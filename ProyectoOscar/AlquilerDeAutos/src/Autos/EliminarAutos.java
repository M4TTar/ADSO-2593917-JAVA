
package Autos;

import Administrador.Alert;
import Administrador.MenuAdministrador;
import Clases.Autos;


public class EliminarAutos extends javax.swing.JFrame {

    MenuAdministrador ventanaMenu;
    Autos listaAutos [];
    
    public EliminarAutos(MenuAdministrador ventanaMenu,Autos listaAutos []) {
        this.ventanaMenu = ventanaMenu;
        this.listaAutos =  listaAutos ;
        initComponents();
        initAlternComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        inputTamaño = new javax.swing.JTextField();
        etqTamaño = new javax.swing.JLabel();
        inputAire = new javax.swing.JTextField();
        etqAireAcondicionado = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        inputPlaca = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JLabel();
        etpMarca = new javax.swing.JLabel();
        etqBuscarPlaca = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JToggleButton();
        inputMarca = new javax.swing.JTextField();
        etqEncontrado = new javax.swing.JLabel();
        etqModelo = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        etqKilometraje = new javax.swing.JLabel();
        inputKilometraje = new javax.swing.JTextField();
        inputColor = new javax.swing.JTextField();
        etqColor = new javax.swing.JLabel();
        inputTransmision = new javax.swing.JTextField();
        etpTransmision = new javax.swing.JLabel();
        etqValor = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        etpId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        etqFecha = new javax.swing.JLabel();
        inputFecha = new javax.swing.JTextField();
        etqEstado = new javax.swing.JLabel();
        inputEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eliminar Auto");
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        inputTamaño.setEditable(false);
        inputTamaño.setBackground(new java.awt.Color(255, 255, 255));
        inputTamaño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputTamaño.setForeground(new java.awt.Color(0, 0, 0));

        etqTamaño.setBackground(new java.awt.Color(0, 0, 0));
        etqTamaño.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqTamaño.setForeground(new java.awt.Color(0, 0, 0));
        etqTamaño.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTamaño.setText("TAMAÑO:");

        inputAire.setEditable(false);
        inputAire.setBackground(new java.awt.Color(255, 255, 255));
        inputAire.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputAire.setForeground(new java.awt.Color(0, 0, 0));

        etqAireAcondicionado.setBackground(new java.awt.Color(0, 0, 0));
        etqAireAcondicionado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqAireAcondicionado.setForeground(new java.awt.Color(0, 0, 0));
        etqAireAcondicionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqAireAcondicionado.setText("AIRE ACONDICIONADO:");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        inputPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(0, 0, 0));

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR AUTO");

        etpMarca.setBackground(new java.awt.Color(0, 0, 0));
        etpMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etpMarca.setForeground(new java.awt.Color(0, 0, 0));
        etpMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpMarca.setText("MARCA:");

        etqBuscarPlaca.setBackground(new java.awt.Color(0, 0, 0));
        etqBuscarPlaca.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        etqBuscarPlaca.setForeground(new java.awt.Color(0, 0, 0));
        etqBuscarPlaca.setText("PLACA:");

        btnBuscar.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        inputMarca.setEditable(false);
        inputMarca.setBackground(new java.awt.Color(255, 255, 255));
        inputMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(0, 0, 0));

        etqEncontrado.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        etqEncontrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqModelo.setBackground(new java.awt.Color(0, 0, 0));
        etqModelo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqModelo.setForeground(new java.awt.Color(0, 0, 0));
        etqModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqModelo.setText("MODELO:");

        inputModelo.setEditable(false);
        inputModelo.setBackground(new java.awt.Color(255, 255, 255));
        inputModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(0, 0, 0));

        etqKilometraje.setBackground(new java.awt.Color(0, 0, 0));
        etqKilometraje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqKilometraje.setForeground(new java.awt.Color(0, 0, 0));
        etqKilometraje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqKilometraje.setText("KILOMETRAJE:");

        inputKilometraje.setEditable(false);
        inputKilometraje.setBackground(new java.awt.Color(255, 255, 255));
        inputKilometraje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputKilometraje.setForeground(new java.awt.Color(0, 0, 0));

        inputColor.setEditable(false);
        inputColor.setBackground(new java.awt.Color(255, 255, 255));
        inputColor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputColor.setForeground(new java.awt.Color(0, 0, 0));

        etqColor.setBackground(new java.awt.Color(0, 0, 0));
        etqColor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqColor.setForeground(new java.awt.Color(0, 0, 0));
        etqColor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqColor.setText("COLOR:");

        inputTransmision.setEditable(false);
        inputTransmision.setBackground(new java.awt.Color(255, 255, 255));
        inputTransmision.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputTransmision.setForeground(new java.awt.Color(0, 0, 0));

        etpTransmision.setBackground(new java.awt.Color(0, 0, 0));
        etpTransmision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etpTransmision.setForeground(new java.awt.Color(0, 0, 0));
        etpTransmision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpTransmision.setText("TIPO TRANSMISIÓN:");

        etqValor.setBackground(new java.awt.Color(0, 0, 0));
        etqValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqValor.setForeground(new java.awt.Color(0, 0, 0));
        etqValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqValor.setText("VALOR ALQUILER:");

        inputValor.setEditable(false);
        inputValor.setBackground(new java.awt.Color(255, 255, 255));
        inputValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputValor.setForeground(new java.awt.Color(0, 0, 0));

        etpId.setBackground(new java.awt.Color(0, 0, 0));
        etpId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etpId.setForeground(new java.awt.Color(0, 0, 0));
        etpId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpId.setText("ID:");

        inputId.setEditable(false);
        inputId.setBackground(new java.awt.Color(255, 255, 255));
        inputId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputId.setForeground(new java.awt.Color(0, 0, 0));

        etqFecha.setBackground(new java.awt.Color(0, 0, 0));
        etqFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqFecha.setForeground(new java.awt.Color(0, 0, 0));
        etqFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqFecha.setText("FECHA:");

        inputFecha.setEditable(false);
        inputFecha.setBackground(new java.awt.Color(255, 255, 255));
        inputFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputFecha.setForeground(new java.awt.Color(0, 0, 0));

        etqEstado.setBackground(new java.awt.Color(0, 0, 0));
        etqEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqEstado.setForeground(new java.awt.Color(0, 0, 0));
        etqEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqEstado.setText("Estado:");

        inputEstado.setEditable(false);
        inputEstado.setBackground(new java.awt.Color(255, 255, 255));
        inputEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputEstado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etqColor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputColor))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                    .addComponent(etpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalLayout.createSequentialGroup()
                                    .addComponent(etpId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                    .addComponent(etqKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputKilometraje))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                    .addComponent(etqModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputModelo))
                                .addGroup(contentPrincipalLayout.createSequentialGroup()
                                    .addComponent(etqValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(etpTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqAireAcondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputAire, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqBuscarPlaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputTransmision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTamaño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqBuscarPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(etqEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKilometraje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTransmision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTamaño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAireAcondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputAire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFecha)
                    .addComponent(etqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEstado)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = inputPlaca.getText();
        Autos temporal =this.ventanaMenu.database.buscarAuto(placa);
        if (temporal != null) {
            inputId.setText( temporal.getId());
            inputMarca.setText(temporal.getMarca());
            inputModelo.setText(temporal.getModelo());
            inputKilometraje.setText(temporal.getKilometraje() );
            inputValor.setText(temporal.getValorAlquiler() );
            inputColor.setText( temporal.getColor());
            inputTransmision.setText( temporal.getTransmision());
            inputTamaño.setText( temporal.getTamaño());
            inputAire.setText( temporal.getAire_acondicionado());
            inputFecha.setText( temporal.getFecha());
            inputEstado.setText( temporal.getEstado());
            btnEliminar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", " ESTE AUTO NO ESTA REGISTRADO.", "error");
            inputPlaca.requestFocus();
            limpiarCampos();
            btnEliminar.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = inputId.getText();
        String marca = inputMarca.getText();
        String modelo = inputModelo.getText();
        String kilometraje = inputKilometraje.getText();
        String ValorAlquiler = inputValor.getText();
        String color = inputColor.getText();
        String numero_placa = inputPlaca.getText();
        String transmision = inputTransmision.getText();
        String tamaño = inputTamaño.getText();
        String aire_acondicionado = inputAire.getText();
        String fecha = inputFecha.getText();
        String estado = inputEstado.getText();
        Autos temporal = new Autos(id,marca,modelo,kilometraje,ValorAlquiler,color,numero_placa,transmision,tamaño,aire_acondicionado,fecha,estado);
        if (!id.equals("") && !marca .equals("") && !modelo.equals("") && !kilometraje.equals("") && !ValorAlquiler.equals("") 
            &&  !color.equals("") &&  !numero_placa.equals("")&&  !transmision.equals("")&&  !tamaño.equals("")&&  ! aire_acondicionado.equals("")&& !fecha.equals("")&& !estado.equals("")){
            boolean proceso = this.ventanaMenu.database.eliminarAutos(temporal);
            Alert alerta = new Alert("EXITO", "Auto Eliminado.", "success");
            inputId.setText("");
            inputMarca.setText("");
            inputModelo.setText("");
            inputKilometraje.setText("");
            inputValor.setText("");
            inputColor.setText("");
            inputPlaca.setText("");
            inputTransmision.setText("");
            inputTamaño.setText("");
            inputAire.setText("");
            inputFecha.setText("");
            inputEstado.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    
    
    public void limpiarCampos(){
        inputId.setText("");
        inputMarca.setText("");
        inputModelo.setText("");
        inputKilometraje.setText("");
        inputValor.setText("");
        inputColor.setText("");
        inputTransmision.setText("");
        inputTamaño.setText("");
        inputAire.setText("");
        inputFecha.setText("");
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etpId;
    private javax.swing.JLabel etpMarca;
    private javax.swing.JLabel etpTransmision;
    private javax.swing.JLabel etqAireAcondicionado;
    private javax.swing.JLabel etqBuscarPlaca;
    private javax.swing.JLabel etqColor;
    private javax.swing.JLabel etqEncontrado;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqKilometraje;
    private javax.swing.JLabel etqModelo;
    private javax.swing.JLabel etqTamaño;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqValor;
    private javax.swing.JTextField inputAire;
    private javax.swing.JTextField inputColor;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputFecha;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputKilometraje;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JTextField inputTamaño;
    private javax.swing.JTextField inputTransmision;
    private javax.swing.JTextField inputValor;
    // End of variables declaration//GEN-END:variables
}
