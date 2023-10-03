
package Cliente;

import Administrador.Alert;
import Clases.Autos;
import Clases.Persona;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class RealizarAlquileres extends javax.swing.JFrame {

    AlquilarAutos ventana;
    MenuCliente ventanaMenu;
    String ValorAlquiler;
    String marca;
    String nombre;
    int pagar;
    int datoingresado;
    public RealizarAlquileres(AlquilarAutos ventana,String marca, String ValorAlquiler,String estado,MenuCliente ventanaMenu,String nombre) {
        this.ventanaMenu = ventanaMenu;
        this.ValorAlquiler = ValorAlquiler;
        this.marca = marca;
        this.nombre = nombre;
        this.ventana = ventana;
        initComponents();
        initAlternComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenPrincipal = new javax.swing.JPanel();
        campoNombre = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqTiempo = new javax.swing.JLabel();
        etqValor = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        btnAlquilar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        campoTiempo = new javax.swing.JTextField();
        campoVehiculo = new javax.swing.JTextField();
        etqNombre1 = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Realizar Alquiler");

        contenPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        campoNombre.setEditable(false);
        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqNombre.setBackground(new java.awt.Color(0, 0, 0));
        etqNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNombre.setText("Nombre:");

        campoTelefono.setEditable(false);
        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqTelefono.setBackground(new java.awt.Color(0, 0, 0));
        etqTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqTelefono.setText("Telefono:");

        etqTiempo.setBackground(new java.awt.Color(0, 0, 0));
        etqTiempo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqTiempo.setText("Tiempo Alquiler:");

        etqValor.setBackground(new java.awt.Color(0, 0, 0));
        etqValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqValor.setText("Valor Total$:");

        campoTotal.setEditable(false);
        campoTotal.setBackground(new java.awt.Color(255, 255, 255));

        btnAlquilar.setBackground(new java.awt.Color(0, 153, 51));
        btnAlquilar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlquilar.setText("ALQUILAR");
        btnAlquilar.setEnabled(false);
        btnAlquilar.setFocusable(false);
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.setFocusable(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        campoTiempo.setEditable(false);
        campoTiempo.setBackground(new java.awt.Color(255, 255, 255));
        campoTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTiempoKeyReleased(evt);
            }
        });

        campoVehiculo.setEditable(false);
        campoVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        campoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqNombre1.setBackground(new java.awt.Color(0, 0, 0));
        etqNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNombre1.setText("Vehiculo:");

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("DATOS ALQUILER");

        javax.swing.GroupLayout contenPrincipalLayout = new javax.swing.GroupLayout(contenPrincipal);
        contenPrincipal.setLayout(contenPrincipalLayout);
        contenPrincipalLayout.setHorizontalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenPrincipalLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlquilar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(171, 171, 171))
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqTiempo)
                            .addComponent(etqTelefono)
                            .addComponent(etqNombre)
                            .addComponent(etqValor)
                            .addComponent(etqNombre1))
                        .addGap(12, 12, 12)
                        .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoVehiculo)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTotal)
                            .addComponent(campoNombre)
                            .addComponent(campoTiempo))))
                .addContainerGap())
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenPrincipalLayout.setVerticalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre1)
                    .addComponent(campoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTiempo)
                    .addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqValor)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
     public void cambiarEstado(){
        Autos listaAutos [] = this.ventana.ventanaCliente.login.db.listaAutosLibres();
        
        if (listaAutos!=null) {
            for(int i = 0; i < listaAutos.length; i++){
                    if(listaAutos[i] != null){
                        JLabel Temporal = new JLabel(" " + listaAutos[i].getId()+" - "+listaAutos[i].getMarca()+" "+listaAutos[i].getModelo()+" - "+listaAutos[i].getKilometraje()+" - "+listaAutos[i].getValorAlquiler()+" - "+listaAutos[i].getColor()+" - "+listaAutos[i].getPlaca()+" - "+listaAutos[i].getTransmision()+" - "+listaAutos[i].getTamaño()+" - "+listaAutos[i].getAire_acondicionado()+" - "+listaAutos[i].getFecha() +" - "+ listaAutos[i].getEstado());
                        
                        Temporal.setFont(new Font("Arial", Font.PLAIN, 12));
                        Temporal.setBorder(new EmptyBorder(2,10,2,10));

                        String placa = listaAutos[i].getPlaca();
                        String marca = listaAutos[i].getMarca();
                        String modelo = listaAutos[i].getModelo();
                        String kilometraje = listaAutos[i].getKilometraje();
                        String ValorAlquiler = listaAutos[i].getValorAlquiler();
                        String color = listaAutos[i].getColor();
                        String id = listaAutos[i].getId();
                        String transmision = listaAutos[i].getTransmision();
                        String tamano = listaAutos[i].getTamaño();
                        String aire_acondicionado = listaAutos[i].getAire_acondicionado();
                        String fecha = listaAutos[i].getFecha();
                        String estado = "I";
                        Autos temporal = new Autos(id,marca,modelo,kilometraje,ValorAlquiler ,color,placa,transmision,tamano,aire_acondicionado,fecha,estado);
                        boolean proceso = this.ventana.ventanaCliente.login.db.editarEstadoAlquilado(temporal);
                        break;
                    }else{
                        break;
                    }
            }
            revalidate();
        }
    }
    public void initAlternComponents(){
        Persona temporal =this.ventanaMenu.login.db.buscarCliente(nombre);
        campoVehiculo.setText(marca);
        campoNombre.setText(temporal.getNombre());
        campoTelefono.setText(temporal.getTelefono());
        campoTiempo.setEditable(true);
        if(campoVehiculo!=null &&campoNombre!=null &&campoTelefono!=null &&campoTiempo!=null &&campoTotal!=null  ){
            btnAlquilar.setEnabled(true);
        }else{
            btnAlquilar.setEnabled(false);
        }
        
        setLocationRelativeTo(null);
    }
    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        this.cambiarEstado();
        String Marca =campoVehiculo.getText();
        String Nombre =campoNombre.getText();
        String telefono =campoTelefono.getText();
        String tiempo =campoTiempo.getText();
        String valor = campoTotal.getText();
        if (!Nombre.equals("") && !Marca.equals("")  && !telefono.equals("") && !valor.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                boolean proceso = this.ventanaMenu.login.db.insertarAlquiler(Nombre,marca,nombre,telefono,tiempo,valor);
                this.ventanaMenu.setVisible(true);
                Alert alerta = new Alert("EXITO", "Auto Alquilado Correctamente.", "success");
                dispose();
            }
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
        }
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
 
    
    private void campoTiempoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTiempoKeyReleased
        datoingresado =Integer.valueOf(campoTiempo.getText()) ;
        if(campoTiempo != null){
            pagar=Integer.valueOf(datoingresado)*Integer.valueOf(ValorAlquiler);
            campoTotal.setText(String.valueOf(pagar));
        }else{
            campoTotal.setText("");
        }
    }//GEN-LAST:event_campoTiempoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTiempo;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JTextField campoVehiculo;
    private javax.swing.JPanel contenPrincipal;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNombre1;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTiempo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqValor;
    // End of variables declaration//GEN-END:variables
}
