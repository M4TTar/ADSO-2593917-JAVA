
package Principal;

import Administrador.Alert;
import Administrador.MenuAdministrador;
import Clases.DataBase;
import Cliente.MenuCliente;


public class Login extends javax.swing.JFrame {
    
    public DataBase db;
    public Login() {
        this.db = new DataBase();
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenLogin = new javax.swing.JPanel();
        division = new javax.swing.JPanel();
        TituloLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etqUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        etqContraseña = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        campoContrasena = new javax.swing.JPasswordField();
        campoSelect = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setResizable(false);

        contenLogin.setBackground(new java.awt.Color(204, 204, 255));

        division.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout divisionLayout = new javax.swing.GroupLayout(division);
        division.setLayout(divisionLayout);
        divisionLayout.setHorizontalGroup(
            divisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        divisionLayout.setVerticalGroup(
            divisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TituloLogin.setBackground(new java.awt.Color(0, 0, 0));
        TituloLogin.setFont(new java.awt.Font("Stencil", 3, 18)); // NOI18N
        TituloLogin.setText("ALQUILER DE AUTOS");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alquilerlogin.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_login.png"))); // NOI18N

        etqUsuario.setBackground(new java.awt.Color(0, 0, 0));
        etqUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqUsuario.setText("Usuario:");

        campoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqContraseña.setBackground(new java.awt.Color(0, 0, 0));
        etqContraseña.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqContraseña.setText("Contraseña:");

        btnIngresar.setBackground(new java.awt.Color(0, 153, 51));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setFocusable(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        campoContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        campoSelect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Tipo Usuario:");

        javax.swing.GroupLayout contenLoginLayout = new javax.swing.GroupLayout(contenLogin);
        contenLogin.setLayout(contenLoginLayout);
        contenLoginLayout.setHorizontalGroup(
            contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenLoginLayout.createSequentialGroup()
                .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenLoginLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenLoginLayout.createSequentialGroup()
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenLoginLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(etqUsuario)
                                .addGap(41, 41, 41)
                                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(contenLoginLayout.createSequentialGroup()
                                    .addGap(170, 170, 170)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contenLoginLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etqContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(contenLoginLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        contenLoginLayout.setVerticalGroup(
            contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenLoginLayout.createSequentialGroup()
                .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenLoginLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(TituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenLoginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqUsuario)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqContraseña)
                            .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(15, 15, 15)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoContrasena, campoSelect, campoUsuario});

        contenLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {etqContraseña, etqUsuario, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = campoUsuario.getText();
        String contrasena = campoContrasena.getText();
        String Opcion = campoSelect.getSelectedItem().toString();
        if(!usuario.equalsIgnoreCase("") && !contrasena.equalsIgnoreCase("")&& Opcion.equalsIgnoreCase("Administrador")){
            boolean valido = this.db.validarAdmin(usuario, contrasena);
            if(valido){
                MenuAdministrador menuadmin = new MenuAdministrador(this);
                menuadmin.setVisible(true);
                setVisible(false);
                campoUsuario.setText("");
                campoContrasena.setText(""); 
                campoUsuario.requestFocus();
            }else if(!valido){
                Alert alerta = new Alert("NO EXISTE", " EL ADMINISTRADOR NO EXISTE.", "error");
                campoUsuario.setText("");
                campoContrasena.setText(""); 
                campoUsuario.requestFocus();
            }
        } 
        if(!usuario.equalsIgnoreCase("") && !contrasena.equalsIgnoreCase("")&& Opcion.equals("Cliente")){
            String nombre = new String(campoUsuario.getText());
            boolean valido = this.db.validarCliente(usuario, contrasena);
            if(valido){
                MenuCliente menucliente = new MenuCliente(this,nombre);
                menucliente.setVisible(true);
                setVisible(false); 
                campoUsuario.setText("");
                campoContrasena.setText(""); 
                campoUsuario.requestFocus();
            }else if(!valido){
                Alert alerta = new Alert("NO EXISTE", " EL CLIENTE NO EXISTE.", "error");
                campoUsuario.setText("");
                campoContrasena.setText(""); 
                campoUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloLogin;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JComboBox<String> campoSelect;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JPanel contenLogin;
    private javax.swing.JPanel division;
    private javax.swing.JLabel etqContraseña;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
