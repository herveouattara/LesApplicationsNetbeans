
import java.awt.*;
import javax.swing.*;

public class Multicolore extends javax.swing.JFrame {
    private Color tabCoulFond[]={Color.RED, Color.BLUE, Color.YELLOW};
    private String tabNomCoulFond[]={"Rouge","Bleu","Jaune"};
    
    private Color tabCoulDispo[]={Color.ORANGE, Color.CYAN, Color.PINK};
    private String tabNomCoulDispo[]={"Orange","Cyan","Rose"};
    
    private Color tabCoulSelect[];
    private int nb;
    private final int  MAX = 100;
    
    private Color coulPanneauInit;
    
    
   
    public Multicolore() {
        initComponents();
        // Remplissage de la liste déroulante (Combo)
        remplirCouleurFond();
        
        // Modèle pour la liste JList 
        DefaultListModel mod= new DefaultListModel();
        // remplsisage de la lsite des couleurs disponibles 
        ListeCoulDispo.setModel(mod);
        remplirListeCouleurDispo();
        
        // modèle pour la lsite des couleurs sélectionnées
        mod= new DefaultListModel();
        ListeCoulSelect.setModel(mod);
        
        // initialisation du tableau pour les couleurs sélectionnées
        tabCoulSelect= new Color [MAX];
        nb=0;
        
        // on garde la couleur du panneau pour ré-inititialiser
        coulPanneauInit=PanneauCoul.getBackground();
        
    }

    public void remplirCouleurFond()
    {   // remplissage de la liste des couleurs de fond
        for (int i=0; i< tabCoulFond.length; i++)
            ListeCoulFond.addItem(tabNomCoulFond[i]);
        // coloriage du fond du panneau avec la 1ère couleur de la liste
        PanneauCoulFond.setBackground(tabCoulFond[0]);
    }
    
    public void remplirListeCouleurDispo()
    {  // remplissage de la lsier des couleurs disponibles
        DefaultListModel mod= (DefaultListModel)ListeCoulDispo.getModel();
        for (int i=0; i< tabCoulFond.length; i++)
            mod.addElement(tabNomCoulDispo[i]);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListeCoulFond = new javax.swing.JComboBox<>();
        PanneauCoulFond = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeCoulDispo = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        BSelection = new javax.swing.JButton();
        BAnnuler = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeCoulSelect = new javax.swing.JList<>();
        PanneauCoul = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titre.setText("Apprenez les listes en mélangeant des couleurs !");
        jPanel1.add(Titre);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Couleur de fond ?");
        jPanel2.add(jLabel2);

        ListeCoulFond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeCoulFondActionPerformed(evt);
            }
        });
        jPanel2.add(ListeCoulFond);

        javax.swing.GroupLayout PanneauCoulFondLayout = new javax.swing.GroupLayout(PanneauCoulFond);
        PanneauCoulFond.setLayout(PanneauCoulFondLayout);
        PanneauCoulFondLayout.setHorizontalGroup(
            PanneauCoulFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        PanneauCoulFondLayout.setVerticalGroup(
            PanneauCoulFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel2.add(PanneauCoulFond);

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        jScrollPane1.setViewportView(ListeCoulDispo);

        jPanel4.add(jScrollPane1);

        jPanel5.setLayout(new java.awt.GridLayout(4, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        BSelection.setText("Sélectionner =>");
        BSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelectionActionPerformed(evt);
            }
        });
        jPanel5.add(BSelection);

        BAnnuler.setText("Annuler");
        BAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnnulerActionPerformed(evt);
            }
        });
        jPanel5.add(BAnnuler);

        jPanel7.setLayout(new java.awt.GridLayout(1, 1));
        jPanel5.add(jPanel7);

        jPanel4.add(jPanel5);

        ListeCoulSelect.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListeCoulSelectValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListeCoulSelect);

        jPanel4.add(jScrollPane2);

        jPanel3.add(jPanel4);

        javax.swing.GroupLayout PanneauCoulLayout = new javax.swing.GroupLayout(PanneauCoul);
        PanneauCoul.setLayout(PanneauCoulLayout);
        PanneauCoulLayout.setHorizontalGroup(
            PanneauCoulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );
        PanneauCoulLayout.setVerticalGroup(
            PanneauCoulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jPanel3.add(PanneauCoul);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListeCoulFondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeCoulFondActionPerformed
        // gestionnaire pour la sélection d'une couleur de fond
        
        int indice = ListeCoulFond.getSelectedIndex();
        PanneauCoulFond.setBackground(tabCoulFond[indice]); 
        colorierPanneau();
    }//GEN-LAST:event_ListeCoulFondActionPerformed

    private void BSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelectionActionPerformed
        // gestionnaire pour le clic sur le bouton de selection
        
        int tab[]=ListeCoulDispo.getSelectedIndices();
        DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
        if ( tab.length != 0)
        {
         for (int i=0; i< tab.length; i++)
         { mod.addElement(tabNomCoulDispo[tab[i]]);
           System.out.println("Ajout de la couleur "+tabNomCoulDispo[tab[i]]);
           System.out.println("à l'indice "+ nb);
           tabCoulSelect[nb++]=tabCoulDispo[tab[i]];
           
         }
        colorierPanneau();
        }
    }//GEN-LAST:event_BSelectionActionPerformed

    private void BAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnnulerActionPerformed
        DefaultListModel mod= (DefaultListModel)ListeCoulSelect.getModel();
        mod.clear();
        PanneauCoul.setBackground(coulPanneauInit);
        nb=0;
    }//GEN-LAST:event_BAnnulerActionPerformed

    private void ListeCoulSelectValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListeCoulSelectValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListeCoulSelectValueChanged

     public void colorierPanneau()
     {  // les couleurs à mélanger sont la couleur de fond et les couleurs selectionnées
        // les couleurs selectionnées sont dans le tabelau tabCoulSelect, il y en a nb
         int vert, bleu, rouge;
        vert = PanneauCoulFond.getBackground().getGreen();
        rouge = PanneauCoulFond.getBackground().getRed();
        bleu = PanneauCoulFond.getBackground().getRed();
        if (nb != 0)
        {
        for (int i=0; i< nb; i++)
        {   vert+= tabCoulSelect[i].getGreen();
            rouge += tabCoulSelect[i].getRed();
            bleu += tabCoulSelect[i].getBlue();
        }
        vert= vert/(nb+1);
        rouge=rouge/(nb+1);
        bleu=bleu/(nb+1);
        Color coul=new Color(vert, rouge, bleu);
        PanneauCoul.setBackground(coul);
        }
        
        
     
     }
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
            java.util.logging.Logger.getLogger(Multicolore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multicolore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multicolore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multicolore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multicolore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnnuler;
    private javax.swing.JButton BSelection;
    private javax.swing.JList<String> ListeCoulDispo;
    private javax.swing.JComboBox<String> ListeCoulFond;
    private javax.swing.JList<String> ListeCoulSelect;
    private javax.swing.JPanel PanneauCoul;
    private javax.swing.JPanel PanneauCoulFond;
    private javax.swing.JLabel Titre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
