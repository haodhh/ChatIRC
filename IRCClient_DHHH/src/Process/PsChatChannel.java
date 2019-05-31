/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Interface.ChatChannelGUI;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class PsChatChannel {
    
    // When the ChatChannelGUI window object is initialized,
    // the PsChatChannel object is initialized and passed to the properties of the window.
    
    // The PsChatChannel object is initialized to execute the received message whether the message is passed to the window.
    
    JTextField textTopic;
    JTextField textChannel;
    JTextArea textArea;
    JList listUser;
    String listUsers[] = new String[1000];
    String topic;
    
    public PsChatChannel(JTextField textTopic, JTextField textChannel, JTextArea textArea, JList listUser){
        this.textTopic = textTopic;
        this.textChannel = textChannel;
        this.textArea = textArea;
        this.listUser = listUser;
        for(int i=0; i<1000; i++){
            listUsers[i] = null;
        }
    }
    
    // Functions will perform message truncation and check that the parts of the message fit the condition
    
    // The function process message from server and paint message to textarea of ChatChannelGUI if message have information of users join channel
    public boolean checkJoin(String message){
        boolean rt = false;
        try{
            String mesx[];
            mesx = message.split(" ");
            // Message join channel as a form: <sender> "JOIN" <channel name>
            if(mesx[1].equals("JOIN") && mesx[2].equals(this.textChannel.getText())){
                this.textArea.append("\n" + message);
                rt = true;
            }
            // Message cannot join channel as a form:
            else if(mesx[3].equals(this.textChannel.getText()) && mesx[4].equals(":Cannot")){
                this.textArea.append("\n" + message);
                rt = true;
            }
            // Message part channel as a form: <sender> "PART" <channel name>
            else if(mesx[1].equals("PART") && mesx[2].equals(this.textChannel.getText())){
                this.textArea.append("\n" + message);
                rt = true;
            }
        }
        catch(Exception e){
            rt = false;
        }
        return rt;
    }
    
    // the function process message from server and update topic of channel if message if message have information topic of channel
    public boolean getTopic(String message){
        boolean rt = false;
        try{
            String mesx[];
            mesx = message.split(" ");
            
            if(mesx[3].equals(this.textChannel.getText()) && !(mesx[4].equals(":End"))){
                String mexx[];
                mexx = message.split(":");
                try{
                    this.textTopic.setText(mexx[2]);
                }
                catch(Exception e){
                    this.textArea.append("\n" + message);
                    this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
                }
                rt = true;
            }
            // Message about topic channel as a form: <sender> "TOPIC" <channel name> <topic name>
            else if(mesx[1].equals("TOPIC") && mesx[2].equals(this.textChannel.getText())){
                String mexx[];
                mexx = mesx[3].split(":");
                topic = mexx[1];
                // The topic channel consists of the following sections
                // We put them together to get topic
                for(int i=4; i<mesx.length; i++){
                    topic += " "+ mesx[i];
                }
                this.textTopic.setText(topic);
                rt = true;
            }
            else if(mesx[3].equals(this.textChannel.getText()) && (mesx[4].equals(":End"))){
                rt = true;
            }
        }
        catch(Exception e){
            rt = false;
        }
        return rt;
    }
    
    // the function process message from server and update list user of channel if message have information about list user of channel
    public boolean getListUser(String message){
        boolean rt = false;
        try{
            String mesx[];
            mesx = message.split(" ");
            // Message about user of channel as a form: <sender> <number> <username> "=" <channel name> <list username of channel>
            if(mesx[3].equals("=") && mesx[4].equals(this.textChannel.getText())){
                for(int i=5; i<mesx.length; i++){
                    listUsers[i-5] = mesx[i];
                }
                this.listUser.setModel(new javax.swing.AbstractListModel<String>() {
                public int getSize() { return listUsers.length; }
                public String getElementAt(int i) { return listUsers[i]; }
                });
                rt = true;
            }
        }
        catch(Exception e){
            rt = false;
        }
        return rt;
    }
    
    // the funtion process message from server and paint it to text area of ChatChannelGUI if it is message send to channel
    public boolean getChat(String message){
        boolean rt = false;
        try{
            String mesx[];
            mesx = message.split(" ");
            // Message chat to channel as a form: <sender> "PRIVMSG" <channel name> <message>
            if(mesx[1].equals("PRIVMSG") && mesx[2].equals(this.textChannel.getText())){
                this.textArea.append("\n" + message);
                this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
                rt = true;
            }
        }
        catch(Exception e){
            rt = false;
        }
        return rt;
    }
    
    public boolean psMessage(String message){
        // Make a call to detailed message handlers,
        // if the function returns true, the message arrives at the required location and the function terminates,
        // which returns false if the called function returns false.
        
        if(checkJoin(message)) return true;
        if(getTopic(message)) return true;
        if(getListUser(message)) return true;
        if(getChat(message)) return true;
        return false;
    }
}
