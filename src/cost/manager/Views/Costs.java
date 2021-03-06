/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cost.manager.Views;

import cost.manager.Model.costRetrival;
import cost.manager.ViewModel.CostsDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Costs extends javax.swing.JPanel {

    private CostsDao costs;
    private DefaultTableModel tr;
    public Costs() {
        costs = new CostsDao();
        initComponents();
        tr = (DefaultTableModel) data.getModel();
        populatemyCosts();

    }

    private void populatemyCosts() {
        try {
            clearTable();
            ArrayList<costRetrival> costing = costs.getCosts();
            for (costRetrival c : costing) {

                Object rowData[] = new Object[4];
                rowData[0] = c.getRecordID();
                rowData[1] = c.getDate();
                rowData[2] = c.getSum();
                rowData[3] = c.getDescription();
                tr.addRow(rowData);
            }

        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fromDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        toDate = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setBackground(new java.awt.Color(102, 102, 255));
        setToolTipText("");

        jToolBar1.setBackground(new java.awt.Color(153, 153, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(102, 102, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Delete");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 204, 0));
        jButton3.setText("Apply Filter");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Costs");

        data.setAutoCreateRowSorter(true);
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Cost", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        data.setColumnSelectionAllowed(false);
        jScrollPane4.setViewportView(data);

        jToolBar2.setBackground(new java.awt.Color(153, 153, 255));
        jToolBar2.setForeground(new java.awt.Color(102, 102, 255));
        jToolBar2.setRollover(true);

        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Filter Data");
        jToolBar2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("|");
        jToolBar2.add(jLabel3);

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("From Date");
        jToolBar2.add(jLabel4);

        fromDate.setBorder(null);
        jToolBar2.add(fromDate);

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("To Date");
        jToolBar2.add(jLabel5);

        toDate.setBorder(null);
        jToolBar2.add(toDate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           int column = 0;
            int row = data.getSelectedRow();
           String value = tr.getValueAt(row, column).toString();
           int i = JOptionPane.showConfirmDialog(null, "Deleting " + value, "Confirmation", 1);
           if(i==0){
               costs.delete(Integer.valueOf(value));
               this.populatemyCosts();

           }
           else{
               
           }
       }catch(Exception e){
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void clearTable() {
        tr.getDataVector().removeAllElements();
        tr.fireTableDataChanged();
        
    }

    private boolean validateFilter() {
        if (fromDate.getText().trim().toLowerCase().length() != 0 && toDate.getText().trim().toLowerCase().length() != 0) {
            return true;
        } else {
            return false;
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (validateFilter()) {
                clearTable();
                ArrayList<costRetrival> costing = costs.getFilter(fromDate.getText().trim().toLowerCase(), toDate.getText().trim().toLowerCase());
                for (costRetrival c : costing) {
                    Object rowData[] = new Object[4];
                    rowData[0] = c.getRecordID();
                    rowData[1] = c.getDate();
                    rowData[2] = c.getSum();
                    rowData[3] = c.getDescription();
                    tr.addRow(rowData);
                }
            } else{
                JOptionPane.showMessageDialog(null, "Enter Dates", "Filter Error", 1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JTextField fromDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField toDate;
    // End of variables declaration//GEN-END:variables
}
