
package Vista;


public class ControlProveedor extends javax.swing.JFrame {

    public ControlProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        crearProvedor = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        eliminarProvedor = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        editarProvedor = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        buscarProvedor = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        listarProvedor = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPROVEEDOR.png"))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel58.setText("GESTION PROVEEDOR");

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCREAR.png"))); // NOI18N

        crearProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearProvedor.setBorder(null);
        crearProvedor.setBorderPainted(false);
        crearProvedor.setOpaque(false);
        crearProvedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearProvedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProvedorActionPerformed(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOGRANDE.PNG"))); // NOI18N

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoELIMINAR.png"))); // NOI18N

        eliminarProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarProvedor.setBorder(null);
        eliminarProvedor.setBorderPainted(false);
        eliminarProvedor.setOpaque(false);
        eliminarProvedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarProvedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProvedorActionPerformed(evt);
            }
        });

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEDITAR.png"))); // NOI18N

        editarProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarProvedor.setBorder(null);
        editarProvedor.setBorderPainted(false);
        editarProvedor.setOpaque(false);
        editarProvedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarProvedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProvedorActionPerformed(evt);
            }
        });

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBUSCAR.png"))); // NOI18N

        buscarProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarProvedor.setBorder(null);
        buscarProvedor.setBorderPainted(false);
        buscarProvedor.setOpaque(false);
        buscarProvedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarProvedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProvedorActionPerformed(evt);
            }
        });

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLISTAR.png"))); // NOI18N

        listarProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarProvedor.setBorder(null);
        listarProvedor.setBorderPainted(false);
        listarProvedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarProvedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProvedorActionPerformed(evt);
            }
        });

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonATRAS.png"))); // NOI18N
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonATRAS.png"))); // NOI18N
        botonAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonATRAS.png"))); // NOI18N
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel59)
                                    .addGap(18, 18, 18)
                                    .addComponent(crearProvedor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel62)
                                    .addGap(18, 18, 18)
                                    .addComponent(editarProvedor))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(26, 26, 26)
                                .addComponent(buscarProvedor))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarProvedor)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel58)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(18, 18, 18)
                        .addComponent(listarProvedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAtras)
                        .addGap(24, 24, 24))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel57)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel59)
                                    .addComponent(crearProvedor))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel61)
                                    .addComponent(eliminarProvedor))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel62))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(editarProvedor)))
                                .addGap(53, 53, 53)
                                .addComponent(buscarProvedor))
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(listarProvedor)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(botonAtras)
                                .addGap(26, 26, 26))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void crearProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearProvedorActionPerformed
        RegistrarProveedor vistaCrear = new RegistrarProveedor();
        vistaCrear.setVisible(true);
    }//GEN-LAST:event_crearProvedorActionPerformed

    private void eliminarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProvedorActionPerformed
        EliminarProveedor vistaEliminar = new EliminarProveedor();
        vistaEliminar.setVisible(true);
    }//GEN-LAST:event_eliminarProvedorActionPerformed

    private void editarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProvedorActionPerformed
        EditarProveedor vistaEditar = new EditarProveedor();
        vistaEditar.setVisible(true);
    }//GEN-LAST:event_editarProvedorActionPerformed

    private void buscarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProvedorActionPerformed
        BuscarProveedor vistaBuscar = new BuscarProveedor();
        vistaBuscar.setVisible(true);
    }//GEN-LAST:event_buscarProvedorActionPerformed

    private void listarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProvedorActionPerformed
        ListarProveedor vistaListar = new ListarProveedor();
        vistaListar.setVisible(true);
    }//GEN-LAST:event_listarProvedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton buscarProvedor;
    private javax.swing.JButton crearProvedor;
    private javax.swing.JButton editarProvedor;
    private javax.swing.JButton eliminarProvedor;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton listarProvedor;
    // End of variables declaration//GEN-END:variables
}
