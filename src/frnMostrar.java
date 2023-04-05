public class frnMostrar extends javax.swing.JFrame {
    
    public frnMostrar(Programas[] programas, int ID) {
   
        initComponents();
        setLocationRelativeTo(null);
        for (int i = 0; i<ID; i++){
       TEXTAREA.append("\ncolor: "+programas[i].getColor());
       TEXTAREA.append("\nMarca: "+programas[i].getMarca());
       TEXTAREA.append("\nPrecio: "+programas[i].getPrecio());
       TEXTAREA.append("\nTamaño: "+programas[i].getTamaño());
       TEXTAREA.append("\nNumero Canal: CANAL2  "+programas[i].isNumcanal());
       TEXTAREA.append("\ncanal: DEPORTES"+programas[i].isNamecanal());
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTAREA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TEXTAREA.setColumns(20);
        TEXTAREA.setRows(5);
        jScrollPane1.setViewportView(TEXTAREA);

        jLabel1.setText("MOSTRAR DATOS");

        REGRESAR.setBackground(new java.awt.Color(255, 0, 0));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(REGRESAR)
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(REGRESAR)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
    frmFormulario formulario = new frmFormulario("");
    formulario.setVisible(true);
    dispose();
    setVisible(false);
    }//GEN-LAST:event_REGRESARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JTextArea TEXTAREA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
