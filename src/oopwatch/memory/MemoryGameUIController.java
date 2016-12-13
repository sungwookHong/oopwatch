package oopwatch.memory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import oopwatch.app.*;

public class MemoryGameUIController extends UIController {
	ArrayList<JButton> buttons;
	JLabel timerLabel;
	
	MemoryGame game;
	
	final int n = 16;
	
	private int last_position;
	private boolean isToggled;
	private JTextField juserName;
	private String userName;
	
	public MemoryGameUIController(ArrayList<JButton> buttons, JLabel timerLabel, JTextField userName) {
		game = new MemoryGame();
		
		this.buttons = buttons;
		this.timerLabel = timerLabel;
		timerLabel.setText("not started");
		this.juserName = userName;
		initializeUI();
	}

	public void initializeUI() {
		// stop previous game
		if ( game.isPlayingNow() == true ) {
			game.stopGame(userName, timerLabel);
		}
		
		isToggled = false;
		game.refreshAnswer();
		for(int i=0;i<n;i++) {
			buttons.get(i).setEnabled(false);
			setButtonNull(i);
		}
	}
	
	public void startGame() {
		initializeUI();
		for(int i=0;i<n;i++) {
			buttons.get(i).setEnabled(true);
		}
		userName = juserName.getText();
		game.startGame(userName, timerLabel);
	}
	
	public MouseAdapter memoryBtnClick(int now_position) {
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				toggleButton(now_position);
				
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					public void run() {
						if ( isToggled == true ) {
							if ( game.checkWithRule(last_position, now_position) == true ) {
								buttons.get(last_position).setEnabled(false);
								buttons.get(now_position).setEnabled(false);
								if ( game.isDone() == true ) {
									initializeUI();
								}
							}
							else {
								toggleButton(now_position);
								toggleButton(last_position);
							}
						}
						else {
							last_position = now_position;
						}
						isToggled = !isToggled;
					}
				}, 1000);
				
			}
		};
	}
	
	public void toggleButton(int i) {
		game.updateToggleStatus(i);
		if ( game.getToggleStatus(i) == true ) {
			setButtonImage(i);
		}
		else {
			setButtonNull(i);
		}
	}
	
	public void setButtonImage(int i) {
		buttons.get(i).setIcon(new ImageIcon(game.getAnswer(i) + ".jpg"));
	}
	
	public void setButtonNull(int i) {
		buttons.get(i).setIcon(null);
	}
	
	public void setName(String name){
		this.userName = name;
	}
}