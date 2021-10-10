package PR_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Match extends JFrame{
    public int x;
    public int y;
    JButton button = new JButton("AC Milan");
    JLabel schet = new JLabel("Result: 0 X 0");
    JButton button1 = new JButton("Real Madrid");
    JLabel last = new JLabel("Last Score: N/A");
    Label win = new Label("Winner: DRAW");
    public void PechatPobeda(){
        if (x>y){
            win.setText("Winner: AC Milan");}
        else if (y>x) {
            win.setText("Winner: Real Madrid");
        }
        else {
            win.setText("Winner: DRAW");
        }
    }
    public Match(){
        super("Football");
        setLayout(new FlowLayout());
        setSize(350,200);
        add(button);
        add(button1);
        add(win);
        add(schet);
        add(last);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++x;
                schet.setText("Result: " + x + " X " + y);
                PechatPobeda();
                last.setText("Last score: AC Milan");

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++y;
                schet.setText("Result: " + x + " X " + y);
                PechatPobeda();
                last.setText("Last score: Real Madrid");
            }
        });
    }
    public static void main(String[]args)
    {
        new Match().setVisible(true);
    }
}