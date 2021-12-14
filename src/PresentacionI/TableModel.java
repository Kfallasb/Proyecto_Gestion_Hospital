/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionI;

import Logic.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Miguel
 */
public class TableModel extends AbstractTableModel{

    private List<Paciente> row;
    private String[] colName;
    private int[] cols;

    public TableModel(List<Paciente> row, int[] cols) {
        this.row = row;
        this.colName = new String[6];
        this.cols = cols;
        asigName();
    }
    
    @Override
    public int getRowCount() {
        return row.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Paciente p = row.get(i);
        switch(cols[i1]){
            case 0:return p.getNombre();
            case 1:return p.getApellido1();
            case 2:return p.getApellido2();
            case 3:return p.getCedula();
            case 4:return p.getPatologia();
            case 5:return p.getFecha();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int i) {
        return colName[i];
    }

    private void asigName() {
        colName[0] = "Nombre";
        colName[1] = "Apellido 1";
        colName[2] = "Apellido 2";
        colName[3] = "Cedula";
        colName[4] = "Patologia";
        colName[5] = "Fecha entrada";
    }
    
    public Paciente getRowAt(int x){
        return row.get(x);
    }
}
