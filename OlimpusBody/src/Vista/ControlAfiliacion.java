
package Vista;


public class ControlAfiliacion extends javax.swing.JFrame {

  
    public ControlAfiliacion() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crearAfiliacin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarAfiliacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        editarAfiliacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buscarAfiliado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        listarAfiliado = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAFILIAR.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("GESTION AFILIACION");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCREAR.png"))); // NOI18N

        crearAfiliacin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearAfiliacin.setBorder(null);
        crearAfiliacin.setBorderPainted(false);
        crearAfiliacin.setOpaque(false);
        crearAfiliacin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearAfiliacin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOGRANDE.PNG"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoELIMINAR.png"))); // NOI18N

        eliminarAfiliacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarAfiliacion.setBorder(null);
        eliminarAfiliacion.setBorderPainted(false);
        eliminarAfiliacion.setOpaque(false);
        eliminarAfiliacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarAfiliacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEDITAR.png"))); // NOI18N

        editarAfiliacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarAfiliacion.setBorder(null);
        editarAfiliacion.setBorderPainted(false);
        editarAfiliacion.setOpaque(false);
        editarAfiliacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarAfiliacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBUSCAR.png"))); // NOI18N

        buscarAfiliado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarAfiliado.setBorder(null);
        buscarAfiliado.setBorderPainted(false);
        buscarAfiliado.setOpaque(false);
        buscarAfiliado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarAfiliado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLISTAR.png"))); // NOI18N

        listarAfiliado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarAfiliado.setBorder(null);
        listarAfiliado.setBorderPainted(false);
        listarAfiliado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarAfiliado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonATRAS.png"))); // NOI18N
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonATRAS.png"))); // NOI18N
        botonAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonATRAS.png"))); // NOI18N

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
                                    .addComponent(crearAfiliacin))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(editarAfiliacion))
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(buscarAfiliado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarAfiliacion)))
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
                        .addComponent(listarAfiliado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAtras)
                        .addGap(24, 24, 24))))
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
                                    .addComponent(crearAfiliacin))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(eliminarAfiliacion))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(editarAfiliacion)))
                                .addGap(53, 53, 53)
                                .addComponent(buscarAfiliado))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(listarAfiliado)
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlAfiliacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton buscarAfiliado;
    private javax.swing.JButton crearAfiliacin;
    private javax.swing.JButton editarAfiliacion;
    private javax.swing.JButton eliminarAfiliacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listarAfiliado;
    // End of variables declaration//GEN-END:variables
}
