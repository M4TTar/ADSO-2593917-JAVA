
package Administrador;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class RegistrarAdministrador extends javax.swing.JFrame {

    MenuAdministrador ventanaMenu;
    
    public RegistrarAdministrador(MenuAdministrador ventanaMenu) {
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

        contenedor1 = new javax.swing.JPanel();
        inputEstado = new javax.swing.JTextField();
        etqEstado = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        etqTitulo = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        etqContraseña = new javax.swing.JLabel();
        inputContraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Administrador");
        setResizable(false);

        contenedor1.setBackground(new java.awt.Color(204, 204, 255));

        inputEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqEstado.setBackground(new java.awt.Color(0, 0, 0));
        etqEstado.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqEstado.setText("Estado:");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("REGISTRAR ADMINISTRADOR");

        etqCedula.setBackground(new java.awt.Color(0, 0, 0));
        etqCedula.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqCedula.setText("Cedula:");

        inputCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqNombre.setBackground(new java.awt.Color(0, 0, 0));
        etqNombre.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombre.setText("Nombre:");

        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqContraseña.setBackground(new java.awt.Color(0, 0, 0));
        etqContraseña.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqContraseña.setText("Contraseña:");

        inputContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout contenedor1Layout = new javax.swing.GroupLayout(contenedor1);
        contenedor1.setLayout(contenedor1Layout);
        contenedor1Layout.setHorizontalGroup(
            contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(contenedor1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedor1Layout.createSequentialGroup()
                                .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputCedula))
                            .addGroup(contenedor1Layout.createSequentialGroup()
                                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(etqContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputEstado)
                                    .addComponent(inputNombre)
                                    .addComponent(inputContraseña))))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        contenedor1Layout.setVerticalGroup(
            contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String cedula = inputCedula.getText();
        String nombre = inputNombre.getText();
        String contrasena = inputContraseña.getText();
        String estado = inputEstado.getText();
        if (!cedula.equals("") && !nombre.equals("") && !contrasena.equals("") && !estado.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                //Producto temporal = new Producto( Integer.valueOf(codigo) , nombre, Integer.valueOf(precio));
                boolean proceso = this.ventanaMenu.database.insertarAdmin(cedula, nombre,contrasena,estado);
                this.ventanaMenu.setVisible(true);
                this.ventanaMenu.alertCreacionUsuario();
                dispose();
            }else{
                Alert alerta = new Alert("CODIGO", "El Producto Ingresado Ya Existe", "error");
            }
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel contenedor1;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqContraseña;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputContraseña;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputNombre;
    // End of variables declaration//GEN-END:variables
}
