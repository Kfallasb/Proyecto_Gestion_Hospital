/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Aplicacion.App;
import Logic.Funcionario;

/**
 *
 * @author Miguel
 */
public class Control {
    private Model model;
    private View view;
    public Control(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setControl(this);
        this.view.setModel(model);
    }

    public void arrancar(Funcionario f) {
        model.setF(f);
        view.setVisible(true);
    }

    public void reabrir() {
        view.dispose();
        
        App.CONTROLLOGIN.init();
    }

    public void initInternos() {
        App.CONTROLI.init();
    }

    private void close() {
        view.dispose();
    }
}
