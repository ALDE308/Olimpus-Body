
package Vista;


public class ControlEmpleado extends javax.swing.JFrame {

    
    public ControlEmpleado() {
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
        jLabel4 = new javax.swing.JLabel();
        crearEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarEmpleado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        editarEmpleado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buscarEmpleado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        listarEmpleado = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEmpleado.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("GESTION EMPLEADO");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCREAR.png"))); // NOI18N

        crearEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearEmpleado.setBorder(null);
        crearEmpleado.setBorderPainted(false);
        crearEmpleado.setOpaque(false);
        crearEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOGRANDE.PNG"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoELIMINAR.png"))); // NOI18N

        eliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarEmpleado.setBorder(null);
        eliminarEmpleado.setBorderPainted(false);
        eliminarEmpleado.setOpaque(false);
        eliminarEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEmpleadoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEDITAR.png"))); // NOI18N

        editarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarEmpleado.setBorder(null);
        editarEmpleado.setBorderPainted(false);
        editarEmpleado.setOpaque(false);
        editarEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEmpleadoActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBUSCAR.png"))); // NOI18N

        buscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarEmpleado.setBorder(null);
        buscarEmpleado.setBorderPainted(false);
        buscarEmpleado.setOpaque(false);
        buscarEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleadoActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLISTAR.png"))); // NOI18N

        listarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarEmpleado.setBorder(null);
        listarEmpleado.setBorderPainted(false);
        listarEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEmpleadoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(crearEmpleado))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(editarEmpleado))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(buscarEmpleado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarEmpleado)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(listarEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAtras)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(crearEmpleado))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(eliminarEmpleado))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(editarEmpleado)))
                                .addGap(53, 53, 53)
                                .addComponent(buscarEmpleado))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(listarEmpleado)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAtras)
                                .addGap(27, 27, 27))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEmpleadoActionPerformed
        RegistrarEmpleado vistaRegistrar = new RegistrarEmpleado();
        vistaRegistrar.setVisible(true);
    }//GEN-LAST:event_crearEmpleadoActionPerformed

    private void eliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleadoActionPerformed
        EliminarEmpleado vistaEliminar = new EliminarEmpleado();
        vistaEliminar.setVisible(true);
    }//GEN-LAST:event_eliminarEmpleadoActionPerformed

    private void editarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEmpleadoActionPerformed
        EditarEmpleado vistaEditar = new EditarEmpleado();
        vistaEditar.setVisible(true);
    }//GEN-LAST:event_editarEmpleadoActionPerformed

    private void buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleadoActionPerformed
        BuscarEmpleado vistaBuscar = new BuscarEmpleado();
        vistaBuscar.setVisible(true);
    }//GEN-LAST:event_buscarEmpleadoActionPerformed

    private void listarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEmpleadoActionPerformed
        ListarEmpleado vistaListar = new ListarEmpleado();
        vistaListar.setVisible(true);
    }//GEN-LAST:event_listarEmpleadoActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton buscarEmpleado;
    private javax.swing.JButton crearEmpleado;
    private javax.swing.JButton editarEmpleado;
    private javax.swing.JButton eliminarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listarEmpleado;
    // End of variables declaration//GEN-END:variables
}
