package Administrador;

import Clases.Administrador;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EditarAdministrador extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;
    
    public EditarAdministrador(MenuAdministrador ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        inputContraseña = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        etqContraseña = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        etqEstado = new javax.swing.JLabel();
        inputEstado = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        inputBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar Administrador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        etqCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqCedula.setText("Cedula:");

        inputCedula.setEditable(false);
        inputCedula.setBackground(new java.awt.Color(255, 255, 255));
        inputCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        inputContraseña.setEditable(false);
        inputContraseña.setBackground(new java.awt.Color(255, 255, 255));
        inputContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombre.setText("Nombre:");

        etqContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqContraseña.setText("Contraseña:");

        inputNombre.setEditable(false);
        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 153, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        etqEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqEstado.setText("Estado:");

        inputEstado.setEditable(false);
        inputEstado.setBackground(new java.awt.Color(255, 255, 255));
        inputEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MODIFICAR  ADMINISTRADOR");

        cedula.setBackground(new java.awt.Color(0, 0, 0));
        cedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cedula.setText("Cedula:");

        inputBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputBuscar.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(inputContraseña)
                    .addComponent(inputCedula)
                    .addComponent(inputNombre)
                    .addComponent(inputEstado))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEstado))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String cedula = inputCedula.getText();
        String nombre = inputNombre.getText();
        String contrasena = inputContraseña.getText();
        String estado = inputEstado.getText();
        Administrador temporal = new Administrador(cedula, nombre, contrasena,estado);
        
        if (!cedula.equals("") && !nombre.equals("") && !contrasena.equals("") && !estado.equals("")) {
            boolean proceso = this.ventanaMenu.database.editarAdmin(temporal);
            Alert alerta = new Alert("EXITO", "Datos editados correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = inputBuscar.getText();
        Administrador temporal =this.ventanaMenu.database.buscarAdmin(cedula);
        
        if (temporal != null) {
            habilitarCampo(inputCedula);
            habilitarCampo(inputNombre);
            habilitarCampo(inputContraseña);
            habilitarCampo(inputEstado);
            inputCedula.setText(temporal.getCedula());
            inputNombre.setText(temporal.getNombre());
            inputContraseña.setText( temporal.getContraseña());
            inputEstado.setText( temporal.getEstado());
            inputCedula.requestFocus();
            btnModificar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "El ADMIN NO EXISTE.", "error");
            inputCedula.setText("");
            inputNombre.setText("");
            inputContraseña.setText("");
            inputEstado.setText("");
            deshabilitarCampo(inputCedula);
            deshabilitarCampo(inputNombre);
            deshabilitarCampo(inputContraseña);
            deshabilitarCampo(inputEstado);
            
            
            inputBuscar.requestFocus();
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    public void deshabilitarCampo(JTextField input){
        JTextField referencia = new JTextField();
        input.setBorder( referencia.getBorder() );
        input.setEnabled(false);
        input.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField input){
        inputNombre.setEditable(true);
        inputContraseña.setEditable(true);
        inputEstado.setEditable(true);
        input.setEnabled(true);
        input.setBackground(Color.WHITE );
    }
    
    public void validarTodosInputs(){
        validarInput(inputCedula);
        validarInput(inputNombre);
        validarInput(inputContraseña);
        validarInput(inputEstado);
    }
    
    public void validarInput(JTextField input){
        if (input.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            input.setBorder(borderRojo);
            input.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            input.setBorder( referencia.getBorder() );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqContraseña;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputContraseña;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
