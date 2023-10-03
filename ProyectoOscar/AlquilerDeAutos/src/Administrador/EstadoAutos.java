
package Administrador;

import Clases.Autos;
import Clases.DataBase;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class EstadoAutos extends javax.swing.JFrame {
    
    public DataBase db;
    MenuAdministrador ventanaMenu;
    private JButton [] btnEstado;
    
    public EstadoAutos(MenuAdministrador ventanaMenu) {
        this.db = db;
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMostrarAutos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Estado Auto");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

        btnAtras.setBackground(new java.awt.Color(255, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.setFocusable(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTA DE AUTOS OCUPADOS");

        campoMostrarAutos.setEditable(false);
        campoMostrarAutos.setColumns(20);
        campoMostrarAutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoMostrarAutos.setRows(5);
        jScrollPane1.setViewportView(campoMostrarAutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void imprimirAutos(){
        Autos listaAutos [] = this.ventanaMenu.database.listaAutosOcupados();
        btnEstado = new JButton [listaAutos.length];
        if (listaAutos!=null) {
            for(int i = 0; i < listaAutos.length; i++){
                    if(listaAutos[i] != null){
                        JLabel Temporal = new JLabel(" " + listaAutos[i].getId()+" - "+listaAutos[i].getMarca()+" "+listaAutos[i].getModelo()+" - "+listaAutos[i].getKilometraje()+" - "+listaAutos[i].getValorAlquiler()+" - "+listaAutos[i].getColor()+" - "+listaAutos[i].getPlaca()+" - "+listaAutos[i].getTransmision()+" - "+listaAutos[i].getTamaño()+" - "+listaAutos[i].getAire_acondicionado()+" - "+listaAutos[i].getFecha() +" - "+ listaAutos[i].getEstado());
                        btnEstado[i] = new JButton("Estado");
                        Temporal.setFont(new Font("Arial", Font.PLAIN, 12));
                        Temporal.setBorder(new EmptyBorder(2,10,2,10));

                        
                        campoMostrarAutos.add(Temporal);
                        campoMostrarAutos.add(btnEstado[i]);
                        
                        
                        
                        ActionListener eventoAtras;
                        eventoAtras = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                cambiarEstado();
                            }
                        }; 

                        btnEstado[i].addActionListener(eventoAtras);
                    }else{
                        break;
                    }
            }
                revalidate();
        }
    }
    
    public void cambiarEstado(){
        
        Autos listaAutos [] = this.ventanaMenu.database.listaAutosOcupados();
        
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
                        String estado = "A";
                        Autos temporal = new Autos(id,marca,modelo,kilometraje,ValorAlquiler ,color,placa,transmision,tamano,aire_acondicionado,fecha,estado);
                        boolean proceso = this.ventanaMenu.database.editarEstado(temporal);
                        Alert alerta = new Alert("EXITO", "Auto Activado Correctamente.", "success");
                        break;
                    }else{
                        break;
                    }
            }
                revalidate();
        }
    }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoMostrarAutos.setLayout( new BoxLayout( campoMostrarAutos, BoxLayout.Y_AXIS) );
        campoMostrarAutos.setBackground(Color.WHITE);
        imprimirAutos();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextArea campoMostrarAutos;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
