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

    public static void teamScreen() {
        //Creating the window.
        JFrame teamFrame = new JFrame("FPL Optimiser");

        //Preventing the window from being resizeable.
        teamFrame.setResizable(false);

        //Setting the layout.
        teamFrame.setLayout(null);

        //Setting window background colour.
        teamFrame.getContentPane().setBackground(Color.decode("#38003C"));

        //Stops the application when the window is closed.
        teamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the size of the window to 75% of the users screen size.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double windowWidth = screenWidth * 0.75;
        int screenWidthInt = (int)windowWidth;

        double screenHeight = screenSize.getHeight();
        double windowHeight = screenHeight * 0.75;
        int screenHeightInt = (int)windowHeight;

        teamFrame.setPreferredSize(new Dimension(screenWidthInt, screenHeightInt));
        teamFrame.pack();

        //Puts the window in the middle of the screen.
        teamFrame.setLocationRelativeTo(null);

        //Making the window visible.
        teamFrame.setVisible(true);

        //Adding a pitch background image.
        JLayeredPane pitchPane = new JLayeredPane();
        JLabel pitch = new JLabel("");
        pitch.setBounds(25, 20, 1400, 1000);
        pitchPane.add(pitch, JLayeredPane.DEFAULT_LAYER);
        pitchPane.setVisible(true);
        pitchPane.setBounds(0, 0, 1960, 1080);
        pitch.setIcon(new ImageIcon("C:\\Users\\Daniel\\IdeaProjects\\FYP\\pitch.png"));
        teamFrame.add(pitchPane);


        //Creating the search for players until file is linked.
        String[] gks = {"Select a player", "Alisson", "Ederson", "Leno", "Vicario", "Ramsdale", "Raya"};
        String[] dfs = {"Select a player", "Romero", "VVD", "Saliba", "Silva", "VDV", "Trippier"};
        String[] mfs = {"Select a player", "De Bruyne", "Maddison", "Rice", "Casemiro", "Salah", "Enzo"};
        String[] ats = {"Select a player", "Son", "Watkins", "Haaland", "Isak"};

        //JComboBox gk1 = new JComboBox(gks);
        JComboBox gk1 = new JComboBox(gks);
        String gk1Selection = gks[0];
        JComboBox gk2 = new JComboBox(gks);
        String gk2Selection = gks[0];

        gk1.setBounds(560, 180, 150, 50);
        pitchPane.add(gk1, JLayeredPane.PALETTE_LAYER);


        /*gk1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gk1Selection = gks[gk1.getSelectedIndex()];
                System.out.println(gk1Selection);

                if (gk1.getSelectedIndex() == gk2.getSelectedIndex()) {
                    gk2.setSelectedIndex(0);
                    System.out.println(gk2Selection);
                }
            }
        });*/

        gk2.setBounds(795, 180, 150, 50);
        pitchPane.add(gk2, JLayeredPane.PALETTE_LAYER);

        //pitchPanel.add(gk2);
        /*gk2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gk2Selection = gks[gk2.getSelectedIndex()];
                System.out.println(gk2Selection);

                if (gk1.getSelectedIndex() == gk2.getSelectedIndex()) {
                    gk2.setSelectedIndex(0);
                    System.out.println(gk2Selection);
                }
            }
        });*/

        //Defenders.
        JComboBox df1 = new JComboBox(dfs);
        df1.setBounds(320, 320, 150, 50);
        pitchPane.add(df1, JLayeredPane.PALETTE_LAYER);

        JComboBox df2 = new JComboBox(dfs);
        df2.setBounds(500, 320, 150, 50);
        pitchPane.add(df2, JLayeredPane.PALETTE_LAYER);

        JComboBox df3 = new JComboBox(dfs);
        df3.setBounds(680, 320, 150, 50);
        pitchPane.add(df3, JLayeredPane.PALETTE_LAYER);

        JComboBox df4 = new JComboBox(dfs);

        df4.setBounds(860, 320, 150, 50);
        pitchPane.add(df4, JLayeredPane.PALETTE_LAYER);

        JComboBox df5 = new JComboBox(dfs);
        df5.setBounds(1040, 320, 150, 50);
        pitchPane.add(df5, JLayeredPane.PALETTE_LAYER);

        //Midfielders.
        JComboBox mf1 = new JComboBox(mfs);
        mf1.setBounds(320, 480, 150, 50);
        pitchPane.add(mf1, JLayeredPane.PALETTE_LAYER);

        JComboBox mf2 = new JComboBox(mfs);
        mf2.setBounds(500, 480, 150, 50);
        pitchPane.add(mf2, JLayeredPane.PALETTE_LAYER);

        JComboBox mf3 = new JComboBox(mfs);
        mf3.setBounds(680, 480, 150, 50);
        pitchPane.add(mf3, JLayeredPane.PALETTE_LAYER);

        JComboBox mf4 = new JComboBox(mfs);
        mf4.setBounds(860, 480, 150, 50);
        pitchPane.add(mf4, JLayeredPane.PALETTE_LAYER);

        JComboBox mf5 = new JComboBox(mfs);
        mf5.setBounds(1040, 480, 150, 50);
        pitchPane.add(mf5, JLayeredPane.PALETTE_LAYER);

        //Attackers.
        JComboBox at1 = new JComboBox(ats);
        at1.setBounds(500, 640, 150, 50);
        pitchPane.add(at1, JLayeredPane.PALETTE_LAYER);

        JComboBox at2 = new JComboBox(ats);
        at2.setBounds(680, 640, 150, 50);
        pitchPane.add(at2, JLayeredPane.PALETTE_LAYER);

        JComboBox at3 = new JComboBox(ats);
        at3.setBounds(860, 640, 150, 50);
        pitchPane.add(at3, JLayeredPane.PALETTE_LAYER);

        //Adding a button that checks your team is valid.
        JButton submitButton = new JButton("Submit team");
        submitButton.setBounds(1470, 920, 400, 100);
        submitButton.setFont(new Font("Calibri Light", Font.BOLD, 30));
        submitButton.setBackground(Color.decode("#00FF85"));
        submitButton.setForeground(Color.decode("#38003C"));
        pitchPane.add(submitButton, JLayeredPane.PALETTE_LAYER);

        //Test code for errors in team.
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Error", "Team Error", JOptionPane.INFORMATION_MESSAGE);
            }
        });


    }

}
