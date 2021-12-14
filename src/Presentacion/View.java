/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Aplicacion.App;
import Logic.Funcionario;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class View extends javax.swing.JFrame implements Observer{
    private Model model;
    private Control control;
    
    public View() {
        initComponents();
        this.setSize(this.getMaximumSize());
        this.setTitle("Sistema de Internamiento");
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    @Override
    public void update(Observable o, Object o1) {
        Funcionario f = model.getF();
        nombre.setText(f.getNombre());
        ape1.setText(f.getApellido1());
        ape2.setText(f.getApellido2());
        ced.setText(f.getCedula());
        int r = f.getRol();
        if(r == 1){
            admi.setEnabled(true);
        }else{
            admi.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        panel = new javax.swing.JDesktopPane();
        nombre = new javax.swing.JLabel();
        ape1 = new javax.swing.JLabel();
        ape2 = new javax.swing.JLabel();
        ced = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        administrador = new javax.swing.JMenu();
        inter = new javax.swing.JMenuItem();
        admi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 102, 0));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("jLabel1");
        panel.add(nombre);
        nombre.setBounds(20, 30, 150, 17);

        ape1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ape1.setForeground(new java.awt.Color(255, 255, 255));
        ape1.setText("jLabel1");
        panel.add(ape1);
        ape1.setBounds(120, 30, 120, 17);

        ape2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ape2.setForeground(new java.awt.Color(255, 255, 255));
        ape2.setText("jLabel1");
        panel.add(ape2);
        ape2.setBounds(220, 30, 130, 17);

        ced.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ced.setForeground(new java.awt.Color(255, 255, 255));
        ced.setText("jLabel1");
        panel.add(ced);
        ced.setBounds(310, 30, 110, 14);

        administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Configuraciones.png"))); // NOI18N
        administrador.setText("Administrar");

        inter.setText("Internos");
        inter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interActionPerformed(evt);
            }
        });
        administrador.add(inter);

        admi.setText("Administrativos");
        admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admiActionPerformed(evt);
            }
        });
        administrador.add(admi);

        menuBar.add(administrador);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Archivo.png"))); // NOI18N
        jMenu3.setText("Acerca de");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        menuBar.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Data.Model.getInstance().guardar();
        control.reabrir();
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiActionPerformed
        App.CONTROLF.init();
    }//GEN-LAST:event_admiActionPerformed

    private void interActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interActionPerformed
        control.initInternos();
    }//GEN-LAST:event_interActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        JOptionPane.showMessageDialog(null, "Sistema Gestión Hospital");
    }//GEN-LAST:event_jMenu3MouseClicked

    public void addInternalFrame(JInternalFrame f){
        this.panel.add(f);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admi;
    private javax.swing.JMenu administrador;
    private javax.swing.JLabel ape1;
    private javax.swing.JLabel ape2;
    private javax.swing.JLabel ced;
    private javax.swing.JMenuItem inter;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nombre;
    private javax.swing.JDesktopPane panel;
    // End of variables declaration//GEN-END:variables


}
