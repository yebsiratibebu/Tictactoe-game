import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
    int width = 600;
    int height = 650; 

    JFrame f = new JFrame();
    JLabel text = new JLabel();
    JPanel Dpanel = new JPanel();

    public TicTacToe () {

        f.setVisible(true);
        f.setSize(width, height);
        //f.setTitle(TicTacToe);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        text.setBackground(Color.darkGray);
        text.setForeground(Color.white);
        text.setFont(new Font( "Times New Roman", Font.BOLD, 50));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("TIC-TAC-TOE");

        Dpanel.setLayout(new BorderLayout());
        Dpanel.add(text);
        f.add(Dpanel);

    
    }
}
