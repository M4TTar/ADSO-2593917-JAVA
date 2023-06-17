package ModuloFacturas;

import Clases.Factura;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListarFacturas extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    private JLabel etqTemporal;
    private JButton [] btnDetalles;
    
    public ListarFacturas(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        contenFacturas.setLayout( new BoxLayout(contenFacturas, BoxLayout.Y_AXIS) );
        contenFacturas.setBackground(Color.WHITE);
        imprimirFactura();
    }
    
    public void imprimirFactura(){
        Factura listaFacturas [] = this.ventanaMenu.database.listarFacturas();
        btnDetalles = new JButton [listaFacturas.length];
        for(int i = 0; i < listaFacturas.length; i++){
            if(listaFacturas[i] != null){
                
                etqTemporal = new JLabel(" " + listaFacturas[i].getId()+" - "+listaFacturas[i]. getCedula_cliente()+" "+listaFacturas[i].getCedula_vendedor()+" - "+" - "+listaFacturas[i].getTotal());
                btnDetalles[i] = new JButton("Ver Detalles");
                etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                String cedula_cliente = listaFacturas[i].getCedula_cliente();
                String cedula_vendedor = listaFacturas[i].getCedula_vendedor();
                String total = listaFacturas[i].getTotal();
                String id_factura = listaFacturas[i].getId();
                
                contenFacturas.add(etqTemporal);
                contenFacturas.add(btnDetalles[i]);
                final ListarFacturas ventana = this;
                ActionListener eventoAtras = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DetallesFacturas detalles = new DetallesFacturas(ventana,cedula_cliente, cedula_vendedor, total, id_factura);
                        detalles.setVisible(true);
                        dispose();

                    } 
                }; 

                btnDetalles[i].addActionListener(eventoAtras);
            }else{
                break;
            }

        }
        revalidate();
        
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalContainer = new javax.swing.JPanel();
        EtqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenFacturas = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        principalContainer.setBackground(new java.awt.Color(153, 153, 255));

        EtqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EtqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtqTitulo.setText("LISTAR FACTURAS");
        EtqTitulo.setToolTipText("");

        javax.swing.GroupLayout contenFacturasLayout = new javax.swing.GroupLayout(contenFacturas);
        contenFacturas.setLayout(contenFacturasLayout);
        contenFacturasLayout.setHorizontalGroup(
            contenFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        contenFacturasLayout.setVerticalGroup(
            contenFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenFacturas);

        btnAtras.setText("Atras");
        btnAtras.setFocusable(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalContainerLayout = new javax.swing.GroupLayout(principalContainer);
        principalContainer.setLayout(principalContainerLayout);
        principalContainerLayout.setHorizontalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principalContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(EtqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        principalContainerLayout.setVerticalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(EtqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contenFacturas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principalContainer;
    // End of variables declaration//GEN-END:variables
}
