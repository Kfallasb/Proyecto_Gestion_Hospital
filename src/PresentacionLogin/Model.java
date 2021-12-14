/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionLogin;

import Logic.Funcionario;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Miguel
 */
public class Model extends Observable{
    private Funcionario f;

    public Model() {
        f = new Funcionario();
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
