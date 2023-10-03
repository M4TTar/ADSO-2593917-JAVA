
package Cliente;

import Administrador.Alert;
import Administrador.MenuAdministrador;
import Clases.Persona;
import java.awt.Color;
import javax.swing.JTextField;


public class EliminarCliente extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;
    Persona listaPersonas[];

    public EliminarCliente(MenuAdministrador ventanaMenu,Persona listaPersonas[]) {
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        cedula = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        inputBuscar = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        inputDireccion = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputCorreo = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Cliente");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnCancelar.setBackground(new java.awt.Color(0, 153, 51));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(0, 0, 0));
        cedula.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cedula.setText("Cedula:");

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        inputBuscar.setForeground(new java.awt.Color(0, 0, 0));

        etqDireccion.setBackground(new java.awt.Color(0, 0, 0));
        etqDireccion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqDireccion.setText("Direccion:");

        btnBuscar.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        inputDireccion.setEditable(false);
        inputDireccion.setBackground(new java.awt.Color(255, 255, 255));
        inputDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR CLIENTE");

        etqNombre.setBackground(new java.awt.Color(0, 0, 0));
        etqNombre.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombre.setText("Nombre:");

        inputNombre.setEditable(false);
        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        inputCorreo.setEditable(false);
        inputCorreo.setBackground(new java.awt.Color(255, 255, 255));
        inputCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTelefono.setBackground(new java.awt.Color(0, 0, 0));
        etqTelefono.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTelefono.setText("Telefono:");

        etqCorreo.setBackground(new java.awt.Color(0, 0, 0));
        etqCorreo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqCorreo.setText("Correo:");

        inputTelefono.setEditable(false);
        inputTelefono.setBackground(new java.awt.Color(255, 255, 255));
        inputTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCorreo)
                    .addComponent(inputNombre)
                    .addComponent(inputTelefono)
                    .addComponent(inputDireccion))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = inputBuscar.getText();
        Persona temporal =this.ventanaMenu.database.buscarCliente(( cedula));
        
        if (temporal != null) {
            inputBuscar.setText(temporal.getCedula());
            inputNombre.setText(temporal.getNombre());
            inputTelefono.setText((temporal.getTelefono()) );
            inputCorreo.setText((temporal.getCorreo()) );
            inputDireccion.setText((temporal.getDireccion()) );
            inputBuscar.requestFocus();
            btnEliminar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", " ESTE PRODUCTO NO ESTA REGISTRADO.", "error");
            inputBuscar.setText("");
            inputNombre.setText("");
            inputTelefono.setText("");
            inputCorreo.setText("");
            inputDireccion.setText("");
            deshabilitarCampo(inputBuscar);
            deshabilitarCampo(inputNombre);
            deshabilitarCampo(inputTelefono);
            deshabilitarCampo(inputCorreo);
            deshabilitarCampo(inputDireccion);
            inputBuscar.requestFocus();
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void deshabilitarCampo(JTextField input){
        JTextField referencia = new JTextField();
        input.setBorder( referencia.getBorder() );
        input.setEnabled(false);
        input.setBackground(Color.WHITE );
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String documento = inputBuscar.getText();
        String cedula = inputBuscar.getText();
        String nombre = inputNombre.getText();
        String telefono = inputTelefono.getText();
        String correo = inputCorreo.getText();
        String direccion = inputDireccion.getText();
        Persona temporal = new Persona(cedula, nombre, telefono, correo, direccion);
        
        if (!documento.equals("") && !cedula.equals("") && !nombre.equals("") && !telefono.equals("") && !correo.equals("") && !direccion.equals("")) {
            boolean proceso = this.ventanaMenu.database.eliminarCliente(temporal);
            Alert alerta = new Alert("EXITO", "Cliente  Eliminado.", "success");
            inputBuscar.setText("");
            inputNombre.setText("");
            inputTelefono.setText("");
            inputCorreo.setText("");
            inputDireccion.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        deshabilitarCampo(inputNombre);
        deshabilitarCampo(inputTelefono);
        deshabilitarCampo(inputCorreo);
        deshabilitarCampo(inputDireccion);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
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
