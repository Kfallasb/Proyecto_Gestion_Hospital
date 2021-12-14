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
public class Funcionario {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private int rol;
    private String clave;
    private String usuario;

    public Funcionario(String nombre, String apellido1, String apellido2, String cedula, int rol, String clave, String usuario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.rol = rol;
        this.clave = clave;
        this.usuario = usuario;
    }

    public Funcionario() {
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

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void guardar(PrintWriter escribe) {
        escribe.println(nombre);
        escribe.println(apellido1);
        escribe.println(apellido2);
        escribe.println(cedula);
        escribe.println(rol);
        escribe.println(clave);
        escribe.println(usuario);
    }

    public Funcionario cargarDatos(BufferedReader almacen) {
        String nom;
        String ape1;
        String ape2;
        String ced;
        int ro;
        String cla;
        String us;

        try {
            nom = almacen.readLine();
            ape1 = almacen.readLine();
            ape2 = almacen.readLine();
            ced = almacen.readLine();
            ro = Integer.parseInt(almacen.readLine());
            cla = almacen.readLine();
            us = almacen.readLine();
            if (nom == null) {
                return null;
            } else {
                return new Funcionario(nom, ape1, ape2, ced, ro, cla, us);
            }

        } catch (Exception e) {
            return null;
        }
    }

}
