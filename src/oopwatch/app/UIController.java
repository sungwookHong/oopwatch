package oopwatch.app;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public abstract class UIController {
	JPanel self;
	
	public abstract void initializeUI();
	public abstract void startGame();
	
	public MouseAdapter changeUIAfterClick(JPanel currentPanel, JPanel nextPanel, boolean initFlag) {
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				currentPanel.setVisible(false);
				nextPanel.setVisible(true);
				
				if ( initFlag == true ) {
					initializeUI();
				}
			}
		};
	}
	
	public MouseAdapter startGameAfterClick() {
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startGame();
			}
		};
	}
}