package Controllerpackage;

import Modelpackage.InvoiceLine;
import java.util.ArrayList;
//import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class LinesTabelControl extends DefaultTableModel {

    private String[] cloNames = {"Item Name", "Item Price", "Count", "Item Total"};
    private ArrayList<InvoiceLine> Lines;

    public LinesTabelControl(ArrayList<InvoiceLine> Lines) {
        this.Lines = Lines;
    }

    @Override
    public int getRowCount() {
        if(this.Lines==null){
        Lines =new  ArrayList<>();
        }
        
        return Lines.size();
    }

    @Override
    public int getColumnCount() {
        return cloNames.length;
    }

    @Override
    public void removeRow(int row) {
      Lines.remove(row);
    }

    
    @Override
    public Object getValueAt(int row, int cloume) {

        InvoiceLine inv = Lines.get(row);
        switch (cloume) {
            case 0:
                return inv.getProduct();
            case 1:
                return inv.getPrice();
            case 2:
                return inv.getCount();
            case 3:
                return inv.getLineTotal();
               
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return cloNames[column]; 
    }

    public ArrayList<InvoiceLine> getInvoices() {
        return Lines;
    }

}
