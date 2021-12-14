/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionF;

import Logic.Funcionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Miguel
 */
public class TableModel extends AbstractTableModel{
    private List<Funcionario> row;
    private String[] colName;
    private int[] cols;

    public TableModel(List<Funcionario> row, int[] cols) {
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
        Funcionario p = row.get(i);
        switch(cols[i1]){
            case 0:return p.getNombre();
            case 1:return p.getApellido1();
            case 2:return p.getApellido2();
            case 3:return p.getCedula();
            case 4:return p.getRol();
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
        colName[4] = "Rol";
    }
    
    public Funcionario getRowAt(int x){
        return row.get(x);
    }
}
