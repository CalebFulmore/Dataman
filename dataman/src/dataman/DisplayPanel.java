package dataman;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private JTextField displayField, problemsAttemptedField, problemsCorrectField;

    public DisplayPanel() {
        setLayout(new GridLayout(2, 1));

        displayField = createDisplayField();
        problemsAttemptedField = createDisplayField();
        problemsCorrectField = createDisplayField();

        JPanel mainDisplayPanel = new JPanel(new BorderLayout());
        mainDisplayPanel.add(displayField, BorderLayout.CENTER);

        JPanel scorePanel = new JPanel();
        scorePanel.add(new JLabel("Attempted: "));
        scorePanel.add(problemsAttemptedField);
        scorePanel.add(new JLabel("Correct: "));
        scorePanel.add(problemsCorrectField);

        add(mainDisplayPanel);
        add(scorePanel);
    }

    private JTextField createDisplayField() {
        JTextField field = new JTextField(5); // Increase the field width
        field.setEditable(false);
        Font currentFont = field.getFont();
        Font newFont = currentFont.deriveFont(Font.PLAIN, 36);
        field.setFont(newFont);
        field.setHorizontalAlignment(JTextField.CENTER); // Center align the text
        return field;
    }

    public void updateDisplay(String text) {
        displayField.setText(text);
    }

    public void updateScore(int attempted, int correct) {
        problemsAttemptedField.setText(String.valueOf(attempted));
        problemsCorrectField.setText(String.valueOf(correct));
    }

    public String getDisplayText() {
        return displayField.getText();
    }
}
