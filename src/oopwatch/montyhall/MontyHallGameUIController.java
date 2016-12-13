package oopwatch.montyhall;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import oopwatch.app.*;

public class MontyHallGameUIController extends UIController{

	int firstSelectNum = -1;
	int secondSelectNum = -1;
	int openNum = -1;
	
	MontyHallGame game = new MontyHallGame();
	
	ImageIcon question = new ImageIcon("question.jpg");
	ImageIcon select = new ImageIcon("select.jpg");
	ImageIcon sheep = new ImageIcon("sheep.jpg");
	ImageIcon gold = new ImageIcon("Gold.jpg");
	
	boolean type = false;
	
	@Override
	public void initializeUI() {
		
	}
	
	//init UI for montyhall labels.
	public void init_UIinMonty(JButton[] buttons, JLabel[] labels, JLabel label){
		for(int i = 0; i < 3; i++){
			buttons[i].setIcon(question);
		}
		labels[0].setText("Keep Choice : 0 times");
		labels[1].setText("Win : 0 Gold ( 0% )");
		labels[2].setText("Losses : 0 sheep ( 0% )");
		labels[3].setText("Change Choice : 0 times");
		labels[4].setText("Win : 0 Gold ( 0% )");
		labels[5].setText("Losses : 0 sheep ( 0% )");
		label.setText("\u2605 Select one of the three boxex above");
	}

	//extends UIController and override startGame method.
	@Override
	public void startGame() {
		game.startGame("None", new JLabel("Don't need time lable"));
		game.shuffle();
		firstSelectNum = -1;
		secondSelectNum = -1;
		openNum = -1;
	}
	
	//shuffle the button 1,2,3 for make gold box,
	public void shuffle(JButton[] buttons, JLabel label){
		game.shuffle();
		firstSelectNum = -1;
		secondSelectNum = -1;
		openNum = -1;
		for(int i = 0; i < 3; i++){
			buttons[i].setIcon(question);
		}
		label.setText("\u2605 Select one of the three boxex above");
	}
	
	//call this method when first selected.
	public int first_select(JButton[] buttons, JLabel label, int selectNum){
		label.setText("Click '!' to keep your first choice or '?' to change it");
		this.firstSelectNum = selectNum;
		buttons[firstSelectNum].setIcon(select);
		
		if(firstSelectNum == game.getGold_Num()){
			Random random = new Random();
			int unselect = random.nextInt(3);
			while(unselect == firstSelectNum){
				unselect = random.nextInt(3);
			}
			buttons[unselect].setIcon(sheep);
			openNum = unselect;
		}else{
			for(int i = 0; i < 3; i++){
				if((i != firstSelectNum) && (i != game.getGold_Num())){
					buttons[i].setIcon(sheep);
					openNum = i;
				}
			}
		}
		
		int question = -1;
		for(int i = 0; i < 3; i++){
			if((i != firstSelectNum) && i != openNum){
				question = i;
			}
		}
		
		return question;
		
	}

	//call this method when second selected.
	public boolean second_select(JButton[] buttons, JLabel[] labels, JLabel label, int selectNum){
		boolean check = true;
		if(selectNum == openNum){
			//Do nothing
			check = false;
		}else{
			secondSelectNum = selectNum;
			for(int i = 0; i < 3; i++){
				if(i == game.getGold_Num()){
					buttons[i].setIcon(gold);
				}else{
					buttons[i].setIcon(sheep);
				}
			}
			if(firstSelectNum == secondSelectNum){
				//keep
				int keep_total = game.getKeep_total();
				keep_total++;
				game.setKeep_total(keep_total);
				if(secondSelectNum == game.getGold_Num()){
					int keep_win = game.getKeep_win();
					keep_win++;
					game.setKeep_win(keep_win);
					label.setText("You kept the choice and Win!");
				}else{
					int keep_lose = game.getKeep_lose();
					keep_lose++;
					game.setKeep_lose(keep_lose);
					label.setText("You kept the choice and Lose!");
				}
				type = true;
			}else{
				//change
				int change_total = game.getChange_total();
				change_total++;
				game.setChange_total(change_total);
				if(secondSelectNum == game.getGold_Num()){
					int change_win = game.getChange_win();
					change_win++;
					game.setChange_win(change_win);
					label.setText("You changed the choice and Win!");
				}else{
					int change_lose = game.getChange_lose();
					change_lose++;
					game.setChange_lose(change_lose);
					label.setText("You changed the choice and Lose!");
				}
				type = false;
			}
			
			game.Calculate(type);
			
			if(type == true){
				labels[0].setText("Keep Choice : "+game.getKeep_total()+" times");
				labels[1].setText("Win : "+game.getKeep_win()+" Gold ( "+game.getKeep_win_p()+"% )");
				labels[2].setText("Losses : "+game.getKeep_lose()+" sheep ( "+game.getKeep_lose_p()+"% )");
			}else{
				labels[3].setText("Change Choice : "+game.getChange_total()+" times");
				labels[4].setText("Win : "+game.getChange_win()+" Gold ( "+game.getChange_win_p()+"% )");
				labels[5].setText("Losses : "+game.getChange_lose()+" sheep ( "+game.getChange_lose_p()+"% )");
			}
		}
		
		return check;
	}
	
}
