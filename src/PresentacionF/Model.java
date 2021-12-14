/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionF;

import Logic.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Miguel
 */
public class Model extends Observable{
    private List<Funcionario> row;
    private boolean editar;
    private Funcionario f;
    private TableModel tablita;
    private int[] cols = {0,1,2,3,4};

    public Model() {
        editar = false;
        row = new ArrayList<>();
        f = new Funcionario();
        tablita = new TableModel(row, cols);
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public TableModel getTablita() {
        return tablita;
    }

    public List<Funcionario> getRow() {
        return row;
    }

    public void setRow(List<Funcionario> r) {
        tablita = new TableModel(r, cols);
        refresh();
    }

    public Funcionario getF() {
        return f;
    }

    public void setF(Funcionario f) {
        this.f = f;
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
