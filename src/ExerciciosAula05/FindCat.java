package ExerciciosAula05;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class FindCat {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JAVA GUI APPLICATION");

        final int[][] maps = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 2, 1, 1},
                {1, 1, 1, 1}
        };
        frame.setLayout(new GridLayout(4,4));

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j ++) {
                final JButton button = new JButton();
                button.setName(Integer.toString(maps[i][j]));
                frame.add(button);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (button.getName().equals("1")) {
                            button.setText("*");
                        } else if (button.getName().equals("2")) {
                            button.setText("Cat!");
                        }
                    }
                });
            }
        }
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
