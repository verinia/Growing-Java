import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel;
    JPanel startButtonPanel;
    JLabel titleNameLabel;
    JButton startButton;

    static int widthW = 850;
    static int heightW = 650;


    //Creating a new Font("Font name", "Font Style", "Font size")
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);

    Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 50);


    public static void main(String[] args) {

        new Game();
    }
    public Game() {

        //initializes the JFrame window
        window = new JFrame();


        //sets the width and height of window in pixels.
        window.setSize(widthW, heightW);

        //Adds a function to the window that you can close the window using the X button.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Sets the window background to black.
        window.getContentPane().setBackground(Color.black);

        //Nulls the default layout of JFrame since I want a custom layout.
        window.setLayout(null);

        //Makes the window appear on the screen, if false, the program will run without the window in the foreground.
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        //This creates a blank space within the window for the text to sit in.
        titleNamePanel.setBounds(100, 100, 600, 150);
        //Sets the text color to blue
        titleNamePanel.setBackground(Color.BLACK);
        //This is how you create a new label with variable as titleNameLabel.
        titleNameLabel = new JLabel("ADVENTURE");
        //Sets the color of the text.
        titleNameLabel.setForeground(Color.WHITE);
        //This is how you add the Font to the titleNameLabel object.
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 80);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(startButtonFont);





        //This is how you add the object titleNameLabel to the titleNamePanel object.
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        //Adds an empty container "second layer to the window" that will hold the titleNamePanel
        con.add(titleNamePanel);
        con.add(startButtonPanel);

    }
}
