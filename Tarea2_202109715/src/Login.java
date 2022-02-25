
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Nuevouser.listauser[0]=new Datosuser("", "","Barahona","Pablo","","202109715","");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        contrain = new javax.swing.JTextField();
        userin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153), 2));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 47, 61));
        jPanel1.setLayout(null);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153), 2));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(760, 170, 420, 480);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153), 2));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(760, 170, 420, 480);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153), 2));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(760, 170, 420, 480);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 130, 320, 40);

        cancelar.setBackground(new java.awt.Color(0, 204, 153));
        cancelar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(280, 400, 130, 40);

        ingresar.setBackground(new java.awt.Color(0, 204, 153));
        ingresar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar);
        ingresar.setBounds(120, 400, 130, 40);

        contrain.setBackground(new java.awt.Color(255, 255, 255));
        contrain.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        contrain.setForeground(new java.awt.Color(42, 47, 61));
        jPanel1.add(contrain);
        contrain.setBounds(150, 300, 260, 30);

        userin.setBackground(new java.awt.Color(255, 255, 255));
        userin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        userin.setForeground(new java.awt.Color(42, 47, 61));
        userin.setToolTipText("");
        userin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinActionPerformed(evt);
            }
        });
        jPanel1.add(userin);
        userin.setBounds(150, 230, 260, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/correo.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 220, 50, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/candado.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 290, 40, 50);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 153), 4, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 50, 420, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        Boolean existeUsuario = false;
        for (int i = 0; i < Nuevouser.getListauser().length; i++) {
            if(Nuevouser.getListauser()[i] != null){
                if(Nuevouser.getListauser()[i].getUser().equals(userin.getText()) 
                        && Nuevouser.getListauser()[i].getContraseña().equals(contrain.getText())){
                    existeUsuario = true;
                    break;
                }
            }
        }
        if(existeUsuario) {
            new About().setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus datos nuevamente");
            userin.setText("");
            contrain.setText("");
        }
        
 
    }//GEN-LAST:event_ingresarActionPerformed

    private void userinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userinActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed


    
    public static void main(String args[]) {


        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField contrain;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField userin;
    // End of variables declaration//GEN-END:variables
}
