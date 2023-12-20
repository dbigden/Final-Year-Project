import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.SQLOutput;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class teamScreen {
    public static void main(String args[]) throws Exception {
        //readFile("position", "defender");
        teamScreen();
    }

    public static void teamScreen() throws Exception {
        //Creating the window.
        JFrame teamFrame = new JFrame("FPL Optimiser");

        //Setting the icon image.
        teamFrame.setIconImage(new ImageIcon("C:\\Users\\Daniel\\" +
                "IdeaProjects\\FYP\\fpl logo.png").getImage());

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
        pitch.setBounds(25, 20, 1500, 1000);
        pitchPane.add(pitch, JLayeredPane.DEFAULT_LAYER);
        pitch.setVisible(true);
        pitchPane.setVisible(true);
        pitchPane.setBounds(0, 0, 1960, 1080);
        pitch.setIcon(new ImageIcon("C:\\Users\\Daniel\\IdeaProjects\\FYP\\pitch.png"));
        teamFrame.add(pitchPane);

        //Getting all goalkeepers names for the dropdown box.
        ArrayList<ArrayList<String>> gks = readFile("position", "goalkeeper");
        ArrayList<String> gkNames = getColumnFromData(gks, "name");
        ArrayList<String> gkTeams = getColumnFromData(gks, "team");
        ArrayList<String> gkName_Team = new ArrayList<String>();

        //Adding the names and teams together to identify players.
        for (int i = 0; i < gkNames.size(); i++) {

            gkName_Team.add(gkNames.get(i) + ", " + gkTeams.get(i));

        }

        //Sorting the ArrayList alphabetically so it is easier to find players.
        Collections.sort(gkName_Team, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        //Getting all defenders names for the dropdown box.
        ArrayList<ArrayList<String>> dfs = readFile("position", "defender");
        ArrayList<String> dfNames = getColumnFromData(dfs, "name");
        ArrayList<String> dfTeams = getColumnFromData(dfs, "team");
        ArrayList<String> dfName_Team = new ArrayList<String>();

        //Adding the names and teams together to identify players.
        for (int i = 0; i < dfNames.size(); i++) {

            dfName_Team.add(dfNames.get(i) + ", " + dfTeams.get(i));

        }

        //Sorting the ArrayList alphabetically so it is easier to find players.
        Collections.sort(dfName_Team, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        //Getting all midfielders names for the dropdown box.
        ArrayList<ArrayList<String>> mfs = readFile("position", "midfielder");
        ArrayList<String> mfNames = getColumnFromData(mfs, "name");
        ArrayList<String> mfTeams = getColumnFromData(mfs, "team");
        ArrayList<String> mfName_Team = new ArrayList<String>();

        //Adding the names and teams together to identify players.
        for (int i = 0; i < mfNames.size(); i++) {

            mfName_Team.add(mfNames.get(i) + ", " + mfTeams.get(i));

        }

        //Sorting the ArrayList alphabetically so it is easier to find players.
        Collections.sort(mfName_Team, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        //Getting all defenders names for the dropdown box.
        ArrayList<ArrayList<String>> fws = readFile("position", "forward");
        ArrayList<String> fwNames = getColumnFromData(fws, "name");
        ArrayList<String> fwTeams = getColumnFromData(fws, "team");
        ArrayList<String> fwName_Team = new ArrayList<String>();

        //Adding the names and teams together to identify players.
        for (int i = 0; i < fwNames.size(); i++) {

            fwName_Team.add(fwNames.get(i) + ", " + fwTeams.get(i));

        }

        //Sorting the ArrayList alphabetically so that it is easier to find players.
        Collections.sort(fwName_Team, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        //Goalkeepers.
        JComboBox gk1 = new JComboBox(gkName_Team.toArray());
        gk1.setBounds(560, 180, 150, 50);
        pitchPane.add(gk1, JLayeredPane.PALETTE_LAYER);

        JComboBox gk2 = new JComboBox(gkName_Team.toArray());
        gk2.setBounds(795, 180, 150, 50);
        pitchPane.add(gk2, JLayeredPane.PALETTE_LAYER);

        //Defenders.
        JComboBox df1 = new JComboBox(dfName_Team.toArray());
        df1.setBounds(320, 320, 150, 50);
        pitchPane.add(df1, JLayeredPane.PALETTE_LAYER);

        JComboBox df2 = new JComboBox(dfName_Team.toArray());
        df2.setBounds(500, 320, 150, 50);
        pitchPane.add(df2, JLayeredPane.PALETTE_LAYER);

        JComboBox df3 = new JComboBox(dfName_Team.toArray());
        df3.setBounds(680, 320, 150, 50);
        pitchPane.add(df3, JLayeredPane.PALETTE_LAYER);

        JComboBox df4 = new JComboBox(dfName_Team.toArray());
        df4.setBounds(860, 320, 150, 50);
        pitchPane.add(df4, JLayeredPane.PALETTE_LAYER);

        JComboBox df5 = new JComboBox(dfName_Team.toArray());
        df5.setBounds(1040, 320, 150, 50);
        pitchPane.add(df5, JLayeredPane.PALETTE_LAYER);

        //Midfielders.
        JComboBox mf1 = new JComboBox(mfName_Team.toArray());
        mf1.setBounds(320, 480, 150, 50);
        pitchPane.add(mf1, JLayeredPane.PALETTE_LAYER);

        JComboBox mf2 = new JComboBox(mfName_Team.toArray());
        mf2.setBounds(500, 480, 150, 50);
        pitchPane.add(mf2, JLayeredPane.PALETTE_LAYER);

        JComboBox mf3 = new JComboBox(mfName_Team.toArray());
        mf3.setBounds(680, 480, 150, 50);
        pitchPane.add(mf3, JLayeredPane.PALETTE_LAYER);

        JComboBox mf4 = new JComboBox(mfName_Team.toArray());
        mf4.setBounds(860, 480, 150, 50);
        pitchPane.add(mf4, JLayeredPane.PALETTE_LAYER);

        JComboBox mf5 = new JComboBox(mfName_Team.toArray());
        mf5.setBounds(1040, 480, 150, 50);
        pitchPane.add(mf5, JLayeredPane.PALETTE_LAYER);

        //Forwards.
        JComboBox fw1 = new JComboBox(fwName_Team.toArray());
        fw1.setBounds(500, 640, 150, 50);
        pitchPane.add(fw1, JLayeredPane.PALETTE_LAYER);

        JComboBox fw2 = new JComboBox(fwName_Team.toArray());
        fw2.setBounds(680, 640, 150, 50);
        pitchPane.add(fw2, JLayeredPane.PALETTE_LAYER);

        JComboBox fw3 = new JComboBox(fwName_Team.toArray());
        fw3.setBounds(860, 640, 150, 50);
        pitchPane.add(fw3, JLayeredPane.PALETTE_LAYER);

        //Adding a text box for users to state the number of free transfers they have.
        JLabel freeTransfers = new JLabel("Free transfers available:");
        freeTransfers.setBounds(1503, 0, 380, 100);
        freeTransfers.setFont(new Font("Calibri", Font.BOLD, 38));
        freeTransfers.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(freeTransfers, JLayeredPane.PALETTE_LAYER);

        JSpinner freeTransferNumber = new JSpinner();
        freeTransferNumber.setBounds(1503, 100, 380, 50);
        freeTransferNumber.setFont(new Font("Calibri", Font.BOLD, 38));
        freeTransferNumber.setForeground(Color.decode("#000000"));
        pitchPane.add(freeTransferNumber, JLayeredPane.PALETTE_LAYER);

        //Adding a text box for users to state the remaining budget they have.
        JLabel budget = new JLabel("Budget remaining:");
        budget.setBounds(1503, 300, 380, 100);
        budget.setFont(new Font("Calibri", Font.BOLD, 38));
        budget.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(budget, JLayeredPane.PALETTE_LAYER);

        JTextField budgetNumber = new JTextField();
        budgetNumber.setBounds(1503, 400, 380, 50);
        budgetNumber.setFont(new Font("Calibri", Font.BOLD, 38));
        budgetNumber.setHorizontalAlignment(SwingConstants.RIGHT);
        budgetNumber.setForeground(Color.decode("#000000"));
        pitchPane.add(budgetNumber, JLayeredPane.PALETTE_LAYER);

        //Allowing only numbers and decimal points to be inputted.
        budgetNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //Checking if inputted character is a number, a decimal point, backspace or delete.
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '.' ||
                        e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_DELETE) {
                    budgetNumber.setEditable(true);

                } else {
                    budgetNumber.setEditable(false);
                    JOptionPane.showMessageDialog(null,
                            "You must enter a valid budget!",
                            "Budget Error", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });

        //Adding chips.
//        JToggleButton fHitWild = new JToggleButton("Free Hit/Wildcard");
//        fHitWild.setBounds(1503, 600, 380, 50);
//        fHitWild.setFont(new Font("Calibri", Font.BOLD, 38));
//        fHitWild.setBackground(Color.decode("#00FF85"));
//        fHitWild.setForeground(Color.decode("#38003C"));
//        fHitWild.setVerticalAlignment(SwingConstants.CENTER);
//        pitchPane.add(fHitWild, JLayeredPane.PALETTE_LAYER);

//        fHitWild.addItemListener(new ItemListener() {
//            boolean chipSelected;
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                int state = e.getStateChange();
//
//
//                if (state == ItemEvent.SELECTED) {
//                    chipSelected = true;
//                } else {
//                    chipSelected = false;
//                }
//            }
//
//            public boolean getChipSelected() {
//                return chipSelected;
//            }
//        });
//
//        //Adding an item listener to get the state of the item listener.
//        ItemListener chipSelectedListener = new MyItemListener();
//        fHitWild.addItemListener(chipSelectedListener);



        //Adding a button that checks your team is valid.
        JButton submitButton = new JButton("Submit team");
        submitButton.setBounds(1503, 920, 380, 100);
        submitButton.setFont(new Font("Calibri Light", Font.BOLD, 50));
        submitButton.setBackground(Color.decode("#00FF85"));
        submitButton.setForeground(Color.decode("#38003C"));
        pitchPane.add(submitButton, JLayeredPane.PALETTE_LAYER);

        //Test code for errors in team.
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Error", "Team Error", JOptionPane.INFORMATION_MESSAGE);

                //Creating variables to track if the submission passes all the checks.
                boolean noDupes = false;
                boolean validFrees = false;
                boolean validBudget = false;
                boolean moreThan3 = true;
                //boolean chipSelected = ((MyItemListener) chipSelectedListener).getChipSelected();

                //Adding all player selections to an array.
                ArrayList<String> players = new ArrayList<String>();
                players.add(String.valueOf(gk1.getSelectedItem()));
                players.add(String.valueOf(gk2.getSelectedItem()));
                players.add(String.valueOf(df1.getSelectedItem()));
                players.add(String.valueOf(df2.getSelectedItem()));
                players.add(String.valueOf(df3.getSelectedItem()));
                players.add(String.valueOf(df4.getSelectedItem()));
                players.add(String.valueOf(df5.getSelectedItem()));
                players.add(String.valueOf(mf1.getSelectedItem()));
                players.add(String.valueOf(mf2.getSelectedItem()));
                players.add(String.valueOf(mf3.getSelectedItem()));
                players.add(String.valueOf(mf4.getSelectedItem()));
                players.add(String.valueOf(mf5.getSelectedItem()));
                players.add(String.valueOf(fw1.getSelectedItem()));
                players.add(String.valueOf(fw2.getSelectedItem()));
                players.add(String.valueOf(fw3.getSelectedItem()));

                //System.out.println(players);

                for (int i = 0; i < players.size(); i++) {

                    //Ending the comparisons if at the last item in array.
                    if (i + 1 == players.size()) {
                        noDupes = true;
                        break;

                    } else {

                        //Comparing items in array of players.
                        if (players.get(i).equals(players.get(i + 1))) {
                            JOptionPane.showMessageDialog(null,
                                    "You can't select the same player more than once!",
                                    "Team Error", JOptionPane.INFORMATION_MESSAGE);

                            //Clearing the players array to stop the pop up showing infinitely.
                            players = null;
                            break;
                        }

                    }

                }

                //Checking the number of players from each team is no more than 3.
                try {
                    ArrayList<ArrayList<String>> playerData = readFile("all", "all");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                //Splitting the selected players to separate the name and the team.
                ArrayList<String> playerNames = new ArrayList<String>();
                ArrayList<String> playerTeams = new ArrayList<String>();

                //Splitting the player name and team.
                for (int i = 0; i < players.size(); i++) {

                    String currentPlayer = players.get(i);
                    String[] split = currentPlayer.split(", ");
                    playerNames.add(split[0]);
                    playerTeams.add(split[1]);

                }

                for (String teams : playerTeams) {

                    int teamCount = 0;

                    for (String teams2 : playerTeams) {

                        if (teams.equalsIgnoreCase(teams2)) {

                            teamCount = teamCount + 1;

                        }

                        if (teamCount > 3) {

                            JOptionPane.showMessageDialog(null,
                                    "You can't have more than 3 players from a team!",
                                    "Team Error", JOptionPane.INFORMATION_MESSAGE);

                            //Clearing the ArrayList so the message only shows up once.
                            playerTeams.clear();
                            moreThan3 = false;
                            break;

                        }

                    }

                    if (!moreThan3) {
                        break;
                    }

                }

                //Checking if the free transfers is valid.
                int freeTransfersInt = 0;

                if (freeTransferNumber.getValue() instanceof Integer) {

                    if ((int) freeTransferNumber.getValue() >= 0 && (int) freeTransferNumber.getValue() <= 2 ) {
                        freeTransfersInt = Integer.parseInt(freeTransferNumber.getValue().toString());
                        validFrees = true;

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "You must enter a valid number of free transfers! Must be 0, 1 or 2.",
                                "Free Transfers Error", JOptionPane.INFORMATION_MESSAGE);

                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "You must enter a valid number of free transfers!",
                            "Free Transfers Error", JOptionPane.INFORMATION_MESSAGE);

                }

                //Checking if the budget is valid.
                double budgetDouble = 0.0;

                if (isNumeric(budgetNumber.getText())) {
                    budgetDouble = Double.valueOf(budgetNumber.getText());
                    validBudget = true;

                } else {
                    JOptionPane.showMessageDialog(null,
                            "You must enter a valid budget!",
                            "Budget Error", JOptionPane.INFORMATION_MESSAGE);

                }

                if (noDupes && validFrees && validBudget && moreThan3) {

                    try {
                        outputScreen.outputScreen(players, freeTransfersInt, budgetDouble);
                        teamFrame.dispose();
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }

                }

            }

        });

    }

    public static ArrayList<ArrayList<String>> readFile(String querySubject, String querySearch) throws Exception{
       /* // list that holds strings of a file
        List<String> listOfStrings
                = new ArrayList<String>();

        // load data from file
        BufferedReader bf = new BufferedReader(
                new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\testplayers.csv"));

        // read entire line as string
        String line = bf.readLine();

        // checking for end of file
        while (line != null) {

            listOfStrings.add(line);
            line = bf.readLine();
        }

        // closing bufferreader object
        bf.close();

        // storing the data in arraylist to array
        String[] array
                = listOfStrings.toArray(new String[0]);

        // printing each line of file
        // which is stored in array
        for (String str : array) {
            //System.out.println(str);
        }

        System.out.println(array[1]);*///////////////////////////////////////////////

        //Creating the 3D ArrayList to store the players data in.
        ArrayList<ArrayList<String>> playerData = new ArrayList<ArrayList<String>>();

        //Creating a buffered reader to read from the csv to help count the number of lines.
        //BufferedReader bf1 = new BufferedReader(
                //new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\testplayers.csv"));

        BufferedReader bf1 = new BufferedReader(
                new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\PlayerData2.csv"));

        //Counting the number of lines in the file.
        int lines = 0;
        while (bf1.readLine() != null) lines++;
        bf1.close();

        //Creating an ArrayList to store the player data as its own ArrayList as well as a
        //temporary ArrayList to hold the current players data.
        ArrayList<String> playerDataRow = new ArrayList<String>();
        ArrayList<String> tempRow = new ArrayList<String>();

        String line;// = bf.readLine();
        String item = "";

        //Creating a buffered reader to read from the csv for player data.
        //BufferedReader bf = new BufferedReader(
                //new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\testplayers.csv"));

        BufferedReader bf = new BufferedReader(
                new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\PlayerData2.csv"));

        //A for loop that goes through each line of the csv file.
        for (int j = 0; j < lines; j++) {
            line = bf.readLine();

            //A for loop that goes through each character in the line to add to the
            //temporary Arraylist.
            for (int i = 0; i < line.length(); i++) {
                //String item = "";

                //A for loop that checks if the line is at the end of the current element or
                //at the end of the line, whilst also adding the characters in the line to
                //the temporary ArrayList.
                if (line.charAt(i) == ',') {
                    tempRow.add(item);
                    item = "";

                } else if ((i + 1) == line.length()) {
                    item += String.valueOf(line.charAt(i));
                    tempRow.add(item);
                    item = "";

                } else {
                    item += String.valueOf(line.charAt(i));

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the main ArrayList.
            playerDataRow = (ArrayList<String>)tempRow.clone();
            playerData.add(playerDataRow);
            tempRow.clear();

        }

        bf.close();

        //TEMPORARY - FOR PRINTING ELEMENTS OF ARRAYLIST LINE BY LINE
        for (ArrayList element : playerData) {
            //System.out.println(element);
        }

        //Checking if the query wants all player data or specific data.
        if (querySubject.equalsIgnoreCase("all") || querySearch.equalsIgnoreCase("all")) {
            return playerData;

        } else {

            //Finding the column of the search subject.
            int indexOfSubject = -1;
            ArrayList<ArrayList<String>> returnData = new ArrayList<ArrayList<String>>();

            ArrayList<String> returnElement = new ArrayList<String>();
            ArrayList<String> tempElement = new ArrayList<String>();

            //For loop going through rows in the data.
            for (ArrayList element : playerData) {

                //For loop going through columns in the data.
                for (int i = 0; i < element.size(); i++) {

                    //Finding a match and recording the index.
                    if (querySubject.equalsIgnoreCase(String.valueOf(element.get(i)))) {
                        indexOfSubject = i;

                    }

                }

            }

            for (ArrayList element : playerData) {

                for (int i = 0; i < element.size(); i++) {

                    if (querySearch.equalsIgnoreCase(String.valueOf(element.get(i)))) {
                        returnData.add(element);

                    }

                }

            }

            //TEMPORARY - FOR PRINTING ELEMENTS OF ARRAYLIST LINE BY LINE
            for (ArrayList element : returnData) {
                //System.out.println(element);
            }

            return returnData;

        }

    }

    public static ArrayList<String> getColumnFromData(ArrayList<ArrayList<String>> data, String querySubject) throws Exception{

        //Importing full data to find the index of the queried column.
        ArrayList<ArrayList<String>> fullData = readFile("all", "all");

       //Finding the column of the search subject.
        int indexOfSubject = -1;

        //The return data ArrayList.
        ArrayList<String> returnData = new ArrayList<String>();

        //For loop going through rows in the data to find what the index of queried column is.
        for (ArrayList element : fullData) {

            //For loop going through columns in the data.
            for (int i = 0; i < element.size(); i++) {

                //Finding a match and recording the index.
                if (querySubject.equalsIgnoreCase(String.valueOf(element.get(i)))) {
                    indexOfSubject = i;

                }

            }

        }

        //Adding the queried data to an ArrayList.
        for (ArrayList element : data) {
            returnData.add(String.valueOf(element.get(indexOfSubject)));

        }

        return returnData;

    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private static class MyItemListener implements ItemListener {

        private boolean chipSelected = false;

        @Override
        public void itemStateChanged(ItemEvent e) {
            int state = e.getStateChange();


            if (state == ItemEvent.SELECTED) {
                chipSelected = true;
            } else {
                chipSelected = false;
            }

        }

        public boolean getChipSelected() {
            return chipSelected;
        }

    }

}
