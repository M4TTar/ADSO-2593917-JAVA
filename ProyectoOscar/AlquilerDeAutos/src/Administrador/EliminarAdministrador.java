
package Administrador;

import Clases.Administrador;
import java.awt.Color;
import javax.swing.JTextField;


public class EliminarAdministrador extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;

    public EliminarAdministrador(MenuAdministrador ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCancelar1 = new javax.swing.JButton();
        cedula = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        inputBuscar = new javax.swing.JTextField();
        etqEstado = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        inputEstado = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JLabel();
        etqNombre1 = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        inputContraseña = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eliminar Administrador");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnCancelar1.setBackground(new java.awt.Color(0, 153, 51));
        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.setFocusable(false);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(0, 0, 0));
        cedula.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setText("Documento:");

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        inputBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputBuscar.setForeground(new java.awt.Color(0, 0, 0));

        etqEstado.setBackground(new java.awt.Color(0, 0, 0));
        etqEstado.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqEstado.setForeground(new java.awt.Color(0, 0, 0));
        etqEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqEstado.setText("Estado:");

        btnBuscar.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        inputEstado.setEditable(false);
        inputEstado.setBackground(new java.awt.Color(255, 255, 255));
        inputEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR ADMINISTRADOR");

        etqNombre1.setBackground(new java.awt.Color(0, 0, 0));
        etqNombre1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqNombre1.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombre1.setText("Cedula:");

        inputCedula.setEditable(false);
        inputCedula.setBackground(new java.awt.Color(255, 255, 255));
        inputCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        inputContraseña.setEditable(false);
        inputContraseña.setBackground(new java.awt.Color(255, 255, 255));
        inputContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTelefono.setBackground(new java.awt.Color(0, 0, 0));
        etqTelefono.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTelefono.setText("Nombre:");

        etqCorreo.setBackground(new java.awt.Color(0, 0, 0));
        etqCorreo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(0, 0, 0));
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqCorreo.setText("Contraseña");

        inputNombre.setEditable(false);
        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputContraseña)
                    .addComponent(inputCedula)
                    .addComponent(inputNombre)
                    .addComponent(inputEstado))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String documento = inputBuscar.getText();
        String cedula = inputCedula.getText();
        String nombre = inputNombre.getText();
        String contraseña = inputContraseña.getText();
        String estado = inputEstado.getText();
        Administrador temporal = new Administrador(cedula, nombre, contraseña, estado);
        
        if (!documento.equals("") && !cedula.equals("") && !nombre.equals("") && !contraseña.equals("") && !estado.equals("")) {
            boolean proceso = this.ventanaMenu.database.eliminarAdmin(temporal);
            Alert alerta = new Alert("EXITO", "Administrador Eliminado.", "success");
            inputCedula.setText("");
            inputNombre.setText("");
            inputContraseña.setText("");
            inputEstado.setText("");
            inputCedula.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = inputBuscar.getText();
        Administrador temporal =this.ventanaMenu.database.buscarAdmin(( cedula));
        
        if (temporal != null) {
            inputCedula.setText(temporal.getCedula());
            inputNombre.setText(temporal.getNombre());
            inputContraseña.setText((temporal.getContraseña()) );
            inputEstado.setText((temporal.getEstado()) );
            inputCedula.requestFocus();
            btnEliminar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", " ESTE ADMINISTRADOR NO ESTA REGISTRADO.", "error");
            inputCedula.setText("");
            inputNombre.setText("");
            inputContraseña.setText("");
            inputEstado.setText("");
            deshabilitarCampo(inputCedula);
            deshabilitarCampo(inputNombre);
            deshabilitarCampo(inputContraseña);
            deshabilitarCampo(inputEstado);
            inputCedula.requestFocus();
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    public void deshabilitarCampo(JTextField input){
        JTextField referencia = new JTextField();
        input.setBorder( referencia.getBorder() );
        input.setEnabled(false);
        input.setBackground(Color.WHITE );
    }
     
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setTitle("Administrador");
        etqTitulo.setText("ELIMINAR ADMINNISTRADOR ");
        
        deshabilitarCampo(inputCedula);
        deshabilitarCampo(inputNombre);
        deshabilitarCampo(inputContraseña);
        deshabilitarCampo(inputEstado);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqNombre1;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputContraseña;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
