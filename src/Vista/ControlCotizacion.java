
package Vista;


public class ControlCotizacion extends javax.swing.JFrame {

    
    public ControlCotizacion() {
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
        crearCotizacion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarCotizacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        editarCotizacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buscarCotizacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        listarCotizacion = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCOTIZACION.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("GESTION COTIZACION");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCREAR.png"))); // NOI18N

        crearCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearCotizacion.setBorder(null);
        crearCotizacion.setBorderPainted(false);
        crearCotizacion.setOpaque(false);
        crearCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N
        crearCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCREAR.PNG"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOGRANDE.PNG"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoELIMINAR.png"))); // NOI18N

        eliminarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarCotizacion.setBorder(null);
        eliminarCotizacion.setBorderPainted(false);
        eliminarCotizacion.setOpaque(false);
        eliminarCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N
        eliminarCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonELIMINAR.PNG"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEDITAR.png"))); // NOI18N

        editarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarCotizacion.setBorder(null);
        editarCotizacion.setBorderPainted(false);
        editarCotizacion.setOpaque(false);
        editarCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N
        editarCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEDITAR.PNG"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBUSCAR.png"))); // NOI18N

        buscarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarCotizacion.setBorder(null);
        buscarCotizacion.setBorderPainted(false);
        buscarCotizacion.setOpaque(false);
        buscarCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N
        buscarCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonBUSCAR.PNG"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLISTAR.png"))); // NOI18N

        listarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarCotizacion.setBorder(null);
        listarCotizacion.setBorderPainted(false);
        listarCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(listarCotizacion)
                        .addGap(320, 320, 320)
                        .addComponent(botonAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(crearCotizacion))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(editarCotizacion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(buscarCotizacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarCotizacion)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)))))
                .addContainerGap(34, Short.MAX_VALUE))
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
                                    .addComponent(crearCotizacion))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(eliminarCotizacion))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(editarCotizacion)))
                                .addGap(53, 53, 53)
                                .addComponent(buscarCotizacion))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(listarCotizacion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAtras)
                                .addGap(32, 32, 32))))))
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
            java.util.logging.Logger.getLogger(ControlCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton buscarCotizacion;
    private javax.swing.JButton crearCotizacion;
    private javax.swing.JButton editarCotizacion;
    private javax.swing.JButton eliminarCotizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listarCotizacion;
    // End of variables declaration//GEN-END:variables
}