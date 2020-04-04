
package Vista;

import javax.swing.JOptionPane;


public class ListarEmpleado extends javax.swing.JFrame {

    
    public ListarEmpleado() {
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
        cboxFiltro = new javax.swing.JComboBox<>();
        txtlistar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        listarEmpleado = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 10, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LISTAR EMPLEADO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUENO2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("LISTAR POR");

        cboxFiltro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Cargo", "Sueldo" }));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        listarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarEmpleado.setBorder(null);
        listarEmpleado.setBorderPainted(false);
        listarEmpleado.setOpaque(false);
        listarEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonLISTAR.PNG"))); // NOI18N
        listarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEmpleadoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(listarEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66)
                        .addComponent(cboxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(txtlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtlistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listarEmpleado)
                    .addComponent(salir))
                .addGap(55, 55, 55))
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
    Modelo.DAOEmpleado listarEmple = new Modelo.DAOEmpleado();
    
    private void listarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEmpleadoActionPerformed
        if (txtlistar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        } else if (cboxFiltro.getSelectedItem().toString().equals("Cargo")) {
            String estado = "Activo";
            listarEmple.listarEmpl(txtlistar.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos, estado);
            limpiarCampos();
        } else if (cboxFiltro.getSelectedItem().toString().equals("Sueldo")) {
            listarEmple.setSueldo(Integer.parseInt(txtlistar.getText()));
            String estado = "Activo";
            listarEmple.listarEmpl(txtlistar.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos, estado);
            limpiarCampos();
        } else {
            String estado = "Activo";
            listarEmple.listarEmpl(txtlistar.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos, estado);
            limpiarCampos();
        }
    }//GEN-LAST:event_listarEmpleadoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    public void limpiarCampos(){
        txtlistar.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarEmpleado;
    private javax.swing.JButton salir;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtlistar;
    // End of variables declaration//GEN-END:variables
}
