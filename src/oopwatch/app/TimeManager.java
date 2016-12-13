package oopwatch.app;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class TimeManager {
	int i=0;
	Timer timer;

	private void startTimer(JLabel timerLabel) {
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				i += 1;
				timerLabel.setText("time elapsed: " + i);
			}
		}, 1000, 1000);
	}
	
	private void stopTimer(JLabel timerLabel) {
		timer.cancel();
		timer.purge();
	}
	
	public void start(JLabel timerLabel) {
		i=0;
		if ( timer != null ) {
			stop(timerLabel);
		}
		startTimer(timerLabel);
	}
	
	public void stop(JLabel timerLabel) {
		stopTimer(timerLabel);
		timerLabel.setText(timerLabel.getText() + " , game stopped.");
	}
	
	public int getTime() {
		return i;
	}
}