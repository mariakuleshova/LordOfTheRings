
import Controller.Controller;
import Model.Ork;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

class ArmyView {
    private JTree armyTree;
    private JPanel infoPanel;
    private JProgressBar strengthBar, agilityBar, intellectBar, healthBar;
    private final Controller controller;

    public ArmyView(Controller controller) {
        this.controller = controller;
        initializeUI();
    }

    private void initializeUI() {
        JFrame frame = new JFrame("Армия Саурона");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setLeftComponent(createArmyPanel());
        splitPane.setRightComponent(createInfoPanel());
        
        frame.add(splitPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JComponent createArmyPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JButton addButton = new JButton("Создать орка");
        addButton.addActionListener(e -> showCreationDialog());

        armyTree = new JTree(createTreeModel());
        armyTree.addTreeSelectionListener(e -> updateInfoPanel());

        panel.add(addButton, BorderLayout.NORTH);
        panel.add(new JScrollPane(armyTree), BorderLayout.CENTER);
        return panel;
    }

    private JComponent createInfoPanel() {
        infoPanel = new JPanel(new GridLayout(4, 1));
        strengthBar = new JProgressBar(0, 100);
        agilityBar = new JProgressBar(0, 100);
        intellectBar = new JProgressBar(0, 50);
        healthBar = new JProgressBar(50, 200);
        infoPanel.add(createInfoBox("Сила:", strengthBar));
        infoPanel.add(createInfoBox("Ловкость:", agilityBar));
        infoPanel.add(createInfoBox("Интеллект:", intellectBar));
        infoPanel.add(createInfoBox("Здоровье:", healthBar));
        
        return infoPanel;
    }

    private JPanel createInfoBox(String label, JProgressBar bar) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(label), BorderLayout.WEST);
        panel.add(bar, BorderLayout.CENTER);
        return panel;
    }

    private void showCreationDialog() {
        JComboBox<String> tribeCombo = new JComboBox<>(new String[]{"Мордор", "Дол Гулдур", "Мглистые Горы"});
        JComboBox<String> roleCombo = new JComboBox<>(new String[]{"Базовый", "Командир", "Разведчик"});

        int result = JOptionPane.showConfirmDialog(
            null,
            new Object[]{"Племя:", tribeCombo, "Роль:", roleCombo},
            "Создать орка",
            JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {
            controller.createOrk(
                (String)tribeCombo.getSelectedItem(),
                (String)roleCombo.getSelectedItem()
            );
            updateTree();
        }
    }

    private TreeModel createTreeModel() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Армия Мордора");
        Map<String, DefaultMutableTreeNode> tribes = new HashMap<>();

        for (Ork ork : controller.getArmy()) {
            tribes.computeIfAbsent(ork.getTribe(), k -> {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(ork.getTribe());
                root.add(node);
                return node;
            }).add(new DefaultMutableTreeNode(ork.getName()));
        }

        return new DefaultTreeModel(root);
    }

    private void updateTree() {
        armyTree.setModel(createTreeModel());
        for (int i = 0; i < armyTree.getRowCount(); i++) {
            armyTree.expandRow(i);
        }
    }

    private void updateInfoPanel() {
        TreePath path = armyTree.getSelectionPath();
        if (path != null) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
            if (node.isLeaf()) {
                String orkName = (String) node.getUserObject();
                controller.getArmy().stream()
                    .filter(ork -> ork.getName().equals(orkName))
                    .findFirst()
                    .ifPresent(this::updateStats);
            }
        }
    }

    private void updateStats(Ork ork) {
        strengthBar.setValue(ork.getStrength());
        agilityBar.setValue(ork.getAgility());
        intellectBar.setValue(ork.getIntellect());
        healthBar.setValue(ork.getHealth());
    }
    
     public static void main(String[] args) {
        Controller controller = new Controller();
        SwingUtilities.invokeLater(() -> new ArmyView(controller));
    }
}