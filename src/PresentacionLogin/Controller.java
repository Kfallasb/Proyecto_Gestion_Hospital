/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionLogin;

import Aplicacion.App;
import Logic.Funcionario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setControl(this);
        this.view.setModel(model);
    }

    public void getAcceso(String usuario, String clave) {
        try {
            Funcionario f = Data.Model.getInstance().getAcceso(usuario, clave);
            if(f != null){
                App.CONTROLP.arrancar(f);
                view.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            model.setF(new Funcionario());
        }
    }

    public void init() {
        model.setF(new Funcionario());
        view.setVisible(true);
    }

    public void fin() {
        view.dispose();
    }
    
}
