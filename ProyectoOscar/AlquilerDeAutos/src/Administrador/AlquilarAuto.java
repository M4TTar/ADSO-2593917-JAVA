package Administrador;

import Clases.Autos;
import Cliente.MenuCliente;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class AlquilarAuto extends javax.swing.JFrame {
    MenuAdministrador ventanaMenu;
    private JButton [] btnAlquilar;
    public AlquilarAuto(MenuAdministrador ventanaMenu) {
       this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ContenTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etqTtituloPrecios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoAutosDisponibles = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CampoAutoBuscado = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alquilar Auto");
        setResizable(false);

        ContenTitulo.setBackground(new java.awt.Color(204, 204, 255));

        etqTitulo.setBackground(new java.awt.Color(204, 204, 255));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ALQUILAR AUTO");

        javax.swing.GroupLayout ContenTituloLayout = new javax.swing.GroupLayout(ContenTitulo);
        ContenTitulo.setLayout(ContenTituloLayout);
        ContenTituloLayout.setHorizontalGroup(
            ContenTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        ContenTituloLayout.setVerticalGroup(
            ContenTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        etqTtituloPrecios.setBackground(new java.awt.Color(0, 0, 0));
        etqTtituloPrecios.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        etqTtituloPrecios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        campoAutosDisponibles.setEditable(false);
        campoAutosDisponibles.setBackground(new java.awt.Color(204, 204, 255));
        campoAutosDisponibles.setColumns(20);
        campoAutosDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoAutosDisponibles.setRows(5);
        jScrollPane1.setViewportView(campoAutosDisponibles);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Buscar Auto:");

        campoBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        CampoAutoBuscado.setEditable(false);
        CampoAutoBuscado.setBackground(new java.awt.Color(204, 204, 255));
        CampoAutoBuscado.setColumns(20);
        CampoAutoBuscado.setRows(5);
        jScrollPane3.setViewportView(CampoAutoBuscado);

        btnAtras.setBackground(new java.awt.Color(255, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTtituloPrecios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContenTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoAutosDisponibles.setLayout( new BoxLayout( campoAutosDisponibles, BoxLayout.Y_AXIS) );
        campoAutosDisponibles.setBackground(Color.WHITE);
        imprimirAutos();
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = campoBuscar.getText();
        Autos temporal =this.ventanaMenu.database.buscarAuto(placa);
        if (temporal != null) {
    
        }else{
            Alert alerta = new Alert("NO EXISTE", " ESTE AUTO NO ESTA REGISTRADO.", "error");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
        
    public void imprimirAutos(){
        Autos listaAutos [] = this.ventanaMenu.database.listaAutosLibres();
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


                    final AlquilarAuto ventana = this;
                    ActionListener eventoAtras = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {                      
                            RealizarAlquiler detalles = new RealizarAlquiler(ventana,ValorAlquiler,Placa,estado,ventanaMenu, marca);
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
    private javax.swing.JTextArea CampoAutoBuscado;
    private javax.swing.JPanel ContenTitulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextArea campoAutosDisponibles;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTtituloPrecios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
