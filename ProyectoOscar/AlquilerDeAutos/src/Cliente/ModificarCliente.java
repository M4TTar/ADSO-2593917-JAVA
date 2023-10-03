
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


public class ModificarCliente extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;
    Persona listaPersonas[];

    public ModificarCliente(MenuAdministrador ventanaMenu,Persona listaPersonas[]) {
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputCorreo = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        etqDireccion = new javax.swing.JLabel();
        inputDireccion = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        inputBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Cliente");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        etqNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombre.setText("Nombre:");

        inputNombre.setEditable(false);
        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        inputCorreo.setEditable(false);
        inputCorreo.setBackground(new java.awt.Color(255, 255, 255));
        inputCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTelefono.setText("Telefono:");

        etqCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqCorreo.setText("Correo:");

        inputTelefono.setEditable(false);
        inputTelefono.setBackground(new java.awt.Color(255, 255, 255));
        inputTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        etqDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqDireccion.setText("Direccion:");

        inputDireccion.setEditable(false);
        inputDireccion.setBackground(new java.awt.Color(255, 255, 255));
        inputDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MODIFICAR  CLIENTE");

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
                .addComponent(inputBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputCorreo)
                    .addComponent(inputNombre)
                    .addComponent(inputTelefono)
                    .addComponent(inputDireccion))
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
                    .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDireccion))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = inputBuscar.getText();
        Persona temporal =this.ventanaMenu.database.buscarCliente( String.valueOf( cedula));
        
        if (temporal != null) {
            habilitarCampo(inputBuscar);
            habilitarCampo(inputNombre);
            habilitarCampo(inputTelefono);
            habilitarCampo(inputCorreo);
            habilitarCampo(inputDireccion);
            inputBuscar.setText(temporal.getCedula());
            inputNombre.setText(temporal.getNombre());
            inputTelefono.setText( temporal.getTelefono());
            inputCorreo.setText( temporal.getCorreo());
            inputDireccion.setText( temporal.getDireccion());
            inputBuscar.requestFocus();
            btnModificar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "El ADMIN NO EXISTE.", "error");
            inputBuscar.setText("");
            inputNombre.setText("");
            inputTelefono.setText("");
            inputCorreo.setText("");
            inputDireccion.setText("");
            deshabilitarCampo(inputNombre);
            deshabilitarCampo(inputTelefono);
            deshabilitarCampo(inputCorreo);
            deshabilitarCampo(inputDireccion);
            
            
            inputBuscar.requestFocus();
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String cedula = inputBuscar.getText();
        String nombre = inputNombre.getText();
        String telefono = inputTelefono.getText();
        String correo = inputCorreo.getText();
        String direccion = inputDireccion.getText();
        Persona temporal = new Persona(cedula, nombre, telefono,correo, direccion);
        
        if (!cedula.equals("") && !nombre.equals("") && !telefono.equals("") && !correo.equals("") && !direccion.equals("")) {
            boolean proceso = this.ventanaMenu.database.editarCliente(temporal);
            Alert alerta = new Alert("EXITO", "Datos editados correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public void deshabilitarCampo(JTextField input){
        JTextField referencia = new JTextField();
        input.setBorder( referencia.getBorder() );
        input.setEnabled(false);
        input.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField input){
        inputNombre.setEditable(true);
        inputTelefono.setEditable(true);
        inputCorreo.setEditable(true);
        inputDireccion.setEditable(true);
        input.setEnabled(true);
        input.setBackground(Color.WHITE );
    }
    
    public void validarTodosInputs(){
        validarInput(inputBuscar);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputCorreo;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputTelefono;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
