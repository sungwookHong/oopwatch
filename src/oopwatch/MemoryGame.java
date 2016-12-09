package oopwatch;

import java.util.Random;

import javax.swing.JLabel;

public class MemoryGame implements Game {
	final int n = 16;
	
	private int failedCount;
	
	private int[] answer;
	private TimeManager timeManager;
	private boolean isPlaying;

	private boolean[] toggleStatus = new boolean[16];
	
	public MemoryGame() {
		timeManager = new TimeManager();
	}
	
	public void startGame(String userName, JLabel timerLabel) {
		failedCount = 0;
		toggleStatus = new boolean[n];
		timeManager.start(timerLabel);
		isPlaying = true;
	}
	
	public void stopGame(String userName, JLabel timerLabel) {
		timeManager.stop(timerLabel);
		isPlaying = false;
		
		if ( isDone() == true ) {
			timerLabel.setText(timerLabel.getText()+" score: " + getScore());
		}
	}
	
	public int getScore() {
		int second = timeManager.getTime();
		int score = 10000 - second * 91 - failedCount * 37;
		if ( score < 0 ) {
			score = 0;
		}
		return score;
	}
	
	public boolean isPlayingNow() {
		return isPlaying;
	}
	
	public int[] refreshAnswer() {
		answer = new int[n];
		Random random = new Random();
		for(int x=1;x<=n/2;x++) {
			for(int times=0;times<2;times++) {
				// random pos;
				int now = random.nextInt(n);
				while ( answer[now] != 0 ) {
					now = random.nextInt(n); 
				}
				answer[now] = x;
			}
		}
		return answer;
	}
	
	public boolean checkWithRule(int i,int j) {
		if ( i != j && answer[i] == answer[j] ) {
			return true;
		}
		failedCount += 1;
		return false;
	}
	
	public int getAnswer(int i) {
		return answer[i];
	}

	public void updateToggleStatus(int i) {
		toggleStatus[i] = !toggleStatus[i];
	}

	public boolean getToggleStatus(int i) {
		return toggleStatus[i];
	}
	
	public boolean isDone() {
		for(int i=0;i<n;i++) {
			if ( toggleStatus[i] == false ) {
				return false;
			}
		}
		return true;
	}
}
