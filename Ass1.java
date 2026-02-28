SwingUtilities.invokeLater(() -> {
    JFrame frame = new JFrame("My First Swing Window");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
});
