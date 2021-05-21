
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class LesCouleurs extends javax.swing.JFrame {
    
    private ArrayList<Color> lstCoulDispo;
    private ArrayList<String> lstNomCoulDispo;
    
    
    private Color tabCoulSelect[];
    private String tabNomCoulSelect[];
    
    private int nb;
    private final int  MAX = 100;
    
    private Color couleurCourante;
    
    
    public LesCouleurs() {
        initComponents();
        lstCoulDispo=new ArrayList<Color> ();
        lstNomCoulDispo=new ArrayList<String> ();
        initLstCoulDispo(); 
        // Remplissage de la liste déroulante (Combo)
        initListeCouleurs();   
        // modèle pour la liste des couleurs sélectionnées
        DefaultListModel mod= new DefaultListModel();
        ListeCoulSelect.setModel(mod);
        
        // initialisation du tableau pour les couleurs sélectionnées
        tabCoulSelect= new Color [MAX];
        tabNomCoulSelect= new String [MAX];
        nb=0;
        couleurCourante=PanCouleur.getBackground();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitre = new javax.swing.JPanel();
        LTitre = new javax.swing.JLabel();
        Panneau = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PBoutons = new javax.swing.JPanel();
        LBoutons = new javax.swing.JLabel();
        BRouge = new javax.swing.JRadioButton();
        BVert = new javax.swing.JRadioButton();
        BBleu = new javax.swing.JRadioButton();
        BInfos = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ListeCouleurs = new javax.swing.JComboBox<>();
        PanCoulSelect = new javax.swing.JPanel();
        BAjouter = new javax.swing.JButton();
        PanVide = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        LMListe = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeCoulSelect = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        PanCouleur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        PanMessage = new javax.swing.JPanel();
        BReset = new javax.swing.JButton();
        BFermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LTitre.setText("Mélange les couleurs !");
        PTitre.add(LTitre);

        getContentPane().add(PTitre, java.awt.BorderLayout.NORTH);

        Panneau.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 4));

        PBoutons.setLayout(new java.awt.GridLayout(5, 1));

        LBoutons.setText("Cochez les couleurs à ajouter");
        PBoutons.add(LBoutons);

        BRouge.setText("Rouge");
        BRouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRougeActionPerformed(evt);
            }
        });
        PBoutons.add(BRouge);

        BVert.setText("Vert");
        BVert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVertActionPerformed(evt);
            }
        });
        PBoutons.add(BVert);

        BBleu.setText("Bleu");
        BBleu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBleuActionPerformed(evt);
            }
        });
        PBoutons.add(BBleu);

        BInfos.setText("Informations");
        BInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInfosActionPerformed(evt);
            }
        });
        PBoutons.add(BInfos);

        jPanel1.add(PBoutons);

        jPanel4.setLayout(new java.awt.GridLayout(5, 1));

        jLabel1.setText("Choisissez une couleur à ajouter ");
        jPanel4.add(jLabel1);

        ListeCouleurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeCouleursActionPerformed(evt);
            }
        });
        jPanel4.add(ListeCouleurs);
        jPanel4.add(PanCoulSelect);

        BAjouter.setText("Ajouter");
        BAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAjouterActionPerformed(evt);
            }
        });
        jPanel4.add(BAjouter);

        javax.swing.GroupLayout PanVideLayout = new javax.swing.GroupLayout(PanVide);
        PanVide.setLayout(PanVideLayout);
        PanVideLayout.setHorizontalGroup(
            PanVideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );
        PanVideLayout.setVerticalGroup(
            PanVideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jPanel4.add(PanVide);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        LMListe.setText("Liste des couleurs mélangées");
        jPanel5.add(LMListe, java.awt.BorderLayout.NORTH);
        LMListe.getAccessibleContext().setAccessibleName("");

        ListeCoulSelect.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ListeCoulSelect);

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel5);

        Panneau.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        PanCouleur.setLayout(new java.awt.GridLayout(1, 1));
        jPanel2.add(PanCouleur);

        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        jPanel2.add(jScrollPane1);

        Panneau.add(jPanel2);

        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        BReset.setText("Réinitialiser");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });
        PanMessage.add(BReset);

        BFermer.setText("Fermer");
        BFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFermerActionPerformed(evt);
            }
        });
        PanMessage.add(BFermer);

        getContentPane().add(PanMessage, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initLstCoulDispo()
    {
        Color c;
        c = new Color(0,127,155);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Bleu Azur");
        c = new Color(1,49,180);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Bleu Saphir");
        c = new Color(91,60,17);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Brun");
        c = new Color(136,66,29);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Acajou");
        c = new Color(247,255,60);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Jaune Citron");
        c = new Color(132,46,27);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Rouge Brique");
        c = new Color(130,196,108);
        lstCoulDispo.add(c);
        lstNomCoulDispo.add("Vert Amande");
    }
    
    private void initListeCouleurs()
    {
        for ( int i=0; i< lstNomCoulDispo.size(); i++)
        {
            ListeCouleurs.addItem(lstNomCoulDispo.get(i));
        }
    }
    private void BVertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVertActionPerformed
        // TODO add your handling code here:
         if (BVert.isSelected())
         {tabCoulSelect[nb]=Color.green;
          tabNomCoulSelect[nb]="Vert";
          nb++;
          colorierPanneau();
          DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
            mod.addElement("Vert");
        if (BInfos.isSelected()) afficherInformations();
         }
    }//GEN-LAST:event_BVertActionPerformed

    private void ListeCouleursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeCouleursActionPerformed
        // TODO add your handling code here:
        int ind = ListeCouleurs.getSelectedIndex();
        if (ind != -1)
        {
            PanCoulSelect.setBackground(lstCoulDispo.get(ind));
        }
    }//GEN-LAST:event_ListeCouleursActionPerformed

    private void BRougeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRougeActionPerformed
        // TODO add your handling code here:
       if (BRouge.isSelected())
       {tabCoulSelect[nb]=Color.red;
        tabNomCoulSelect[nb]="Rouge";
        nb++;
        colorierPanneau();
        DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
            mod.addElement("Rouge");
        if (BInfos.isSelected()) afficherInformations();
       }
    }//GEN-LAST:event_BRougeActionPerformed

    private void BBleuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBleuActionPerformed
        // TODO add your handling code here:
         if (BBleu.isSelected())
         {tabCoulSelect[nb]=Color.blue;
        tabNomCoulSelect[nb]="Bleu";
        nb++;
        colorierPanneau();
        DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
            mod.addElement("Bleu");
        if (BInfos.isSelected()) afficherInformations();
         }
    }//GEN-LAST:event_BBleuActionPerformed

    private void BAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAjouterActionPerformed
        // TODO add your handling code here:
        int ind = ListeCouleurs.getSelectedIndex();
        if (ind != -1)
        {
            tabCoulSelect[nb]=lstCoulDispo.get(ind);
            tabNomCoulSelect[nb]=lstNomCoulDispo.get(ind);
            nb++;
        DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
            mod.addElement(lstNomCoulDispo.get(ind));
        colorierPanneau();
        if (BInfos.isSelected()) afficherInformations();
        }
        
    }//GEN-LAST:event_BAjouterActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        // TODO add your handling code here:
        BRouge.setSelected(false);
        BBleu.setSelected(false);
        BVert.setSelected(false);
        DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
            mod.removeAllElements();
        nb=0;
        BInfos.setSelected(false);
        Edition.setText("");
        PanCouleur.setBackground(PanVide.getBackground());
        
    }//GEN-LAST:event_BResetActionPerformed

    private void BInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInfosActionPerformed
        // TODO add your handling code here:
        if (BInfos.isSelected()) afficherInformations();
        else Edition.setText("");
            
    }//GEN-LAST:event_BInfosActionPerformed

    private void BFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFermerActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BFermerActionPerformed
 
    public void afficherInformations()
    {
        Edition.setText("");
        for (int i=0; i<nb; i++)
            Edition.append("\n"+tabCoulSelect[i]);
        Edition.append("\nCouleur actuelle : "+couleurCourante.getRed()+" "+couleurCourante.getGreen()+" "+" "+couleurCourante.getBlue());
    }
    public void colorierPanneau()
     {  // les couleurs à mélanger sont la couleur de fond et les couleurs selectionnées
        // les couleurs selectionnées sont dans le tabelau tabCoulSelect, il y en a nb
         int vert, bleu, rouge;
        vert = 0;
        rouge = 0;
        bleu = 0;
        if (nb != 0)
        {
            if ( nb == 1) 
            {
                PanCouleur.setBackground(tabCoulSelect[0]);
                couleurCourante=tabCoulSelect[0];
            }
        else
            {   
                for (int i=0; i< nb; i++)
                    {   vert+= tabCoulSelect[i].getGreen();
                        rouge += tabCoulSelect[i].getRed();
                        bleu += tabCoulSelect[i].getBlue();
                        System.out.println(rouge+" "+vert+" "+" "+bleu);
                    }
                    vert= vert/nb;
                    rouge=rouge/nb;
                    bleu=bleu/nb;
                    System.out.println(rouge+" "+vert+" "+" "+bleu);
                    couleurCourante=new Color(rouge, vert, bleu);
                    PanCouleur.setBackground(couleurCourante);
            }  
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
            java.util.logging.Logger.getLogger(LesCouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LesCouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LesCouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LesCouleurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LesCouleurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAjouter;
    private javax.swing.JRadioButton BBleu;
    private javax.swing.JButton BFermer;
    private javax.swing.JCheckBox BInfos;
    private javax.swing.JButton BReset;
    private javax.swing.JRadioButton BRouge;
    private javax.swing.JRadioButton BVert;
    private javax.swing.JTextArea Edition;
    private javax.swing.JLabel LBoutons;
    private javax.swing.JLabel LMListe;
    private javax.swing.JLabel LTitre;
    private javax.swing.JList<String> ListeCoulSelect;
    private javax.swing.JComboBox<String> ListeCouleurs;
    private javax.swing.JPanel PBoutons;
    private javax.swing.JPanel PTitre;
    private javax.swing.JPanel PanCoulSelect;
    private javax.swing.JPanel PanCouleur;
    private javax.swing.JPanel PanMessage;
    private javax.swing.JPanel PanVide;
    private javax.swing.JPanel Panneau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
