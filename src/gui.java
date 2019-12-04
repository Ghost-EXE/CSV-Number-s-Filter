
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    ArrayList<String> contents = new ArrayList<>();

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
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        filter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        filter.setText("Filter");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout BackpnlLayout = new javax.swing.GroupLayout(Backpnl);
        Backpnl.setLayout(BackpnlLayout);
        BackpnlLayout.setHorizontalGroup(
            BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileSelectbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(savebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackpnlLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BackpnlLayout.setVerticalGroup(
            BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackpnlLayout.createSequentialGroup()
                .addGroup(BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackpnlLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(rn0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(FileSelectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackpnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
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
        /*
        *Opens a file chooser and readFromFile
        */
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
        /*
        *saves content on "output" textArea
        */
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

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        /*
        *Removes Leters and unchosen numbers from "txta" textArea and put's
        *them in "output" txtArea 
        */
        
        
        String cvsSplitBy = ";";
        StringBuilder sb = new StringBuilder();
        for (String line : contents) {
            if (rn0.isSelected()) {
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String num = mass[i].replaceAll("[^0-9.]", "");
                    String three = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                    String answer = three.replaceAll("(.{3})", "$1 ");             
                    sb.append(answer);
                    if (i == mass.length - 1) {
                        sb.append(" ");
                     
                    }
                }
                sb.append(System.lineSeparator());
                String end = sb.toString();
                int count = end.split("\\s").length;   
                jLabel2.setText(" " +count);
                output.setText(end);
            }
            if (rn1.isSelected()) {
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String num = mass[i].replaceAll("[^0-9.]", "");
                    String three = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                    String answer = three.replaceAll("(.{3})", "$1 ");
                    if (!num.equals("")
                            && (Integer.parseInt(num) % 2) == 0) {
                        sb.append(answer);
                        if (i == mass.length - 1) {
                            sb.append(" ");
                        }
                    }
                }
                sb.append(System.lineSeparator());
                String end = sb.toString();
                int count = end.split("\\s").length;   
                jLabel2.setText(" " +count);
                output.setText(end);
                
            }
            if (rn2.isSelected()) {
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String num = mass[i].replaceAll("[^0-9.]", "");
                    String three = num.replaceAll("\\b\\w{1,2}\\b\\s?", "");
                    String answer = three.replaceAll("(.{3})", "$1 ");
                    if (!num.equals("")
                            && (Integer.parseInt(num) % 2) == 1
                            ) {
                        sb.append(answer);
                        if (i == mass.length - 1) {
                            sb.append(" ");
                        }
                    }
                }
                sb.append(System.lineSeparator());
                String end = sb.toString();
                int count = end.split("\\s").length;   
                jLabel2.setText(" " +count);
                output.setText(end);
            }
        }
    }//GEN-LAST:event_filterActionPerformed

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
        /*
        *Reads file, add's it to arayList and put's text in "txta" textArea
        */
        String line = "";
        String cvsSplitBy = ";";

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                contents.add(line);
                String[] mass = line.split(cvsSplitBy);
                for (int i = 0; i < mass.length; i++) {
                    String answer = mass[i];
                    sb.append(answer);
                    if (i < mass.length - 1) {
                        sb.append(";");
                    }

                }

                sb.append(System.lineSeparator());

            }
        }
        txta.setText(sb.toString());

    }
    
    public void writeFile(String savefile) throws IOException {
        /*
        *saves "output" textArea into a file
        */
        String content = output.getText();

        try (FileWriter bf = new FileWriter(savefile)) {
            bf.append(content);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backpnl;
    private javax.swing.JButton FileSelectbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton filter;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea output;
    private javax.swing.JRadioButton rn0;
    private javax.swing.JRadioButton rn1;
    private javax.swing.JRadioButton rn2;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables

}
