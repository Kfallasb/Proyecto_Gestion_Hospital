/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Miguel
 */
public class Paciente {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String fecha;
    private String patologia;

    public Paciente(String nombre, String apellido1, String apellido2, String cedula, String fecha, String patologia) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.fecha = fecha;
        this.patologia = patologia;
    }

    public Paciente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public void guardar(PrintWriter escribe) {
        escribe.println(nombre);
        escribe.println(apellido1);
        escribe.println(apellido2);
        escribe.println(cedula);
        escribe.println(fecha);
        escribe.println(patologia);
    }

    public Paciente cargarDatos(BufferedReader almacen) {
        String nom;
        String ape1;
        String ape2;
        String ced;
        String fe;
        String pa;
        try {
            nom = almacen.readLine();
            ape1 = almacen.readLine();
            ape2 = almacen.readLine();
            ced = almacen.readLine();
            fe = almacen.readLine();
            pa = almacen.readLine();
            if (nom == null) {
                return null;
            } else {
                return new Paciente(nom, ape1, ape2, ced, fe, pa);
            }
        } catch (Exception e) {
            return null;
        }
    }

}
