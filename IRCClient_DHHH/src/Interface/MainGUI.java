/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Process.ProcessIO;
import Process.PsMain;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    
    ProcessIO psIO;
    PsMain psMain;
    
    public MainGUI() {
        initComponents();
        this.textArea.setEditable(false);
        psMain = new PsMain(this.listServer, this.listChannel, this.textArea);
        psIO = new ProcessIO(psMain);
        setEnabledd(true);
    }
    
    private void setEnabledd(boolean enabled){
        //pannel connect
        this.textUser.setEditable(enabled);
        this.textNick.setEditable(enabled);
        this.textPass.setEditable(enabled);
        this.textServer.setEditable(enabled);
        this.textPort.setEditable(enabled);
        this.listServer.setEnabled(enabled);
        this.btConnect.setEnabled(enabled);
        this.btDisconnect.setEnabled(!enabled);
        //pannel channel
        this.btRefresh.setEnabled(!enabled);
        this.listChannel.setEnabled(!enabled);
        this.textChannel.setEditable(!enabled);
        this.btChatChannel.setEnabled(!enabled);
        this.btChatOne.setEnabled(!enabled);
        this.btChatMany.setEnabled(!enabled);
        //pannel chat
        this.textChat.setEditable(!enabled);
        this.btSend.setEnabled(!enabled);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        textNick = new javax.swing.JTextField();
        btConnect = new javax.swing.JButton();
        btDisconnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listServer = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textServer = new javax.swing.JTextField();
        textPort = new javax.swing.JTextField();
        textPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listChannel = new javax.swing.JList<>();
        btChatMany = new javax.swing.JButton();
        btChatOne = new javax.swing.JButton();
        btChatChannel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        textChannel = new javax.swing.JTextField();
        btRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        textChat = new javax.swing.JTextField();
        btSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IRCClient_DHHH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Status:");

        lbStatus.setText("Disconnect");

        jLabel3.setText("UserName:");

        jLabel4.setText("NickName:");

        jLabel5.setText("PassWord");

        textUser.setText("cusuhao");

        textNick.setText("cusuhao");

        btConnect.setText("Connect");
        btConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConnectActionPerformed(evt);
            }
        });

        btDisconnect.setText("Disconnect");
        btDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisconnectActionPerformed(evt);
            }
        });

        listServer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "irc.scuttled.net", "irc.2ch.sc", "irc.accessirc.net", "irc.rr.afternet.org", "irc.data.lt", "irc.anthrochat.net", "arcnet-irc.org", "irc.austnet.org", "irc.azzurra.org", "irc.betachat.net", "irc.canternet.org", "irc.chat4all.org", "irc.chatjunkies.org", "irc.chatnet.org", "irc.chatspike.net", "irc.chattingaway.com", "irc.criten.net", "irc.dal.net", "irc2.darkmyst.org", "irc.pool.d-t-net.de", "irc.deltaanime.net", "irc.choopa.net", "irc.electrocode.net", "irc.enterthegame.com", "irc.entropynet.net", "irc.esper.net", "irc.euirc.net", "irc.europnet.org", "irc.fdfnet.net", "chat.freenode.net", "irc.furnet.org", "irc.galaxynet.org", "irc.gamesurge.net", "na.iso.geeksirc.net", "ap.geekshed.net" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listServerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listServer);

        jLabel6.setText("Server List:");

        jLabel7.setText("Port:");

        jLabel8.setText("Server:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUser)
                                    .addComponent(textNick)
                                    .addComponent(textPass)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btConnect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDisconnect))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPort)
                                    .addComponent(textServer))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConnect)
                    .addComponent(btDisconnect))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Channel List:");

        listChannel.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listChannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listChannelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listChannel);

        btChatMany.setText("Chat One to Many");
        btChatMany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChatManyActionPerformed(evt);
            }
        });

        btChatOne.setText("Chat One to One");
        btChatOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChatOneActionPerformed(evt);
            }
        });

        btChatChannel.setText("Join and Chat on Channel");
        btChatChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChatChannelActionPerformed(evt);
            }
        });

        jLabel10.setText("Channel:");

        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRefresh))
                        .addComponent(btChatChannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btChatOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btChatMany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textChannel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textChannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btChatChannel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btChatOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btChatMany)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane3.setViewportView(textArea);

        btSend.setText("Send");
        btSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textChat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSend)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSend))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConnectActionPerformed
        // TODO add your handling code here:
        if(psIO.connect(this.textServer.getText(), Integer.parseInt(this.textPort.getText()), this.textUser.getText(), this.textNick.getText(), Arrays.toString(this.textPass.getPassword()))){
            this.textArea.append("\nConnected to " + this.textServer.getText() + " ...");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
            setEnabledd(false);
        }
        else{
            this.textArea.append("\nConnect fail!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btConnectActionPerformed

    private void btDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisconnectActionPerformed
        // TODO add your handling code here:
        if(psIO.disconnect()){
            this.textArea.append("\nDisconneted!");
            this.textArea.append("\n||===========================||===========================||===========================||===========================||");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
            setEnabledd(true);
        }
        else{
            this.textArea.append("\nDisconnect fail!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btDisconnectActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        // TODO add your handling code here:
        if(psIO.send("LIST")){
        }
        else{
            this.textArea.append("\nCannot refresh Channel list!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btChatChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChatChannelActionPerformed
        // TODO add your handling code here:
        try{
            if(Arrays.toString(this.textPass.getPassword()) != null){
                psIO.send("JOIN "+ this.textChannel.getText());
                ChatChannelGUI chatChannel = new ChatChannelGUI(this.textUser.getText(), this.textChannel.getText(), this.psIO);
            }
            else {
                psIO.send("JOIN "+ this.textChannel.getText());
                ChatChannelGUI chatChannel = new ChatChannelGUI(this.textUser.getText(), this.textChannel.getText(), this.psIO);
            }
        }
        catch(Exception e){
            this.textArea.append("\nCannot open ChatChannel!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btChatChannelActionPerformed

    private void btChatOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChatOneActionPerformed
        // TODO add your handling code here:
        try{
            ChatOneGUI chatOne = new ChatOneGUI(this.textUser.getText(), this.psIO);
        }
        catch(Exception e){
            this.textArea.append("\nCannot open ChatOne!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btChatOneActionPerformed

    private void btChatManyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChatManyActionPerformed
        // TODO add your handling code here:
        try{
            ChatManyGUI chatMany = new ChatManyGUI(this.textUser.getText(), this.psIO);
        }
        catch(Exception e){
            this.textArea.append("\nCannot open ChatMany!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btChatManyActionPerformed

    private void btSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSendActionPerformed
        // TODO add your handling code here:
        if(psIO.send(this.textChat.getText())){
            this.textArea.append("\nMe: " + this.textChat.getText());
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
            this.textChat.setText("");
        }
        else{
            this.textArea.append("\nCannot send message!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btSendActionPerformed

    private void listServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listServerMouseClicked
        // TODO add your handling code here:
        this.textServer.setText(this.listServer.getSelectedValue());
        this.textPort.setText("6667");
    }//GEN-LAST:event_listServerMouseClicked

    private void listChannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listChannelMouseClicked
        // TODO add your handling code here:
        this.textChannel.setText(this.listChannel.getSelectedValue());
    }//GEN-LAST:event_listChannelMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if(psIO.disconnect()){
            this.textArea.append("\nDisconneted!");
            this.textArea.append("\n||===========================||===========================||===========================||===========================||");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
            //System.out.println("1");
        }
        else{
            this.textArea.append("\nDisconnect fail!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChatChannel;
    private javax.swing.JButton btChatMany;
    private javax.swing.JButton btChatOne;
    private javax.swing.JButton btConnect;
    private javax.swing.JButton btDisconnect;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JList<String> listChannel;
    private javax.swing.JList<String> listServer;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textChannel;
    private javax.swing.JTextField textChat;
    private javax.swing.JTextField textNick;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textPort;
    private javax.swing.JTextField textServer;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
