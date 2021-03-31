/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.RegionController;
import icontrollers.IRegionController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Region;
import tools.DBConnection;

/**
 *
 * @author Okala
 */
public final class JIRegionView extends javax.swing.JInternalFrame {

    DBConnection connection = new DBConnection();
    IRegionController irc = new RegionController(connection.getConnection());
    /**
     * Creates new form JIRegionView
     */
    public JIRegionView() {
        initComponents();
        showTableRegion("");
    }
   
    public void resetTextRegion(){
        txtRegionId.setText("");
        txtRegionName.setText("");
        txtRegionId.setEditable(true);
        btnInsertRegion.setEnabled(true);
    }
    
    public void showTableRegion(String key){
        DefaultTableModel model = (DefaultTableModel)tableRegion.getModel();
        Object[] row = new Object[3];
        List<Region> regions = irc.search(key);
        if (key.isEmpty()) {
            regions = irc.getAll();
        }
        for (int i = 0; i < regions.size(); i++) {
            row[0]=i+1;
            row[1]=regions.get(i).getId();
            row[2]=regions.get(i).getName();
            model.addRow(row);
        }
    }
    
//    public void showTableRegion(String s){
//        DefaultTableModel model = (DefaultTableModel)tableRegion.getModel();
//        Object[] row = new Object[2];
//        for (int i = 0; i < irc.search(s).size(); i++) {
//            row[0]=irc.search(s).get(i).getId();
//            row[1]=irc.search(s).get(i).getName();
//            model.addRow(row);
//        }
//    }
    
//    public void updateTableRegion(){
//        DefaultTableModel model = (DefaultTableModel)tableRegion.getModel();
//        model.setRowCount(0);
//        showTableRegion();
//    }
    
    public void updateTableRegion(String s){
        DefaultTableModel model = (DefaultTableModel)tableRegion.getModel();
        model.setRowCount(0);
        showTableRegion(s);
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
        txtRegionId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRegionName = new javax.swing.JTextField();
        btnInsertRegion = new javax.swing.JButton();
        btnDeleteRegion = new javax.swing.JButton();
        txtRegionSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbRegionSearch = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegion = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("REGION");
        setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Region Info");

        txtRegionId.setName(""); // NOI18N

        jLabel3.setText("ID");

        jLabel4.setText("Name");

        btnInsertRegion.setText("save");
        btnInsertRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertRegionActionPerformed(evt);
            }
        });

        btnDeleteRegion.setText("delete");
        btnDeleteRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRegionActionPerformed(evt);
            }
        });

        txtRegionSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionSearchActionPerformed(evt);
            }
        });
        txtRegionSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegionSearchKeyTyped(evt);
            }
        });

        jLabel2.setText("Search");

        cmbRegionSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "ID", "NAME" }));

        tableRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "id", "name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRegion.getTableHeader().setReorderingAllowed(false);
        tableRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRegionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRegion);
        if (tableRegion.getColumnModel().getColumnCount() > 0) {
            tableRegion.getColumnModel().getColumn(0).setResizable(false);
            tableRegion.getColumnModel().getColumn(1).setResizable(false);
            tableRegion.getColumnModel().getColumn(2).setResizable(false);
        }

        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRegionId, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear))
                            .addComponent(txtRegionName)
                            .addComponent(txtRegionSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnInsertRegion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteRegion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbRegionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertRegion)
                    .addComponent(btnDeleteRegion))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbRegionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnInsertRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertRegionActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk melakukan insert?", "Confirm Insert", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirm==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, irc.save(txtRegionId.getText(), txtRegionName.getText()));
            updateTableRegion("");
            resetTextRegion();
        }
    }//GEN-LAST:event_btnInsertRegionActionPerformed

    private void btnDeleteRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRegionActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk melakukan delete?", "Confirm Update", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirm==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, irc.delete(txtRegionId.getText()));
            updateTableRegion("");
            resetTextRegion();
        }
    }//GEN-LAST:event_btnDeleteRegionActionPerformed

    private void tableRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRegionMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableRegion.getModel();
        int SelectedRowIndex = tableRegion.getSelectedRow();
        txtRegionId.setEditable(false);
//        btnInsertRegion.setEnabled(false);
        txtRegionId.setText(model.getValueAt(SelectedRowIndex, 1).toString());
        txtRegionName.setText(model.getValueAt(SelectedRowIndex, 2).toString());
    }//GEN-LAST:event_tableRegionMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        resetTextRegion();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtRegionSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegionSearchKeyTyped
        // TODO add your handling code here:
        updateTableRegion(txtRegionSearch.getText());
    }//GEN-LAST:event_txtRegionSearchKeyTyped

    private void txtRegionSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteRegion;
    private javax.swing.JButton btnInsertRegion;
    private javax.swing.JComboBox<String> cmbRegionSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRegion;
    private javax.swing.JTextField txtRegionId;
    private javax.swing.JTextField txtRegionName;
    private javax.swing.JTextField txtRegionSearch;
    // End of variables declaration//GEN-END:variables
}
