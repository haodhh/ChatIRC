/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ProcessIO {
    
    private String user;
    
    private Socket socketOfClient = null;
    private BufferedWriter writer;
    private BufferedReader reader;
    private ReceiverThread receiver;
    
    // When each window object is created, an object for the window handle is created
    // Window handle objects have functions that process the received message and pass that message to the window it processes
    PsMain psMain;
    PsChatOne psCO[] = new PsChatOne[10000];
    PsChatChannel psCC[] = new PsChatChannel[10000];
    private int nPsCO, nPsCC;
    
    public ProcessIO(PsMain psMain) {
        // add a new the window handle object of MainGUI
        this.psMain = psMain;
        nPsCO = 0; nPsCC = 0;
    }
    
    // Make a copy or delete the window handle object
    // the window handle object has value null
    
    public int addCO(PsChatOne psCO){
        // add a new the window handle object of ChatOneGUI
        this.psCO[nPsCO] = psCO;
        nPsCO++;
        return nPsCO - 1;
    }
    
    public void delCO(int n){
        // delete the window handle object of ChatOneGUI
        for(int i=n; i<nPsCO; i++){
            this.psCO[i] = psCO[i+1];
        }
        nPsCO--;
    }
    
    public int addCC(PsChatChannel psCC){
        // add a new the window handle object of ChatChannelGUI
        this.psCC[nPsCC] = psCC;
        nPsCC++;
        return nPsCC - 1;
    }
    
    public void delCC(int n){
        // delete the window handle object of ChatChannelGUI
        for(int i=n; i<nPsCC; i++){
            this.psCC[i] = psCC[i+1];
        }
        nPsCC--;
    }
    
    // The function perform connect client to server
    public boolean connect(String server, int port, String user, String nick, String pass){
        this.user = user;
        boolean rt = false;
        try {
            socketOfClient = new Socket(server, port);
            writer = new BufferedWriter(new OutputStreamWriter( socketOfClient.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader( socketOfClient.getInputStream()));
            // Performs a stream of receiving data and starts this stream
            receiver = new ReceiverThread();
            receiver.start();
            if(null != pass){
                writer.write("PASS " + pass +"\r\n");
                writer.flush();
            }
            writer.write("NICK " + nick + "\r\n");
            writer.write("USER " + user + " 8 * :ihao IRC chat program\r\n");
            writer.flush();
            rt = true;
        } catch (IOException e) {
            rt = false;
        }
        return rt;
    }
    
    // The function perform disconnect client to server
    public boolean disconnect(){
        boolean rt;
        try {
            send("QUIT :Goodbye\r\n");
            receiver.stop();
            writer.close();
            reader.close();
            socketOfClient.close();
            rt = true;
        } catch (IOException e) {
            rt = false;
        }
        return rt;
    }
    
    // The function perform send message from client to server
    public boolean send(String message){
        boolean rt = false;
        try {
            writer.write(message + "\r\n");
            writer.flush();
            rt = true;
        } catch (IOException e) {
            rt = false;
        }
        return rt;
    }
    
    // Thread receive message from server to client
    class ReceiverThread extends Thread {
        @Override
        public void run(){
            String message = "";
            try {
                while((message = reader.readLine()) != null){
                    if (message.startsWith("PING ")) {
                        // If received PING message, need to reply PONG message, because the PING message is the message the client is still running
                        writer.write("PONG " + message.substring(5) + "\r\n");
                        writer.flush();
                    } else {
                        // Make call to psMessage to handle the receive message
                        psMessage(message);
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Cannot receive message!", "Notice!", 1);
            }
        }
    }
    
    // The function process message from server to client
    public void psMessage(String message){
        // Make calls to message handlers of existing objects
        
        // If the message handlers return true,
        // the message is brought to the appropriate location,
        // the message handler is terminated,
        // and further calls to other message handlers if false is returned.
        
        for(int i=0; i<nPsCO; i++){
            if(psCO[i].psMessage(message)) return;
        }
        for(int i=0; i<nPsCC; i++){
            if(psCC[i].psMessage(message)) return;
        }
        if(psMain.getListChannel(message)) return;
        
        //If the message handlers return false then the message is sent to MainGUI
        psMain.showMessage(message);
    }
    
}
