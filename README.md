# Library Management System

Ito ang project para sa Library Management System na gumagamit ng Java Swing para sa graphical user interface (GUI). May tatlong pangunahing libraries: Book, Video, at Audio libraries.

## Mga Klase

### 1. `Book.java`

Ang klase na ito ay ginagamit para mag-represent ng mga libro sa library.

- **Keywords:**
  - `public class Book` - Pangalan ng class para sa libro.
  - `private String isbn` - Variable para sa ISBN ng libro.
  - `private String title` - Variable para sa title ng libro.
  - `private String author` - Variable para sa author ng libro.
  - `private double price` - Variable para sa presyo ng libro.
  - `public Book(String isbn, String title, String author, double price)` - Constructor para gumawa ng bagong Book object.
  - `public String getIsbn()` - Method para makuha ang ISBN.
  - `public void setIsbn(String isbn)` - Method para i-set ang ISBN.
  - `public String getTitle()` - Method para makuha ang title.
  - `public void setTitle(String title)` - Method para i-set ang title.
  - `public String getAuthor()` - Method para makuha ang author.
  - `public void setAuthor(String author)` - Method para i-set ang author.
  - `public double getPrice()` - Method para makuha ang price.
  - `public void setPrice(double price)` - Method para i-set ang price.
  - `@Override` - Annotation para sa pag-override ng method.
  - `public String toString()` - Method para gawing string ang Book object para sa display purposes.

### 2. `LibraryGUI.java`

Ang klase na ito ay ginagamit para sa GUI ng Book Library.

- **Keywords:**
  - `import javax.swing.*` - Import ng Swing library para sa GUI components.
  - `import javax.swing.table.DefaultTableModel` - Import para sa table model na ginagamit sa JTable.
  - `import java.awt.*` - Import para sa awt library na ginagamit sa layout at component sizes.
  - `import java.awt.event.ActionEvent` - Import para sa action events tulad ng button clicks.
  - `import java.awt.event.ActionListener` - Import para sa action listener interface.
  - `public class LibraryGUI` - Pangalan ng class para sa GUI ng library.
  - `private JFrame frame` - Frame ng GUI.
  - `private JTextField isbnField` - Text field para sa ISBN input.
  - `private JTextField titleField` - Text field para sa title input.
  - `private JTextField authorField` - Text field para sa author input.
  - `private JTextField priceField` - Text field para sa price input.
  - `private JTable bookTable` - Table para sa listahan ng books.
  - `private DefaultTableModel tableModel` - Model ng table para sa data handling.
  - `private ArrayList<Book> books` - Listahan ng books.
  - `public LibraryGUI()` - Constructor ng class.
  - `private void initialize()` - Method para i-setup ang GUI components.
  - `private void addBook()` - Method para mag-add ng book sa listahan at table.
  - `public static void main(String[] args)` - Main method, entry point ng program.

### 3. `VideoLibraryGUI.java`

Ang klase na ito ay ginagamit para sa GUI ng Video Library.

- **Mga Keywords:**
  - `import javax.swing.*` - Import ng Swing library para sa GUI components.
  - `import javax.swing.table.DefaultTableModel` - Import para sa table model na ginagamit sa JTable.
  - `import java.awt.*` - Import para sa awt library na ginagamit sa layout at component sizes.
  - `import java.awt.event.ActionEvent` - Import para sa action events tulad ng button clicks.
  - `import java.awt.event.ActionListener` - Import para sa action listener interface.
  - `import java.io.File` - Import para sa file handling.
  - `public class VideoLibraryGUI` - Pangalan ng class para sa GUI ng video library.
  - `private JFrame frame` - Frame ng GUI.
  - `private DefaultTableModel tableModel` - Model ng table para sa data handling.
  - `public VideoLibraryGUI()` - Constructor ng class.
  - `private void initialize()` - Method para i-setup ang GUI components.
  - `private void uploadVideo()` - Method para mag-upload ng video file at idagdag ito sa table.

### 4. `AudioLibraryGUI.java`

Ang klase na ito ay ginagamit para sa GUI ng Audio Library.

- **Keywords:**
  - `import javax.swing.*` - Import ng Swing library para sa GUI components.
  - `import javax.swing.table.DefaultTableModel` - Import para sa table model na ginagamit sa JTable.
  - `import java.awt.*` - Import para sa awt library na ginagamit sa layout at component sizes.
  - `import java.awt.event.ActionEvent` - Import para sa action events tulad ng button clicks.
  - `import java.awt.event.ActionListener` - Import para sa action listener interface.
  - `import java.io.File` - Import para sa file handling.
  - `public class AudioLibraryGUI` - Pangalan ng class para sa GUI ng audio library.
  - `private JFrame frame` - Frame ng GUI.
  - `private DefaultTableModel tableModel` - Model ng table para sa data handling.
  - `public AudioLibraryGUI()` - Constructor ng class.
  - `private void initialize()` - Method para i-setup ang GUI components.
  - `private void uploadSong()` - Method para mag-upload ng audio file at idagdag ito sa table.

### 5. `LibraryManagementSystem.java`

Ang klase na ito ang pangunahing system para sa library management.

- **Mga Keywords:**
  - `import javax.swing.*` - Import ng Swing library para sa GUI components.
  - `import java.awt.*` - Import para sa awt library na ginagamit sa layout at component sizes.
  - `import java.awt.event.ActionEvent` - Import para sa action events tulad ng button clicks.
  - `import java.awt.event.ActionListener` - Import para sa action listener interface.
  - `public class LibraryManagementSystem` - Pangalan ng class para sa main system ng library.
  - `private JFrame frame` - Frame ng GUI.
  - `private CardLayout cardLayout` - Layout manager para sa card-based navigation.
  - `private JPanel mainPanel` - Main panel na naglalaman ng iba't ibang cards.
  - `public static void main(String[] args)` - Main method, entry point ng program.
  - `public LibraryManagementSystem()` - Constructor ng class.
  - `private void initialize()` - Method para i-setup ang GUI components.
  - `JPanel welcomePanel` - Panel para sa welcome screen.
  - `JPanel optionsPanel` - Panel para sa options menu.
  - `JButton videoLibraryButton` - Button para pumunta sa video library.
  - `JButton bookLibraryButton` - Button para pumunta sa book library.
  - `JButton audioLibraryButton` - Button para pumunta sa audio library.


## Author

- Pangalan: Ariel Clemence A. Prado
- Email: eyshicah@gmail.com

---

