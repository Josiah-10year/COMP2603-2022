/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8.m1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author azeldaniel
 */
public class SummerCampForm extends javax.swing.JFrame {

    /**
     * Creates new form SummerCampForm
     */
    public SummerCampForm() {
        initComponents();
        
        resetUI();
    }
    
    private void resetUI(){
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        
        campTypeComboBox.setSelectedIndex(0);
        campusToursCheckBox.setSelected(false);
        gamesCheckBox.setSelected(false);
        careerGuidanceCheckBox.setSelected(false);
        fieldTripsCheckBox.setSelected(false);
        industryVisitsCheckBox.setSelected(false);
        
        careerGuidanceCheckBox.setVisible(false);
        mentorPanel.setVisible(false);
        nineToTwelveRadioButton.setSelected(true);
        thirteenToFifteenRadioButton.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bannerPanel = new javax.swing.JPanel();
        bannerLabel = new javax.swing.JLabel();
        demographicPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        campTypeLabel = new javax.swing.JLabel();
        campTypeComboBox = new javax.swing.JComboBox<>();
        ageGroupLabel = new javax.swing.JLabel();
        nineToTwelveRadioButton = new javax.swing.JRadioButton();
        thirteenToFifteenRadioButton = new javax.swing.JRadioButton();
        activitiesPanel = new javax.swing.JPanel();
        activitiesLabel = new javax.swing.JLabel();
        campusToursCheckBox = new javax.swing.JCheckBox();
        gamesCheckBox = new javax.swing.JCheckBox();
        careerGuidanceCheckBox = new javax.swing.JCheckBox();
        fieldTripsCheckBox = new javax.swing.JCheckBox();
        industryVisitsCheckBox = new javax.swing.JCheckBox();
        mentorPanel = new javax.swing.JPanel();
        mentorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mentorList = new javax.swing.JList<>();
        buttonPanel = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bannerLabel.setIcon(new javax.swing.ImageIcon("/Users/azeldaniel/Documents/tutoring/2022/COMP2603-2022/Week 8/banner.jpg")); // NOI18N

        javax.swing.GroupLayout bannerPanelLayout = new javax.swing.GroupLayout(bannerPanel);
        bannerPanel.setLayout(bannerPanelLayout);
        bannerPanelLayout.setHorizontalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bannerLabel)
                .addGap(94, 94, 94))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(bannerLabel)
                .addContainerGap())
        );

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        campTypeLabel.setText("Camp Type");

        campTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Robotics Camp", "Web Design Camp", "Algorithms Camp" }));

        ageGroupLabel.setText("Age Group");

        buttonGroup1.add(nineToTwelveRadioButton);
        nineToTwelveRadioButton.setText("9 - 12 years");
        nineToTwelveRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineToTwelveRadioButtonMouseClicked(evt);
            }
        });
        nineToTwelveRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineToTwelveRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(thirteenToFifteenRadioButton);
        thirteenToFifteenRadioButton.setText("13 - 15 years");
        thirteenToFifteenRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirteenToFifteenRadioButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout demographicPanelLayout = new javax.swing.GroupLayout(demographicPanel);
        demographicPanel.setLayout(demographicPanelLayout);
        demographicPanelLayout.setHorizontalGroup(
            demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demographicPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(campTypeLabel)
                    .addComponent(ageGroupLabel))
                .addGap(36, 36, 36)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thirteenToFifteenRadioButton)
                    .addComponent(nineToTwelveRadioButton)
                    .addComponent(campTypeComboBox, 0, 271, Short.MAX_VALUE)
                    .addComponent(lastNameTextField)
                    .addComponent(firstNameTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        demographicPanelLayout.setVerticalGroup(
            demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demographicPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campTypeLabel)
                    .addComponent(campTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageGroupLabel)
                    .addComponent(nineToTwelveRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirteenToFifteenRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        activitiesLabel.setText("Activities");

        campusToursCheckBox.setText("Campus Tours");

        gamesCheckBox.setText("Games");

        careerGuidanceCheckBox.setText("Career Guidance");
        careerGuidanceCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                careerGuidanceCheckBoxMouseClicked(evt);
            }
        });

        fieldTripsCheckBox.setText("Field Trips");

        industryVisitsCheckBox.setText("Industry Visits");

        javax.swing.GroupLayout activitiesPanelLayout = new javax.swing.GroupLayout(activitiesPanel);
        activitiesPanel.setLayout(activitiesPanelLayout);
        activitiesPanelLayout.setHorizontalGroup(
            activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitiesPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(activitiesLabel)
                .addGap(44, 44, 44)
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(careerGuidanceCheckBox)
                    .addGroup(activitiesPanelLayout.createSequentialGroup()
                        .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campusToursCheckBox)
                            .addComponent(gamesCheckBox))
                        .addGap(42, 42, 42)
                        .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(industryVisitsCheckBox)
                            .addComponent(fieldTripsCheckBox))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        activitiesPanelLayout.setVerticalGroup(
            activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitiesPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activitiesLabel)
                    .addComponent(campusToursCheckBox)
                    .addComponent(fieldTripsCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamesCheckBox)
                    .addComponent(industryVisitsCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(careerGuidanceCheckBox)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mentorLabel.setText("Mentor");

        mentorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dr Dorian Smith", "Dr. Lisa Rosenberg", "Prof. Garry Mitchel" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(mentorList);

        javax.swing.GroupLayout mentorPanelLayout = new javax.swing.GroupLayout(mentorPanel);
        mentorPanel.setLayout(mentorPanelLayout);
        mentorPanelLayout.setHorizontalGroup(
            mentorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mentorPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(mentorLabel)
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mentorPanelLayout.setVerticalGroup(
            mentorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mentorPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(mentorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mentorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clearButton.setText("Clear Form");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(registerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton)
                .addGap(80, 80, 80))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(registerButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bannerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(demographicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mentorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activitiesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demographicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activitiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mentorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nineToTwelveRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineToTwelveRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nineToTwelveRadioButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        
        Camper camper = new Camper(
            firstNameTextField.getText(),
            lastNameTextField.getText(),
                campTypeComboBox.getSelectedItem().toString()
        );
        
        ArrayList<String> activities = new ArrayList<>();
        
        if(nineToTwelveRadioButton.isSelected())
            camper.setAgeGroup("9 - 12 years");
        else
            camper.setAgeGroup("13 - 15 years");
        
        if(campusToursCheckBox.isSelected()) activities.add(campusToursCheckBox.getText());
        if(gamesCheckBox.isSelected()) activities.add(gamesCheckBox.getText());
        if(careerGuidanceCheckBox.isSelected()) activities.add(careerGuidanceCheckBox.getText());
        if(fieldTripsCheckBox.isSelected()) activities.add(fieldTripsCheckBox.getText());
        if(industryVisitsCheckBox.isSelected()) activities.add(industryVisitsCheckBox.getText());
        camper.setActivities(activities);
        camper.setMentors(mentorList.getSelectedValuesList());
        
        System.out.println(camper);
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void thirteenToFifteenRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirteenToFifteenRadioButtonMouseClicked
        // TODO add your handling code here:
        careerGuidanceCheckBox.setVisible(true);
    }//GEN-LAST:event_thirteenToFifteenRadioButtonMouseClicked

    private void nineToTwelveRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineToTwelveRadioButtonMouseClicked
        // TODO add your handling code here:
        careerGuidanceCheckBox.setVisible(false);
        mentorPanel.setVisible(false);
        nineToTwelveRadioButton.setSelected(true);
        thirteenToFifteenRadioButton.setSelected(false);
    }//GEN-LAST:event_nineToTwelveRadioButtonMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        resetUI();
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void careerGuidanceCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_careerGuidanceCheckBoxMouseClicked
        // TODO add your handling code here:
        if(careerGuidanceCheckBox.isSelected())
            mentorPanel.setVisible(true);
        else
            mentorPanel.setVisible(false);
    }//GEN-LAST:event_careerGuidanceCheckBoxMouseClicked

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
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummerCampForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activitiesLabel;
    private javax.swing.JPanel activitiesPanel;
    private javax.swing.JLabel ageGroupLabel;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JComboBox<String> campTypeComboBox;
    private javax.swing.JLabel campTypeLabel;
    private javax.swing.JCheckBox campusToursCheckBox;
    private javax.swing.JCheckBox careerGuidanceCheckBox;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel demographicPanel;
    private javax.swing.JCheckBox fieldTripsCheckBox;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JCheckBox gamesCheckBox;
    private javax.swing.JCheckBox industryVisitsCheckBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel mentorLabel;
    private javax.swing.JList<String> mentorList;
    private javax.swing.JPanel mentorPanel;
    private javax.swing.JRadioButton nineToTwelveRadioButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JRadioButton thirteenToFifteenRadioButton;
    // End of variables declaration//GEN-END:variables
}
