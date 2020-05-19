package Vista;

import javax.swing.JOptionPane;

public class RegistrarAfiliacion extends javax.swing.JFrame {
    
    public RegistrarAfiliacion() {
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
        afiliarGriego = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        afiliarOlimpo = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jlbCedulaCli = new javax.swing.JLabel();
        cedulaCliente = new javax.swing.JTextField();
        cbxEstadoPlan = new javax.swing.JComboBox<>();
        jlbCedulaCli1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AFILIAR CLIENTE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUENO2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PLAN GRIEGO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ENTRENAS CUANDO QUIERAS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PLANGRIEGO.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PLAN OLIMPO");

        afiliarGriego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIARYA.PNG"))); // NOI18N
        afiliarGriego.setBorder(null);
        afiliarGriego.setBorderPainted(false);
        afiliarGriego.setOpaque(false);
        afiliarGriego.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIARYA.PNG"))); // NOI18N
        afiliarGriego.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIARYA.PNG"))); // NOI18N
        afiliarGriego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afiliarGriegoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PRECIO 50.000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("LA FUERZA ESTA EN TUS MANOS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PRECIO 70.000");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PLANOLIMPOOOOOO.jpg"))); // NOI18N

        afiliarOlimpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIARYA.PNG"))); // NOI18N
        afiliarOlimpo.setBorder(null);
        afiliarOlimpo.setBorderPainted(false);
        afiliarOlimpo.setOpaque(false);
        afiliarOlimpo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIARYA.PNG"))); // NOI18N
        afiliarOlimpo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAFILIARYA.PNG"))); // NOI18N
        afiliarOlimpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afiliarOlimpoActionPerformed(evt);
            }
        });

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        botonSalir.setBorder(null);
        botonSalir.setBorderPainted(false);
        botonSalir.setOpaque(false);
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSALIR.PNG"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jlbCedulaCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCedulaCli.setText("CEDULA:");

        cedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaClienteKeyTyped(evt);
            }
        });

        cbxEstadoPlan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxEstadoPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAGO", "DEBE" }));

        jlbCedulaCli1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCedulaCli1.setText("ESTADO PLAN:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonREGISTRARAFILIAR.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonREGISTRARAFILIAR.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonREGISTRARAFILIAR.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(afiliarOlimpo)
                        .addComponent(jLabel12)
                        .addComponent(botonSalir)))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCedulaCli)
                            .addComponent(jlbCedulaCli1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxEstadoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 249, Short.MAX_VALUE))
                            .addComponent(cedulaCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(afiliarGriego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(292, 292, 292)))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCedulaCli)
                    .addComponent(cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCedulaCli1)
                    .addComponent(cbxEstadoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(afiliarGriego)
                    .addComponent(afiliarOlimpo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Controlador.ControladorCliente objCliente = new Controlador.ControladorCliente();
    Controlador.ControladorAfiliacion objAfiliacion = new Controlador.ControladorAfiliacion();
    private void afiliarGriegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afiliarGriegoActionPerformed
        int cedula = Integer.parseInt(cedulaCliente.getText());
        if (cedulaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS");
        } else if (!cedulaCliente.getText().equals("")) {
            String resultadoA = objAfiliacion.verificarExistencia(cedula);
            if (!resultadoA.equals("No esta")) {
                JOptionPane.showMessageDialog(null, "EL CLIENTE YA ESTA AFILIADO");
            } else if (resultadoA.equals("No esta")) {
                String resultado = objCliente.verificarExistencia(cedula);
                if (resultado.equals("No esta")) {
                    JOptionPane.showMessageDialog(null, "SEDEBE REGISTRAR EL CLIENTA"+ "\n" + "PARA PODER AFILIARLO");
                } else if (!resultado.equals("No esta")) {
                    String plan = "PLAN GRIEGO";
                    String estadoPlan = (String) cbxEstadoPlan.getSelectedItem();
                    objAfiliacion.guardaAfiliacion(cedula, plan, estadoPlan);
                }
            }
        }
        cedulaCliente.setText("");

    }//GEN-LAST:event_afiliarGriegoActionPerformed

    private void afiliarOlimpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afiliarOlimpoActionPerformed
        int cedula = Integer.parseInt(cedulaCliente.getText());
        if (cedulaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS");
        } else if (!cedulaCliente.getText().equals("")) {
            String resultadoA = objAfiliacion.verificarExistencia(cedula);
            if (!resultadoA.equals("No esta")) {
                JOptionPane.showMessageDialog(null, "EL CLIENTE YA ESTA AFILIADO");
            } else if (resultadoA.equals("No esta")) {
                String resultado = objCliente.verificarExistencia(cedula);
                if (resultado.equals("No esta")) {
                    JOptionPane.showMessageDialog(null, "SEDEBE REGISTRAR EL CLIENTA"+ "\n" + "PARA PODER AFILIARLO");
                } else if (!resultado.equals("No esta")) {
                    String plan = "PLAN OLIMPO";
                    String estadoPlan = (String) cbxEstadoPlan.getSelectedItem();
                    objAfiliacion.guardaAfiliacion(cedula, plan, estadoPlan);
                }
            }
        }
        cedulaCliente.setText("");
    }//GEN-LAST:event_afiliarOlimpoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void cedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaClienteKeyTyped
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
    }//GEN-LAST:event_cedulaClienteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistrarClienteyAfiliar rca =  new RegistrarClienteyAfiliar();
        this.setVisible(false);
        rca.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afiliarGriego;
    private javax.swing.JButton afiliarOlimpo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> cbxEstadoPlan;
    private javax.swing.JTextField cedulaCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCedulaCli;
    private javax.swing.JLabel jlbCedulaCli1;
    // End of variables declaration//GEN-END:variables
}
