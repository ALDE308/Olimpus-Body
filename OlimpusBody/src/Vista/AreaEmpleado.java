
package Vista;

import Modelo.DAOEmpleado;

public class AreaEmpleado extends javax.swing.JFrame {
    DAOEmpleado emple = new DAOEmpleado();

    public AreaEmpleado() {
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
        botonCotizacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonAfiliar = new javax.swing.JButton();
        btonSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEmpleado.png"))); // NOI18N

        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUENO2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("AREA EMPLEADO");

        botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPRODUCTOS.PNG"))); // NOI18N
        botonProductos.setToolTipText("");
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCOTIZACION.png"))); // NOI18N

        botonCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCOTIZACION.PNG"))); // NOI18N
        botonCotizacion.setBorder(null);
        botonCotizacion.setContentAreaFilled(false);
        botonCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCOTIZACION.PNG"))); // NOI18N
        botonCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCOTIZACION.PNG"))); // NOI18N
        botonCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCotizacionActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCLIENTE.png"))); // NOI18N

        botonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCLIENTE.PNG"))); // NOI18N
        botonCliente.setBorder(null);
        botonCliente.setDefaultCapable(false);
        botonCliente.setFocusPainted(false);
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAFILIAR.png"))); // NOI18N

        botonAfiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIAR.PNG"))); // NOI18N
        botonAfiliar.setBorder(null);
        botonAfiliar.setDefaultCapable(false);
        botonAfiliar.setFocusPainted(false);
        botonAfiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAfiliarActionPerformed(evt);
            }
        });

        btonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        btonSalir.setBorder(null);
        btonSalir.setContentAreaFilled(false);
        btonSalir.setFocusPainted(false);
        btonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        btonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        btonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonSalirActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPRODUCTOS.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(138, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)))
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(botonAfiliar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonProductos)
                                    .addComponent(botonCotizacion)
                                    .addComponent(botonCliente))))
                        .addGap(0, 153, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btonSalir)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(botonProductos))
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(botonCotizacion)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(botonCliente))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(botonAfiliar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btonSalir)
                .addGap(19, 19, 19))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        ControlProducto vistaProducto = new ControlProducto();
        vistaProducto.setVisible(true);
    }//GEN-LAST:event_botonProductosActionPerformed

    private void btonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonSalirActionPerformed
        Login vista = new Login();
        vista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btonSalirActionPerformed

    private void botonCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCotizacionActionPerformed
        ControlCotizacion vistaCotizacion = new ControlCotizacion();
        vistaCotizacion.setVisible(true);
    }//GEN-LAST:event_botonCotizacionActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        ControlAfiliacion vistaAfiliacion = new ControlAfiliacion();
        vistaAfiliacion.setVisible(true);
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonAfiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAfiliarActionPerformed
        RegistrarAfiliacion vistaAfiliacion = new RegistrarAfiliacion();
        vistaAfiliacion.setVisible(true);
    }//GEN-LAST:event_botonAfiliarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAfiliar;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonCotizacion;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton btonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
    void nombreUsuario(String string) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
