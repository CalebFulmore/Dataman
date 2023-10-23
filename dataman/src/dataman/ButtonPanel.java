package dataman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton[] buttons;

    public ButtonPanel(ActionListener actionListener) {
        setLayout(new GridLayout(6, 4));
        buttons = new JButton[24];

        String[] buttonNames = {
            "Electro Flash", "[?]", "OFF", "ON/UserEntry",
            "Wipe Out", "Number Guesser", "Force Out", "÷",
            "7", "8", "9", "x",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "GO", "0", "Memory Bank", "="
        };

        for (int i = 0; i < 24; i++) {
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].addActionListener(actionListener);
            add(buttons[i]);
        }
    }

    public JButton getButton(int index) {
        if (index >= 0 && index < 24) {
            return buttons[index];
        }
        return null;
    }
}
