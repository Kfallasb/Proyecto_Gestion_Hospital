/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionI;

import Logic.Paciente;
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

    public void init() {
        view.setVisible(true);
    }

    public void agregar(boolean b, String nom, String ape1, String ape2, String ced, String pato, String fe) {
        try {
            Paciente p = new Paciente(nom, ape1, ape2, ced, fe, pato);
            if(!b){
                Data.Model.getInstance().addPaciente(p);
            }else{
                Data.Model.getInstance().modificarPaciente(p);
            }
            solTodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        model.setP(new Paciente());
        model.setEditar(false);
    }

    public void cancelar() {
        model.setP(new Paciente());
    }

    public void buscarPaciente(String b) {
        try {
            List<Paciente> row = Data.Model.getInstance().getPaciente(b);
            model.setRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void solTodos() {
        List<Paciente> row = Data.Model.getInstance().getPacientes();
        model.setRow(row);
    }

    public void editar() {
        model.setEditar(true);
    }

    public void recuperarEditable(int row) {
        Paciente p = model.getTabla().getRowAt(row);
        model.setP(p);
    }

    public void eliminar(int x) {
        Paciente p = model.getTabla().getRowAt(x);
        Data.Model.getInstance().eliminarPaciente(p);
        List<Paciente> row = Data.Model.getInstance().getPacientes();
        model.setRow(row);
    }

    public void close() {
        view.dispose();
    }
}
