/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class PsChatOne {
    
    // When the ChatOneGUI window object is initialized,
    // the PsChatOne object is initialized and passed to the properties of the window.
    
    // The PsChatOne object is initialized to execute the received message whether the message is passed to the window.
    
    JTextArea textArea;
    JTextField textUser;
    private String user;
    
    public PsChatOne(String user, JTextArea textArea, JTextField textUser){
        this.user = user;
        this.textUser = textUser;
        this.textArea = textArea;
    }
    
    // the function process message from server to client and paint it on textarea of ChatOneGUI if this message is message send from user on GUI
    public boolean psMessage(String message) {
        boolean rt = false;
        try{
            String mesx[];
            mesx = message.split(" ");
            // Message chat to user as a form: <sender> "PRIVMSG" <receiver> <message>
            // Check who the recipient is user of client
            if(mesx[1].equals("PRIVMSG") && mesx[2].equals(this.user)){
                String mess[];
                mess = mesx[0].split("!");
                String mexx[];
                mexx = mess[0].split(":");
                // Check if the sender name matches the information on the window, message will print to the window
                if(mexx[1].equals(this.textUser.getText())){
                    this.textArea.append("\n" + message);
                    this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
                    rt = true;
                }
            }
        }
        catch(Exception e){
            rt = false;
        }
        return rt;
    }
    
}
