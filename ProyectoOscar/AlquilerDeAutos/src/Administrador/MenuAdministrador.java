package Administrador;

import Autos.EliminarAutos;
import Autos.ListarAutos;
import Autos.ModificarAutos;
import Autos.RegistrarAuto;
import Clases.Administrador;
import Clases.Autos;
import Clases.DataBase;
import Clases.Persona;
import Cliente.EliminarCliente;
import Cliente.ListarCliente;
import Cliente.ModificarCliente;
import Cliente.RegistroCliente;
import Principal.Login;


public class MenuAdministrador extends javax.swing.JFrame {
    public DataBase database;
    Login login;
    public Administrador listaAdministradores[];
    public Persona listaPersonas[];
    public Autos listaAutos [];
    //public Factura listaFacturas  [];
    
    public MenuAdministrador( Login login) {
        this.database = new DataBase();
        this.login = login;
        this.listaAdministradores = new Administrador [100];
        this.listaPersonas = new Persona [100];
        this.listaAutos = new Autos[100];
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor2 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        btnListarAutos = new javax.swing.JButton();
        btnEliminarAutos = new javax.swing.JButton();
        btnModificarAutos = new javax.swing.JButton();
        btnRegistrarAutos = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        btnEliminarClientes = new javax.swing.JButton();
        btnModificarClientes = new javax.swing.JButton();
        btnRegistrarClientes = new javax.swing.JButton();
        btnAlquilarAuto = new javax.swing.JButton();
        btnEstadoAuto = new javax.swing.JButton();
        btnRegistrarAdmin = new javax.swing.JButton();
        btnEliminarAdmin = new javax.swing.JButton();
        btnModificarAdmin = new javax.swing.JButton();
        btnListarAdmin = new javax.swing.JButton();
        etqClientes = new javax.swing.JLabel();
        etqAutos1 = new javax.swing.JLabel();
        etqAdministrado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        contenedor2.setBackground(new java.awt.Color(204, 204, 255));

        titulo1.setBackground(new java.awt.Color(153, 153, 153));
        titulo1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(51, 51, 51));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("ALQUILER DE AUTOS");

        btnListarAutos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnListarAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarautos.png"))); // NOI18N
        btnListarAutos.setText("LISTAR AUTOS");
        btnListarAutos.setFocusable(false);
        btnListarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAutosActionPerformed(evt);
            }
        });

        btnEliminarAutos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnEliminarAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_eliminar_auto.png"))); // NOI18N
        btnEliminarAutos.setText("  ELIMINAR AUTOS");
        btnEliminarAutos.setFocusable(false);
        btnEliminarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutosActionPerformed(evt);
            }
        });

        btnModificarAutos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnModificarAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarauto.png"))); // NOI18N
        btnModificarAutos.setText("MODIFICAR AUTOS");
        btnModificarAutos.setFocusable(false);
        btnModificarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAutosActionPerformed(evt);
            }
        });

        btnRegistrarAutos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnRegistrarAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarauto.png"))); // NOI18N
        btnRegistrarAutos.setText("REGISTRAR AUTOS");
        btnRegistrarAutos.setFocusable(false);
        btnRegistrarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutosActionPerformed(evt);
            }
        });

        btnListarClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarautos.png"))); // NOI18N
        btnListarClientes.setText("   LISTAR CLIENTES");
        btnListarClientes.setFocusable(false);
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        btnEliminarClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnEliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_usuario.png"))); // NOI18N
        btnEliminarClientes.setText("ELIMINAR CLIENTES");
        btnEliminarClientes.setFocusable(false);
        btnEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClientesActionPerformed(evt);
            }
        });

        btnModificarClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnModificarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar_usuario (1).png"))); // NOI18N
        btnModificarClientes.setText("  MODIFICAR CLIENTES");
        btnModificarClientes.setFocusable(false);
        btnModificarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClientesActionPerformed(evt);
            }
        });

        btnRegistrarClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnRegistrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear_usuario (1).png"))); // NOI18N
        btnRegistrarClientes.setText("REGISTRAR CLIENTES");
        btnRegistrarClientes.setFocusable(false);
        btnRegistrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClientesActionPerformed(evt);
            }
        });

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

        btnEstadoAuto.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnEstadoAuto.setForeground(new java.awt.Color(51, 51, 51));
        btnEstadoAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadoauto.png"))); // NOI18N
        btnEstadoAuto.setText("ESTADO AUTO");
        btnEstadoAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEstadoAuto.setFocusable(false);
        btnEstadoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoAutoActionPerformed(evt);
            }
        });

        btnRegistrarAdmin.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnRegistrarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear_usuario (1).png"))); // NOI18N
        btnRegistrarAdmin.setText("REGISTRAR ADMINISTRADOR");
        btnRegistrarAdmin.setFocusable(false);
        btnRegistrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAdminActionPerformed(evt);
            }
        });

        btnEliminarAdmin.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnEliminarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_usuario.png"))); // NOI18N
        btnEliminarAdmin.setText("ELIMINAR ADMINISTRADOR");
        btnEliminarAdmin.setToolTipText("");
        btnEliminarAdmin.setFocusable(false);
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });

        btnModificarAdmin.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnModificarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar_usuario (1).png"))); // NOI18N
        btnModificarAdmin.setText("EDITAR ADMINISTRADOR");
        btnModificarAdmin.setFocusable(false);
        btnModificarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAdminActionPerformed(evt);
            }
        });

        btnListarAdmin.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnListarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarautos.png"))); // NOI18N
        btnListarAdmin.setText("LISTAR ADMINISTRADOR");
        btnListarAdmin.setFocusable(false);
        btnListarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAdminActionPerformed(evt);
            }
        });

        etqClientes.setBackground(new java.awt.Color(0, 0, 0));
        etqClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClientes.setText("CLIENTES");

        etqAutos1.setBackground(new java.awt.Color(0, 0, 0));
        etqAutos1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqAutos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqAutos1.setText("AUTOS");

        etqAdministrado.setBackground(new java.awt.Color(0, 0, 0));
        etqAdministrado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqAdministrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqAdministrado.setText("ADMINISTRADORES");

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor2Layout.createSequentialGroup()
                        .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contenedor2Layout.createSequentialGroup()
                                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnRegistrarAutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarAutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarAutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarAutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegistrarClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contenedor2Layout.createSequentialGroup()
                                        .addComponent(btnRegistrarAdmin)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnListarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(contenedor2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnAlquilarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstadoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(etqClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqAdministrado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedor2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(etqAutos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(562, 562, 562)))
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstadoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlquilarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqAdministrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor2Layout.createSequentialGroup()
                        .addComponent(btnRegistrarAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor2Layout.createSequentialGroup()
                        .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedor2Layout.createSequentialGroup()
                                .addComponent(btnEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedor2Layout.createSequentialGroup()
                                .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedor2Layout.createSequentialGroup()
                    .addGap(164, 164, 164)
                    .addComponent(etqAutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(279, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAutosActionPerformed
        setVisible(false);
        ListarAutos ventana = new ListarAutos(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarAutosActionPerformed

    private void btnEliminarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutosActionPerformed
        EliminarAutos ventana = new EliminarAutos(this, this.listaAutos);
        setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarAutosActionPerformed

    private void btnModificarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAutosActionPerformed
        setVisible(false);
        ModificarAutos ventana = new ModificarAutos(this, this.listaAutos);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarAutosActionPerformed

    private void btnRegistrarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutosActionPerformed
        RegistrarAuto ventana = new RegistrarAuto(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegistrarAutosActionPerformed

    private void btnAlquilarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarAutoActionPerformed
        AlquilarAuto ventana = new AlquilarAuto(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAlquilarAutoActionPerformed

    private void btnEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClientesActionPerformed
        EliminarCliente ventana = new EliminarCliente(this, this.listaPersonas);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnEliminarClientesActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        setVisible(false);
        ListarCliente ventana = new ListarCliente(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnEstadoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoAutoActionPerformed
        setVisible(false);
        EstadoAutos ventana = new EstadoAutos(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEstadoAutoActionPerformed

    private void btnRegistrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClientesActionPerformed
        setVisible(false);
        RegistroCliente ventana = new RegistroCliente(this, this.listaPersonas);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegistrarClientesActionPerformed

    private void btnModificarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClientesActionPerformed
        setVisible(false);
        ModificarCliente ventana = new ModificarCliente(this, this.listaPersonas);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarClientesActionPerformed

    private void btnModificarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAdminActionPerformed
        setVisible(false);
        EditarAdministrador ventana = new EditarAdministrador(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarAdminActionPerformed

    private void btnRegistrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAdminActionPerformed
        setVisible(false);
        RegistrarAdministrador ventana = new RegistrarAdministrador(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegistrarAdminActionPerformed

    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
        setVisible(false);
        EliminarAdministrador ventana = new EliminarAdministrador(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarAdminActionPerformed

    private void btnListarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAdminActionPerformed
        setVisible(false);
        ListarAdministrador ventana = new ListarAdministrador(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarAdminActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void alertCreacionUsuario(){
        Alert alerta = new Alert("CORRECTO", "Se ha creado un nuevo usuario.", "success");
    }
   
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquilarAuto;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JButton btnEliminarAutos;
    private javax.swing.JButton btnEliminarClientes;
    private javax.swing.JButton btnEstadoAuto;
    private javax.swing.JButton btnListarAdmin;
    private javax.swing.JButton btnListarAutos;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnModificarAdmin;
    private javax.swing.JButton btnModificarAutos;
    private javax.swing.JButton btnModificarClientes;
    private javax.swing.JButton btnRegistrarAdmin;
    private javax.swing.JButton btnRegistrarAutos;
    private javax.swing.JButton btnRegistrarClientes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel contenedor2;
    private javax.swing.JLabel etqAdministrado;
    private javax.swing.JLabel etqAutos1;
    private javax.swing.JLabel etqClientes;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
