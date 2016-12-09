package oopwatch;

import java.util.Random;

import javax.swing.JLabel;

public class MontyHallGame implements Game {
	
	int gold_Num = -1;
	
	int keep_total = 0;
	int keep_win = 0;
	int keep_lose = 0;
	int keep_win_p = 0;
	int keep_lose_p = 0;
	
	int change_total = 0;
	int change_win = 0;
	int change_lose = 0;
	int change_win_p = 0;
	int change_lose_p = 0;
	
	@Override
	public void startGame(String userName, JLabel timerLabel) {
		
	}

	@Override
	public int getScore() {
		return 0;
	}
	
	public void shuffle(){
		Random random = new Random();
		gold_Num = random.nextInt(3);
	}
	
	public void init(){
		
		keep_total = 0;
		keep_win = 0;
		keep_lose = 0;
		keep_win_p = 0;
		keep_lose_p = 0;
		
		change_total = 0;
		change_win = 0;
		change_lose = 0;
		change_win_p = 0;
		change_lose_p = 0;
	}
	
	public void Calculate(boolean type){
		
		if(type == true){
			keep_win_p = (keep_win*100 / keep_total);
			keep_lose_p = (keep_lose*100 / keep_total);
		}else{
			change_win_p = (change_win*100 / change_total);
			change_lose_p = (change_lose*100 / change_total);
		}
		
	}

}
