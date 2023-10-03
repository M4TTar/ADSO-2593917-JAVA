
package Autos;

import Administrador.MenuAdministrador;
import Clases.Autos;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class ListarAutos extends javax.swing.JFrame {
    
    MenuAdministrador ventanaMenu;
    private JLabel Temporal;

    public ListarAutos(MenuAdministrador ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
     
        
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoMostrarAutos.setLayout( new BoxLayout( campoMostrarAutos, BoxLayout.Y_AXIS) );
        campoMostrarAutos.setBackground(Color.WHITE);
        imprimirAutos();
    }
    
    public void imprimirAutos(){
        Autos listaAutos [] = this.ventanaMenu.database.listaAutos();
        if (listaAutos!=null) {
            for(int i = 0; i < listaAutos.length; i++){
                if(listaAutos[i] != null){
                    JLabel Temporal = new JLabel(" " + listaAutos[i].getId()+" - "+listaAutos[i].getMarca()+" "+listaAutos[i].getModelo()+" - "+listaAutos[i].getKilometraje()+" - "+listaAutos[i].getValorAlquiler()+" - "+listaAutos[i].getColor()+" - "+listaAutos[i].getPlaca()+" - "+listaAutos[i].getTransmision()+" - "+listaAutos[i].getTamaño()+" - "+listaAutos[i].getAire_acondicionado()+" - "+listaAutos[i].getFecha() + listaAutos[i].getEstado());
                    Temporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    Temporal.setBorder(new EmptyBorder(2,10,2,10));
                    campoMostrarAutos.add(Temporal);
                }else{
                    break;
                }
            }
            revalidate();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMostrarAutos = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lista de Autos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTA DE AUTOS");

        campoMostrarAutos.setEditable(false);
        campoMostrarAutos.setBackground(new java.awt.Color(255, 255, 255));
        campoMostrarAutos.setColumns(20);
        campoMostrarAutos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        campoMostrarAutos.setForeground(new java.awt.Color(0, 0, 0));
        campoMostrarAutos.setRows(5);
        jScrollPane1.setViewportView(campoMostrarAutos);

        btnAtras.setBackground(new java.awt.Color(255, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(12, 12, 12))
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextArea campoMostrarAutos;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
