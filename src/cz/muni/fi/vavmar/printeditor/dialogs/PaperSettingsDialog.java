/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.muni.fi.vavmar.printeditor.dialogs;

public class PaperSettingsDialog {
    
/**
 *
 * @author Martin
 */
private class PaperSettingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaperSettingsDialog
     */
    public PaperSettingsJPanel() {
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

        iDempierePapersComboBox = new javax.swing.JComboBox();
        paperWidthTextField = new javax.swing.JTextField();
        paperWidthLabel = new javax.swing.JLabel();
        paperHeightLabel = new javax.swing.JLabel();
        paperHeightTextField = new javax.swing.JTextField();
        paperDescriptionTextField = new javax.swing.JTextField();
        paperDescriptionLabel = new javax.swing.JLabel();

        iDempierePapersComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        paperWidthTextField.setText(org.openide.util.NbBundle.getMessage(PaperSettingsDialog.class, "PaperSettingsDialog.paperWidthTextField.text")); // NOI18N

        paperWidthLabel.setText(org.openide.util.NbBundle.getMessage(PaperSettingsDialog.class, "PaperSettingsDialog.paperWidthLabel.text")); // NOI18N

        paperHeightLabel.setText(org.openide.util.NbBundle.getMessage(PaperSettingsDialog.class, "PaperSettingsDialog.paperHeightLabel.text")); // NOI18N

        paperHeightTextField.setText(org.openide.util.NbBundle.getMessage(PaperSettingsDialog.class, "PaperSettingsDialog.paperHeightTextField.text")); // NOI18N

        paperDescriptionTextField.setText(org.openide.util.NbBundle.getMessage(PaperSettingsDialog.class, "PaperSettingsDialog.paperDescriptionTextField.text")); // NOI18N

        paperDescriptionLabel.setText(org.openide.util.NbBundle.getMessage(PaperSettingsDialog.class, "PaperSettingsDialog.paperDescriptionLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paperWidthLabel)
                    .addComponent(paperHeightLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iDempierePapersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paperHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paperDescriptionLabel)
                                .addGap(67, 67, 67))
                            .addComponent(paperDescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(paperDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(iDempierePapersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(paperDescriptionLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paperWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperWidthLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paperHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperHeightLabel))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox iDempierePapersComboBox;
    private javax.swing.JLabel paperDescriptionLabel;
    private javax.swing.JTextField paperDescriptionTextField;
    private javax.swing.JLabel paperHeightLabel;
    private javax.swing.JTextField paperHeightTextField;
    private javax.swing.JLabel paperWidthLabel;
    private javax.swing.JTextField paperWidthTextField;
    // End of variables declaration//GEN-END:variables
}

}