
package Autos;

import Administrador.Alert;
import Administrador.MenuAdministrador;
import Clases.Autos;
import java.awt.Color;
import javax.swing.JTextField;


public class ModificarAutos extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;
    Autos listaAutos [];

    public ModificarAutos(MenuAdministrador ventanaMenu,Autos listaAutos []) {
        this.ventanaMenu = ventanaMenu;
        this.listaAutos =  listaAutos ;
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        inputModelo = new javax.swing.JTextField();
        etqKilometraje = new javax.swing.JLabel();
        inputKilometraje = new javax.swing.JTextField();
        inputColor = new javax.swing.JTextField();
        etqColor = new javax.swing.JLabel();
        inputTransmision = new javax.swing.JTextField();
        etpTransmision = new javax.swing.JLabel();
        etqId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputAire = new javax.swing.JTextField();
        etqAireAcondicionado = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        inputPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        etqPlaca = new javax.swing.JLabel();
        etpMarca = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JToggleButton();
        inputMarca = new javax.swing.JTextField();
        etqModelo = new javax.swing.JLabel();
        etqValorAlquiler = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        inputTamaño = new javax.swing.JTextField();
        etpTamaño = new javax.swing.JLabel();
        inputFecha = new javax.swing.JTextField();
        etqFecha = new javax.swing.JLabel();
        inputEstado = new javax.swing.JTextField();
        etqEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar Auto");
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        inputModelo.setEditable(false);
        inputModelo.setBackground(new java.awt.Color(255, 255, 255));
        inputModelo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(51, 51, 51));

        etqKilometraje.setBackground(new java.awt.Color(0, 0, 0));
        etqKilometraje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqKilometraje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqKilometraje.setText("KILOMETRAJE:");

        inputKilometraje.setEditable(false);
        inputKilometraje.setBackground(new java.awt.Color(255, 255, 255));
        inputKilometraje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputKilometraje.setForeground(new java.awt.Color(51, 51, 51));

        inputColor.setEditable(false);
        inputColor.setBackground(new java.awt.Color(255, 255, 255));
        inputColor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputColor.setForeground(new java.awt.Color(51, 51, 51));

        etqColor.setBackground(new java.awt.Color(0, 0, 0));
        etqColor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqColor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqColor.setText("COLOR:");

        inputTransmision.setEditable(false);
        inputTransmision.setBackground(new java.awt.Color(255, 255, 255));
        inputTransmision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputTransmision.setForeground(new java.awt.Color(51, 51, 51));

        etpTransmision.setBackground(new java.awt.Color(0, 0, 0));
        etpTransmision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etpTransmision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpTransmision.setText("TIPO TRANSMISIÓN:");

        etqId.setBackground(new java.awt.Color(0, 0, 0));
        etqId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqId.setText("ID:");

        inputId.setEditable(false);
        inputId.setBackground(new java.awt.Color(255, 255, 255));
        inputId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputId.setForeground(new java.awt.Color(51, 51, 51));

        inputAire.setEditable(false);
        inputAire.setBackground(new java.awt.Color(255, 255, 255));
        inputAire.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputAire.setForeground(new java.awt.Color(51, 51, 51));

        etqAireAcondicionado.setBackground(new java.awt.Color(0, 0, 0));
        etqAireAcondicionado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqAireAcondicionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqAireAcondicionado.setText("AIRE ACONDICIONADO:");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 153, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.setEnabled(false);
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        inputPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR AUTO");

        etqPlaca.setBackground(new java.awt.Color(0, 0, 0));
        etqPlaca.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        etqPlaca.setText("PLACA:");

        etpMarca.setBackground(new java.awt.Color(0, 0, 0));
        etpMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etpMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpMarca.setText("MARCA:");

        btnBuscar.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        inputMarca.setEditable(false);
        inputMarca.setBackground(new java.awt.Color(255, 255, 255));
        inputMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(51, 51, 51));

        etqModelo.setBackground(new java.awt.Color(0, 0, 0));
        etqModelo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqModelo.setText("MODELO:");

        etqValorAlquiler.setBackground(new java.awt.Color(0, 0, 0));
        etqValorAlquiler.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqValorAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqValorAlquiler.setText("VALOR ALQUILER:");

        inputValor.setEditable(false);
        inputValor.setBackground(new java.awt.Color(255, 255, 255));
        inputValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputValor.setForeground(new java.awt.Color(51, 51, 51));

        inputTamaño.setEditable(false);
        inputTamaño.setBackground(new java.awt.Color(255, 255, 255));
        inputTamaño.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputTamaño.setForeground(new java.awt.Color(51, 51, 51));

        etpTamaño.setBackground(new java.awt.Color(0, 0, 0));
        etpTamaño.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etpTamaño.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpTamaño.setText("TAMAÑO:");

        inputFecha.setEditable(false);
        inputFecha.setBackground(new java.awt.Color(255, 255, 255));
        inputFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputFecha.setForeground(new java.awt.Color(51, 51, 51));

        etqFecha.setBackground(new java.awt.Color(0, 0, 0));
        etqFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqFecha.setText("FECHA INGRESO:");

        inputEstado.setEditable(false);
        inputEstado.setBackground(new java.awt.Color(255, 255, 255));
        inputEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inputEstado.setForeground(new java.awt.Color(51, 51, 51));

        etqEstado.setBackground(new java.awt.Color(0, 0, 0));
        etqEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqEstado.setText("ESTADO:");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                                            .addComponent(etpTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(69, 69, 69)
                                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(inputAire)
                                                .addComponent(inputFecha)
                                                .addGroup(contentPrincipalLayout.createSequentialGroup()
                                                    .addComponent(inputTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(5, 5, 5))))
                                        .addComponent(etqId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                                            .addGap(161, 161, 161)
                                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(etqColor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etqValorAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etqKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etqModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etpTransmision))
                                            .addGap(1, 1, 1)
                                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(inputColor, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(inputValor, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(inputKilometraje, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(inputModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(inputMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(inputTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(inputEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etqAireAcondicionado)
                                            .addComponent(etqFecha)
                                            .addComponent(etqEstado))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputId, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqValorAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputColor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTransmision, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAireAcondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputAire, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //Metodo para buscar el auto a  modificar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = inputPlaca.getText();
        Autos temporal =this.ventanaMenu.database.buscarAuto(placa);
        if (temporal != null) {
            habilitarCampo();
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
            btnModificar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", " ESTE AUTO NO ESTA REGISTRADO.", "error");
            inputPlaca.requestFocus();
            deshabilitarCampo();
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       String placa = inputPlaca.getText();
       String marca  =inputMarca.getText();
       String modelo = inputModelo.getText();
       String kilometraje = inputKilometraje.getText();
       String ValorAlquiler = inputValor.getText();
       String color = inputColor.getText();
       String id = inputId.getText();
       String transmision = inputTransmision.getText();
       String tamaño =inputTamaño.getText();
       String aire_acondicionado = inputAire.getText();
       String fecha = inputFecha.getText();
       String estado = inputEstado.getText();
       Autos temporal = new Autos(id,marca,modelo,kilometraje,ValorAlquiler ,color,placa,transmision,tamaño,aire_acondicionado,fecha,estado);
        if(!placa.equals("") && !marca.equals("") && !modelo.equals("") && !kilometraje.equals("") &&!ValorAlquiler.equals("") && !color.equals("")&& 
          !id.equals("") && !transmision.equals("")&& !tamaño.equals("") && !aire_acondicionado.equals("") && !fecha.equals("")) {
            boolean proceso = this.ventanaMenu.database.editarAutos(temporal);
            Alert alerta = new Alert("EXITO", "Datos editados correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            //validarTodosInputs();
        }
    }//GEN-LAST:event_btnModificarActionPerformed
    
    
    
    public void deshabilitarCampo(){
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
        inputTamaño.setEditable(false);
        inputMarca.setEditable(false);
        inputModelo.setEditable(false);
        inputKilometraje.setEditable(false);
        inputValor.setEditable(false);
        inputColor.setEditable(false);
        inputId.setEditable(false);
        inputTransmision.setEditable(false);
        inputTamaño.setEditable(false);
        inputAire.setEditable(false);
        inputFecha.setEditable(false);
    }
    
    public void habilitarCampo(){
        inputKilometraje.setEditable(true);
        inputValor.setEditable(true);
        inputColor.setEditable(true);
        inputTransmision.setEditable(true);
        inputAire.setEditable(true);
        
        
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etpMarca;
    private javax.swing.JLabel etpTamaño;
    private javax.swing.JLabel etpTransmision;
    private javax.swing.JLabel etqAireAcondicionado;
    private javax.swing.JLabel etqColor;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqId;
    private javax.swing.JLabel etqKilometraje;
    private javax.swing.JLabel etqModelo;
    private javax.swing.JLabel etqPlaca;
    private javax.swing.JLabel etqValorAlquiler;
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
