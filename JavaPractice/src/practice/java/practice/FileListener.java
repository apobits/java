package practice.java.practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
	System.out.println(e);
    }
}
