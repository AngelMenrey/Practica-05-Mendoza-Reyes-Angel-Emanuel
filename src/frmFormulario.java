
public class frmFormulario extends javax.swing.JFrame {
    Programas programas [] = new Programas[20];
    boolean namecanal,numcanal;
    int precio, tamaño,  ID = 0;
    String color, marca;
    
    public frmFormulario(String usuario) {
        initComponents();
        setLocationRelativeTo(null);
        USUARIO.setText(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        REGISTRAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        MENSAJE = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        COLOR = new javax.swing.JTextField();
        MARCA = new javax.swing.JTextField();
        PRECIO = new javax.swing.JTextField();
        TAMAÑO = new javax.swing.JTextField();
        REGRESAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CANAL2 = new javax.swing.JRadioButton();
        CANAL7 = new javax.swing.JRadioButton();
        DEPORTES = new javax.swing.JCheckBox();
        NOTICIAS = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO TELEVISION");

        REGISTRAR.setBackground(new java.awt.Color(0, 255, 0));
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        MOSTRAR.setBackground(new java.awt.Color(0, 204, 204));
        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        LIMPIAR.setBackground(new java.awt.Color(153, 255, 204));
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO");

        USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOActionPerformed(evt);
            }
        });

        jLabel4.setText("COLOR");

        jLabel5.setText("MARCA");

        jLabel6.setText("PRECIO");

        jLabel7.setText("TAMAÑO");

        MARCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MARCAActionPerformed(evt);
            }
        });

        REGRESAR.setBackground(new java.awt.Color(255, 0, 0));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        jLabel3.setText("CATEGORIA");

        jLabel8.setText("NUMERO CANAL");

        buttonGroup2.add(CANAL2);
        CANAL2.setText("CANAL 2");
        CANAL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANAL2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(CANAL7);
        CANAL7.setText("CANAL 7");

        DEPORTES.setText("DEPORTES");
        DEPORTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPORTESActionPerformed(evt);
            }
        });

        NOTICIAS.setText("NOTICIAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(USUARIO)
                                    .addComponent(COLOR)
                                    .addComponent(MARCA)
                                    .addComponent(PRECIO)
                                    .addComponent(TAMAÑO)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CANAL2)
                                            .addComponent(CANAL7))
                                        .addGap(192, 192, 192)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NOTICIAS)
                                            .addComponent(DEPORTES))))))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(MENSAJE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(REGISTRAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MOSTRAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LIMPIAR)
                                .addGap(18, 18, 18)
                                .addComponent(REGRESAR)))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(COLOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TAMAÑO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANAL2)
                    .addComponent(DEPORTES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANAL7)
                    .addComponent(NOTICIAS))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGISTRAR)
                    .addComponent(MOSTRAR)
                    .addComponent(LIMPIAR)
                    .addComponent(REGRESAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(MENSAJE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed

    if (ID<20){
    color = COLOR.getText();
    marca = MARCA.getText();
    precio = Integer.parseInt(PRECIO.getText());
    tamaño = Integer.parseInt(TAMAÑO.getText());
    numcanal =CANAL2.isSelected();
    numcanal = CANAL7.isSelected();
    namecanal = DEPORTES.isSelected();
    namecanal = NOTICIAS.isSelected();
    programas[ID]= new Programas(namecanal,numcanal, color, marca, precio, tamaño);
    ID++;
    COLOR.setText("");
    MARCA.setText("");
    COLOR.setText("");
    PRECIO.setText("");
    TAMAÑO.setText("");
    MENSAJE.setText("los datos fueron agregados correctamente");
    COLOR.requestFocus();
    }       
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USUARIOActionPerformed

    private void MARCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MARCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MARCAActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
    frmIngreso ingreso = new frmIngreso();
    ingreso.setVisible(true);
    dispose();
    setVisible(false);
    }//GEN-LAST:event_REGRESARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
       COLOR.setText("");
       MARCA.setText("");
       PRECIO.setText("");
       TAMAÑO.setText("");
       COLOR.requestFocus();
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
    
    frnMostrar fmr = new frnMostrar(programas,ID);
    fmr.setVisible(true);
    this.dispose();
    setVisible(false);      
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void CANAL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANAL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANAL2ActionPerformed

    private void DEPORTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPORTESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPORTESActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CANAL2;
    private javax.swing.JRadioButton CANAL7;
    private javax.swing.JTextField COLOR;
    private javax.swing.JCheckBox DEPORTES;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JTextField MARCA;
    private javax.swing.JLabel MENSAJE;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JCheckBox NOTICIAS;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JTextField TAMAÑO;
    private javax.swing.JTextField USUARIO;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
