package View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import Controller.Controller;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author maria
 */
public class View extends javax.swing.JFrame {

    private Controller controller = new Controller();
    
    public View() {
        initComponents();
        setTitle("Армия Саурона");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        JSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        createOrkButton = new javax.swing.JButton();
        leftScrollPane = new javax.swing.JScrollPane();
        armyTree = new javax.swing.JTree(buildTree());
        rightPanel = new javax.swing.JPanel();
        strengthBar = new javax.swing.JProgressBar();
        agilityBar = new javax.swing.JProgressBar();
        intellectBar = new javax.swing.JProgressBar();
        healthBar = new javax.swing.JProgressBar();
        strehgthLabel = new javax.swing.JLabel();
        agilityLabel = new javax.swing.JLabel();
        intellectLabel = new javax.swing.JLabel();
        healthLabel = new javax.swing.JLabel();
        textNameLabel = new javax.swing.JLabel();
        textTribeLabel = new javax.swing.JLabel();
        tribeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        weaponTextLabel = new javax.swing.JLabel();
        weaponLabel = new javax.swing.JLabel();
        armorTextLabel = new javax.swing.JLabel();
        armorLabel = new javax.swing.JLabel();
        bannerTextLabel = new javax.swing.JLabel();
        bannerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        leftPanel.setLayout(new java.awt.BorderLayout());

        createOrkButton.setText("Создать орка");
        createOrkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrkButtonActionPerformed(evt);
            }
        });
        leftPanel.add(createOrkButton, java.awt.BorderLayout.CENTER);

        armyTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                armyTreeValueChanged(evt);
            }
        });
        leftScrollPane.setViewportView(armyTree);

        leftPanel.add(leftScrollPane, java.awt.BorderLayout.PAGE_END);

        JSplitPane.setLeftComponent(leftPanel);

        rightPanel.setMinimumSize(new java.awt.Dimension(400, 180));
        rightPanel.setPreferredSize(new java.awt.Dimension(400, 360));
        rightPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 11;
        rightPanel.add(strengthBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 10;
        rightPanel.add(agilityBar, gridBagConstraints);

        intellectBar.setMaximum(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipady = 10;
        rightPanel.add(intellectBar, gridBagConstraints);

        healthBar.setMaximum(200);
        healthBar.setMinimum(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipady = 10;
        rightPanel.add(healthBar, gridBagConstraints);

        strehgthLabel.setText("Strength");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(strehgthLabel, gridBagConstraints);

        agilityLabel.setText("Agility");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(agilityLabel, gridBagConstraints);

        intellectLabel.setText("Intellect");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(intellectLabel, gridBagConstraints);

        healthLabel.setText("Health");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(healthLabel, gridBagConstraints);

        textNameLabel.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(textNameLabel, gridBagConstraints);

        textTribeLabel.setText("Tribe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(textTribeLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        rightPanel.add(tribeLabel, gridBagConstraints);
        rightPanel.add(nameLabel, new java.awt.GridBagConstraints());

        weaponTextLabel.setText("Weapon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(weaponTextLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        rightPanel.add(weaponLabel, gridBagConstraints);

        armorTextLabel.setText("Armor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(armorTextLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        rightPanel.add(armorLabel, gridBagConstraints);

        bannerTextLabel.setText("Banner");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        rightPanel.add(bannerTextLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        rightPanel.add(bannerLabel, gridBagConstraints);

        JSplitPane.setRightComponent(rightPanel);

        mainPanel.add(JSplitPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createOrkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrkButtonActionPerformed
        showCreationDialog();
    }//GEN-LAST:event_createOrkButtonActionPerformed

    private void armyTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_armyTreeValueChanged
        updateInfoPanel();
    }//GEN-LAST:event_armyTreeValueChanged

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane JSplitPane;
    private javax.swing.JProgressBar agilityBar;
    private javax.swing.JLabel agilityLabel;
    private javax.swing.JLabel armorLabel;
    private javax.swing.JLabel armorTextLabel;
    private javax.swing.JTree armyTree;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JLabel bannerTextLabel;
    private javax.swing.JButton createOrkButton;
    private javax.swing.JProgressBar healthBar;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JProgressBar intellectBar;
    private javax.swing.JLabel intellectLabel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JScrollPane leftScrollPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel strehgthLabel;
    private javax.swing.JProgressBar strengthBar;
    private javax.swing.JLabel textNameLabel;
    private javax.swing.JLabel textTribeLabel;
    private javax.swing.JLabel tribeLabel;
    private javax.swing.JLabel weaponLabel;
    private javax.swing.JLabel weaponTextLabel;
    // End of variables declaration//GEN-END:variables
 
//    Окно для создания нового орка
    private void showCreationDialog() {
        String[] tribes = controller.getAvailableTribes();
        String[] roles = {"Базовый", "Командир", "Разведчик"};

        JComboBox<String> tribeCombo = new JComboBox<>(tribes);
        JComboBox<String> roleCombo = new JComboBox<>(roles);

        int result = JOptionPane.showConfirmDialog(this, 
                new Object[]{"Племя:", tribeCombo, "Роль:", roleCombo},
                "Создать орка", JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {
            controller.createOrk((String) tribeCombo.getSelectedItem(),
                    (String) roleCombo.getSelectedItem()
            );
            updateTree();
        }
    }

//    Обновление дерева
    private void updateTree() {
        DefaultTreeModel model = new DefaultTreeModel(buildTree());
        armyTree.setModel(model);
        expandAllNodes();
    }

//    Создание кастомного дерева
    private DefaultMutableTreeNode buildTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Армия Мордора");
        Map<String, List<String>> armyStructure = controller.getArmyStructure();

        armyStructure.forEach((tribe, orks) -> {
            DefaultMutableTreeNode tribeNode = new DefaultMutableTreeNode(tribe);
            orks.forEach(ork -> tribeNode.add(new DefaultMutableTreeNode(ork)));
            root.add(tribeNode);
        });

        return root;
    }

//    Автоматическое раскрытие всех узлов
    private void expandAllNodes() {
        for (int i = 0; i < armyTree.getRowCount(); i++) {
            armyTree.expandRow(i);
        }
    }

//    Обновление информации при выборе орка
   private void updateInfoPanel() {
    TreePath path = armyTree.getSelectionPath();
    if (path != null) {
        Object node = ((DefaultMutableTreeNode) path.getLastPathComponent()).getUserObject();
        if (node instanceof String orkName) {
            Map<String, Object> orkInfo = controller.getOrkInfo(orkName);
            
            // Обновление текстовых полей
            nameLabel.setText((String) orkInfo.getOrDefault("name", ""));
            tribeLabel.setText((String) orkInfo.getOrDefault("tribe", ""));
            weaponLabel.setText((String) orkInfo.getOrDefault("weapon", ""));
            armorLabel.setText((String) orkInfo.getOrDefault("armor", ""));
            bannerLabel.setText((String) orkInfo.getOrDefault("banner", ""));

            // Обновление прогресс-баров
            strengthBar.setValue((Integer) orkInfo.getOrDefault("strength", 0));
            agilityBar.setValue((Integer) orkInfo.getOrDefault("agility", 0));
            intellectBar.setValue((Integer) orkInfo.getOrDefault("intellect", 0));
            healthBar.setValue((Integer) orkInfo.getOrDefault("health", 0));
        }
    }
}
}