package oopwatch;

import javax.swing.JLabel;

public interface Game {
	public void startGame(String userName, JLabel timerLabel);
	public int getScore();
}