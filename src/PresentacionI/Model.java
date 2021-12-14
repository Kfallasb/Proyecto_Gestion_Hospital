/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionI;

import Logic.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Miguel
 */
public class Model extends Observable{

    private boolean editar;
    private Paciente p;
    private List<Paciente> row;
    private int[] col = {0,1,2,3,4,5};
    private TableModel tabla;
    
    public Model() {
        editar = false;
        row = new ArrayList<>();
        p = new Paciente();
        tabla = new TableModel(row, col);
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public List<Paciente> getRow() {
        return row;
    }

    public void setRow(List<Paciente> ro) {
        tabla = new TableModel(ro, col);
        refresh();
    }

    public TableModel getTabla() {
        return tabla;
    }

    public void setTabla(TableModel tabla) {
        this.tabla = tabla;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
        refresh();
    }
    
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        refresh();
    }
    
    private void refresh(){
        setChanged();
        notifyObservers();
    }


    
}
