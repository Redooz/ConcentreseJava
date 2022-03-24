package vista;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.Usuario;
import modelo.Archivo;

/**
 *
 * @author SnakyDH
 */
public class Login extends javax.swing.JFrame {
    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        lblAcronimo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btmSalir = new javax.swing.JButton();
        txtAcronimo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        Developer2 = new javax.swing.JLabel();
        nombreJuego = new javax.swing.JLabel();
        desarrolladoPor = new javax.swing.JLabel();
        Developer1 = new javax.swing.JLabel();
        iconJava = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        background.setBackground(new java.awt.Color(106, 126, 252));
        background.setPreferredSize(new java.awt.Dimension(1080, 720));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        lblAcronimo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblAcronimo.setForeground(new java.awt.Color(106, 126, 252));
        lblAcronimo.setText("Short Name");
        lblAcronimo.setToolTipText("");
        lblAcronimo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAcronimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(106, 126, 252));
        lblNombre.setText("Name Player");

        btnJugar.setBackground(new java.awt.Color(51, 255, 0));
        btnJugar.setText("Play :)");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btmSalir.setBackground(new java.awt.Color(255, 86, 86));
        btmSalir.setText("Exit");
        btmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSalirActionPerformed(evt);
            }
        });

        txtAcronimo.setForeground(new java.awt.Color(102, 102, 102));
        txtAcronimo.setText("ABC");
        txtAcronimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAcronimoMouseClicked(evt);
            }
        });
        txtAcronimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcronimoActionPerformed(evt);
            }
        });

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Nick Name");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAcronimo)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                .addGap(40, 53, Short.MAX_VALUE)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                        .addComponent(lblAcronimo)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(69, 69, 69))))
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btmSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAcronimo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAcronimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmSalir)
                    .addComponent(btnJugar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        background.add(panelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 340, 280));

        Developer2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Developer2.setForeground(new java.awt.Color(255, 255, 255));
        Developer2.setText("- Nicolas Olmos (@Redooz)");
        Developer2.setToolTipText("");
        Developer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Developer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(Developer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 320, 50));

        nombreJuego.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nombreJuego.setForeground(new java.awt.Color(255, 255, 255));
        nombreJuego.setText("Memory Game");
        nombreJuego.setToolTipText("");
        nombreJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombreJuego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(nombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 33));

        desarrolladoPor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        desarrolladoPor.setForeground(new java.awt.Color(255, 255, 255));
        desarrolladoPor.setText("Developed by:");
        desarrolladoPor.setToolTipText("");
        desarrolladoPor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desarrolladoPor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(desarrolladoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 280, 50));

        Developer1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Developer1.setForeground(new java.awt.Color(255, 255, 255));
        Developer1.setText("- Daniel Garcia Romero (@SnakyDH)");
        Developer1.setToolTipText("");
        Developer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Developer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(Developer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 320, 50));

        iconJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/6.png"))); // NOI18N
        background.add(iconJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // Se leen los text fields de la ventana
        String acronimo = txtAcronimo.getText(); 
        String nombre = txtNombre.getText();
        Usuario userLogin = new Usuario(acronimo, nombre, 0); //Se crea un usuario
        
        Game ventanaJuego = new Game(); //Se crea una ventana de juego

        ventanaJuego.setVisible(true); //Se abre la ventana de juego

        setVisible(false); //Se cierra la ventana de login
        dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSalirActionPerformed
        setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btmSalirActionPerformed

    private void txtAcronimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcronimoActionPerformed
        
    }//GEN-LAST:event_txtAcronimoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtAcronimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAcronimoMouseClicked
        txtAcronimo.setText(null);
    }//GEN-LAST:event_txtAcronimoMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Developer1;
    private javax.swing.JLabel Developer2;
    private javax.swing.JPanel background;
    private javax.swing.JButton btmSalir;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel desarrolladoPor;
    private javax.swing.JLabel iconJava;
    private javax.swing.JLabel lblAcronimo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel nombreJuego;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtAcronimo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
