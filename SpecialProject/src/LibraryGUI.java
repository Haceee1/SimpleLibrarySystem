package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LibraryGUI {
    private JFrame frame;
    private JTextField isbnField;
    private JTextField titleField;
    private JTextField authorField;
    private JTextField priceField;
    private JTable bookTable;
    private DefaultTableModel tableModel;
    private ArrayList<Book> books;

    public LibraryGUI() {
        books = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Library Management System");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(10, 10));
    
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
    
        JLabel isbnLabel = new JLabel("ISBN:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(isbnLabel, gbc);
    
        isbnField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        inputPanel.add(isbnField, gbc);
    
        JLabel titleLabel = new JLabel("Title:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(titleLabel, gbc);
    
        titleField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        inputPanel.add(titleField, gbc);
    
        JLabel authorLabel = new JLabel("Author:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(authorLabel, gbc);
    
        authorField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        inputPanel.add(authorField, gbc);
    
        JLabel priceLabel = new JLabel("Price:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(priceLabel, gbc);
    
        priceField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        inputPanel.add(priceField, gbc);
    
        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });
    
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.EAST;
        inputPanel.add(addButton, gbc);
    
        frame.getContentPane().add(inputPanel, BorderLayout.NORTH);
    
        String[] columnNames = {"ISBN", "Title", "Author", "Price"};
        tableModel = new DefaultTableModel(columnNames, 0);
        bookTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    
        frame.setVisible(true);
    }
    

    private void addBook() {
        String isbn = isbnField.getText();
        String title = titleField.getText();
        String author = authorField.getText();
        double price = Double.parseDouble(priceField.getText());

        Book newBook = new Book(isbn, title, author, price);
        books.add(newBook);

        Object[] rowData = {isbn, title, author, price};
        tableModel.addRow(rowData);

        isbnField.setText("");
        titleField.setText("");
        authorField.setText("");
        priceField.setText("");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LibraryGUI window = new LibraryGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
