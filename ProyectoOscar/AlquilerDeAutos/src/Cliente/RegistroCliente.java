
package Cliente;

import Administrador.Alert;
import Administrador.MenuAdministrador;
import Clases.Persona;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class RegistroCliente extends javax.swing.JFrame {

    MenuAdministrador ventanaMenu;
    Persona listaPersonas[];
    
    public RegistroCliente(MenuAdministrador ventanaMenu,Persona listaPersonas[]){
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor1 = new javax.swing.JPanel();
        inputCorreo = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        etqDireccion = new javax.swing.JLabel();
        inputDireccion = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Usuario");

        contenedor1.setBackground(new java.awt.Color(204, 204, 255));

        inputCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqCorreo.setBackground(new java.awt.Color(0, 0, 0));
        etqCorreo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqCorreo.setText("Correo:");

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

        etqDireccion.setBackground(new java.awt.Color(0, 0, 0));
        etqDireccion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqDireccion.setText("Direccion:");

        inputDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("REGISTRAR CLIENTE");

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

        etqTelefono.setBackground(new java.awt.Color(0, 0, 0));
        etqTelefono.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTelefono.setText("Telefono:");

        inputTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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
                                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(etqDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputCorreo)
                                    .addComponent(inputNombre)
                                    .addComponent(inputTelefono)
                                    .addComponent(inputDireccion))))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(contenedor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
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
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDireccion))
                .addGap(27, 27, 27)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String telefono = inputTelefono.getText();
        String correo = inputCorreo.getText();
        String direccion = inputDireccion.getText();
        if (!cedula.equals("") && !nombre.equals("") && !telefono.equals("") && !correo.equals("") && !direccion.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                boolean proceso = this.ventanaMenu.database.insertarCliente(cedula, nombre,telefono,correo, direccion);
                this.ventanaMenu.setVisible(true);
                this.ventanaMenu.alertCreacionUsuario();
                dispose();
            }else{
                Alert alerta = new Alert("CODIGO", "El Cliente  Ingresado Ya Existe", "error");
            }
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    public void validarTodosInputs(){
        validarInput(inputCedula);
        validarInput(inputNombre);
        validarInput(inputTelefono);
        validarInput(inputCorreo);
        validarInput(inputDireccion);
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
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel contenedor1;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputCorreo;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputTelefono;
    // End of variables declaration//GEN-END:variables
}
