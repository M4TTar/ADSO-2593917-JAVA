package Cliente;

import Administrador.AlquilarAuto;
import Clases.Autos;
import Clases.Registro;
import Principal.Login;

public class MenuCliente extends javax.swing.JFrame {
    
   Login login;
   String nombre;
   private Autos AlquilarAuto;
       
   
   public AlquilarAuto realizaralquiler;
    public MenuCliente(Login login,String nombre) {
        this.login = login;
        this.nombre= nombre;
        
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenPrincipal = new javax.swing.JPanel();
        Perfil = new javax.swing.JLabel();
        etqTexto = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        btnAlquilarAuto = new javax.swing.JButton();
        btnAutosAlquilados = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Cliente");
        setResizable(false);

        ContenPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        Perfil.setBackground(new java.awt.Color(255, 255, 255));
        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_login.png"))); // NOI18N

        etqTexto.setBackground(new java.awt.Color(0, 0, 0));
        etqTexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTexto.setText("Bienvenido");

        etqNombre.setBackground(new java.awt.Color(0, 0, 0));
        etqNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAlquilarAuto.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnAlquilarAuto.setForeground(new java.awt.Color(51, 51, 51));
        btnAlquilarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alquilarauto.png"))); // NOI18N
        btnAlquilarAuto.setText("ALQUILAR AUTO");
        btnAlquilarAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAlquilarAuto.setFocusable(false);
        btnAlquilarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarAutoActionPerformed(evt);
            }
        });

        btnAutosAlquilados.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnAutosAlquilados.setForeground(new java.awt.Color(51, 51, 51));
        btnAutosAlquilados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alquilarauto.png"))); // NOI18N
        btnAutosAlquilados.setText("AUTOS ALQUILADOS");
        btnAutosAlquilados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAutosAlquilados.setFocusable(false);
        btnAutosAlquilados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosAlquiladosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenPrincipalLayout = new javax.swing.GroupLayout(ContenPrincipal);
        ContenPrincipal.setLayout(ContenPrincipalLayout);
        ContenPrincipalLayout.setHorizontalGroup(
            ContenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenPrincipalLayout.createSequentialGroup()
                        .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(ContenPrincipalLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(ContenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAutosAlquilados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlquilarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        ContenPrincipalLayout.setVerticalGroup(
            ContenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlquilarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAutosAlquilados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public MenuCliente() {
        
    }
    
    private void btnAlquilarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarAutoActionPerformed
        AlquilarAutos ventana = new AlquilarAutos(this,nombre);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAlquilarAutoActionPerformed

    private void btnAutosAlquiladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosAlquiladosActionPerformed
        setVisible(false);
        AutosAlquilados ventana = new AutosAlquilados(this, nombre);
        ventana.setVisible(true);        
    }//GEN-LAST:event_btnAutosAlquiladosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
 
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        Registro temporal =this.login.db.buscarClienteingresado(nombre);
        etqNombre.setText(temporal.getNombre());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenPrincipal;
    private javax.swing.JLabel Perfil;
    private javax.swing.JButton btnAlquilarAuto;
    private javax.swing.JButton btnAutosAlquilados;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTexto;
    // End of variables declaration//GEN-END:variables


}
