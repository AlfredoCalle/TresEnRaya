/*
 * Tres en raya V1
 */
package tresenraya;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class TresEnRaya extends javax.swing.JFrame {

    boolean estado = true;
    String siguiente = "O";
    String turno = "X";
    JButton tablero[] = new JButton[9];
    int victorias[][] = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},
        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},
        {0, 4, 8},
        {2, 4, 6}
        };

    public TresEnRaya() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage()); // Cambia el icono de la ventana(JFrame)

        tablero[0] = btn_0;
        tablero[1] = btn_1;
        tablero[2] = btn_2;
        tablero[3] = btn_3;
        tablero[4] = btn_4;
        tablero[5] = btn_5;
        tablero[6] = btn_6;
        tablero[7] = btn_7;
        tablero[8] = btn_8;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        txt_puntajeO = new javax.swing.JLabel();
        txt_puntajeX = new javax.swing.JLabel();
        btn_reiniciar = new javax.swing.JButton();
        txt_turno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(244, 247, 253));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_2.setBorderPainted(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setOpaque(false);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 80, 80));

        btn_0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_0.setBorderPainted(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setOpaque(false);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        btn_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_1.setBorderPainted(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setOpaque(false);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 80));

        btn_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_3.setBorderPainted(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setOpaque(false);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 80, 80));

        btn_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setOpaque(false);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, 80));

        btn_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_5.setBorderPainted(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setOpaque(false);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, 80));

        btn_6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setOpaque(false);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 80));

        btn_7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setOpaque(false);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, 80));

        btn_8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_8.setBorderPainted(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setOpaque(false);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 80, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 260));

        txt_puntajeO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_puntajeO.setForeground(new java.awt.Color(55, 62, 71));
        txt_puntajeO.setText("O: 0");
        jPanel1.add(txt_puntajeO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 40, 30));

        txt_puntajeX.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_puntajeX.setForeground(new java.awt.Color(55, 62, 71));
        txt_puntajeX.setText("X: 0");
        jPanel1.add(txt_puntajeX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 30));

        btn_reiniciar.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        btn_reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reiniciar.png"))); // NOI18N
        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.setBorderPainted(false);
        btn_reiniciar.setFocusPainted(false);
        btn_reiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reiniciar.setOpaque(false);
        btn_reiniciar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reiniciar.png"))); // NOI18N
        btn_reiniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reiniciar_pressed.png"))); // NOI18N
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 30));

        txt_turno.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        txt_turno.setForeground(new java.awt.Color(157, 179, 237));
        txt_turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_turno.setText("Turno de X");
        txt_turno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 40));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(190, 202, 236));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Creador: Alfredo Calle Aguilar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 356, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        selecionarCasilla(2);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        selecionarCasilla(0);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        selecionarCasilla(1);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        selecionarCasilla(3);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        selecionarCasilla(4);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        selecionarCasilla(5);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        selecionarCasilla(6);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        selecionarCasilla(7);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        selecionarCasilla(8);
    }//GEN-LAST:event_btn_8ActionPerformed

    // Método que reinicia el tablero donde estan los botones
    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
        for(int i = 0; i < tablero.length; i++) {
            tablero[i].setText("");
            tablero[i].setIcon(new ImageIcon(getClass().getResource("/images/boton1.png")));
        }
        
        turno = siguiente;
        
        if(siguiente.equals("O")) {
            siguiente = "X";
        }else {
            siguiente = "O";
        }
        txt_turno.setText("Turno de " + turno);
        estado = true;
    }//GEN-LAST:event_btn_reiniciarActionPerformed
    
    // Método que cambia el turno de cada jugador
    public void cambiarTurno() {
        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }
        txt_turno.setText("Turno de " + turno);
    }

    // Método cambia el color de las casillas(boton)
    public void cambiarColorBoton(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn2.png")));
    }
    
    // Método que verifica si uno de los dos jugadores ya ganó
    public void verificarVictoria() {
        JButton casilla1 = null;
        JButton casilla2 = null;
        JButton casilla3 = null;

        for (int i = 0; i < victorias.length; i++) {
            casilla1 = tablero[victorias[i][0]];
            casilla2 = tablero[victorias[i][1]];
            casilla3 = tablero[victorias[i][2]];

            if (casilla1.getText().equals("X")
                    && casilla2.getText().equals("X")
                    && casilla3.getText().equals("X")) {

                cambiarColorBoton(casilla1);
                cambiarColorBoton(casilla2);
                cambiarColorBoton(casilla3);

                String puntaje = txt_puntajeX.getText();
                int cantidad = Integer.parseInt(puntaje.substring(puntaje.length() - 1)) + 1;
                txt_puntajeX.setText("X:  " + cantidad);
                txt_turno.setText("Ha ganado X");
                estado = false;
            }
            if (casilla1.getText().equals("O")
                    && casilla2.getText().equals("O")
                    && casilla3.getText().equals("O")) {

                cambiarColorBoton(casilla1);
                cambiarColorBoton(casilla2);
                cambiarColorBoton(casilla3);
                
                String puntaje = txt_puntajeO.getText();
                int cantidad = Integer.parseInt(puntaje.substring(puntaje.length() - 1)) + 1;
                txt_puntajeO.setText("O:  " + cantidad);
                txt_turno.setText("Ha ganado O");
                estado = false;
            }
        }
    }
    // Método que pone la X o O en la casilla(boton)
    public void selecionarCasilla(int i) {
        JButton casilla = tablero[i];
        if (casilla.getText().equals("") && estado) {
            casilla.setText(turno);
            cambiarTurno();
            verificarVictoria();
        }
    }

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
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresEnRaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_puntajeO;
    private javax.swing.JLabel txt_puntajeX;
    private javax.swing.JLabel txt_turno;
    // End of variables declaration//GEN-END:variables
}
