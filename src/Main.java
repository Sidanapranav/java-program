import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a test of the Java program.");  

        JFrame frame = new JFrame("Hello Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JLabel to display the message
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
