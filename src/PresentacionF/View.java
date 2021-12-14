/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionF;

import Logic.Funcionario;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class View extends javax.swing.JInternalFrame implements Observer{

    private Model model;
    private Control control;
    
    public View() {
        initComponents();
        desahabilitar();
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
        if(model.isEditar()){
            ahabilitar();
            textCed.setEnabled(true);
        }
        tablita.setModel(model.getTablita());
        textNombre.setText(f.getNombre());
        textApe1.setText(f.getApellido1());
        textApe2.setText(f.getApellido2());
        textCed.setText(f.getCedula());
        textClave.setText(f.getClave());
        textUser.setText(f.getUsuario());
        comRol.setSelectedIndex(f.getRol());
        textBuscar.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nom3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        ape7 = new javax.swing.JLabel();
        textApe1 = new javax.swing.JTextField();
        ape8 = new javax.swing.JLabel();
        textApe2 = new javax.swing.JTextField();
        ced3 = new javax.swing.JLabel();
        textCed = new javax.swing.JTextField();
        btnGuardar3 = new javax.swing.JButton();
        btnNuevo3 = new javax.swing.JButton();
        btnCancelar3 = new javax.swing.JButton();
        ced4 = new javax.swing.JLabel();
        comRol = new javax.swing.JComboBox<>();
        ced5 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        ced6 = new javax.swing.JLabel();
        textClave = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        textBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Funcionarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        nom3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom3.setForeground(new java.awt.Color(0, 242, 239));
        nom3.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape7.setForeground(new java.awt.Color(0, 242, 239));
        ape7.setText("Apellido 1");

        textApe1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape8.setForeground(new java.awt.Color(0, 242, 239));
        ape8.setText("Apellido 2");

        textApe2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ced3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced3.setForeground(new java.awt.Color(0, 242, 239));
        ced3.setText("Cedula");

        textCed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardar3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btnGuardar3.setText("Guardar");
        btnGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar3ActionPerformed(evt);
            }
        });

        btnNuevo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/nuevo.GIF"))); // NOI18N
        btnNuevo3.setText("Nuevo");
        btnNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo3ActionPerformed(evt);
            }
        });

        btnCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btnCancelar3.setText("Cancelar");
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });

        ced4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced4.setForeground(new java.awt.Color(0, 242, 239));
        ced4.setText("Rol");

        comRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretaria", "Administrador", " " }));

        ced5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced5.setForeground(new java.awt.Color(0, 242, 239));
        ced5.setText("Usuario");

        textUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ced6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced6.setForeground(new java.awt.Color(0, 242, 239));
        ced6.setText("Clave");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar3)
                        .addGap(54, 54, 54)
                        .addComponent(btnNuevo3)
                        .addGap(51, 51, 51)
                        .addComponent(btnCancelar3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ape8)
                        .addGap(73, 73, 73)
                        .addComponent(textApe2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ape7)
                            .addComponent(nom3)
                            .addComponent(ced3)
                            .addComponent(ced4)
                            .addComponent(ced5)
                            .addComponent(ced6))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textApe1)
                            .addComponent(textCed, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comRol, javax.swing.GroupLayout.Alignment.LEADING, 0, 167, Short.MAX_VALUE)
                            .addComponent(textUser)
                            .addComponent(textClave, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(80, 84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom3)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape7)
                    .addComponent(textApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape8)
                    .addComponent(textApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced3)
                    .addComponent(textCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced4)
                    .addComponent(comRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced5)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced6)
                    .addComponent(textClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo3)
                        .addComponent(btnCancelar3)))
                .addGap(35, 35, 35))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lista de Funcionarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablitaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablita);

        textBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(80, 80, 80))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean valida(String nom, String ape1, String ape2, String ced, String user, String pass) {
        if(nom.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar Nombre");
            return false;
        }
        if(ape1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar Apellido 1");
            return false;
        }
        if(ape2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar Apellido 2");
            return false;
        }
        if(ced.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar Cedula");
            return false;
        }
        if(user.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar Usuario");
            return false;
        }
        if(pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar Usuario");
            return false;
        }
        return true;
    }
    
    private void desahabilitar(){
        textApe1.setEnabled(false);
        textApe2.setEnabled(false);
        textCed.setEnabled(false);
        textNombre.setEnabled(false);
        textUser.setEnabled(false);
        textClave.setEnabled(false);
    }
    
    private void ahabilitar(){
        textApe1.setEnabled(true);
        textApe2.setEnabled(true);
        textCed.setEnabled(true);
        textNombre.setEnabled(true);
        textUser.setEnabled(true);
        textClave.setEnabled(true);
    }
    
    private void btnGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar3ActionPerformed
        String nom = textNombre.getText();
        String ape1 = textApe1.getText();
        String ape2 = textApe2.getText();
        String ced = textCed.getText();
        String user = textUser.getText();
        String pass = textClave.getText();
        int rol = comRol.getSelectedIndex();
        if(valida(nom, ape1, ape2, ced, user, pass)){
            control.agregar(model.isEditar(), nom, ape1, ape2, ced, rol, user, pass);
            desahabilitar();
        }
    }//GEN-LAST:event_btnGuardar3ActionPerformed

    private void btnNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo3ActionPerformed
        ahabilitar();
    }//GEN-LAST:event_btnNuevo3ActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        control.cancelar();
        desahabilitar();
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablitaMouseClicked
        if(evt.getClickCount() == 2){
            control.editar();
            int row = tablita.getSelectedRow();
            control.recuperarEditable(row);
        }
    }//GEN-LAST:event_tablitaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String b = textBuscar.getText();
        if(!b.isEmpty()){
            control.buscarFuncionario(b);
        }else{
            control.solTodos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = tablita.getSelectedRow();
        if(x >= 0){
            control.eliminar(x);
        }else{
            JOptionPane.showMessageDialog(null, "Debe escoger el Paciente a eliminar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ape7;
    private javax.swing.JLabel ape8;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnGuardar3;
    private javax.swing.JButton btnNuevo3;
    private javax.swing.JLabel ced3;
    private javax.swing.JLabel ced4;
    private javax.swing.JLabel ced5;
    private javax.swing.JLabel ced6;
    private javax.swing.JComboBox<String> comRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nom3;
    private javax.swing.JTable tablita;
    private javax.swing.JTextField textApe1;
    private javax.swing.JTextField textApe2;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textCed;
    private javax.swing.JPasswordField textClave;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
