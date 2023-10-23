package dataman;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private JTextField displayField;

    public DisplayPanel() {
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);

        // Adjusting font size
        Font currentFont = displayField.getFont();
        Font newFont = currentFont.deriveFont(Font.PLAIN, 36); // Adjust the font size as per your requirement
        displayField.setFont(newFont);

        // Adjusting preferred size to make it taller
        displayField.setPreferredSize(new Dimension(displayField.getPreferredSize().width, 60)); // Adjust the height as per your preference

        add(displayField, BorderLayout.CENTER);
    }

    public void updateDisplay(String text) {
        displayField.setText(text);
    }

    public String getDisplayText() {
        return displayField.getText();
    }
}

