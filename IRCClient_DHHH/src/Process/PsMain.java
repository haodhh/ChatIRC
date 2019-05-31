/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author admin
 */
public class PsMain {
    
    // When the MainGUI window object is initialized,
    // the PsMain object is initialized and passed to the properties of the window.
    
    // The PsMain object is initialized to execute the received message whether the message is passed to the window.
    
    JList listServer;
    JList listChannel;
    JTextArea textArea;
    
    private boolean getListChannel;
    private String listChannels[] = new String[1000];
    private int nChannel;
    
    public PsMain(JList listServer, JList listChannel, JTextArea textArea){
        this.listServer = listServer;
        this.listChannel = listChannel;
        this.textArea = textArea;
        getListChannel = false;
        nChannel = 0;
        for(int i=0; i<1000; i++){
            this.listChannels[i] = null;
        }
    }
    
    // the function process message from server to client, update channel list if message have information list channel
    public boolean getListChannel(String message){
        boolean rt = false;
        try{
            String mesx[];
            mesx = message.split(" ");
            
            if(mesx[3].equals("Channel") && mesx[4].equals(":Users") && mesx[6].equals("Name")){
                // Message about list channel start with message as a form: <server> <number> <username> "Channel" ":Users"  "Name"
                // when receive this message, getListChannel will have value true
                this.getListChannel = true;
                nChannel = 0;
                for(int i=0; i<1000; i++){
                    this.listChannels[i] = null;
                }
                rt = true;
            }
            // :End of /LIST
            else if(mesx[3].equals(":End") && mesx[4].equals("of") && mesx[5].equals("/LIST")){
                // Message about list channel finish with message as a form: <server> <number> <username> ":End" "of" "/LIST"
                // when receive this message, getListChannel will have value false
                this.getListChannel = false;
                rt = true;
            }
            else if(this.getListChannel){
                // when getListChannel have value true, we update listchannel
                if(nChannel<1000){
                    this.listChannels[nChannel] = mesx[3];
                    nChannel++;
                }
                this.listChannel.setModel(new javax.swing.AbstractListModel<String>() {
                    public int getSize() { return listChannels.length; }
                    public String getElementAt(int i) { return listChannels[i]; }
                    });
                rt = true;
            }
        }
        catch(Exception e){
            rt = false;
        }
        return rt;
    }
    
    // the function print message from server to client to text area of MainGUI
    public void showMessage(String message){
        this.textArea.append("\n" + message);
        this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
    }
    
}
