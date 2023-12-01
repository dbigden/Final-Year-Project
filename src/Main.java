import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            //System.out.println("i = " + i);
        //}

        /*String fonts[]
                = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < fonts.length; i++) {
            System.out.println(fonts[i]);
        }*/

        homeMenu();
    }

    public static void homeMenu() {
        //Creating the window.
        JFrame frame = new JFrame("FPL Optimiser");
        //frame.setLayout(new GridLayout());

        //Stops the application when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the size of the window to 75% of the users screen size.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double windowWidth = screenWidth * 0.75;
        int screenWidthInt = (int)windowWidth;

        double screenHeight = screenSize.getHeight();
        double windowHeight = screenHeight * 0.75;
        int screenHeightInt = (int)windowHeight;

        System.out.println(screenWidthInt);
        System.out.println(screenHeightInt);

        frame.setPreferredSize(new Dimension(screenWidthInt, screenHeightInt));
        frame.pack();

        //Setting background colour.
        frame.getContentPane().setBackground(Color.decode("#38003C"));

        //Adding the title and making it 30% of the screen size.
        double titleWidth = screenWidth * 5;
        int titleWidthInt = (int)titleWidth;

        double titleHeight = screenHeight * 5;
        int titleHeightInt = (int)titleHeight;

        JLabel title = new JLabel("FPL Optimiser");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(SwingConstants.TOP);
        title.setPreferredSize(new Dimension(titleWidthInt, titleHeightInt));
        //title.setBounds(500,500,titleWidthInt,titleHeightInt);
        title.setForeground(Color.decode("#FFFFFF"));
        title.setFont(new Font("Calibri", Font.PLAIN, 200));

        //frame.getContentPane().add(title, BorderLayout.CENTER);
        frame.add(title);

        //Adding a button that takes you to the team page and closes the welcome page.
        JButton start = new JButton("Start");
        start.setFont(new Font("Calibri", Font.BOLD, 26));
        start.setHorizontalAlignment(JButton.CENTER);
        start.setVerticalAlignment(JButton.CENTER);
        //start.setSize(new Dimension(50,50));
        //start.setLocation(500,350);
        //frame.add(start);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBackground(Color.decode("#38003C"));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(300, 500, 300, 500));
        //buttonPanel.add(start);
        //buttonPanel.add(title, BorderLayout.NORTH);
        //buttonPanel.setSize(200,100);
        buttonPanel.add(start, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamScreen();
                frame.dispose();
            }
        });

        //Puts the window in the middle of the screen.
        frame.setLocationRelativeTo(null);

        //Making the window visible.
        frame.setVisible(true);
    }

    public static void teamScreen() {
        //Creating the window.
        JFrame frame = new JFrame("FPL Optimiser");

        //Stops the application when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the size of the window to 75% of the users screen size.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double windowWidth = screenWidth * 0.75;
        int screenWidthInt = (int)windowWidth;

        double screenHeight = screenSize.getHeight();
        double windowHeight = screenHeight * 0.75;
        int screenHeightInt = (int)windowHeight;

        frame.setPreferredSize(new Dimension(screenWidthInt, screenHeightInt));
        frame.pack();

        //Setting background colour.
        frame.getContentPane().setBackground(Color.decode("#38003C"));

        //Puts the window in the middle of the screen.
        frame.setLocationRelativeTo(null);

        //Making the window visible.
        frame.setVisible(true);

    }



}