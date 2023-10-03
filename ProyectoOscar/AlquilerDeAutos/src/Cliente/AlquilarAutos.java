
package Cliente;

import Clases.Autos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class AlquilarAutos extends javax.swing.JFrame {
    
    MenuCliente ventanaCliente;
    String nombre;
    String Nombre;
    String Telefono;
    private JButton [] btnAlquilar;
    public AlquilarAutos(MenuCliente ventanaCliente,String nombre) {
        this.ventanaCliente = ventanaCliente;
        this.nombre = nombre; 
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoAutosDisponibles.setLayout( new BoxLayout( campoAutosDisponibles, BoxLayout.Y_AXIS) );
        campoAutosDisponibles.setBackground(Color.WHITE);
        imprimirAutos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTtituloPrecios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoAutosDisponibles = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AlquilarAuto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        etqTtituloPrecios.setBackground(new java.awt.Color(0, 0, 0));
        etqTtituloPrecios.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        etqTtituloPrecios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        campoAutosDisponibles.setEditable(false);
        campoAutosDisponibles.setBackground(new java.awt.Color(204, 204, 255));
        campoAutosDisponibles.setColumns(20);
        campoAutosDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoAutosDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        campoAutosDisponibles.setRows(5);
        jScrollPane1.setViewportView(campoAutosDisponibles);

        btnAtras.setBackground(new java.awt.Color(255, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atras");
        btnAtras.setFocusable(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTtituloPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTtituloPrecios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        etqTitulo.setBackground(new java.awt.Color(204, 204, 255));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ALQUILAR AUTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 374, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void imprimirAutos(){
        Autos listaAutos [] =this.ventanaCliente.login.db.listaAutosLibres();
        btnAlquilar = new JButton [listaAutos.length];
        if (listaAutos!=null) {
            for(int i = 0; i < listaAutos.length; i++){
                if(listaAutos[i] != null){
                    JLabel Temporal = new JLabel(" " + listaAutos[i].getId()+" - "+listaAutos[i].getMarca()+" "+listaAutos[i].getModelo()+" - "+listaAutos[i].getKilometraje()+" - "+listaAutos[i].getValorAlquiler()+" - "+listaAutos[i].getColor()+" - "+listaAutos[i].getPlaca()+" - "+listaAutos[i].getTransmision()+" - "+listaAutos[i].getTamaño()+" - "+listaAutos[i].getAire_acondicionado()+" - "+listaAutos[i].getFecha() +" - "+ listaAutos[i].getEstado());
                    btnAlquilar[i] = new JButton("Alquilar");
                    Temporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    Temporal.setBorder(new EmptyBorder(2,10,2,10));
                    
                    campoAutosDisponibles.add(Temporal);
                    campoAutosDisponibles.add(btnAlquilar[i]);

                    String ValorAlquiler = listaAutos[i].getValorAlquiler();
                    String Placa = listaAutos[i].getPlaca();
                    String marca = listaAutos[i].getMarca();
                    String estado = "I";


                    final AlquilarAutos ventana = this;
                    ActionListener eventoAtras = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) { 
                            RealizarAlquileres detalles = new RealizarAlquileres(ventana,marca,ValorAlquiler,estado,ventanaCliente,nombre);
                            detalles.setVisible(true);
                            dispose();
                        } 
                    }; 

                    btnAlquilar[i].addActionListener(eventoAtras);
                }else{
                    break;
                }
                revalidate();
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextArea campoAutosDisponibles;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTtituloPrecios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
