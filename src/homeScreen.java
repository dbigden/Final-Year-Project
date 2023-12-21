import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;


public class homeScreen extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //frame frame = new frame();
                    //frame.setVisible(true);
                    homeScreen();

                    //teamScreen();
                    //teamScreen.teamScreen();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    //public frame() {
    public static void homeScreen() {
        //Creating the window.
        JFrame homeFrame = new JFrame("FPL Optimiser");
        //frame.setLayout(new GridLayout());

        //Setting the icon image.
        homeFrame.setIconImage(new ImageIcon("C:\\Users\\Daniel\\" +
                "IdeaProjects\\FYP\\fpl logo.png").getImage());

        //Preventing the window from being resizeable.
        homeFrame.setResizable(false);

        //Stops the application when the window is closed.
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the size of the window to 75% of the users screen size.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double windowWidth = screenWidth * 0.75;
        int screenWidthInt = (int)windowWidth;

        double screenHeight = screenSize.getHeight();
        double windowHeight = screenHeight * 0.75;
        int screenHeightInt = (int)windowHeight;

        homeFrame.setBounds(100, 100, screenWidthInt, screenHeightInt);

        //Puts the window in the middle of the screen.
        homeFrame.setLocationRelativeTo(null);

        //Making the window visible.
        homeFrame.setVisible(true);

        //Creating a panel to put the items on the frame onto.
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.decode("#38003C"));
        contentPane.setLayout(null);
        homeFrame.setContentPane(contentPane);

        //Adding a title.
        JLabel titleLabel = new JLabel("FPL Optimiser");
        titleLabel.setBounds(365, 220, 1180, 250);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 200));
        titleLabel.setForeground(Color.WHITE);
        contentPane.add(titleLabel);

        //Adding a button that takes you to the team page and closes the welcome page.
        JButton startButton = new JButton("Start");
        startButton.setBounds(830, 600, 250, 120);
        startButton.setFont(new Font("Calibri Light", Font.BOLD, 50));
        startButton.setBackground(Color.decode("#00FF85"));
        startButton.setForeground(Color.decode("#38003C"));
        contentPane.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //teamScreen();
                try {
                    teamScreen.teamScreen();
                    homeFrame.dispose();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

}
