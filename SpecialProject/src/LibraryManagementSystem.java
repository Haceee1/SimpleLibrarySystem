package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystem {

    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LibraryManagementSystem window = new LibraryManagementSystem();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LibraryManagementSystem() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Library Management System");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Welcome Panel
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new BorderLayout(10, 10));

        JLabel welcomeLabel = new JLabel("Welcome to the Library Management System", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 20));
        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);

        JButton enterButton = new JButton("Enter");
        enterButton.setFont(new Font("Serif", Font.PLAIN, 16));
        enterButton.setPreferredSize(new Dimension(100, 30));
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "optionsPanel");
            }
        });
        welcomePanel.add(enterButton, BorderLayout.SOUTH);

        mainPanel.add(welcomePanel, "welcomePanel");

        // Options Panel
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1, 10, 10)); // Updated grid to 4 rows

        JButton videoLibraryButton = new JButton("Video Library");
        videoLibraryButton.setFont(new Font("Serif", Font.PLAIN, 16));
        videoLibraryButton.setPreferredSize(new Dimension(150, 30));
        videoLibraryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new VideoLibraryGUI();
            }
        });
        optionsPanel.add(videoLibraryButton);

        JButton bookLibraryButton = new JButton("Book Library");
        bookLibraryButton.setFont(new Font("Serif", Font.PLAIN, 16));
        bookLibraryButton.setPreferredSize(new Dimension(150, 30));
        bookLibraryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new LibraryGUI();
            }
        });
        optionsPanel.add(bookLibraryButton);

        JButton audioLibraryButton = new JButton("Audio Library");
        audioLibraryButton.setFont(new Font("Serif", Font.PLAIN, 16));
        audioLibraryButton.setPreferredSize(new Dimension(150, 30));
        audioLibraryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new AudioLibraryGUI();
            }
        });
        optionsPanel.add(audioLibraryButton);

        mainPanel.add(optionsPanel, "optionsPanel");

        frame.getContentPane().add(mainPanel);
        cardLayout.show(mainPanel, "welcomePanel");
    }
}
