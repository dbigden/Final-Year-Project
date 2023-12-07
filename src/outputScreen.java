import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class outputScreen {

    public static void main(String args[]) throws Exception {
        ArrayList<String> players = new ArrayList<>(
                Arrays.asList("A.Becker, Liverpool", "Leno, Fulham", "Walker, Man City",
                        "Saliba, Arsenal",  "Romero, Spurs", "Udogie, Spurs", "Virgil, Liverpool",
                        "Son, Spurs", "Salah, Liverpool", "De Bruyne, Man City", "Maddison, Spurs",
                        "Bentancur, Spurs", "Haaland, Man City", "Watkins, Aston Villa",
                        "Mbeumo, Brentford"));

        outputScreen(players);

    }

    public static void outputScreen(ArrayList<String> players) throws Exception {
        //Creating the window.
        JFrame outputFrame = new JFrame("FPL Optimiser");

        //Preventing the window from being resizeable.
        outputFrame.setResizable(false);

        //Setting the layout.
        outputFrame.setLayout(null);

        //Setting window background colour.
        outputFrame.getContentPane().setBackground(Color.decode("#38003C"));

        //Stops the application when the window is closed.
        outputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the size of the window to 75% of the users screen size.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double windowWidth = screenWidth * 0.75;
        int screenWidthInt = (int)windowWidth;

        double screenHeight = screenSize.getHeight();
        double windowHeight = screenHeight * 0.75;
        int screenHeightInt = (int)windowHeight;

        outputFrame.setPreferredSize(new Dimension(screenWidthInt, screenHeightInt));
        outputFrame.pack();

        //Puts the window in the middle of the screen.
        outputFrame.setLocationRelativeTo(null);

        //Making the window visible.
        outputFrame.setVisible(true);

        //Adding a pitch background image.
        JLayeredPane pitchPane = new JLayeredPane();
        JLabel pitch = new JLabel("");
        pitch.setBounds(25, 20, 1500, 1000);
        pitchPane.add(pitch, JLayeredPane.DEFAULT_LAYER);
        pitch.setVisible(true);
        pitchPane.setVisible(true);
        pitchPane.setBounds(0, 0, 1960, 1080);
        pitch.setIcon(new ImageIcon("C:\\Users\\Daniel\\IdeaProjects\\FYP\\pitch.png"));
        outputFrame.add(pitchPane);

        //Creating slots for players to potentially fill.
        //Goalkeepers.
        JLabel gk1 = new JLabel("gk1");
        gk1.setBounds(560, 180, 150, 50);
        gk1.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(gk1, JLayeredPane.PALETTE_LAYER);

        JLabel gk2 = new JLabel("gk2");
        gk2.setBounds(795, 180, 150, 50);
        gk2.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(gk2, JLayeredPane.PALETTE_LAYER);

        //Defenders.
        //Options:
        // - 3, 5 and 7
        // - 2, 4, 6 and 8
        // - 1, 3, 5, 7 and 9
        JLabel df1 = new JLabel("df1");
        df1.setBounds(320, 320, 150, 50);
        df1.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df1, JLayeredPane.PALETTE_LAYER);

        JLabel df2 = new JLabel("df2");
        df2.setBounds(410, 320, 150, 50);
        df2.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df2, JLayeredPane.PALETTE_LAYER);

        JLabel df3 = new JLabel("df3");
        df3.setBounds(500, 320, 150, 50);
        df3.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df3, JLayeredPane.PALETTE_LAYER);

        JLabel df4 = new JLabel("df4");
        df4.setBounds(590, 320, 150, 50);
        df4.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df4, JLayeredPane.PALETTE_LAYER);

        JLabel df5 = new JLabel("df5");
        df5.setBounds(680, 320, 150, 50);
        df5.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df5, JLayeredPane.PALETTE_LAYER);

        JLabel df6 = new JLabel("df6");
        df6.setBounds(770, 320, 150, 50);
        df6.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df6, JLayeredPane.PALETTE_LAYER);

        JLabel df7 = new JLabel("df7");
        df7.setBounds(860, 320, 150, 50);
        df7.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df7, JLayeredPane.PALETTE_LAYER);

        JLabel df8 = new JLabel("df8");
        df8.setBounds(950, 320, 150, 50);
        df8.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df8, JLayeredPane.PALETTE_LAYER);

        JLabel df9 = new JLabel("df9");
        df9.setBounds(1040, 320, 150, 50);
        df9.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(df9, JLayeredPane.PALETTE_LAYER);

        //Midfielders.
        //Options:
        // - 4 and 6
        // - 3, 5 and 7
        // - 2, 4, 6 and 8
        // - 1, 3, 5, 7 and 9
        JLabel mf1 = new JLabel("mf1");
        mf1.setBounds(320, 480, 150, 50);
        mf1.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf1, JLayeredPane.PALETTE_LAYER);

        JLabel mf2 = new JLabel("mf2");
        mf2.setBounds(410, 480, 150, 50);
        mf2.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf2, JLayeredPane.PALETTE_LAYER);

        JLabel mf3 = new JLabel("mf3");
        mf3.setBounds(500, 480, 150, 50);
        mf3.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf3, JLayeredPane.PALETTE_LAYER);

        JLabel mf4 = new JLabel("mf4");
        mf4.setBounds(590, 480, 150, 50);
        mf4.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf4, JLayeredPane.PALETTE_LAYER);

        JLabel mf5 = new JLabel("mf5");
        mf5.setBounds(680, 480, 150, 50);
        mf5.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf5, JLayeredPane.PALETTE_LAYER);

        JLabel mf6 = new JLabel("mf6");
        mf6.setBounds(770, 480, 150, 50);
        mf6.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf6, JLayeredPane.PALETTE_LAYER);

        JLabel mf7 = new JLabel("mf7");
        mf7.setBounds(860, 480, 150, 50);
        mf7.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf7, JLayeredPane.PALETTE_LAYER);

        JLabel mf8 = new JLabel("mf8");
        mf8.setBounds(950, 480, 150, 50);
        mf8.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf8, JLayeredPane.PALETTE_LAYER);

        JLabel mf9 = new JLabel("mf9");
        mf9.setBounds(1040, 480, 150, 50);
        mf9.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(mf9, JLayeredPane.PALETTE_LAYER);

        //Forwards.
        //Options:
        // - 3
        // - 2 and 4
        // - 1, 3 and 5
        JLabel fw1 = new JLabel("fw1");
        fw1.setBounds(500, 640, 150, 50);
        fw1.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(fw1, JLayeredPane.PALETTE_LAYER);

        JLabel fw2 = new JLabel("fw2");
        fw2.setBounds(590, 640, 150, 50);
        fw2.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(fw2, JLayeredPane.PALETTE_LAYER);

        JLabel fw3 = new JLabel("fw3");
        fw3.setBounds(680, 640, 150, 50);
        fw3.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(fw3, JLayeredPane.PALETTE_LAYER);

        JLabel fw4 = new JLabel("fw4");
        fw4.setBounds(770, 640, 150, 50);
        fw4.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(fw4, JLayeredPane.PALETTE_LAYER);

        JLabel fw5 = new JLabel("fw5");
        fw5.setBounds(860, 640, 150, 50);
        fw5.setHorizontalAlignment(SwingConstants.CENTER);
        pitchPane.add(fw5, JLayeredPane.PALETTE_LAYER);

        //Working out which players will start in the team.
        //Getting the full player data.
        ArrayList<ArrayList<String>> playerData = teamScreen.readFile("all", "all");

        //Holding the full data of the selected players.
        ArrayList<ArrayList<String>> selectedPlayerData = new ArrayList<ArrayList<String>>();

        int nameIndex = -1;
        int teamIndex = -1;
        int ICT_Index = -1;
        int pointsIndex = -1;
        int costIndex = -1;
        int formIndex = -1;
        int pointsPerGameIndex = -1;
        //For loop going through rows in the data to find what the index of the desired column is.
        for (ArrayList element : playerData) {

            //For loop going through columns in the data.
            for (int i = 0; i < element.size(); i++) {

                //Finding a match and recording the index of the name column.
                if (String.valueOf(element.get(i)).equalsIgnoreCase("name")) {
                    nameIndex = i;

                //Finding a match and recording the index of the team column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("team")) {
                    teamIndex = i;

                //Finding a match and recording the index of the ICT index column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("ict index")) {
                    ICT_Index = i;

                //Finding a match and recording the index of the points column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("total points")) {
                    pointsIndex = i;

                //Finding a match and recording the index of the cost column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("current price")) {
                    costIndex = i;

                //Finding a match and recording the index of the form column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("form")) {
                    formIndex = i;

                //Finding a match and recording the index of the points per game column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("points per game")) {
                    pointsPerGameIndex = i;

                }

            }

        }

        //Splitting the selected players to separate the name and the team.
        ArrayList<String> playerNames = new ArrayList<String>();
        ArrayList<String> playerTeams = new ArrayList<String>();

        for (int i = 0; i < players.size(); i++) {

            String currentPlayer = players.get(i);
            String[] split = currentPlayer.split(", ");
            playerNames.add(split[0]);
            playerTeams.add(split[1]);

        }

        //Finding name matches then adding their file to the ArrayList.
        for (int i = 0; i < players.size(); i++) {

            for (ArrayList element : playerData) {

                //Finding a name match.
                if (String.valueOf(element.get(nameIndex)).equalsIgnoreCase(playerNames.get(i))) {

                    //Making sure the players team also matches.
                    if (String.valueOf(element.get(teamIndex)).equalsIgnoreCase(playerTeams.get(i))) {

                        selectedPlayerData.add(element);

                    }

                }

            }

       }

        //Calculating how valuable a player is.
        //Average ranking of multiple metrics:
        // - ICT
        // - (Total Points / Cost) * Total Points
        // - Form
        // - Points Per Game

        //Storing player rankings of selected players.
        ArrayList<ArrayList<String>> selectedPlayersRanked = rankings(selectedPlayerData, nameIndex,
                ICT_Index, pointsIndex, costIndex, formIndex, pointsPerGameIndex);

        /*//Sorting selected player data by ICT.
        ArrayList<ArrayList<String>> selectedSorted_ICT = sortData(selectedPlayerData, ICT_Index);

        //Creating an ArrayList to store the player ranking data as its own ArrayList as well as a
        //temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerArrList = new ArrayList<String>();
        ArrayList<String> tempPlayerArrList = new ArrayList<String>();
        ArrayList<ArrayList<String>> playerRanking = new ArrayList<ArrayList<String>>();

        //A for loop that goes through each row of the ArrayList.
        int rank = 1;
        for (ArrayList element : selectedSorted_ICT) {

            //A for loop that goes through each column of the Arraylist.
            for (int i = 0; i < element.size(); i++) {

                //A for loop that adds the name, ICT index and ICT ranking to the temporary ArrayList.
                if (i == nameIndex) {
                    tempPlayerArrList.add(String.valueOf(element.get(i)));

                } else if (i == ICT_Index){
                    tempPlayerArrList.add(String.valueOf(element.get(i)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank + 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the main ArrayList.
            playerArrList = (ArrayList<String>)tempPlayerArrList.clone();
            playerRanking.add(playerArrList);
            tempPlayerArrList.clear();

        }

        for (ArrayList element : playerRanking) {
            System.out.println(element);
        }*/

        for (ArrayList element : selectedPlayersRanked) {
            System.out.println(element);
        }

        //Adding the starting players to the team.
        int




    }

    public static ArrayList<ArrayList<String>> sortData(ArrayList<ArrayList<String>> records, int col) {

        Comparator<ArrayList<String>> comparator = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {

                try {
                    Double num1 = Double.parseDouble(o1.get(col));
                    Double num2 = Double.parseDouble(o2.get(col));

                    return num1.compareTo(num2);

                } catch (Exception e) {
                    return o1.get(col).compareTo(o2.get(col));

                }

            }
        };

        Collections.sort(records, comparator);
        Collections.reverse(records);

        return records;

    }

    public static ArrayList<ArrayList<String>> rankings(ArrayList<ArrayList<String>> playerData,
                                                        int nameIndex, int ICT_Index, int pointsIndex,
                                                        int costIndex, int formIndex,
                                                        int pointsPerGameIndex) {

        //Sorting selected player data by ICT.
        ArrayList<ArrayList<String>> selectedSorted_ICT = sortData(playerData, ICT_Index);

        //Creating an ArrayList to store the player ranking data as its own ArrayList as well as a
        //temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerArrList = new ArrayList<String>();
        ArrayList<String> tempPlayerArrList = new ArrayList<String>();
        ArrayList<ArrayList<String>> playerRanking = new ArrayList<ArrayList<String>>();

        //A for loop that goes through each row of the ArrayList.
        int rank = 1;
        for (ArrayList element : selectedSorted_ICT) {

            //A for loop that goes through each column of the Arraylist.
            for (int i = 0; i < element.size(); i++) {

                //A for loop that adds the name, ICT index and ICT ranking to the temporary ArrayList.
                if (i == nameIndex) {
                    tempPlayerArrList.add(String.valueOf(element.get(i)));

                } else if (i == ICT_Index){
                    tempPlayerArrList.add(String.valueOf(element.get(i)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank + 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the main ArrayList.
            playerArrList = (ArrayList<String>)tempPlayerArrList.clone();
            playerRanking.add(playerArrList);
            tempPlayerArrList.clear();

        }

        //

        return playerRanking;
    }

}
