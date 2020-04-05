
package Vista;


public class AreaJefe extends javax.swing.JFrame {

 
    public AreaJefe() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonProductos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonProveedor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonReportes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonCotizacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        botonEmpleado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botonAfiliar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoJEFE.png"))); // NOI18N

        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("AREA JEFE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUENO2.png"))); // NOI18N

        botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPRODUCTOS.PNG"))); // NOI18N
        botonProductos.setBorder(null);
        botonProductos.setContentAreaFilled(false);
        botonProductos.setFocusPainted(false);
        botonProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPRODUCTOS.PNG"))); // NOI18N
        botonProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPRODUCTOS.PNG"))); // NOI18N
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPROVEEDOR.png"))); // NOI18N

        botonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPROVEEDOR.PNG"))); // NOI18N
        botonProveedor.setBorder(null);
        botonProveedor.setContentAreaFilled(false);
        botonProveedor.setFocusPainted(false);
        botonProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPROVEEDOR.PNG"))); // NOI18N
        botonProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPROVEEDOR.PNG"))); // NOI18N
        botonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedorActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoREPORTES.png"))); // NOI18N

        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonREPORTES.PNG"))); // NOI18N
        botonReportes.setBorder(null);
        botonReportes.setContentAreaFilled(false);
        botonReportes.setFocusPainted(false);
        botonReportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonREPORTES.PNG"))); // NOI18N
        botonReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonREPORTES.PNG"))); // NOI18N
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCOTIZACION.png"))); // NOI18N

        botonCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCOTIZACION.PNG"))); // NOI18N
        botonCotizacion.setBorder(null);
        botonCotizacion.setContentAreaFilled(false);
        botonCotizacion.setFocusPainted(false);
        botonCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCOTIZACION.PNG"))); // NOI18N
        botonCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCOTIZACION.PNG"))); // NOI18N
        botonCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCotizacionActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEmpleado.png"))); // NOI18N

        botonEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEMPLEADO.PNG"))); // NOI18N
        botonEmpleado.setBorder(null);
        botonEmpleado.setContentAreaFilled(false);
        botonEmpleado.setFocusPainted(false);
        botonEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEMPLEADO.PNG"))); // NOI18N
        botonEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEMPLEADO.PNG"))); // NOI18N
        botonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadoActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCLIENTE.png"))); // NOI18N

        botonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCLIENTE.PNG"))); // NOI18N
        botonCliente.setBorder(null);
        botonCliente.setContentAreaFilled(false);
        botonCliente.setFocusPainted(false);
        botonCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCLIENTE.PNG"))); // NOI18N
        botonCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCLIENTE.PNG"))); // NOI18N
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAFILIAR.png"))); // NOI18N

        botonAfiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIAR.PNG"))); // NOI18N
        botonAfiliar.setBorder(null);
        botonAfiliar.setBorderPainted(false);
        botonAfiliar.setContentAreaFilled(false);
        botonAfiliar.setFocusPainted(false);
        botonAfiliar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIAR.PNG"))); // NOI18N
        botonAfiliar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIAR.PNG"))); // NOI18N
        botonAfiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAfiliarActionPerformed(evt);
            }
        });

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        botonSalir.setBorder(null);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setFocusPainted(false);
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPRODUCTOS.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonProductos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonProveedor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonReportes)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCotizacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(botonEmpleado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonSalir)
                                    .addComponent(botonCliente)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(botonAfiliar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonCotizacion)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(botonEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonProductos)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(botonProveedor))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(botonReportes))
                            .addComponent(botonCliente))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonSalir)
                            .addComponent(botonAfiliar)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel9))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void botonAfiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAfiliarActionPerformed
        RegistrarAfiliacion vistaAfiliacion = new RegistrarAfiliacion();
        vistaAfiliacion.setVisible(true);
    }//GEN-LAST:event_botonAfiliarActionPerformed

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        ControlProducto vistaProducto = new ControlProducto();
        vistaProducto.setVisible(true);
    }//GEN-LAST:event_botonProductosActionPerformed

    private void botonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedorActionPerformed
        ControlProveedor vistaProveedor = new ControlProveedor();
        vistaProveedor.setVisible(true);
    }//GEN-LAST:event_botonProveedorActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        ControlReportes vistaReportes = new ControlReportes();
        vistaReportes.setVisible(true);
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCotizacionActionPerformed
        ControlCotizacion vistaCotizacion = new ControlCotizacion();
        vistaCotizacion.setVisible(true);
    }//GEN-LAST:event_botonCotizacionActionPerformed

    private void botonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadoActionPerformed
        ControlEmpleado vistaEmpleado = new ControlEmpleado();
        vistaEmpleado.setVisible(true);
    }//GEN-LAST:event_botonEmpleadoActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        ControlAfiliacion vistaAfiliacion = new ControlAfiliacion();
        vistaAfiliacion.setVisible(true);
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Login vista = new Login();
        vista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAfiliar;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonCotizacion;
    private javax.swing.JButton botonEmpleado;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton botonProveedor;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
