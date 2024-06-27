package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class VideoLibraryGUI {

    private JFrame frame;
    private DefaultTableModel tableModel;

    public VideoLibraryGUI() {
        initialize();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame("Video Library");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JButton uploadButton = new JButton("Upload Video");
        uploadButton.setPreferredSize(new Dimension(150, 30));
        uploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                uploadVideo();
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        inputPanel.add(uploadButton, gbc);

        frame.getContentPane().add(inputPanel, BorderLayout.NORTH);

        String[] columnNames = {"File Name", "File Path"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable videoTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(videoTable);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void uploadVideo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(frame);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            tableModel.addRow(new Object[]{selectedFile.getName(), selectedFile.getAbsolutePath()});
        }
    }
}

