package ModuloFacturas;


import Clases.DataBase;
import Clases.itemsFactura;
import ModuloFacturas.ListarFacturas;



public class DetallesFacturas extends javax.swing.JFrame {
    ListarFacturas volver_lista_detalles;
    String cedula_cliente;
    String cedula_vendedor;
    String total;
    String id_factura;
    
  public DetallesFacturas(ListarFacturas volver_lista_detalles , String cedula_cliente, String cedula_vendedor, String total, String id_factura) {
        this. volver_lista_detalles = volver_lista_detalles;
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.total = total;
        this.id_factura = id_factura;
        
        
        initComponents();
        copiarDatos();
        initAlternComponents();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        contenedor2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoCedula_Vendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoCedula_Cliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoProductos = new javax.swing.JTextArea();
        etqTotal = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        etqId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor1.setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("DETALLES FACTURA");

        javax.swing.GroupLayout Contenedor1Layout = new javax.swing.GroupLayout(Contenedor1);
        Contenedor1.setLayout(Contenedor1Layout);
        Contenedor1Layout.setHorizontalGroup(
            Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Contenedor1Layout.setVerticalGroup(
            Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedor2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula Vendedor:");

        campoCedula_Vendedor.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula Cliente:");

        campoCedula_Cliente.setEditable(false);
        campoCedula_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedula_ClienteActionPerformed(evt);
            }
        });

        campoProductos.setEditable(false);
        campoProductos.setBackground(new java.awt.Color(255, 255, 255));
        campoProductos.setColumns(20);
        campoProductos.setRows(5);
        jScrollPane1.setViewportView(campoProductos);

        etqTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTotal.setForeground(new java.awt.Color(255, 255, 255));
        etqTotal.setText("$TOTAL:");

        btnAtras.setBackground(new java.awt.Color(0, 0, 255));
        btnAtras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etqId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqId.setForeground(new java.awt.Color(255, 255, 255));
        etqId.setText("ID:");

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqTotal)
                .addGap(34, 34, 34))
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCedula_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedula_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedor2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnAtras)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedor2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(campoCedula_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqId)
                    .addComponent(etqTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras)
                .addGap(14, 14, 14))
            .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedor2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void copiarDatos(){
        DataBase nombre = new DataBase();
        this.campoCedula_Cliente.setText(this.cedula_cliente);
        this.campoCedula_Vendedor.setText(this.cedula_vendedor);
        this.etqId.setText(id_factura);
        this.etqTotal.setText("Total: $"+this.total);
        itemsFactura nombre2 [] = nombre.imprimirProductos(id_factura);
        for (int i = 0; i < nombre2.length; i++) {
            if (nombre2[i] != null) {
                String id_prod = nombre2[i].getId_producto();
                String cantidad = nombre2[i].getCantidad();
                String subtotal = nombre2[i].getSubtotal();
                String todo = id_prod +" - "+ cantidad +" - "+ subtotal+"\n";
                this.campoProductos.append(todo);
            }
        }
    }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       this. volver_lista_detalles.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void campoCedula_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedula_ClienteActionPerformed
        
    }//GEN-LAST:event_campoCedula_ClienteActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        setTitle("Detalles Factura");
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextField campoCedula_Cliente;
    private javax.swing.JTextField campoCedula_Vendedor;
    private javax.swing.JTextArea campoProductos;
    private javax.swing.JPanel contenedor2;
    private javax.swing.JLabel etqId;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
