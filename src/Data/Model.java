/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Funcionario;
import Logic.Paciente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Miguel
 */
public class Model {
    private static Model instances = null;
    private Map<String, Funcionario> funcionarios;
    private Map<String, Paciente> pacientes;

    private Model() {
        funcionarios = new HashMap<>();
        pacientes = new HashMap<>();
    }
    
    public void addPaciente(Paciente p) throws Exception {
        if(pacientes.get(p.getCedula()) == null){
            pacientes.put(p.getCedula(), p);
        }else{
            throw new Exception("Ya existe Paciente");
        }
    }
    public static Model getInstance(){
        if(instances == null){
            instances = new Model();
        }
        return instances;
    }
    
    public void guardar(){
        guardarFuncionarios();
        guardarPacientes();
    }
    
    public void cargar(){
        cargaFuncionarios();
        cargaPacientes();
    }
    
    public Funcionario getAcceso(String usuario, String clave) throws Exception {
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            Funcionario f = entry.getValue();
            if(f.getClave().equals(clave) && f.getUsuario().equals(usuario)){
                return f;
            }
            
        }
        throw new Exception("No existe Funcionario registrado");
    }
    
    private void cargaPacientes(){
        File file = new File("Pacientes.txt");
        FileReader leer;
        BufferedReader almacen;
        Paciente aux, per = new Paciente();
        try {
            leer = new FileReader(file);
            almacen = new BufferedReader(leer);
            aux = per.cargarDatos(almacen);
            while(aux != null){
                pacientes.put(aux.getCedula(), aux);
                aux = per.cargarDatos(almacen);
            }
            almacen.close();
            leer.close();
        } catch (Exception e) {
        }
    }
    
    private void cargaFuncionarios(){
        File file = new File("Funcionarios.txt");
        FileReader leer;
        BufferedReader almacen;
        Funcionario aux, per = new Funcionario();
        try {
            leer = new FileReader(file);
            almacen = new BufferedReader(leer);
            aux = per.cargarDatos(almacen);
            while(aux != null){
                funcionarios.put(aux.getCedula(), aux);
                aux = per.cargarDatos(almacen);
            }
            leer.close();
            almacen.close();
        } catch (Exception e) {
        }
    }
    
    private void guardarPacientes(){
        File archivo = new File("Pacientes.txt");
        PrintWriter escribe;
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribe = new PrintWriter(archivo, "utf-8");
            for (Map.Entry<String, Paciente> entry : pacientes.entrySet()) {
                entry.getValue().guardar(escribe);
                
            }
            escribe.close();
        } catch (Exception e) {
        }
    }
    
    private void guardarFuncionarios(){
        File archivo = new File("Funcionarios.txt");
        PrintWriter escribe;
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribe = new PrintWriter(archivo, "utf-8");
            for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
                entry.getValue().guardar(escribe);
                
            }
            escribe.close();
        } catch (Exception e) {
        }
    }

    public List<Paciente> getPacientes() {
        List<Paciente> lis = new ArrayList<>();
        for (Map.Entry<String, Paciente> entry : pacientes.entrySet()) {
            lis.add(entry.getValue());
            
        }
        return lis;
    }

    public List<Paciente> getPaciente(String b) throws Exception{
        List<Paciente> p = new ArrayList<>();
        Paciente x = pacientes.get(b);
        if(x != null){
            p.add(x);
            return p;
        }
        throw new Exception("No existe paciente con esa cedula");
    }

    public void modificarPaciente(Paciente p) {
        Paciente pa = pacientes.get(p.getCedula());
        if(pa != null){
            pa.setNombre(p.getNombre());
            pa.setApellido1(p.getApellido1());
            pa.setApellido2(p.getApellido2());
            pa.setFecha(p.getFecha());
            pa.setPatologia(p.getPatologia());
        }
    }

    public void eliminarPaciente(Paciente p) {
        pacientes.remove(p.getCedula());
    }

    public void addFuncionario(Funcionario f) throws Exception {
        if(funcionarios.get(f.getCedula()) == null){
            funcionarios.put(f.getCedula(), f);
        }else{
            throw new Exception("Ya existe Funcionario");
        }
    }

    public void modificarFuncionario(Funcionario f) {
        Funcionario pa = funcionarios.get(f.getCedula());
        if(pa != null){
            pa.setNombre(f.getNombre());
            pa.setApellido1(f.getApellido1());
            pa.setApellido2(f.getApellido2());
            pa.setClave(f.getClave());
            pa.setUsuario(f.getUsuario());
            pa.setRol(f.getRol());
        }
    }

    public List<Funcionario> getFuncionarios() {
        List<Funcionario> lis = new ArrayList<>();
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            lis.add(entry.getValue());
            
        }
        return lis;
    }

    public List<Funcionario> getFuncionario(String b) throws Exception {
        List<Funcionario> p = new ArrayList<>();
        Funcionario x = funcionarios.get(b);
        if(x != null){
            p.add(x);
            return p;
        }
        throw new Exception("No existe Funcionario con esa cedula");
    }

    public void eliminarFuncionario(Funcionario p) {
        funcionarios.remove(p.getCedula());
    }
}
