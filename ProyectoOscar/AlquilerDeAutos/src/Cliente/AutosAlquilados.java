
package Cliente;

import Clases.Autos;
import Clases.DataBase;
import Clases.ListaAutosAlquilados;
import Clases.Registro;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class AutosAlquilados extends javax.swing.JFrame {
    
    
    MenuCliente ventanaCliente;
    String nombre;
    
    public AutosAlquilados(MenuCliente ventanaCliente,String nombre) {
        this.ventanaCliente = ventanaCliente;
        this.nombre = nombre;
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMostrarAutos = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Autos Alquilados");

        contenPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTA DE AUTOS");

        campoMostrarAutos.setEditable(false);
        campoMostrarAutos.setBackground(new java.awt.Color(255, 255, 255));
        campoMostrarAutos.setColumns(20);
        campoMostrarAutos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout contenPrincipalLayout = new javax.swing.GroupLayout(contenPrincipal);
        contenPrincipal.setLayout(contenPrincipalLayout);
        contenPrincipalLayout.setHorizontalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        contenPrincipalLayout.setVerticalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoMostrarAutos.setLayout( new BoxLayout( campoMostrarAutos, BoxLayout.Y_AXIS) );
        campoMostrarAutos.setBackground(Color.WHITE);
        imprimirAutosAlquilados();
    }
    
    public void imprimirAutosAlquilados(){
        ListaAutosAlquilados listaAutos [] = this.ventanaCliente.login.db.listaAutosAlquilados(nombre);
        if (listaAutos!=null) {
            for(int i = 0; i < listaAutos.length; i++){
                if(listaAutos[i] != null){
                    JLabel Temporal = new JLabel(" "+listaAutos[i].getMarca_vehiculo()+" - "+listaAutos[i].getNombre()+" - "+listaAutos[i].getCedula()+" - "+listaAutos[i].getTelefono()+" - "+listaAutos[i].getTiempo_alquiler()+" - "+listaAutos[i].getTotal_valor());
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
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextArea campoMostrarAutos;
    private javax.swing.JPanel contenPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
