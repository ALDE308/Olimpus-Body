package Vista;

import javax.swing.JOptionPane;

public class EliminarCliente extends javax.swing.JFrame {

    public EliminarCliente() {
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
        cedulaCliente = new javax.swing.JTextField();
        buscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoBusqueda = new javax.swing.JTextArea();
        eliminarCliente = new javax.swing.JButton();
        salirCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ELIMINAR CLIENTE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUENO2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CEDULA DEL CLIENTE");

        cedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteActionPerformed(evt);
            }
        });

        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarCliente.setBorder(null);
        buscarCliente.setBorderPainted(false);
        buscarCliente.setOpaque(false);
        buscarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        resultadoBusqueda.setColumns(20);
        resultadoBusqueda.setRows(5);
        jScrollPane1.setViewportView(resultadoBusqueda);

        eliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarCliente.setBorder(null);
        eliminarCliente.setBorderPainted(false);
        eliminarCliente.setOpaque(false);
        eliminarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteActionPerformed(evt);
            }
        });

        salirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        salirCliente.setBorder(null);
        salirCliente.setBorderPainted(false);
        salirCliente.setOpaque(false);
        salirCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        salirCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        salirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(eliminarCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salirCliente))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscarCliente)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(buscarCliente)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarCliente)
                    .addComponent(salirCliente))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Controlador.ControladorCliente clien = new Controlador.ControladorCliente();
    private void cedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaClienteActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        int cedula = Integer.parseInt(cedulaCliente.getText());
        if (cedulaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL CLIENTE");
        } else {
            String estado = "Activo";
            resultadoBusqueda.setText(clien.buscarCliente(cedula, estado));
        }
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteActionPerformed
        if (cedulaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE BUSCAR AL EMPLEADO");
        } else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el empleado, ¿desea continuar?",
                "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String eliminarCli = "Inactivo";
            clien.eliminarCliente(Integer.parseInt(cedulaCliente.getText()), eliminarCli);
            limpiarCampos();
        }
    }//GEN-LAST:event_eliminarClienteActionPerformed

    private void salirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirClienteActionPerformed
        ControlAfiliacion ca = new ControlAfiliacion();
        this.dispose();
        ca.setVisible(true);
    }//GEN-LAST:event_salirClienteActionPerformed

    private void telefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
            char dato = evt.getKeyChar();
            if (dato < '0' || dato > '9') {
                evt.consume();
            }
        }
    }

    private void cedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
        char dato = evt.getKeyChar();
        if (dato < '0' || dato > '9') {
            evt.consume();
        }
    }

    public void limpiarCampos() {
        cedulaCliente.setText("");
        resultadoBusqueda.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarCliente;
    private javax.swing.JTextField cedulaCliente;
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultadoBusqueda;
    private javax.swing.JButton salirCliente;
    // End of variables declaration//GEN-END:variables
}
