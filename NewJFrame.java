/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Controllerpackage.HeaderTabelControl;
import Modelpackage.InvoiceHeader;
import Modelpackage.InvoiceLine;
import Controllerpackage.LinesTabelControl;


public class NewJFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    private ArrayList<InvoiceHeader> invoices = new ArrayList<>();
    private ArrayList<InvoiceLine> invoiceLines = new ArrayList<>();
    private HeaderTabelControl headerTabelModel;
    private LinesTabelControl linesTabelModel;
    private NewInvDialog newInvDialog;
    private NewInLineDialog newInLineDialog;

    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        createNewInvoice = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CreateNewItem = new javax.swing.JButton();
        delItem = new javax.swing.JButton();
        InvDatetextF = new javax.swing.JTextField();
        InvCustomerNameTestF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LineTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        createNewInvoice.setBackground(new java.awt.Color(51, 51, 51));
        createNewInvoice.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        createNewInvoice.setForeground(new java.awt.Color(0, 51, 255));
        createNewInvoice.setText("Create New Invoice");
        createNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewInvoiceActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Delete Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Invoices Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(createNewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel2.setText("Invoice Number");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel3.setText("Invoice Date");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel4.setText("Customer Name");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel6.setText("Invoice Total");

        CreateNewItem.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        CreateNewItem.setForeground(new java.awt.Color(0, 51, 102));
        CreateNewItem.setText("Create Item");
        CreateNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewItemActionPerformed(evt);
            }
        });

        delItem.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        delItem.setForeground(new java.awt.Color(0, 51, 102));
        delItem.setText("Del Item");
        delItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delItemActionPerformed(evt);
            }
        });

        InvDatetextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDatetextFActionPerformed(evt);
            }
        });

        LineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        LineTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(LineTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(InvDatetextF, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(InvCustomerNameTestF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(CreateNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(delItem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(InvDatetextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InvCustomerNameTestF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        jMenu1.setText("File");

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFileMenuItem.setText("Save File");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        deleteInv();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InvDatetextFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvDatetextFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvDatetextFActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed

       //to Load File
        try {
            loadfile();
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_loadFileMenuItemActionPerformed

    private void loadfile() throws Exception {
        invoices.clear();
        invoiceLines.clear();
        //"Chocese Frist File" Header
        JOptionPane.showMessageDialog(this, "Select Inoices header file", "Inv Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        File selectFile;
        if (option == JFileChooser.APPROVE_OPTION) {
            selectFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] headerLine = line.split(",");
                int invNum = Integer.parseInt(headerLine[0]);
                Date invdate = df.parse(headerLine[1]);
                String custName = headerLine[2];
                InvoiceHeader header = new InvoiceHeader(invNum, invdate, custName);
                invoices.add(header);
            }
            br.close();
            fr.close();
            
        }
        //"Chocese Second File" Lines
       // JOptionPane.showMessageDialog(this, " Select Invoice Lines file", "Inv Lines", JOptionPane.WARNING_MESSAGE);
        option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            selectFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] InvoiceLines = line.split(",");
                int invNum = Integer.parseInt(InvoiceLines[0]);
                String CustomerName = InvoiceLines[1];
                double price = Double.parseDouble(InvoiceLines[2]);
                int count = Integer.parseInt(InvoiceLines[3]);
                InvoiceHeader header = findByNumHeader(invNum);
                InvoiceLine Invline = new InvoiceLine(CustomerName, price, count, header);
                header.addLine(Invline);
  System.out.println(invNum+" "+CustomerName+" "+price+" "+count);
          
            }
            br.close();
            fr.close();
            System.out.println("check line");
            headerTabelModel = new HeaderTabelControl(invoices);
            headerTabelModel = new HeaderTabelControl(invoices);
            headerTable.setModel(headerTabelModel);
            headerTable.validate();
           //  System.out.println(br.readLine());
        }

    }

    private InvoiceHeader findByNumHeader(int headerNum) {

        for (InvoiceHeader header : invoices) {
            if (header.getNum() == headerNum) {
                return header;
            }
        }

        return null;
    }
    private void createNewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewInvoiceActionPerformed
        createNewINv();
    }//GEN-LAST:event_createNewInvoiceActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        try {
            savefile();
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void CreateNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewItemActionPerformed
        createNewItems();
    }//GEN-LAST:event_CreateNewItemActionPerformed

    private void delItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delItemActionPerformed
      deleteItem();
    }//GEN-LAST:event_delItemActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewItem;
    private javax.swing.JTextField InvCustomerNameTestF;
    private javax.swing.JTextField InvDatetextF;
    private javax.swing.JTable LineTable;
    private javax.swing.JButton createNewInvoice;
    private javax.swing.JButton delItem;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        headerRowSelect();
    }

    private void headerRowSelect() {
        int indexrow = headerTable.getSelectedRow();
        if (indexrow >= 0) {
            InvoiceHeader rowselect = headerTabelModel.getInvoices().get(indexrow);
            InvCustomerNameTestF.setText(rowselect.getCusName());
            InvDatetextF.setText(rowselect.getDate().toString());
            jLabel5.setText("" + rowselect.getNum());
            jLabel7.setText("" + rowselect.getInvTotal());
            ArrayList<InvoiceLine> lines = rowselect.getLines();
            linesTabelModel = new LinesTabelControl(lines);
            LineTable.setModel(linesTabelModel);
            linesTabelModel.fireTableDataChanged();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("createOk")) {
            createOkInv();
        } else if (e.getActionCommand().equals("createCancel")) {
            createcancelInv();
        } else if (e.getActionCommand().equals("createItemOk")) {
            createOkItem();
        } else if (e.getActionCommand().equals("createItemCancel")) {
            createcancelItem();
        }

    }

    private void createNewINv() {

        newInvDialog = new NewInvDialog(this);
        newInvDialog.setVisible(true);

    }

    private void createNewItems() {
        newInLineDialog = new NewInLineDialog(this);
        newInLineDialog.setVisible(true);
    }

    private void createOkInv() {
        String customername = newInvDialog.getCustomerNameField().getText();
        String invdateString = newInvDialog.getInDateF().getText();
        Date invdate = new Date();
        try {
            Date inDate = df.parse(invdateString);
        } catch (ParseException ex) {
            //  Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        newInvDialog.setVisible(false);

        int newNumber = getMaxNumber();
        InvoiceHeader headerNew = new InvoiceHeader(newNumber, invdate, customername);
        invoices.add(headerNew);
        headerTabelModel.fireTableDataChanged();
        
    }


    private void createcancelInv() {
        newInvDialog.setVisible(false);
    }

    private int getMaxNumber() {
        int num = 0;
        for (InvoiceHeader header : invoices) {

            if (header.getNum() > num) {
                num = header.getNum();
            }
        }

        return num + 1;
    }

    private void createcancelItem() {
        newInLineDialog.setVisible(false);
    }

    private void deleteInv() {
        int indexrow = headerTable.getSelectedRow();
        headerTabelModel.removeRow(indexrow);
        headerTabelModel.fireTableDataChanged();
        linesTabelModel.fireTableDataChanged();

    }

    private void savefile() throws Exception {
        //for Header Tabel
        JOptionPane.showMessageDialog(this, "Please choose File Header to Save", "Invooice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChoosers = new JFileChooser();
        int option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfile = fileChoosers.getSelectedFile();
            PrintWriter out = new PrintWriter(Csvfile);

           for (InvoiceHeader header : invoices) {
             ;
               out.printf("%d,%s,%s",header.getNum(),header.getDate().toString(),header.getCusName());
               out.println();
            }
           out.close();
            JOptionPane.showMessageDialog(this, "Successfully Header Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        //for Lines Tabel
               JOptionPane.showMessageDialog(this, "Please Chosce File Line to Save", "Invooice Line", JOptionPane.WARNING_MESSAGE);
          fileChoosers = new JFileChooser();
         option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfilee = fileChoosers.getSelectedFile();
            PrintWriter outt = new PrintWriter(Csvfilee);


           for (InvoiceHeader header : invoices) {
               for(InvoiceLine Lines :header.getLines()){
             
               outt.printf("%s ,%s,%d",Lines.getProduct(),""+Lines.getPrice(),Lines.getCount());
               outt.println();
                   System.out.println(Lines.getProduct()+Lines.getPrice()+Lines.getCount());
               outt.println();
            }}
           outt.close();
            JOptionPane.showMessageDialog(this, "Successfully Lines Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    private void deleteItem() {
      int indexrow = LineTable.getSelectedRow();
        linesTabelModel.removeRow(indexrow);
        //headerTabelModel.fireTableDataChanged();
        linesTabelModel.fireTableDataChanged();

    }
    
    private void createOkItem() {
        String itemName = newInLineDialog.getItemNameTF().getText();
        String itemCount = newInLineDialog.getItemCountTF().getText();
        String itemPrice = newInLineDialog.getItemPriceTF().getText();
        int Count = Integer.parseInt(itemCount);
        double Price = Double.parseDouble(itemPrice);
        System.out.println(itemName+itemCount+itemPrice);

        newInLineDialog.setVisible(false);

        int row = headerTable.getSelectedRow();
        if (row >= 0) {
            InvoiceHeader header = invoices.get(row);
            InvoiceLine li = new InvoiceLine(itemName, Price, Count, header);
            header.addLine(li);
 System.out.println(itemName+Count+Price);
            linesTabelModel.fireTableDataChanged();
            headerTabelModel.fireTableDataChanged();
        }
    }
}
