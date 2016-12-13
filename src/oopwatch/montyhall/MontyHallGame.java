package oopwatch.montyhall;

import java.util.Random;

import javax.swing.JLabel;

import oopwatch.app.*;

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
	
	//Make get,set method for encapsulation! 11 instance variables.
	public int getGold_Num() {
		return gold_Num;
	}

	public void setGold_Num(int gold_Num) {
		this.gold_Num = gold_Num;
	}

	public int getKeep_total() {
		return keep_total;
	}

	public void setKeep_total(int keep_total) {
		this.keep_total = keep_total;
	}

	public int getKeep_win() {
		return keep_win;
	}

	public void setKeep_win(int keep_win) {
		this.keep_win = keep_win;
	}

	public int getKeep_lose() {
		return keep_lose;
	}

	public void setKeep_lose(int keep_lose) {
		this.keep_lose = keep_lose;
	}

	public int getKeep_win_p() {
		return keep_win_p;
	}

	public void setKeep_win_p(int keep_win_p) {
		this.keep_win_p = keep_win_p;
	}

	public int getKeep_lose_p() {
		return keep_lose_p;
	}

	public void setKeep_lose_p(int keep_lose_p) {
		this.keep_lose_p = keep_lose_p;
	}

	public int getChange_total() {
		return change_total;
	}

	public void setChange_total(int change_total) {
		this.change_total = change_total;
	}

	public int getChange_win() {
		return change_win;
	}

	public void setChange_win(int change_win) {
		this.change_win = change_win;
	}

	public int getChange_lose() {
		return change_lose;
	}

	public void setChange_lose(int change_lose) {
		this.change_lose = change_lose;
	}

	public int getChange_win_p() {
		return change_win_p;
	}

	public void setChange_win_p(int change_win_p) {
		this.change_win_p = change_win_p;
	}

	public int getChange_lose_p() {
		return change_lose_p;
	}

	public void setChange_lose_p(int change_lose_p) {
		this.change_lose_p = change_lose_p;
	}

	//implemets Game class but Montyhall game don't need userName and time.
	@Override
	public void startGame(String userName, JLabel timerLabel) {
		init();
	}

	//don't need score
	@Override
	public int getScore() {
		return 0;
	}
	
	//Make a Gold number used to random Object.
	public void shuffle(){
		Random random = new Random();
		gold_Num = random.nextInt(3);
	}
	
	//init the variable instances.
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
	
	//Calculate the percent.
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
