/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionF;

import Logic.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

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

    public void agregar(boolean b, String nom, String ape1, String ape2, String ced, int rol, String user, String pass) {
        try {
            Funcionario f = new Funcionario(nom, ape1, ape2, ced, rol, user, pass);
            if(!b){
                Data.Model.getInstance().addFuncionario(f);
            }else{
                Data.Model.getInstance().modificarFuncionario(f);
            }
            solTodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        model.setF(new Funcionario());
        model.setEditar(false);
    }
    
    public void solTodos() {
        List<Funcionario> row = Data.Model.getInstance().getFuncionarios();
        model.setRow(row);
    }
    
    public void editar() {
        model.setEditar(true);
    }
    
    public void buscarFuncionario(String b) {
        try {
            List<Funcionario> row = Data.Model.getInstance().getFuncionario(b);
            model.setRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void recuperarEditable(int row) {
        Funcionario p = model.getTablita().getRowAt(row);
        model.setF(p);
    }
    
    public void eliminar(int x) {
        Funcionario p = model.getTablita().getRowAt(x);
        Data.Model.getInstance().eliminarFuncionario(p);
        List<Funcionario> row = Data.Model.getInstance().getFuncionarios();
        model.setRow(row);
    }
    
    public void cancelar() {
        model.setF(new Funcionario());
    }
    
    public void init() {
        view.setVisible(true);
    }

    public void close() {
        view.dispose();
    }
}
