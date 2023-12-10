import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

public class outputScreen {

    public static void main(String args[]) throws Exception {
        ArrayList<String> players = new ArrayList<>(
                Arrays.asList("A.Becker, Liverpool", "Leno, Fulham", "Chambers, Liverpool",
                        "Saliba, Arsenal",  "Romero, Spurs", "Chambers, Aston Villa", "Virgil, Liverpool",
                        "Son, Spurs", "Salah, Liverpool", "Bernardo, Man City", "Maddison, Spurs",
                        "Bentancur, Spurs", "Haaland, Man City", "Watkins, Aston Villa",
                        "J.Alvarez, Man City"));


        //"Udogie, Spurs"
        //"Walker, Man City"
        outputScreen(players, 2, 0.6);

    }

    public static void outputScreen(ArrayList<String> players, int freeTransfers, double budget) throws Exception {
        //Creating the window.
        JFrame outputFrame = new JFrame("FPL Optimiser");

        //Setting the icon image.
        outputFrame.setIconImage(new ImageIcon("C:\\Users\\Daniel\\" +
                "IdeaProjects\\FYP\\fpl logo.png").getImage());

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
        //Goalkeeper.
        JLabel gk1 = new JLabel("gk1");
        gk1.setBounds(680, 180, 150, 50);
        gk1.setHorizontalAlignment(SwingConstants.CENTER);
        gk1.setBackground(Color.decode("#38003C"));
        gk1.setFont(new Font("Calibri", Font.BOLD, 15));
        gk1.setForeground(Color.decode("#FFFFFF"));
        gk1.setOpaque(true);
        pitchPane.add(gk1, JLayeredPane.PALETTE_LAYER);

        //Defenders.
        //Options:
        // - 3, 5 and 7
        // - 2, 4, 6 and 8
        // - 1, 3, 5, 7 and 9
        JLabel df1 = new JLabel("df1");
        df1.setBounds(320, 320, 150, 50);
        df1.setHorizontalAlignment(SwingConstants.CENTER);
        df1.setBackground(Color.decode("#38003C"));
        df1.setFont(new Font("Calibri", Font.BOLD, 15));
        df1.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df1, JLayeredPane.PALETTE_LAYER);

        JLabel df2 = new JLabel("df2");
        df2.setBounds(410, 320, 150, 50);
        df2.setHorizontalAlignment(SwingConstants.CENTER);
        df2.setBackground(Color.decode("#38003C"));
        df2.setFont(new Font("Calibri", Font.BOLD, 15));
        df2.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df2, JLayeredPane.PALETTE_LAYER);

        JLabel df3 = new JLabel("df3");
        df3.setBounds(500, 320, 150, 50);
        df3.setHorizontalAlignment(SwingConstants.CENTER);
        df3.setBackground(Color.decode("#38003C"));
        df3.setFont(new Font("Calibri", Font.BOLD, 15));
        df3.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df3, JLayeredPane.PALETTE_LAYER);

        JLabel df4 = new JLabel("df4");
        df4.setBounds(590, 320, 150, 50);
        df4.setHorizontalAlignment(SwingConstants.CENTER);
        df4.setBackground(Color.decode("#38003C"));
        df4.setFont(new Font("Calibri", Font.BOLD, 15));
        df4.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df4, JLayeredPane.PALETTE_LAYER);

        JLabel df5 = new JLabel("df5");
        df5.setBounds(680, 320, 150, 50);
        df5.setHorizontalAlignment(SwingConstants.CENTER);
        df5.setBackground(Color.decode("#38003C"));
        df5.setFont(new Font("Calibri", Font.BOLD, 15));
        df5.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df5, JLayeredPane.PALETTE_LAYER);

        JLabel df6 = new JLabel("df6");
        df6.setBounds(770, 320, 150, 50);
        df6.setHorizontalAlignment(SwingConstants.CENTER);
        df6.setBackground(Color.decode("#38003C"));
        df6.setFont(new Font("Calibri", Font.BOLD, 15));
        df6.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df6, JLayeredPane.PALETTE_LAYER);

        JLabel df7 = new JLabel("df7");
        df7.setBounds(860, 320, 150, 50);
        df7.setHorizontalAlignment(SwingConstants.CENTER);
        df7.setBackground(Color.decode("#38003C"));
        df7.setFont(new Font("Calibri", Font.BOLD, 15));
        df7.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df7, JLayeredPane.PALETTE_LAYER);

        JLabel df8 = new JLabel("df8");
        df8.setBounds(950, 320, 150, 50);
        df8.setHorizontalAlignment(SwingConstants.CENTER);
        df8.setBackground(Color.decode("#38003C"));
        df8.setFont(new Font("Calibri", Font.BOLD, 15));
        df8.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(df8, JLayeredPane.PALETTE_LAYER);

        JLabel df9 = new JLabel("df9");
        df9.setBounds(1040, 320, 150, 50);
        df9.setHorizontalAlignment(SwingConstants.CENTER);
        df9.setBackground(Color.decode("#38003C"));
        df9.setFont(new Font("Calibri", Font.BOLD, 15));
        df9.setForeground(Color.decode("#FFFFFF"));
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
        mf1.setBackground(Color.decode("#38003C"));
        mf1.setFont(new Font("Calibri", Font.BOLD, 15));
        mf1.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf1, JLayeredPane.PALETTE_LAYER);

        JLabel mf2 = new JLabel("mf2");
        mf2.setBounds(410, 480, 150, 50);
        mf2.setHorizontalAlignment(SwingConstants.CENTER);
        mf2.setBackground(Color.decode("#38003C"));
        mf2.setFont(new Font("Calibri", Font.BOLD, 15));
        mf2.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf2, JLayeredPane.PALETTE_LAYER);

        JLabel mf3 = new JLabel("mf3");
        mf3.setBounds(500, 480, 150, 50);
        mf3.setHorizontalAlignment(SwingConstants.CENTER);
        mf3.setBackground(Color.decode("#38003C"));
        mf3.setFont(new Font("Calibri", Font.BOLD, 15));
        mf3.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf3, JLayeredPane.PALETTE_LAYER);

        JLabel mf4 = new JLabel("mf4");
        mf4.setBounds(590, 480, 150, 50);
        mf4.setHorizontalAlignment(SwingConstants.CENTER);
        mf4.setBackground(Color.decode("#38003C"));
        mf4.setFont(new Font("Calibri", Font.BOLD, 15));
        mf4.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf4, JLayeredPane.PALETTE_LAYER);

        JLabel mf5 = new JLabel("mf5");
        mf5.setBounds(680, 480, 150, 50);
        mf5.setHorizontalAlignment(SwingConstants.CENTER);
        mf5.setBackground(Color.decode("#38003C"));
        mf5.setFont(new Font("Calibri", Font.BOLD, 15));
        mf5.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf5, JLayeredPane.PALETTE_LAYER);

        JLabel mf6 = new JLabel("mf6");
        mf6.setBounds(770, 480, 150, 50);
        mf6.setHorizontalAlignment(SwingConstants.CENTER);
        mf6.setBackground(Color.decode("#38003C"));
        mf6.setFont(new Font("Calibri", Font.BOLD, 15));
        mf6.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf6, JLayeredPane.PALETTE_LAYER);

        JLabel mf7 = new JLabel("mf7");
        mf7.setBounds(860, 480, 150, 50);
        mf7.setHorizontalAlignment(SwingConstants.CENTER);
        mf7.setBackground(Color.decode("#38003C"));
        mf7.setFont(new Font("Calibri", Font.BOLD, 15));
        mf7.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf7, JLayeredPane.PALETTE_LAYER);

        JLabel mf8 = new JLabel("mf8");
        mf8.setBounds(950, 480, 150, 50);
        mf8.setHorizontalAlignment(SwingConstants.CENTER);
        mf8.setBackground(Color.decode("#38003C"));
        mf8.setFont(new Font("Calibri", Font.BOLD, 15));
        mf8.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf8, JLayeredPane.PALETTE_LAYER);

        JLabel mf9 = new JLabel("mf9");
        mf9.setBounds(1040, 480, 150, 50);
        mf9.setHorizontalAlignment(SwingConstants.CENTER);
        mf9.setBackground(Color.decode("#38003C"));
        mf9.setFont(new Font("Calibri", Font.BOLD, 15));
        mf9.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(mf9, JLayeredPane.PALETTE_LAYER);

        //Forwards.
        //Options:
        // - 3
        // - 2 and 4
        // - 1, 3 and 5
        JLabel fw1 = new JLabel("fw1");
        fw1.setBounds(500, 640, 150, 50);
        fw1.setHorizontalAlignment(SwingConstants.CENTER);
        fw1.setBackground(Color.decode("#38003C"));
        fw1.setFont(new Font("Calibri", Font.BOLD, 15));
        fw1.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(fw1, JLayeredPane.PALETTE_LAYER);

        JLabel fw2 = new JLabel("fw2");
        fw2.setBounds(590, 640, 150, 50);
        fw2.setHorizontalAlignment(SwingConstants.CENTER);
        fw2.setBackground(Color.decode("#38003C"));
        fw2.setFont(new Font("Calibri", Font.BOLD, 15));
        fw2.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(fw2, JLayeredPane.PALETTE_LAYER);

        JLabel fw3 = new JLabel("fw3");
        fw3.setBounds(680, 640, 150, 50);
        fw3.setHorizontalAlignment(SwingConstants.CENTER);
        fw3.setBackground(Color.decode("#38003C"));
        fw3.setFont(new Font("Calibri", Font.BOLD, 15));
        fw3.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(fw3, JLayeredPane.PALETTE_LAYER);

        JLabel fw4 = new JLabel("fw4");
        fw4.setBounds(770, 640, 150, 50);
        fw4.setHorizontalAlignment(SwingConstants.CENTER);
        fw4.setBackground(Color.decode("#38003C"));
        fw4.setFont(new Font("Calibri", Font.BOLD, 15));
        fw4.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(fw4, JLayeredPane.PALETTE_LAYER);

        JLabel fw5 = new JLabel("fw5");
        fw5.setBounds(860, 640, 150, 50);
        fw5.setHorizontalAlignment(SwingConstants.CENTER);
        fw5.setBackground(Color.decode("#38003C"));
        fw5.setFont(new Font("Calibri", Font.BOLD, 15));
        fw5.setForeground(Color.decode("#FFFFFF"));
        pitchPane.add(fw5, JLayeredPane.PALETTE_LAYER);

        //Subs.
        JLabel gkSub = new JLabel("gkSub");
        gkSub.setBounds(1190, 180, 150, 50);
        gkSub.setHorizontalAlignment(SwingConstants.CENTER);
        gkSub.setBackground(Color.decode("#38003C"));
        gkSub.setFont(new Font("Calibri", Font.BOLD, 15));
        gkSub.setForeground(Color.decode("#FFFFFF"));
        gkSub.setOpaque(true);
        pitchPane.add(gkSub, JLayeredPane.PALETTE_LAYER);

        JLabel sub1 = new JLabel("sub1");
        sub1.setBounds(1215, 250, 150, 50);
        sub1.setHorizontalAlignment(SwingConstants.CENTER);
        sub1.setBackground(Color.decode("#38003C"));
        sub1.setFont(new Font("Calibri", Font.BOLD, 15));
        sub1.setForeground(Color.decode("#FFFFFF"));
        sub1.setOpaque(true);
        pitchPane.add(sub1, JLayeredPane.PALETTE_LAYER);

        JLabel sub2 = new JLabel("sub2");
        sub2.setBounds(1242, 320, 150, 50);
        sub2.setHorizontalAlignment(SwingConstants.CENTER);
        sub2.setBackground(Color.decode("#38003C"));
        sub2.setFont(new Font("Calibri", Font.BOLD, 15));
        sub2.setForeground(Color.decode("#FFFFFF"));
        sub2.setOpaque(true);
        pitchPane.add(sub2, JLayeredPane.PALETTE_LAYER);

        JLabel sub3 = new JLabel("sub3");
        sub3.setBounds(1270, 390, 150, 50);
        sub3.setHorizontalAlignment(SwingConstants.CENTER);
        sub3.setBackground(Color.decode("#38003C"));
        sub3.setFont(new Font("Calibri", Font.BOLD, 15));
        sub3.setForeground(Color.decode("#FFFFFF"));
        sub3.setOpaque(true);
        pitchPane.add(sub3, JLayeredPane.PALETTE_LAYER);

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
        int positionIndex = -1;
        int availabilityIndex = -1;
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

                //Finding a match and recording the index of the position column.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("position")) {
                    positionIndex = i;

                //Finding a match and recording the index of the availability.
                } else if (String.valueOf(element.get(i)).equalsIgnoreCase("chance of playing")) {
                    availabilityIndex = i;

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
        // - Form
        // - Points Per Game
        // - (Total Points / Cost) * Total Points

        //Storing player rankings of selected players.
        ArrayList<ArrayList<String>> selectedPlayersRanked = rankings(selectedPlayerData, nameIndex,
                teamIndex, positionIndex, ICT_Index, pointsIndex, costIndex, formIndex, pointsPerGameIndex);



        for (ArrayList element : selectedPlayersRanked) {
            //System.out.println(element);
        }

        //Storing player ranking of all players.
        ArrayList<ArrayList<String>> allPlayersRanked = rankings(playerData, nameIndex,
                teamIndex, positionIndex, ICT_Index, pointsIndex, costIndex, formIndex, pointsPerGameIndex);

        for (ArrayList element : allPlayersRanked) {
            //System.out.println(element);
        }


        //Transfers.
        //Checking if the user has any free transfers.
        ArrayList<ArrayList<String>> transfers = new ArrayList<ArrayList<String>>();

        if (freeTransfers != 0) {

            for (int i = 0; i < freeTransfers; i++) {

                //Checking if there is still budget left.
                if (budget > 0) {

                    ArrayList<String> bestTransfer = bestAvailableTransfer(selectedPlayersRanked,
                            allPlayersRanked, playerData, nameIndex, teamIndex, positionIndex, costIndex, availabilityIndex, budget);

                    transfers.add(bestTransfer);

                    if (bestTransfer != null) {

                        //Updating the budget with the new transfer.
                        budget = Double.parseDouble(String.valueOf(bestTransfer.get(12)));
                        budget = round(budget, 1);

                    }

                }

            }

        }

        //Creating an ArrayList to add the current players details to.
        ArrayList<ArrayList<String>> finalPlayers = new ArrayList<ArrayList<String>>();

        //Making the transfers.
        //A for loop that goes through all rows in the ranked ArrayList of selected players.
        for (ArrayList playerInfo : selectedPlayersRanked) {

            boolean transferMade = false;

            //A for loop that goes through all rows in the transfers ArrayList.
            for (ArrayList transferPlayer : transfers) {

                //Checking if the current selected player and player to be transferred out match.
                if (playerInfo.get(nameIndex).equals(transferPlayer.get(6)) &&
                        playerInfo.get(positionIndex).equals(transferPlayer.get(7))) {

                    //A for loop that goes through all rows in the full ranking ArrayList.
                    for (ArrayList newPlayer : allPlayersRanked) {

                        //Checking if the player in the ArrayList and player to be transferred in match.
                        if (newPlayer.get(nameIndex).equals(transferPlayer.get(nameIndex)) &&
                                newPlayer.get(positionIndex).equals(transferPlayer.get(positionIndex))) {

                            finalPlayers.add(newPlayer);
                            transferMade = true;

                        }

                    }

                }

            }

            //Checking if a transfer was made, if it was skipping adding the current player.
            if (!transferMade) {

                finalPlayers.add(playerInfo);

            }

        }

        for (ArrayList player : finalPlayers) {
            //System.out.println(player);
        }

        ArrayList<ArrayList<String>> finalPlayerData = new ArrayList<ArrayList<String>>();

        for (ArrayList player : finalPlayers) {

            for (ArrayList playerInfo : playerData) {

                //Finding a name match.
                if (String.valueOf(player.get(nameIndex)).equalsIgnoreCase(String.valueOf(
                        playerInfo.get(nameIndex)))) {

                    //Making sure the players team also matches.
                    if (String.valueOf(player.get(teamIndex)).equalsIgnoreCase(String.valueOf(
                            playerInfo.get(teamIndex)))) {

                        finalPlayerData.add(playerInfo);

                    }

                }

            }

        }

        for (ArrayList player : finalPlayerData) {
            //System.out.println(player);
        }

        //Storing player ranking of all players.
        ArrayList<ArrayList<String>> finalPlayersRanked = rankings(finalPlayerData, nameIndex,
                teamIndex, positionIndex, ICT_Index, pointsIndex, costIndex, formIndex, pointsPerGameIndex);

        for (ArrayList element : finalPlayersRanked) {
            //System.out.println(element);
        }


        //Going through the ranked selected players and checking what the best possible starting team is.
        int totalCost = 0;
        String startingGk = "";
        String subGk = "";
        ArrayList<String> startingDf = new ArrayList<>();
        ArrayList<String> startingMf = new ArrayList<>();
        ArrayList<String> startingFw = new ArrayList<>();
        ArrayList<String> subs = new ArrayList<>();


//        for (ArrayList player : selectedPlayersRanked) {
        for (ArrayList player : finalPlayersRanked) {

            if (String.valueOf(player.get(positionIndex)).equalsIgnoreCase("goalkeeper")) {

                if (startingGk.equalsIgnoreCase("")) {
                    startingGk = player.get(nameIndex) + ", " + player.get(teamIndex);

                } else {
                    subGk = player.get(nameIndex) + ", " + player.get(teamIndex);

                }

            } else if (String.valueOf(player.get(positionIndex)).equalsIgnoreCase("defender")) {

                if (String.valueOf(startingDf.size()).equalsIgnoreCase("4")) {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("5")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("4")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("3")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("3")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingDf.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                } else if (String.valueOf(startingDf.size()).equalsIgnoreCase("3")) {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("5") &&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("4") &&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("3")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingDf.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                }  else {
                        startingDf.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                }

            } else if (String.valueOf(player.get(positionIndex)).equalsIgnoreCase("midfielder")) {

                if (String.valueOf(startingDf.size()).equalsIgnoreCase("5")) {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("4")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("3")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingMf.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                } else if (String.valueOf(startingDf.size()).equalsIgnoreCase("4")) {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("4")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("3")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("3")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingMf.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                } else {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("4")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("3")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingMf.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                }

            } else if (String.valueOf(player.get(positionIndex)).equalsIgnoreCase("forward")) {

                if (String.valueOf(startingDf.size()).equalsIgnoreCase("5")) {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("4") &&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("1")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("3") &&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingFw.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                } else if (String.valueOf(startingDf.size()).equalsIgnoreCase("4")) {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("5")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("1")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else if (String.valueOf(startingMf.size()).equalsIgnoreCase("4")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingFw.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                } else {

                    if (String.valueOf(startingMf.size()).equalsIgnoreCase("5")&&
                            String.valueOf(startingFw.size()).equalsIgnoreCase("2")) {
                        subs.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    } else {
                        startingFw.add(player.get(nameIndex) + ", " + player.get(teamIndex));

                    }

                }

            }

        }


        //Adding the starting players to the team.
        //Goalkeeper.
        gk1.setText(startingGk);

        //Defenders.
        if (startingDf.size() == 5) {
            df1.setText(startingDf.get(0));
            df1.setOpaque(true);
            df2.setText("");
            df3.setText(startingDf.get(1));
            df3.setOpaque(true);
            df4.setText("");
            df5.setText(startingDf.get(2));
            df5.setOpaque(true);
            df6.setText("");
            df7.setText(startingDf.get(3));
            df7.setOpaque(true);
            df8.setText("");
            df9.setText(startingDf.get(4));
            df9.setOpaque(true);

        } else if (startingDf.size() == 4) {
            df1.setText("");
            df2.setText(startingDf.get(0));
            df2.setOpaque(true);
            df3.setText("");
            df4.setText(startingDf.get(1));
            df4.setOpaque(true);
            df5.setText("");
            df6.setText(startingDf.get(2));
            df6.setOpaque(true);
            df7.setText("");
            df8.setText(startingDf.get(3));
            df8.setOpaque(true);
            df9.setText("");

        } else {
            df1.setText("");
            df2.setText("");
            df3.setText(startingDf.get(0));
            df3.setOpaque(true);
            df4.setText("");
            df5.setText(startingDf.get(1));
            df5.setOpaque(true);
            df6.setText("");
            df7.setText(startingDf.get(2));
            df7.setOpaque(true);
            df8.setText("");
            df9.setText("");

        }


        //Midfielders.
        if (startingMf.size() == 5) {
            mf1.setText(startingMf.get(0));
            mf1.setOpaque(true);
            mf2.setText("");
            mf3.setText(startingMf.get(1));
            mf3.setOpaque(true);
            mf4.setText("");
            mf5.setText(startingMf.get(2));
            mf5.setOpaque(true);
            mf6.setText("");
            mf7.setText(startingMf.get(3));
            mf7.setOpaque(true);
            mf8.setText("");
            mf9.setText(startingMf.get(4));
            mf9.setOpaque(true);

        } else if (startingMf.size() == 4) {
            mf1.setText("");
            mf2.setText(startingMf.get(0));
            mf2.setOpaque(true);
            mf3.setText("");
            mf4.setText(startingMf.get(1));
            mf4.setOpaque(true);
            mf5.setText("");
            mf6.setText(startingMf.get(2));
            mf6.setOpaque(true);
            mf7.setText("");
            mf8.setText(startingMf.get(3));
            mf8.setOpaque(true);
            mf9.setText("");

        } else if (startingMf.size() == 3) {
            mf1.setText("");
            mf2.setText("");
            mf3.setText(startingMf.get(0));
            mf3.setOpaque(true);
            mf4.setText("");
            mf5.setText(startingMf.get(1));
            mf5.setOpaque(true);
            mf6.setText("");
            mf7.setText(startingMf.get(2));
            mf7.setOpaque(true);
            mf8.setText("");
            mf9.setText("");

        } else {
            mf1.setText("");
            mf2.setText("");
            mf3.setText("");
            mf4.setText(startingMf.get(0));
            mf4.setOpaque(true);
            mf5.setText("");
            mf6.setText(startingMf.get(1));
            mf6.setOpaque(true);
            mf7.setText("");
            mf8.setText("");
            mf9.setText("");

        }

        //Forwards.
        if (startingFw.size() == 3) {
            fw1.setText(startingFw.get(0));
            fw1.setOpaque(true);
            fw2.setText("");
            fw3.setText(startingFw.get(1));
            fw3.setOpaque(true);
            fw4.setText("");
            fw5.setText(startingFw.get(2));
            fw5.setOpaque(true);

        } else if (startingFw.size() == 2) {
            fw1.setText("");
            fw2.setText(startingFw.get(0));
            fw2.setOpaque(true);
            fw3.setText("");
            fw4.setText(startingFw.get(1));
            fw4.setOpaque(true);
            fw5.setText("");

        } else {
            fw1.setText("");
            fw2.setText("");
            fw3.setText(startingFw.get(0));
            fw3.setOpaque(true);
            fw4.setText("");
            fw5.setText("");
        }

        //Subs.
        gkSub.setText(subGk);
        sub1.setText(subs.get(0));
        sub2.setText(subs.get(1));
        sub3.setText(subs.get(2));

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
                                                        int nameIndex, int teamIndex, int positionIndex,
                                                        int ICT_Index, int pointsIndex, int costIndex,
                                                        int formIndex, int pointsPerGameIndex) {

        //ICT Ranking
        //Sorting selected player data by ICT.
        ArrayList<ArrayList<String>> selectedSorted_ICT = sortData(playerData, ICT_Index);

        //Creating an ArrayList to store the player ranking data as its own ArrayList as well as a
        //temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerICT_ArrList = new ArrayList<String>();
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

                } else if (i == teamIndex){
                    tempPlayerArrList.add(String.valueOf(element.get(i)));

                } else if (i == positionIndex){
                    tempPlayerArrList.add(String.valueOf(element.get(i)));

                } else if (i == costIndex){
                    tempPlayerArrList.add(String.valueOf(element.get(i)));

                } else if (i == ICT_Index){
                    //tempPlayerArrList.add(String.valueOf(element.get(i)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank + 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the main ranking ArrayList.
            playerICT_ArrList = (ArrayList<String>)tempPlayerArrList.clone();
            playerRanking.add(playerICT_ArrList);
            tempPlayerArrList.clear();

        }


        //Form Ranking
        //Sorting selected player data by form.
        ArrayList<ArrayList<String>> selectedSortedForm = sortData(playerData, formIndex);

        //Clearing the previous ArrayList to store the player ranking data as its own ArrayList as well as
        //clearing the temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerFormArrList = new ArrayList<String>();
        tempPlayerArrList.clear();
        ArrayList<ArrayList<String>> updatedPlayerRankings = new ArrayList<ArrayList<String>>();

        //Resetting the rank variable.
        rank = 1;

        //A for loop that goes through each row of the selected players form ranked ArrayList.
        for (ArrayList formElement : selectedSortedForm) {

            //A for loop that goes through each row of the previously used
            //selected players ranked ArrayList.
            for (ArrayList rankElement : playerRanking) {

                //Checking if the name and team of both elements matches.
                if (formElement.get(nameIndex).equals(rankElement.get(nameIndex)) &&
                        formElement.get(teamIndex).equals(rankElement.get(teamIndex))) {

                    //Loop adding previously stored rank data to the new ranking ArrayList.
                    for (int i = 0; i < rankElement.size(); i++) {

                        tempPlayerArrList.add(String.valueOf(rankElement.get(i)));

                    }

                    //Adding form and form ranking to new ranking ArrayList.
                    //tempPlayerArrList.add(String.valueOf(formElement.get(formIndex)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank + 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the new ranking ArrayList.
            playerFormArrList = (ArrayList<String>) tempPlayerArrList.clone();
            updatedPlayerRankings.add(playerFormArrList);
            tempPlayerArrList.clear();

        }

        //Clearing the player ranking ArrayList and copying the contents of the new player ranking
        //ArrayList into it, then clearing the new player ranking ArrayList.
        playerRanking.clear();

        for (ArrayList element : updatedPlayerRankings) {
            playerRanking.add(element);
        }

        updatedPlayerRankings.clear();


        //Points Per Game Ranking
        //Sorting selected player data by points per game.
        ArrayList<ArrayList<String>> selectedSortedPPG = sortData(playerData, pointsPerGameIndex);

        //Clearing the previous ArrayList to store the player ranking data as its own ArrayList as well as
        //clearing the temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerPPG_ArrList = new ArrayList<String>();
        tempPlayerArrList.clear();

        //Resetting the rank variable.
        rank = 1;

        //A for loop that goes through each row of the selected players form ranked ArrayList.
        for (ArrayList ppgElement : selectedSortedPPG) {

            //A for loop that goes through each row of the previously used
            //selected players ranked ArrayList.
            for (ArrayList rankElement : playerRanking) {

                //Checking if the name and team of both elements matches.
                if (ppgElement.get(nameIndex).equals(rankElement.get(nameIndex)) &&
                        ppgElement.get(teamIndex).equals(rankElement.get(teamIndex))) {

                    //Loop adding previously stored rank data to the new ranking ArrayList.
                    for (int i = 0; i < rankElement.size(); i++) {

                        tempPlayerArrList.add(String.valueOf(rankElement.get(i)));

                    }

                    //Adding form and form ranking to new ranking ArrayList.
                    //tempPlayerArrList.add(String.valueOf(ppgElement.get(pointsPerGameIndex)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank + 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the new ranking ArrayList.
            playerPPG_ArrList = (ArrayList<String>) tempPlayerArrList.clone();
            updatedPlayerRankings.add(playerPPG_ArrList);
            tempPlayerArrList.clear();

        }

        //Clearing the player ranking ArrayList and copying the contents of the new player ranking
        //ArrayList into it, then clearing the new player ranking ArrayList.
        playerRanking.clear();

        for (ArrayList element : updatedPlayerRankings) {
            playerRanking.add(element);
        }

        updatedPlayerRankings.clear();


        //(Total Points / Cost) * Total Points Ranking - Points:Cost (PC) Ranking
        //Creating an ArrayList to hold player name, team, points, cost and PC.
        ArrayList<ArrayList<String>> selectedPlayersPC = new ArrayList<ArrayList<String>>();
        ArrayList<String> playerPC_Data = new ArrayList<String >();
        ArrayList<String> tempPlayerPC_Data = new ArrayList<String>();

        //Creating the PC index.
        int PC_Index = -1;

        //For loop searching through rows of the player data.
        for (ArrayList element : playerData) {
            boolean skip = false;

            //For loop searching through the columns in the player data.
            for (int i = 0; i < element.size(); i++) {

                //Making the loop ignore the header of the data.
                if (element.get(i).equals("Name")) {
                    skip = true;
                    break;

                //Adding the players name.
                } else if (i == nameIndex) {
                    tempPlayerPC_Data.add(String.valueOf(element.get(i)));

                //Adding the players team.
                } else if (i == teamIndex) {
                    tempPlayerPC_Data.add(String.valueOf(element.get(i)));

                //Adding the players total points.
                } else if (i == pointsIndex) {
                    tempPlayerPC_Data.add(String.valueOf(element.get(i)));

                //Adding the players cost.
                } else if (i == costIndex) {
                    tempPlayerPC_Data.add(String.valueOf(element.get(i)));

                //Calculating the players pc value and adding it to the temporary ArrayList.
                } else if (i + 1 == element.size()) {
                    //System.out.println(element.get(nameIndex));
                    //System.out.println(element.get(pointsIndex));
                    int playerPoints = Integer.parseInt(String.valueOf(element.get(pointsIndex)));
                    double playerCost = Double.parseDouble(String.valueOf(element.get(costIndex)));
                    double playerPC = (playerPoints / playerCost) * playerPoints;

                    tempPlayerPC_Data.add(String.valueOf(playerPC));

                    //System.out.println(tempPlayerPC_Data);

                    //Setting PC index.
                    PC_Index = tempPlayerPC_Data.size() - 1;

                }

            }

            if (!skip) {
                //Cloning the temporary ArrayList into the player PC ArrayList then adding
                //that into the selected players PC ArrayList.
                playerPC_Data = (ArrayList<String>) tempPlayerPC_Data.clone();
                selectedPlayersPC.add(playerPC_Data);
                tempPlayerPC_Data.clear();

            }

        }

        //Rod�k
        for (ArrayList element : selectedPlayersPC) {
            ///////////////////////////////////////////////System.out.println(element);
        }

        //Sorting selected player data by PC.
        ArrayList<ArrayList<String>> selectedSortedPC = sortData(selectedPlayersPC, PC_Index);

        //Clearing the previous ArrayList to store the player ranking data as its own ArrayList as well as
        //clearing the temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerPC_ArrList = new ArrayList<String>();
        tempPlayerArrList.clear();

        //Resetting the rank variable.
        rank = 1;

        //A for loop that goes through each row of the selected players PC ranked ArrayList.
        for (ArrayList pcElement : selectedSortedPC) {

            //A for loop that goes through each row of the previously used
            //selected players ranked ArrayList.
            for (ArrayList rankElement : playerRanking) {

                //Checking if the name and team of both elements matches.
                if (pcElement.get(nameIndex).equals(rankElement.get(nameIndex)) &&
                        pcElement.get(teamIndex - 1).equals(rankElement.get(teamIndex))) {

                    //Loop adding previously stored rank data to the new ranking ArrayList.
                    for (int i = 0; i < rankElement.size(); i++) {

                        tempPlayerArrList.add(String.valueOf(rankElement.get(i)));

                    }

                    //Adding PC and PC ranking to new ranking ArrayList.
                    //tempPlayerArrList.add(String.valueOf(pcElement.get(PC_Index)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank + 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the new ranking ArrayList.
            playerPC_ArrList = (ArrayList<String>) tempPlayerArrList.clone();
            updatedPlayerRankings.add(playerPC_ArrList);
            tempPlayerArrList.clear();

        }

        //Clearing the player ranking ArrayList and copying the contents of the new player ranking
        //ArrayList into it, then clearing the new player ranking ArrayList.
        playerRanking.clear();

        for (ArrayList element : updatedPlayerRankings) {
            playerRanking.add(element);
        }

        updatedPlayerRankings.clear();


        //Final average ranking.
        //Creating an ArrayList to hold player name, team, ICT rank, form rank, points per game rank,
        //PC rank and average rank.
        ArrayList<ArrayList<String>> selectedPlayersRank = new ArrayList<ArrayList<String>>();
        ArrayList<String> playerRankData = new ArrayList<String >();
        ArrayList<String> tempPlayerRankData = new ArrayList<String>();

        //Creating a rank index.
        int rankIndex = -1;

        //Creating a double for the rank average.
        double playerRankAverage;

        //For loop searching through each row in the player ranking ArrayList.
        for (ArrayList element : playerRanking) {

            //Resetting the rank average
            playerRankAverage = 0;

            //Going through each column in the player ranking ArrayList.
            for (int i = 0; i < element.size(); i++) {

                //Adding players name, team and position to temporary Arraylist.
                if (i < 4) {
                    tempPlayerRankData.add(String.valueOf(element.get(i)));

                } else {

                    //Checking if the current column is the last in the ArrayList.
                    if (i + 1 == element.size()) {

                        //Adding the last rank to the temporary ArrayList.
                        tempPlayerRankData.add(String.valueOf(element.get(i)));

                        //Adding the rank to the total.
                        playerRankAverage = playerRankAverage + Integer.parseInt(
                                String.valueOf(element.get(i)));

                        //Dividing the total of the ranks by the number of tests.
                        playerRankAverage = playerRankAverage / 4;

                        //Adding the rank average to the temporary ArrayList.
                        tempPlayerRankData.add(String.valueOf(playerRankAverage));

                        //Setting the rank index.
                        rankIndex = tempPlayerRankData.size() - 1;

                    } else {

                        //Adding the rank to the total.
                        playerRankAverage = playerRankAverage + Integer.parseInt(
                                String.valueOf(element.get(i)));


                        //Adding the rank to the temporary ArrayList.
                        tempPlayerRankData.add(String.valueOf(element.get(i)));

                    }

                }

            }

            //Cloning the temporary ArrayList into the player PC ArrayList then adding
            //that into the selected players PC ArrayList.
            playerRankData = (ArrayList<String>) tempPlayerRankData.clone();
            selectedPlayersRank.add(playerRankData);
            tempPlayerRankData.clear();

        }

        //Sorting selected player data by PC.
        ArrayList<ArrayList<String>> selectedSortedRank = sortData(selectedPlayersRank, rankIndex);

        //Clearing the previous ArrayList to store the player ranking data as its own ArrayList as well as
        //clearing the temporary ArrayList to hold the current players ranking data.
        ArrayList<String> playerRankArrList = new ArrayList<String>();
        tempPlayerArrList.clear();

        //Resetting the rank variable so that the system can asssign rank in reverse.
        ArrayList<String> playerDataRow1 = playerData.get(nameIndex);

        if (playerDataRow1.get(nameIndex).equalsIgnoreCase("name")) {
            rank = playerData.size() - 1;

        } else {
            rank = playerData.size();

        }

        //A for loop that goes through each row of the selected players sorted ranked ArrayList.
        for (ArrayList avgRankElement : selectedSortedRank) {

            //A for loop that goes through each row of the previously used
            //selected players ranked ArrayList.
            for (ArrayList rankElement : playerRanking) {

                //Checking if the name of both elements matches.
                if (avgRankElement.get(nameIndex).equals(rankElement.get(nameIndex)) &&
                        avgRankElement.get(teamIndex).equals(rankElement.get(teamIndex))) {

                    //Loop adding previously stored rank data to the new ranking ArrayList.
                    for (int i = 0; i < rankElement.size(); i++) {

                        tempPlayerArrList.add(String.valueOf(rankElement.get(i)));

                    }

                    //Adding rank and average ranking to new ranking ArrayList.
                    //tempPlayerArrList.add(String.valueOf(avgRankElement.get(PC_Index)));
                    tempPlayerArrList.add(String.valueOf(rank));
                    rank = rank - 1;

                }

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the new ranking ArrayList.
            playerRankArrList = (ArrayList<String>) tempPlayerArrList.clone();
            updatedPlayerRankings.add(playerRankArrList);
            tempPlayerArrList.clear();

        }

        //Clearing the player ranking ArrayList and copying the contents of the new player ranking
        //ArrayList into it, then clearing the new player ranking ArrayList.
        playerRanking.clear();

        for (ArrayList element : updatedPlayerRankings) {
            playerRanking.add(element);
        }

        updatedPlayerRankings.clear();

        //Reversing the ArrayList so the rank best player is at the top.
        Collections.reverse(playerRanking);


        //Position Rank.
        int gkRank = 1;
        int dfRank = 1;
        int mfRank = 1;
        int fwRank = 1;

        ArrayList<String> playerPositionRanking = new ArrayList<String >();
        ArrayList<String> tempPlayerRanking = new ArrayList<String>();

        for (ArrayList element : playerRanking) {

            if (String.valueOf(element.get(positionIndex)).
                    equalsIgnoreCase("goalkeeper")) {

                //Loop adding previously stored rank data to the new ranking ArrayList.
                for (int i = 0; i < element.size(); i++) {

                    tempPlayerRanking.add(String.valueOf(element.get(i)));

                }

                tempPlayerRanking.add(String.valueOf(gkRank));
                gkRank = gkRank + 1;

            } else if (String.valueOf(element.get(positionIndex)).
                    equalsIgnoreCase("defender")) {

                //Loop adding previously stored rank data to the new ranking ArrayList.
                for (int i = 0; i < element.size(); i++) {

                    tempPlayerRanking.add(String.valueOf(element.get(i)));

                }

                tempPlayerRanking.add(String.valueOf(dfRank));
                dfRank = dfRank + 1;

            } else if (String.valueOf(element.get(positionIndex)).
                    equalsIgnoreCase("midfielder")) {

                //Loop adding previously stored rank data to the new ranking ArrayList.
                for (int i = 0; i < element.size(); i++) {

                    tempPlayerRanking.add(String.valueOf(element.get(i)));

                }

                tempPlayerRanking.add(String.valueOf(mfRank));
                mfRank = mfRank + 1;

            } else if (String.valueOf(element.get(positionIndex)).
                    equalsIgnoreCase("forward")) {

                //Loop adding previously stored rank data to the new ranking ArrayList.
                for (int i = 0; i < element.size(); i++) {

                    tempPlayerRanking.add(String.valueOf(element.get(i)));

                }

                tempPlayerRanking.add(String.valueOf(fwRank));
                fwRank = fwRank + 1;

            }

            //Cloning the temporary ArrayList into the player data ArrayList then adding
            //that into the new ranking ArrayList.
            playerPositionRanking = (ArrayList<String>) tempPlayerRanking.clone();
            updatedPlayerRankings.add(playerPositionRanking);
            tempPlayerRanking.clear();

        }

        //Clearing the player ranking ArrayList and copying the contents of the new player ranking
        //ArrayList into it, then clearing the new player ranking ArrayList.
        playerRanking.clear();

        for (ArrayList element : updatedPlayerRankings) {
            playerRanking.add(element);
        }

        updatedPlayerRankings.clear();

        return playerRanking;
    }

    public static ArrayList<String> bestAvailableTransfer(
            ArrayList<ArrayList<String>> selectedPlayersRanked, ArrayList<ArrayList<String>>
            allPlayersRanked, ArrayList<ArrayList<String>> rawPlayerData, int nameIndex, int teamIndex, int positionIndex, int costIndex,
            int availabilityIndex, double budget) {

        ArrayList<ArrayList<ArrayList<String>>> bestTransfers =
                new ArrayList<ArrayList<ArrayList<String>>>();

        ArrayList<ArrayList<String>> playerTransferOptions = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> tempPlayerTransferOptions = new ArrayList<ArrayList<String>>();

        ArrayList<String> playerOption = new ArrayList<String >();
        ArrayList<String> tempPlayerOption = new ArrayList<String >();

        final int positionRankIndex = 9;
        final int rankIndex = 8;
        boolean alreadyInTeam = false;



        for (ArrayList playerSelectedRankData : selectedPlayersRanked) {

            for (ArrayList playerFullRankData : allPlayersRanked) {

                for (ArrayList selectedPlayers : selectedPlayersRanked) {

                    if (playerFullRankData.get(nameIndex).equals(selectedPlayers.get(nameIndex)) &&
                            playerFullRankData.get(teamIndex).equals(selectedPlayers.get(teamIndex))) {

                        alreadyInTeam = true;

                    }

                }

                //Finding the difference between overall position rank.
                int selectedPlayerRank = -1;

                for (ArrayList player : allPlayersRanked) {

                    if (player.get(nameIndex).equals(playerSelectedRankData.get(nameIndex)) &&
                            player.get(teamIndex).equals(playerSelectedRankData.get(teamIndex))) {

                        selectedPlayerRank = Integer.parseInt(String.valueOf(player.get(positionRankIndex)));

                    }

                }


                if (playerSelectedRankData.get(positionIndex).equals(playerFullRankData.get(positionIndex))
                        && Integer.parseInt(String.valueOf(playerFullRankData.get(positionRankIndex))) <
                        Integer.parseInt(String.valueOf(playerSelectedRankData.get(positionRankIndex)))) {

                    if (!alreadyInTeam && Double.parseDouble(String.valueOf(
                            playerFullRankData.get(costIndex))) <= budget + Double.parseDouble(
                            String.valueOf(playerSelectedRankData.get(costIndex)))) {

                        //Adding the info about the new player.
                        tempPlayerOption.add(String.valueOf(playerFullRankData.get(nameIndex)));
                        tempPlayerOption.add(String.valueOf(playerFullRankData.get(positionIndex)));
                        tempPlayerOption.add(String.valueOf(playerFullRankData.get(teamIndex)));
                        tempPlayerOption.add(String.valueOf(playerFullRankData.get(costIndex)));
                        tempPlayerOption.add(String.valueOf(playerFullRankData.get(rankIndex)));
                        tempPlayerOption.add(String.valueOf(playerFullRankData.get(positionRankIndex)));

                        //Adding the info about the player he is compared to.
                        tempPlayerOption.add(String.valueOf(playerSelectedRankData.get(nameIndex)));
                        tempPlayerOption.add(String.valueOf(playerSelectedRankData.get(positionIndex)));
                        tempPlayerOption.add(String.valueOf(playerSelectedRankData.get(teamIndex)));
                        tempPlayerOption.add(String.valueOf(playerSelectedRankData.get(costIndex)));
                        tempPlayerOption.add(String.valueOf(playerSelectedRankData.get(rankIndex)));
                        tempPlayerOption.add(String.valueOf(selectedPlayerRank));

                        //Adding the difference between their cost (plus remaining budget)
                        double selectedCost = Double.parseDouble(String.valueOf(
                                playerSelectedRankData.get(costIndex)));
                        double newCost = Double.parseDouble(String.valueOf(playerFullRankData.get(costIndex)));

                        DecimalFormat df = new DecimalFormat("#.#");

                        double potentialBudget = selectedCost - newCost + budget;

                        tempPlayerOption.add(String.valueOf(round(potentialBudget, 1)));

                        //Adding the difference between overall position rank.
                        int selectedPosRank = Integer.parseInt(String.valueOf(
                                playerSelectedRankData.get(positionRankIndex)));
                        int newPosRank = Integer.parseInt(String.valueOf(
                                playerFullRankData.get(positionRankIndex)));

                        //System.out.println(playerSelectedRankData);
                        tempPlayerOption.add(String.valueOf(selectedPlayerRank - newPosRank));

                    }

                }

                //System.out.println("test");

                if (tempPlayerOption.size() != 0) {

                    //Cloning the temporary ArrayList into the player data ArrayList then adding
                    //that into the new ranking ArrayList.
                    playerOption = (ArrayList<String>) tempPlayerOption.clone();
                    tempPlayerTransferOptions.add(playerOption);
                    tempPlayerOption.clear();

                }

                alreadyInTeam = false;

            }

            if (tempPlayerTransferOptions.size() != 0) {

                //Cloning the temporary ArrayList into the player data ArrayList then adding
                //that into the new ranking ArrayList.
                playerTransferOptions = (ArrayList<ArrayList<String>>) tempPlayerTransferOptions.clone();
                bestTransfers.add(playerTransferOptions);
                tempPlayerTransferOptions.clear();

            }

        }

        for (ArrayList<ArrayList<String>> element2 : bestTransfers) {

            for (ArrayList<String> element : element2) {

                //System.out.println(element);

            }

        }
        //System.out.println("");

        //Finding the best transfer of the results.
        ArrayList<String> bestTransfer = new ArrayList<String>();

        //Checking if player in team is seriously injured (0% chance to play)
        //to prioritise their transfer.
        final int transferOutNameIndex = 6;
        final int transferOutPositionIndex = 7;
        final int transferOutTeamIndex = 8;
        final int transferOutCostIndex = 9;
        int highestPriority = 3;

        ArrayList<ArrayList<ArrayList<String>>> updatedBestTransfers =
                new ArrayList<ArrayList<ArrayList<String>>>();

        ArrayList<ArrayList<String>> allTransferOptions = new ArrayList<ArrayList<String>>();
        tempPlayerTransferOptions.clear();

        ArrayList<String> transferOption = new ArrayList<String >();
        tempPlayerOption.clear();


        // go through elements in transfer AL and match to name in full data to check if player injured
        for (ArrayList<ArrayList<String>> playerOutOuter : bestTransfers) {

            for (ArrayList<String> playerOut : playerOutOuter) {

                for (ArrayList<String> playerData : rawPlayerData) {

                    if (playerOut.get(transferOutNameIndex).equals(playerData.get(nameIndex)) &&
                            playerOut.get(transferOutTeamIndex).equals(playerData.get(teamIndex))) {

                        if (playerData.get(availabilityIndex).equals("0")) {

                            for (int i = 0; i < playerOut.size(); i++) {

                                tempPlayerOption.add(playerOut.get(i));

                            }

                            tempPlayerOption.add("1");
                            highestPriority = 1;

                        } else if (playerData.get(availabilityIndex).equals("25")) {

                            for (int i = 0; i < playerOut.size(); i++) {

                                tempPlayerOption.add(playerOut.get(i));

                            }

                            tempPlayerOption.add("2");
                            if (highestPriority == 3) {
                                highestPriority = 2;

                            }

                        } else {

                            for (int i = 0; i < playerOut.size(); i++) {

                                tempPlayerOption.add(playerOut.get(i));

                            }

                            tempPlayerOption.add("3");
                            if (highestPriority == 3) {
                                highestPriority = 3;

                            }

                        }

                        if (!tempPlayerOption.isEmpty()) {

                            //Cloning the temporary ArrayList into the player data ArrayList then adding
                            //that into the new ranking ArrayList.
                            //System.out.println(tempPlayerOption);
                            transferOption = (ArrayList<String>) tempPlayerOption.clone();
                            tempPlayerTransferOptions.add(transferOption);
                            tempPlayerOption.clear();

                        }

                    }

                    //Cloning the temporary ArrayList into the player data ArrayList then adding
                    //that into the new ranking ArrayList.
                    allTransferOptions = (ArrayList<ArrayList<String>>) tempPlayerTransferOptions.clone();
                    updatedBestTransfers.add(allTransferOptions);
                    tempPlayerTransferOptions.clear();

                }

            }


        }


        int biggestGain = 0;

        //Transferring the highest priority player with the best transfer.
        for (ArrayList<ArrayList<String>> element2 : updatedBestTransfers) {

            for (ArrayList<String> element : element2) {

                if (Integer.parseInt(String.valueOf(element.get(13))) > biggestGain &&
                        Integer.parseInt(String.valueOf(element.get(14))) == highestPriority) {

                    biggestGain = Integer.parseInt(String.valueOf(element.get(13)));

                    bestTransfer.clear();
                    bestTransfer = element;

                }

            }

        }

        if (bestTransfer.isEmpty()) {

            return null;

        }
        return bestTransfer;

    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

}
