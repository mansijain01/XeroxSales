/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminstrativeRole;

import Business.Business;
import Business.Customer;
import Business.Order;
import Business.OrderItem;
import Business.Product;
import Business.ProductCatalog;
import Business.SalesPerson;
import Business.Supplier;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ReportJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;

    public ReportJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateSalesPersonJTable();
        populateStarProduct();
        populateLoyalCustomer();
        populateSalesDetails();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        salesPersonJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        starProdTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loyalCustomerTxtField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesDetails = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdminstrativeRole/Xerox.png"))); // NOI18N
        jLabel1.setText("XEROX - Sales Report");

        salesPersonJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Salesperson ID", "Sales Volume"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesPersonJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Our Star Product:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Top 3 Salesperson:");

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<< Back");

        starProdTxtField.setEditable(false);
        starProdTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Most Loyal Customer:");

        loyalCustomerTxtField.setEditable(false);
        loyalCustomerTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        salesDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Salesperson ID", "Above Target", "Below Target", "Commission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(salesDetails);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Salesperson Sales Details:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(starProdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loyalCustomerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backBtn)))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(starProdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(loyalCustomerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(backBtn)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField loyalCustomerTxtField;
    private javax.swing.JTable salesDetails;
    private javax.swing.JTable salesPersonJTable;
    private javax.swing.JTextField starProdTxtField;
    // End of variables declaration//GEN-END:variables

    private void populateSalesPersonJTable() {

        for (SalesPerson sp : business.getSalesPersonDirectory().getSalesPersonList()) {
            int total = 0;
            for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getSalesPerson().equals(sp)) {
                    total += order.getSalesVolume();
                    sp.setSaleVol(total);
                }
            }
        }

        DefaultTableModel dtm = (DefaultTableModel) salesPersonJTable.getModel();
        dtm.setRowCount(0);

        Collections.sort(business.getSalesPersonDirectory().getSalesPersonList());

        for (int j = 0; j < 3; j++) {
            SalesPerson sp = business.getSalesPersonDirectory().getSalesPersonList().get(j);
            Object row[] = new Object[4];
            row[0] = sp;
            row[1] = sp.getLname();
            row[2] = sp.getSalesId();
            row[3] = sp.getSaleVol();
            dtm.addRow(row);
        }

    }

    private void populateStarProduct() {
        for (Supplier s : business.getSupplierDirectory().getSupplierlist()) {
            for (Product p : s.getProductCatalog().getProductcatalog()) {
                int totalItem = 0;
                for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                    for (OrderItem oi : order.getOrderItemList()) {
                        if (oi.getProduct().equals(p)) {
                            totalItem += oi.getQuantity();
                            p.setSalesVolm(totalItem);
                        }
                    }
                }
            }
        }

        for (Supplier s : business.getSupplierDirectory().getSupplierlist()) {
            Collections.sort(s.getProductCatalog().getProductcatalog());

        }
        for (Supplier s : business.getSupplierDirectory().getSupplierlist()) {
            Product p = s.getProductCatalog().getProductcatalog().get(0);
            starProdTxtField.setText(p.getProdName());
        }
    }

    private void populateLoyalCustomer() {

        for (Customer c : business.getCustomerDirectory().getCustomerList()) {
            int purchase = 0;
            for (Order o : business.getMasterOrderCatalog().getOrderCatalog()) {
                if (o.getCustomer().equals(c)) {
                    purchase += o.getSalesVolume();
                    c.setPurchaseVolume(purchase);
                }
            }
        }

        Collections.sort(business.getCustomerDirectory().getCustomerList());

        Customer c = business.getCustomerDirectory().getCustomerList().get(0);
        loyalCustomerTxtField.setText(c.getFname());
    }

    private void populateSalesDetails() {
        for (SalesPerson sp : business.getSalesPersonDirectory().getSalesPersonList()) {
            int aboveTarget = 0;
            int belowTarget = 0;
            float commission = 0;
            for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getSalesPerson().equals(sp)) {
                    for (OrderItem oi : order.getOrderItemList()) {
                        if(oi.getSalesPrice() < oi.getProduct().getTargetPrice()){
                            belowTarget = belowTarget + oi.getQuantity();
                            commission += (float) (0.1 * oi.getSalesPrice() * oi.getQuantity());
                        }
                        else{
                            aboveTarget = aboveTarget + oi.getQuantity();
                            commission += (float) (0.2 * oi.getSalesPrice() * oi.getQuantity());
                        }
                    }
                }
            }
            sp.setAboveTarget(aboveTarget);
            sp.setBelowTarget(belowTarget);
            sp.setCommission(commission);                                  
        }
        
            DefaultTableModel dtm = (DefaultTableModel)salesDetails.getModel();
            dtm.setRowCount(0);
            for (SalesPerson sp : business.getSalesPersonDirectory().getSalesPersonList()){
                Object row[] = new Object[5];
                row[0] = sp;
                row[1] = sp.getSalesId();
                row[2] = sp.getAboveTarget();
                row[3] = sp.getBelowTarget();
                row[4] = sp.getCommission();
                dtm.addRow(row);
            }
        }
    }

