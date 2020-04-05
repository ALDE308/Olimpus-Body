
package Vista;

import javax.swing.JOptionPane;


public class RegistrarProveedor extends javax.swing.JFrame {


    public RegistrarProveedor() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        guardarProveedor = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        registrarNombre = new javax.swing.JTextField();
        nitProveedor = new javax.swing.JTextField();
        telefonoProveedor = new javax.swing.JTextField();
        direccionProveedor = new javax.swing.JTextField();
        productoProveedor = new javax.swing.JTextField();
        precioProveedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUENO2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRAR PROVEEDOR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NIT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("TELEFONO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DIRECCION");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("NOMBRE PRODUCTO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("PRECIO PRECIO");

        guardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGUARDAR.PNG"))); // NOI18N
        guardarProveedor.setBorder(null);
        guardarProveedor.setBorderPainted(false);
        guardarProveedor.setOpaque(false);
        guardarProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGUARDAR.PNG"))); // NOI18N
        guardarProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGUARDAR.PNG"))); // NOI18N
        guardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProveedorActionPerformed(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setOpaque(false);
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        telefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoProveedorKeyTyped(evt);
            }
        });

        precioProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProveedorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarNombre)
                    .addComponent(nitProveedor)
                    .addComponent(telefonoProveedor)
                    .addComponent(direccionProveedor)
                    .addComponent(productoProveedor)
                    .addComponent(precioProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(guardarProveedor)
                        .addGap(126, 126, 126)
                        .addComponent(salir)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1)
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(registrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel4))
                                            .addComponent(nitProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel5))
                                    .addComponent(telefonoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6))
                            .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7))
                    .addComponent(productoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(precioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
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

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void guardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProveedorActionPerformed
        Modelo.DAOProveedor  objProv;
        objProv = new Modelo.DAOProveedor();

        int nit = (Integer.parseInt(nitProveedor.getText()));
        
        Controlador.ControladorProveedor proveedor  = new Controlador.ControladorProveedor();
        
        if (registrarNombre.getText().equals("")||nitProveedor.getText().equals("")||telefonoProveedor.getText().equals("")
                ||direccionProveedor.getText().equals("")||productoProveedor.getText().equals("")||
                precioProveedor.getText().equals("")) {
             JOptionPane.showMessageDialog(rootPane, "Debe ingresar todos los datos");
             limpiarCampos();
        }else{
            String nombre =(registrarNombre.getText());
            int nitt = Integer.parseInt(nitProveedor.getText());
            int tel = Integer.parseInt(telefonoProveedor.getText());
            String direccion = direccionProveedor.getText();
            String nombreeP = productoProveedor.getText();
            int precio =(Integer.parseInt(precioProveedor.getText()));
            String estado = "Activo";
            
            proveedor.guardarProveedor(nombre, nitt, tel, direccion, precio,nombreeP ,estado);
            JOptionPane.showMessageDialog(rootPane, "SE REGISTRO EL PROVEEDOR CON EXITO");
            limpiarCampos();  
        }
    }//GEN-LAST:event_guardarProveedorActionPerformed

    private void telefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoProveedorKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_telefonoProveedorKeyTyped

    private void precioProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProveedorKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_precioProveedorKeyTyped
    public void limpiarCampos (){
        registrarNombre.setText("");
        nitProveedor.setText("");
        telefonoProveedor.setText("");
        direccionProveedor.setText("");
        productoProveedor.setText("");
        precioProveedor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccionProveedor;
    private javax.swing.JButton guardarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nitProveedor;
    private javax.swing.JTextField precioProveedor;
    private javax.swing.JTextField productoProveedor;
    private javax.swing.JTextField registrarNombre;
    private javax.swing.JButton salir;
    private javax.swing.JTextField telefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
