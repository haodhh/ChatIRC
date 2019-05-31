/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Process.ProcessIO;

/**
 *
 * @author admin
 */
public class ChatManyGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChatManyGUI
     */
    ProcessIO psIO;
    private String listUsers[] = new String[1000];
    private int nUser;
    private String users;
    
    public ChatManyGUI(String user, ProcessIO psIO) {
        initComponents();
        setVisible(true);
        setTitle("IRCClient_ChatMany_" + user);
        this.psIO = psIO;
        for(int i=0; i<1000; i++){
            listUsers[i] = null;
        }
        nUser = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listUser = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        textChat = new javax.swing.JTextField();
        btSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IRCClient_ChatMany");

        jLabel1.setText("Chat to:");

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDel.setText("Del");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        jLabel2.setText("Users List:");

        listUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listUser);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        btSend.setText("Send");
        btSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textChat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSend))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd)
                    .addComponent(btDel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSend))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        if(nUser<1000){
            boolean add = true;
            for(int i=0; i<nUser; i++){
                if(listUsers[i].equals(this.textUser.getText())){
                    add = false;
                    break;
                }
            }
            if(add){
                this.listUsers[nUser] = this.textUser.getText();
                nUser++;
            }
            this.listUser.setModel(new javax.swing.AbstractListModel<String>() {
                public int getSize() { return listUsers.length; }
                public String getElementAt(int i) { return listUsers[i]; }
                });
        }
        this.textUser.setText("");
    }//GEN-LAST:event_btAddActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        // TODO add your handling code here:
        if(nUser>0){
            for(int i=0; i<nUser; i++){
                if(listUsers[i].equals(this.textUser.getText())){
                    for(int j=i; j<nUser; j++){
                        listUsers[j] = listUsers[j+1];
                    }
                    nUser--;
                    break;
                }
            }
            this.listUser.setModel(new javax.swing.AbstractListModel<String>() {
                public int getSize() { return listUsers.length; }
                public String getElementAt(int i) { return listUsers[i]; }
                });
        }
        this.textUser.setText("");
    }//GEN-LAST:event_btDelActionPerformed

    private void btSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSendActionPerformed
        // TODO add your handling code here:
        this.users = listUsers[0];
        for(int i=1; i<nUser; i++){
            users += ","+ listUsers[i];
        }
        if(psIO.send("PRIVMSG " + users + " : " + this.textChat.getText())){
            this.textArea.append("\nMe: " + this.textChat.getText());
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
            this.textChat.setText("");
        }
        else {
            this.textArea.append("\nCannot send message!");
            this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
        }
    }//GEN-LAST:event_btSendActionPerformed

    private void listUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUserMouseClicked
        // TODO add your handling code here:
        this.textUser.setText(this.listUser.getSelectedValue());
    }//GEN-LAST:event_listUserMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listUser;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textChat;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}