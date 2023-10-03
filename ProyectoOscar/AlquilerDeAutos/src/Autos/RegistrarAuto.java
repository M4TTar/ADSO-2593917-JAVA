package Autos;

import Administrador.Alert;
import Administrador.MenuAdministrador;
import Clases.Autos;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrarAuto extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;
    
    public RegistrarAuto(MenuAdministrador ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.ventanaMenu.setVisible(false);
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etpMarca = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        etqModelo = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        etqKilometraje = new javax.swing.JLabel();
        inputKilometraje = new javax.swing.JTextField();
        inputColor = new javax.swing.JTextField();
        etqColor = new javax.swing.JLabel();
        inputTransmision = new javax.swing.JTextField();
        etpTransmision = new javax.swing.JLabel();
        etqPlaca = new javax.swing.JLabel();
        inputPlaca = new javax.swing.JTextField();
        inputTamaño = new javax.swing.JTextField();
        etqTamaño = new javax.swing.JLabel();
        inputAire = new javax.swing.JTextField();
        etqAireAcondicionado = new javax.swing.JLabel();
        inputFecha = new javax.swing.JTextField();
        etqFecha = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        etqValor = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        inputEstado = new javax.swing.JTextField();
        etqEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Auto");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("REGISTRAR AUTO");

        etpMarca.setBackground(new java.awt.Color(0, 0, 0));
        etpMarca.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etpMarca.setForeground(new java.awt.Color(0, 0, 0));
        etpMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpMarca.setText("MARCA:");

        inputMarca.setBackground(new java.awt.Color(255, 255, 255));
        inputMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(0, 0, 0));

        etqModelo.setBackground(new java.awt.Color(0, 0, 0));
        etqModelo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqModelo.setForeground(new java.awt.Color(0, 0, 0));
        etqModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqModelo.setText("MODELO:");

        inputModelo.setBackground(new java.awt.Color(255, 255, 255));
        inputModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(0, 0, 0));

        etqKilometraje.setBackground(new java.awt.Color(0, 0, 0));
        etqKilometraje.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqKilometraje.setForeground(new java.awt.Color(0, 0, 0));
        etqKilometraje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqKilometraje.setText("KILOMETRAJE:");

        inputKilometraje.setBackground(new java.awt.Color(255, 255, 255));
        inputKilometraje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputKilometraje.setForeground(new java.awt.Color(0, 0, 0));

        inputColor.setBackground(new java.awt.Color(255, 255, 255));
        inputColor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputColor.setForeground(new java.awt.Color(0, 0, 0));

        etqColor.setBackground(new java.awt.Color(0, 0, 0));
        etqColor.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqColor.setForeground(new java.awt.Color(0, 0, 0));
        etqColor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqColor.setText("COLOR:");

        inputTransmision.setBackground(new java.awt.Color(255, 255, 255));
        inputTransmision.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputTransmision.setForeground(new java.awt.Color(0, 0, 0));

        etpTransmision.setBackground(new java.awt.Color(0, 0, 0));
        etpTransmision.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etpTransmision.setForeground(new java.awt.Color(0, 0, 0));
        etpTransmision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etpTransmision.setText("TIPO TRANSMISIÓN:");

        etqPlaca.setBackground(new java.awt.Color(0, 0, 0));
        etqPlaca.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqPlaca.setForeground(new java.awt.Color(0, 0, 0));
        etqPlaca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqPlaca.setText("NÚMERO DE PLACA:");

        inputPlaca.setBackground(new java.awt.Color(255, 255, 255));
        inputPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(0, 0, 0));

        inputTamaño.setBackground(new java.awt.Color(255, 255, 255));
        inputTamaño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputTamaño.setForeground(new java.awt.Color(0, 0, 0));

        etqTamaño.setBackground(new java.awt.Color(0, 0, 0));
        etqTamaño.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqTamaño.setForeground(new java.awt.Color(0, 0, 0));
        etqTamaño.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTamaño.setText("TAMAÑO:");

        inputAire.setBackground(new java.awt.Color(255, 255, 255));
        inputAire.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputAire.setForeground(new java.awt.Color(0, 0, 0));

        etqAireAcondicionado.setBackground(new java.awt.Color(0, 0, 0));
        etqAireAcondicionado.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqAireAcondicionado.setForeground(new java.awt.Color(0, 0, 0));
        etqAireAcondicionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqAireAcondicionado.setText("AIRE ACONDICIONADO:");

        inputFecha.setBackground(new java.awt.Color(255, 255, 255));
        inputFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputFecha.setForeground(new java.awt.Color(0, 0, 0));

        etqFecha.setBackground(new java.awt.Color(0, 0, 0));
        etqFecha.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqFecha.setForeground(new java.awt.Color(0, 0, 0));
        etqFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqFecha.setText("FECHA:");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        etqValor.setBackground(new java.awt.Color(0, 0, 0));
        etqValor.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqValor.setForeground(new java.awt.Color(0, 0, 0));
        etqValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqValor.setText("VALOR ALQUILER:");
        etqValor.setToolTipText("");

        inputValor.setBackground(new java.awt.Color(255, 255, 255));
        inputValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputValor.setForeground(new java.awt.Color(0, 0, 0));

        inputEstado.setBackground(new java.awt.Color(255, 255, 255));
        inputEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputEstado.setForeground(new java.awt.Color(0, 0, 0));

        etqEstado.setBackground(new java.awt.Color(0, 0, 0));
        etqEstado.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        etqEstado.setForeground(new java.awt.Color(0, 0, 0));
        etqEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqEstado.setText("Estado.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputModelo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputKilometraje))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqColor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputColor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etpTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTransmision))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputPlaca))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTamaño))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqAireAcondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputAire))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputValor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputEstado)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKilometraje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTransmision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTamaño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAireAcondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputAire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
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
        if (!marca .equals("") && !modelo.equals("") && !kilometraje.equals("") && !ValorAlquiler.equals("") &&  !color.equals("") 
           &&  !numero_placa.equals("")&&  !transmision.equals("")&&  !tamaño.equals("")&&  ! aire_acondicionado.equals("")&&  !fecha.equals("")&&  !estado.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                boolean proceso = this.ventanaMenu.database.insertarAuto( marca, modelo,kilometraje,ValorAlquiler,color,numero_placa,transmision,tamaño,aire_acondicionado,fecha,estado);
                this.ventanaMenu.setVisible(true);
                Alert alerta = new Alert("Correcto", "El Auto a sido Ingresado Con Exito", "success");
                dispose();
            }else{
                Alert alerta = new Alert("Error", "El Auto Ingresado Ya Existe", "error");
            }
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    public void validarTodosInputs(){
        validarInput(inputMarca);
        validarInput(inputModelo);
        validarInput(inputKilometraje);
        validarInput(inputColor);
        validarInput(inputPlaca);
        validarInput(inputTransmision);
        validarInput(inputTamaño);
        validarInput(inputFecha);
    }
    
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo.setBorder(borderRojo);
            campo.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            campo.setBorder( referencia.getBorder() );
        }
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel etpMarca;
    private javax.swing.JLabel etpTransmision;
    private javax.swing.JLabel etqAireAcondicionado;
    private javax.swing.JLabel etqColor;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqKilometraje;
    private javax.swing.JLabel etqModelo;
    private javax.swing.JLabel etqPlaca;
    private javax.swing.JLabel etqTamaño;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqValor;
    private javax.swing.JTextField inputAire;
    private javax.swing.JTextField inputColor;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputFecha;
    private javax.swing.JTextField inputKilometraje;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JTextField inputTamaño;
    private javax.swing.JTextField inputTransmision;
    private javax.swing.JTextField inputValor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
