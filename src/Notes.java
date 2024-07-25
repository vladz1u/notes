import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notes extends JFrame {
    int y = 150;

    Notes(){
        JFrame jFrame = new JFrame("Notes");
        setLayout(null);
        setSize(500, 700);

        notesFunc();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void notesFunc(){
        JButton add = new JButton("Add note");
        add.setBounds(100, 60, 300, 50);
        add(add);
        JTextField notesField = new JTextField();
        notesField.setBounds(40, 0, 400, 50);
        add(notesField);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel l = new JLabel();
                l.setText(notesField.getText());
                l.setBounds(50, y, 400, 50);
                add(l);
                y += 50;
                repaint();
            }
        });
    }
}
