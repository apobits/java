package practice.java.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JPanel jPanel;

    public ButtonListener(JPanel jPanel) {
	this.jPanel = jPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	var jFileChooser = new JFileChooser();
	((JTextField)jPanel.getComponent(1)).getText();
	jFileChooser.addActionListener(new FileListener());
	jFileChooser.showOpenDialog(null);
	jPanel.add(jFileChooser);
	jPanel.invalidate();
	jPanel.validate();
	jPanel.repaint();

    }
}
