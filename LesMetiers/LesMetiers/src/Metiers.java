
public class Metiers extends javax.swing.JFrame {

    public Metiers() {
        initComponents();
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        MonImage = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        MonMetier = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Resultat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ISculpteur = new javax.swing.JButton();
        IMarin = new javax.swing.JButton();
        IPatissier = new javax.swing.JButton();
        ICoiffeur = new javax.swing.JButton();
        IPeintre = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Peintre = new javax.swing.JButton();
        Patissier = new javax.swing.JButton();
        Coiffeur = new javax.swing.JButton();
        Sculpteur = new javax.swing.JButton();
        Marin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jeu = new javax.swing.JMenu();
        Rejouer = new javax.swing.JMenuItem();
        Quitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));
        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel8.setLayout(new java.awt.BorderLayout());

        MonImage.setText("Image");
        MonImage.setName("image"); // NOI18N
        jPanel8.add(MonImage, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        MonMetier.setText("Métier");
        MonMetier.setName("metier"); // NOI18N
        jPanel9.add(MonMetier, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel9);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        Resultat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Resultat.setText("Résultat");
        jPanel7.add(Resultat, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Le jeu des métiers");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.GridLayout(5, 1));

        ISculpteur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escultor.gif"))); // NOI18N
        ISculpteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISculpteurActionPerformed(evt);
            }
        });
        jPanel3.add(ISculpteur);

        IMarin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marino_piloto.gif"))); // NOI18N
        IMarin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMarinActionPerformed(evt);
            }
        });
        jPanel3.add(IMarin);

        IPatissier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastelero.gif"))); // NOI18N
        IPatissier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPatissierActionPerformed(evt);
            }
        });
        jPanel3.add(IPatissier);

        ICoiffeur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peluquero.gif"))); // NOI18N
        ICoiffeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICoiffeurActionPerformed(evt);
            }
        });
        jPanel3.add(ICoiffeur);

        IPeintre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pintor.gif"))); // NOI18N
        IPeintre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPeintreActionPerformed(evt);
            }
        });
        jPanel3.add(IPeintre);

        getContentPane().add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setLayout(new java.awt.GridLayout(5, 1));

        Peintre.setText("Peintre");
        Peintre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeintreActionPerformed(evt);
            }
        });
        jPanel4.add(Peintre);

        Patissier.setText("Patissier");
        Patissier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatissierActionPerformed(evt);
            }
        });
        jPanel4.add(Patissier);

        Coiffeur.setText("Coiffeur");
        Coiffeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoiffeurActionPerformed(evt);
            }
        });
        jPanel4.add(Coiffeur);

        Sculpteur.setText("Sculpteur");
        Sculpteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SculpteurActionPerformed(evt);
            }
        });
        jPanel4.add(Sculpteur);

        Marin.setText("Marin");
        Marin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarinActionPerformed(evt);
            }
        });
        jPanel4.add(Marin);

        getContentPane().add(jPanel4, java.awt.BorderLayout.EAST);

        Jeu.setText("Jeu");

        Rejouer.setText("Rejouer");
        Rejouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejouerActionPerformed(evt);
            }
        });
        Jeu.add(Rejouer);

        Quitter.setText("Quitter");
        Jeu.add(Quitter);

        jMenuBar1.add(Jeu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private boolean gagne ()
{   
    if ( MonImage.getName().equals(MonMetier.getName()) )
            return true;
    else return false;
}
            
private void ISculpteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISculpteurActionPerformed
    MonImage.setText("");
    MonImage.setName("sculpteur");
    MonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escultor.gif"))); 
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_ISculpteurActionPerformed

private void IMarinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMarinActionPerformed
     MonImage.setText("");
     MonImage.setName("marin");
     MonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marino_piloto.gif"))); 
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_IMarinActionPerformed

private void IPatissierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPatissierActionPerformed
     MonImage.setText("");
     MonImage.setName("patissier");
     MonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastelero.gif")));
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_IPatissierActionPerformed

private void ICoiffeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICoiffeurActionPerformed
     MonImage.setText("");
     MonImage.setName("coiffeur");
     MonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peluquero.gif"))); 
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_ICoiffeurActionPerformed

private void IPeintreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPeintreActionPerformed
     MonImage.setText("");
     MonImage.setName("peintre");
     MonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pintor.gif"))); 
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_IPeintreActionPerformed

private void PeintreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeintreActionPerformed
     MonMetier.setName("peintre");
     MonMetier.setText("Peintre");
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_PeintreActionPerformed

private void PatissierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatissierActionPerformed
    MonMetier.setName("patissier");
    MonMetier.setText("Peintre");
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_PatissierActionPerformed

private void CoiffeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoiffeurActionPerformed
     MonMetier.setName("coiffeur");
     MonMetier.setText("Coiffeur");
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_CoiffeurActionPerformed

private void SculpteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SculpteurActionPerformed
     MonMetier.setName("sculpteur");
     MonMetier.setText("Scupteur");
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_SculpteurActionPerformed

private void MarinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarinActionPerformed
     MonMetier.setName("marin");
     MonMetier.setText("Marin");
    if (gagne() ) Resultat.setText("Bravo !");
    else Resultat.setText("Continu !");
}//GEN-LAST:event_MarinActionPerformed

private void RejouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejouerActionPerformed
     MonMetier.setName("metier");
     MonMetier.setText("Métier");
     MonImage.setName("image");
     MonImage.setText("Image");
     MonImage.setIcon(null);
     Resultat.setText("Résultat");
}//GEN-LAST:event_RejouerActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Metiers().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Coiffeur;
    private javax.swing.JButton ICoiffeur;
    private javax.swing.JButton IMarin;
    private javax.swing.JButton IPatissier;
    private javax.swing.JButton IPeintre;
    private javax.swing.JButton ISculpteur;
    private javax.swing.JMenu Jeu;
    private javax.swing.JButton Marin;
    private javax.swing.JButton MonImage;
    private javax.swing.JButton MonMetier;
    private javax.swing.JButton Patissier;
    private javax.swing.JButton Peintre;
    private javax.swing.JMenuItem Quitter;
    private javax.swing.JMenuItem Rejouer;
    private javax.swing.JLabel Resultat;
    private javax.swing.JButton Sculpteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
    
}
