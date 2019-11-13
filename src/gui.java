
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kermo.Kevend
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Backpnl = new javax.swing.JPanel();
        savebtn = new javax.swing.JButton();
        FileSelectbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        rn0 = new javax.swing.JRadioButton();
        rn1 = new javax.swing.JRadioButton();
        rn2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CSV Number Filter");
        setResizable(false);

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        FileSelectbtn.setText("open a csv");
        FileSelectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileSelectbtnActionPerformed(evt);
            }
        });

        txta.setColumns(20);
        txta.setRows(5);
        txta.setAutoscrolls(false);
        txta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txta);

        buttonGroup1.add(rn0);
        rn0.setSelected(true);
        rn0.setText("All");
        rn0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rn0StateChanged(evt);
            }
        });

        buttonGroup1.add(rn1);
        rn1.setText("Even");
        rn1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rn1StateChanged(evt);
            }
        });

        buttonGroup1.add(rn2);
        rn2.setText("Uneven");
        rn2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rn2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout BackpnlLayout = new javax.swing.GroupLayout(Backpnl);
        Backpnl.setLayout(BackpnlLayout);
        BackpnlLayout.setHorizontalGroup(
            BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FileSelectbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(savebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        BackpnlLayout.setVerticalGroup(
            BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackpnlLayout.createSequentialGroup()
                .addGroup(BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackpnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(BackpnlLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(rn0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(FileSelectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileSelectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileSelectbtnActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            String filename = file.toString();
            try {
                readFromFile(filename);
            } catch (IOException ex) {
                System.out.println("error on open");

            }
        }
    }//GEN-LAST:event_FileSelectbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        int returnVal = jFileChooser1.showSaveDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            String savefile = file.toString() + ".csv";
            try {
                writeFile(savefile);                
            } catch (IOException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
        }
    }//GEN-LAST:event_savebtnActionPerformed
    private void rn1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rn1StateChanged
    }//GEN-LAST:event_rn1StateChanged
    private void rn2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rn2StateChanged
  
    }//GEN-LAST:event_rn2StateChanged
    private void rn0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rn0StateChanged
    }//GEN-LAST:event_rn0StateChanged

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });

    }

    public void readFromFile(String filename) throws FileNotFoundException, IOException {
        String line = "";
        String cvsSplitBy = ";";

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                
                if (rn0.isSelected()){
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String num = mass[i].replaceAll("[^0-9.]", "");
                    String answer = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                    if (!answer.equals("")) {
                        sb.append(answer);
                        if (i < mass.length) {
                            sb.append(";");
                        }
                    }

                }
                String end = sb.toString();
                String tEnd = end.replaceAll("(.{16})", "$1\n");
                txta.setText(tEnd);
            }
               if (rn1.isSelected()){
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String num = mass[i].replaceAll("[^0-9.]", "");
                    String answer = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                    if (!answer.endsWith("1")){
                    if (!answer.endsWith("3")){
                    if (!answer.endsWith("5")){
                    if (!answer.endsWith("7")){
                    if (!answer.endsWith("9")){ 
                    if (!answer.equals("")){
                        sb.append(answer);    
                        if (i < mass.length) {
                            sb.append(";");
                            
                        }
                    }}}}}}

                }
                String end = sb.toString();
                String tEnd = end.replaceAll("(.{16})", "$1\n");
                txta.setText(tEnd);
             
               }
               if (rn2.isSelected()){
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String num = mass[i].replaceAll("[^0-9.]", "");
                    String answer = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                    if (!answer.endsWith("2")){
                    if (!answer.endsWith("4")){
                    if (!answer.endsWith("6")){
                    if (!answer.endsWith("8")){
                    if (!answer.endsWith("0")){ 
                    if (!answer.equals("")){
                        sb.append(answer);    
                        if (i < mass.length) {
                            sb.append(";");
                        }
                    }}}}}}

                }
                String end = sb.toString();
                String tEnd = end.replaceAll("(.{16})", "$1\n");
                txta.setText(tEnd);
               }
           
        
            }
        }
       
    }

    public void writeFile(String savefile) throws IOException {
        String content = txta.getText();
                
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(savefile, true))) {
              
            
                    String num = content.replaceAll("[^0-9.;]", "");
                    String answer = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                if (!answer.equals("")) {
                    String end = answer.replaceAll("(.{16})", "$1\n");
                    bf.append(end);
                    
        }
           
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backpnl;
    private javax.swing.JButton FileSelectbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rn0;
    private javax.swing.JRadioButton rn1;
    private javax.swing.JRadioButton rn2;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables




}