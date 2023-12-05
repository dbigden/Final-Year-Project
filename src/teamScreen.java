import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        //String[] gks = {"Select a player", "Alisson", "Ederson", "Leno", "Vicario", "Ramsdale", "Raya"};
        //String[] dfs = {"Select a player", "Romero", "VVD", "Saliba", "Silva", "VDV", "Trippier"};
        //String[] mfs = {"Select a player", "De Bruyne", "Maddison", "Rice", "Casemiro", "Salah", "Enzo"};
        //String[] ats = {"Select a player", "Son", "Watkins", "Haaland", "Isak"};

        //Getting all goalkeepers names for the dropdown box.
        ArrayList<ArrayList<String>> gks = readFile("position", "goalkeeper");
        ArrayList<String> gkNames = getColumnFromData(gks, "name");

        //Getting all defenders names for the dropdown box.
        ArrayList<ArrayList<String>> dfs = readFile("position", "defender");
        ArrayList<String> dfNames = getColumnFromData(dfs, "name");

        //Getting all midfielders names for the dropdown box.
        ArrayList<ArrayList<String>> mfs = readFile("position", "midfielder");
        ArrayList<String> mfNames = getColumnFromData(mfs, "name");

        //Getting all defenders names for the dropdown box.
        ArrayList<ArrayList<String>> fws = readFile("position", "forward");
        ArrayList<String> fwNames = getColumnFromData(fws, "name");

        //JComboBox gk1 = new JComboBox(gks);
        JComboBox gk1 = new JComboBox(gkNames.toArray());
        //String gk1Selection = gks[0];
        JComboBox gk2 = new JComboBox(gkNames.toArray());
        //String gk2Selection = gks[0];

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
        JComboBox df1 = new JComboBox(dfNames.toArray());
        df1.setBounds(320, 320, 150, 50);
        pitchPane.add(df1, JLayeredPane.PALETTE_LAYER);

        JComboBox df2 = new JComboBox(dfNames.toArray());
        df2.setBounds(500, 320, 150, 50);
        pitchPane.add(df2, JLayeredPane.PALETTE_LAYER);

        JComboBox df3 = new JComboBox(dfNames.toArray());
        df3.setBounds(680, 320, 150, 50);
        pitchPane.add(df3, JLayeredPane.PALETTE_LAYER);

        JComboBox df4 = new JComboBox(dfNames.toArray());

        df4.setBounds(860, 320, 150, 50);
        pitchPane.add(df4, JLayeredPane.PALETTE_LAYER);

        JComboBox df5 = new JComboBox(dfNames.toArray());
        df5.setBounds(1040, 320, 150, 50);
        pitchPane.add(df5, JLayeredPane.PALETTE_LAYER);

        //Midfielders.
        JComboBox mf1 = new JComboBox(mfNames.toArray());
        mf1.setBounds(320, 480, 150, 50);
        pitchPane.add(mf1, JLayeredPane.PALETTE_LAYER);

        JComboBox mf2 = new JComboBox(mfNames.toArray());
        mf2.setBounds(500, 480, 150, 50);
        pitchPane.add(mf2, JLayeredPane.PALETTE_LAYER);

        JComboBox mf3 = new JComboBox(mfNames.toArray());
        mf3.setBounds(680, 480, 150, 50);
        pitchPane.add(mf3, JLayeredPane.PALETTE_LAYER);

        JComboBox mf4 = new JComboBox(mfNames.toArray());
        mf4.setBounds(860, 480, 150, 50);
        pitchPane.add(mf4, JLayeredPane.PALETTE_LAYER);

        JComboBox mf5 = new JComboBox(mfNames.toArray());
        mf5.setBounds(1040, 480, 150, 50);
        pitchPane.add(mf5, JLayeredPane.PALETTE_LAYER);

        //Attackers.
        JComboBox fw1 = new JComboBox(fwNames.toArray());
        fw1.setBounds(500, 640, 150, 50);
        pitchPane.add(fw1, JLayeredPane.PALETTE_LAYER);

        JComboBox fw2 = new JComboBox(fwNames.toArray());
        fw2.setBounds(680, 640, 150, 50);
        pitchPane.add(fw2, JLayeredPane.PALETTE_LAYER);

        JComboBox fw3 = new JComboBox(fwNames.toArray());
        fw3.setBounds(860, 640, 150, 50);
        pitchPane.add(fw3, JLayeredPane.PALETTE_LAYER);

        //Adding a text box for users to state the number of free transfers they have.
        JLabel freeTransfers = new JLabel("Free transfers available:");
        freeTransfers.setBounds(1460, 0, 400, 100);
        freeTransfers.setFont(new Font("Calibri", Font.BOLD, 40));
        freeTransfers.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(freeTransfers, JLayeredPane.PALETTE_LAYER);

        JSpinner freeTransferNumber = new JSpinner();
        freeTransferNumber.setBounds(1460, 100, 400, 50);
        freeTransferNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        freeTransferNumber.setForeground(Color.decode("#000000"));
        pitchPane.add(freeTransferNumber, JLayeredPane.PALETTE_LAYER);

        //Adding a text box for users to state the number of free transfers they have.
        JLabel budget = new JLabel("Budget remaining:");
        budget.setBounds(1460, 300, 400, 100);
        budget.setFont(new Font("Calibri", Font.BOLD, 40));
        budget.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(budget, JLayeredPane.PALETTE_LAYER);

        JSpinner budgetNumber = new JSpinner();
        budgetNumber.setBounds(1460, 400, 400, 50);
        budgetNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        budgetNumber.setForeground(Color.decode("#000000"));
        pitchPane.add(budgetNumber, JLayeredPane.PALETTE_LAYER);



        //Adding a button that checks your team is valid.
        JButton submitButton = new JButton("Submit team");
        submitButton.setBounds(1470, 920, 400, 100);
        submitButton.setFont(new Font("Calibri Light", Font.BOLD, 50));
        submitButton.setBackground(Color.decode("#00FF85"));
        submitButton.setForeground(Color.decode("#38003C"));
        pitchPane.add(submitButton, JLayeredPane.PALETTE_LAYER);

        //Test code for errors in team.
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Error", "Team Error", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(gk1.getSelectedItem());

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

                System.out.println(players);

                for (int i = 0; i < players.size(); i++) {

                    //Ending the comparisons if at the last item in array.
                    if (i + 1 == players.size()) {
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
                new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\PlayerData.csv"));

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
                new FileReader("C:\\Users\\Daniel\\IdeaProjects\\FYP\\PlayerData.csv"));

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

}
