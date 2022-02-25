
import javax.swing.table.DefaultTableModel;

public class Nuevouser extends javax.swing.JFrame {
    
    
    static Datosuser [] listauser = new Datosuser[1];

    public Nuevouser() {
        
        listauser[0]=new Datosuser("", "","Barahona","Pablo","","202109715","");
        initComponents();
        initComponents2();
    }

    private void initComponents2(){
        setLocationRelativeTo(null);
    }
    
    
    
    private Datosuser[] redArreglo(Datosuser [] arreglo){
        Datosuser[] temporal = new Datosuser[arreglo.length + 1];
        for (int i = 0; i < arreglo.length; i++) {
            temporal[i] = arreglo [i];
        }
        return temporal;
    }
    
    
    
    private Boolean crearE(Datosuser[] arreglo){
        Boolean espacio=false;
        for (int i = 0; i < arreglo.length; i++) {  
            if (arreglo[i]==null) {
                espacio=true;
                break;                      
            }
        }
        return espacio;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        namein = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        apellidoin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        userin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rolin = new javax.swing.JTextField();
        contrain1 = new javax.swing.JTextField();
        contrain2 = new javax.swing.JTextField();
        crear1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(42, 47, 61));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR USUARIO");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel1);
        jLabel1.setBounds(70, 5, 420, 60);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 520, 70);

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 153));
        jLabel9.setText("ID");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 110, 20, 50);

        idin.setBackground(new java.awt.Color(255, 255, 255));
        idin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        idin.setForeground(new java.awt.Color(42, 47, 61));
        idin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idinActionPerformed(evt);
            }
        });
        jPanel2.add(idin);
        idin.setBounds(200, 120, 260, 30);

        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 153));
        jLabel10.setText("Nombre");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(120, 160, 80, 50);

        namein.setBackground(new java.awt.Color(255, 255, 255));
        namein.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        namein.setForeground(new java.awt.Color(42, 47, 61));
        namein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinActionPerformed(evt);
            }
        });
        jPanel2.add(namein);
        namein.setBounds(200, 170, 260, 30);

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 153));
        jLabel11.setText("Apellido");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(120, 210, 90, 50);

        apellidoin.setBackground(new java.awt.Color(255, 255, 255));
        apellidoin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        apellidoin.setForeground(new java.awt.Color(42, 47, 61));
        jPanel2.add(apellidoin);
        apellidoin.setBounds(200, 220, 260, 30);

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 153));
        jLabel12.setText("Usuario");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(120, 260, 80, 50);

        userin.setBackground(new java.awt.Color(255, 255, 255));
        userin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        userin.setForeground(new java.awt.Color(42, 47, 61));
        jPanel2.add(userin);
        userin.setBounds(200, 270, 260, 30);

        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 153));
        jLabel13.setText("Rol");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(150, 310, 30, 50);

        rolin.setBackground(new java.awt.Color(255, 255, 255));
        rolin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        rolin.setForeground(new java.awt.Color(42, 47, 61));
        jPanel2.add(rolin);
        rolin.setBounds(200, 320, 260, 30);

        contrain1.setBackground(new java.awt.Color(255, 255, 255));
        contrain1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        contrain1.setForeground(new java.awt.Color(42, 47, 61));
        jPanel2.add(contrain1);
        contrain1.setBounds(200, 370, 260, 30);

        contrain2.setBackground(new java.awt.Color(255, 255, 255));
        contrain2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        contrain2.setForeground(new java.awt.Color(42, 47, 61));
        jPanel2.add(contrain2);
        contrain2.setBounds(200, 420, 260, 30);

        crear1.setBackground(new java.awt.Color(0, 204, 153));
        crear1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        crear1.setForeground(new java.awt.Color(255, 255, 255));
        crear1.setText("Crear");
        crear1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        crear1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        crear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear1ActionPerformed(evt);
            }
        });
        jPanel2.add(crear1);
        crear1.setBounds(120, 490, 130, 40);

        cancelar.setBackground(new java.awt.Color(255, 51, 51));
        cancelar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelar);
        cancelar.setBounds(280, 490, 130, 40);

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 153));
        jLabel16.setText("Contraseña");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(90, 360, 100, 50);

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 153));
        jLabel17.setText("Confirmar contraseña");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 410, 190, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void crear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear1ActionPerformed
    
        
        if (!crearE(listauser)) {
            listauser = redArreglo(getListauser());
        }
    
        for (int i = 1; i < getListauser().length; i++) {
                if(getListauser()[i]==null) {
                    listauser[i]=new Datosuser(idin.getText(), namein.getText(),apellidoin.getText(),userin.getText(),rolin.getText(),contrain1.getText(),contrain2.getText());
                    break;
                }
            
        }
        
        idin.setText("");
        namein.setText("");
        apellidoin.setText("");
        userin.setText("");
        rolin.setText("");
        contrain1.setText("");
        contrain2.setText("");
        

    }//GEN-LAST:event_crear1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
      
        
        
        this.setVisible(false);
        idin.setText("");
        namein.setText("");
        apellidoin.setText("");
        userin.setText("");
        rolin.setText("");
        contrain1.setText("");
        contrain2.setText("");
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void idinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idinActionPerformed

    private void nameinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameinActionPerformed

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
            java.util.logging.Logger.getLogger(Nuevouser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevouser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevouser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevouser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevouser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoin;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField contrain1;
    private javax.swing.JTextField contrain2;
    private javax.swing.JButton crear1;
    private javax.swing.JTextField idin;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField namein;
    private javax.swing.JTextField rolin;
    private javax.swing.JTextField userin;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the listauser
     */
    public static Datosuser[] getListauser() {
        return listauser;
    }
}
