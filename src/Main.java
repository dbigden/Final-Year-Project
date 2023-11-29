import javax.swing.*;
import java.awt.*;

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

        createWindow();
    }

    private static void createWindow() {
        //Creating the window.
        JFrame frame = new JFrame("FPL Optimiser");

        //Stops the application when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double windowWidth = screenWidth * 0.75;
        int screenWidthInt = (int)windowWidth;

        double screenHeight = screenSize.getHeight();
        double windowHeight = screenHeight * 0.75;
        int screenHeightInt = (int)windowHeight;

        frame.setPreferredSize(new Dimension(screenWidthInt, screenHeightInt));
        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}