
import java.awt.Color;


public class LesChiffres extends javax.swing.JFrame {

    private int chiffre1;   // 1er operande l'operation
    private int chiffre2;   // 2eme operande de l'operation
    private int numero;     // numero du chiffre en cours 1 ou 2
    
    public LesChiffres() {
        initComponents();
        this.chiffre1=-1;    // valeur initiale
        this.chiffre2=-1;
        this.numero=1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        PActions = new javax.swing.JPanel();
        Soustraction = new javax.swing.JButton();
        Addition = new javax.swing.JButton();
        Style1 = new javax.swing.JButton();
        Style2 = new javax.swing.JButton();
        Aide = new javax.swing.JButton();
        PMessage = new javax.swing.JPanel();
        Message = new javax.swing.JLabel();
        PChiffres = new javax.swing.JPanel();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MLesChiffres = new javax.swing.JMenu();
        MRejouer = new javax.swing.JMenuItem();
        MQuitter = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PActions.setLayout(new java.awt.GridLayout(1, 6));

        Soustraction.setText("-");
        Soustraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoustractionActionPerformed(evt);
            }
        });
        PActions.add(Soustraction);

        Addition.setText("+");
        Addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionActionPerformed(evt);
            }
        });
        PActions.add(Addition);

        Style1.setBackground(new java.awt.Color(255, 204, 255));
        Style1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Style1.setForeground(new java.awt.Color(102, 0, 102));
        Style1.setText("Style 1");
        Style1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Style1ActionPerformed(evt);
            }
        });
        PActions.add(Style1);

        Style2.setBackground(new java.awt.Color(204, 255, 204));
        Style2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Style2.setForeground(new java.awt.Color(0, 102, 0));
        Style2.setText("Style 2");
        Style2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Style2ActionPerformed(evt);
            }
        });
        PActions.add(Style2);

        Aide.setText("Aide");
        Aide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AideMouseEntered(evt);
            }
        });
        PActions.add(Aide);

        getContentPane().add(PActions, java.awt.BorderLayout.NORTH);

        PMessage.setLayout(new java.awt.GridLayout(1, 1));

        Message.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Message.setForeground(new java.awt.Color(0, 0, 102));
        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message.setText("Cliquez sur un bouton !");
        PMessage.add(Message);

        getContentPane().add(PMessage, java.awt.BorderLayout.CENTER);

        PChiffres.setLayout(new java.awt.GridLayout(10, 1));

        jButton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton0.setForeground(new java.awt.Color(0, 0, 153));
        jButton0.setText("0");
        jButton0.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton0.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton0.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton0);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton4.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton5.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton5.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 153));
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton6.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton6.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 153));
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton7.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton7.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton8.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton8.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 153));
        jButton9.setText("9");
        jButton9.setMaximumSize(new java.awt.Dimension(80, 31));
        jButton9.setMinimumSize(new java.awt.Dimension(80, 31));
        jButton9.setPreferredSize(new java.awt.Dimension(80, 31));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        PChiffres.add(jButton9);

        getContentPane().add(PChiffres, java.awt.BorderLayout.EAST);

        MLesChiffres.setText("LesChiffres");

        MRejouer.setText("Rejouer");
        MRejouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRejouerActionPerformed(evt);
            }
        });
        MLesChiffres.add(MRejouer);

        MQuitter.setText("Quitter");
        MLesChiffres.add(MQuitter);

        jMenuBar1.add(MLesChiffres);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.cyan);
        Message.setText("quatre");
         if (numero==1) {this.chiffre1=4; numero=2;}
        else {this.chiffre2=4; numero=1;}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.blue);
        Message.setText("huit");
         if (this.numero==1) {this.chiffre1=8; this.numero=2;}
        else {this.chiffre2=8; numero=1;}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.yellow);
        Message.setText("zéro");
         if (numero==1) {this.chiffre1=0; numero=2;}
        else {this.chiffre2=0; numero=1;}
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.green);
        Message.setText("un");
        if (this.numero==1) {this.chiffre1=1; this.numero=2;}
        else {this.chiffre2=1; this.numero=1;}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.magenta);
        Message.setText("deux");
         if (this.numero==1) {this.chiffre1=2; this.numero=2;}
        else {this.chiffre2=2; this.numero=1;}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.orange);
        Message.setText("trois");
        if (this.numero==1) {this.chiffre1=3; this.numero=2;}
        else {this.chiffre2=3; this.numero=1;}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.pink);
        Message.setText("cinq");
        if (this.numero==1) {this.chiffre1=5; this.numero=2;}
        else {chiffre2=5; this.numero=1;}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.red);
        Message.setText("six");
        if (this.numero==1) {this.chiffre1=6; this.numero=2;}
        else {this.chiffre2=6; this.numero=1;}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.lightGray);
        Message.setText("sept");
        if (this.numero==1) {this.chiffre1=7; this.numero=2;}
        else {chiffre2=7; this.numero=1;}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //Message.setForeground(Color.gray);
        Message.setText("neuf");
        if (this.numero==1) {this.chiffre1=9; this.numero=2;}
        else {this.chiffre2=9; this.numero=1;}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void Style1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Style1ActionPerformed
        // TODO add your handling code here:
        Message.setBackground(new java.awt.Color(255, 204, 255));
        Message.setForeground(new java.awt.Color(102, 0, 102));
        Message.setFont(new java.awt.Font("Tahoma", 0, 36));
        Message.setText("Cliquez sur un bouton !");
    }//GEN-LAST:event_Style1ActionPerformed

    private void Style2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Style2ActionPerformed
        // TODO add your handling code here:
        Message.setBackground(new java.awt.Color(204, 255, 204));
        Message.setForeground(new java.awt.Color(0, 102, 0));
        Message.setFont(new java.awt.Font("Tahoma", 2, 36));
        Message.setText("Cliquez sur un bouton !");
    }//GEN-LAST:event_Style2ActionPerformed

    private void SoustractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoustractionActionPerformed
        if (this.chiffre1 != -1 && this.chiffre2 != -1)
        { int res= this.chiffre1-this.chiffre2;
            Message.setText(""+this.chiffre1+ " - "+this.chiffre2 +" = "+ res );
            this.chiffre1 =-1; this.chiffre2=-1; this.numero=1;
        }
        else Message.setText("Cliquez sur un chiffre pour l'opération !");
    }//GEN-LAST:event_SoustractionActionPerformed

    private void AideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AideMouseEntered
        // TODO add your handling code here:
        Message.setFont(new java.awt.Font("Tahoma", 0, 16));
        Message.setText("Pour une opération, cliquez d'abord sur 2 chiffres !");
    }//GEN-LAST:event_AideMouseEntered

    private void MRejouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRejouerActionPerformed
        // TODO add your handling code here:
        Message.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Message.setText("Cliquez sur un bouton !");
        PMessage.add(Message);
        this.chiffre1=-1; this.chiffre2=-1;
    }//GEN-LAST:event_MRejouerActionPerformed

    private void AdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionActionPerformed
        // TODO add your handling code here:
        if (chiffre1 != -1 && this.chiffre2 != -1)
        { int res= chiffre1+this.chiffre2;
            Message.setText(""+chiffre1+ " + "+this.chiffre2 +" = "+ res );
            this.chiffre1 =-1; this.chiffre2=-1; this.numero=1;
        }
        else Message.setText("Cliquez sur un chiffre pour l'opération !");
    }//GEN-LAST:event_AdditionActionPerformed


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
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LesChiffres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addition;
    private javax.swing.JButton Aide;
    private javax.swing.JMenu MLesChiffres;
    private javax.swing.JMenuItem MQuitter;
    private javax.swing.JMenuItem MRejouer;
    private javax.swing.JLabel Message;
    private javax.swing.JPanel PActions;
    private javax.swing.JPanel PChiffres;
    private javax.swing.JPanel PMessage;
    private javax.swing.JButton Soustraction;
    private javax.swing.JButton Style1;
    private javax.swing.JButton Style2;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
