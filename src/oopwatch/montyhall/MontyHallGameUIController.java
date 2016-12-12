package oopwatch;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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

	@Override
	public void startGame() {
		game.init();
		game.shuffle();
		firstSelectNum = -1;
		secondSelectNum = -1;
		openNum = -1;
	}
	
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
	
	public int first_select(JButton[] buttons, JLabel label, int selectNum){
		label.setText("Click '!' to keep your first choice or '?' to change it");
		this.firstSelectNum = selectNum;
		buttons[firstSelectNum].setIcon(select);
		
		if(firstSelectNum == game.gold_Num){
			Random random = new Random();
			int unselect = random.nextInt(3);
			while(unselect == firstSelectNum){
				unselect = random.nextInt(3);
			}
			buttons[unselect].setIcon(sheep);
			openNum = unselect;
		}else{
			for(int i = 0; i < 3; i++){
				if((i != firstSelectNum) && (i != game.gold_Num)){
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

	public boolean second_select(JButton[] buttons, JLabel[] labels, JLabel label, int selectNum){
		boolean check = true;
		if(selectNum == openNum){
			//Do nothing
			check = false;
		}else{
			secondSelectNum = selectNum;
			for(int i = 0; i < 3; i++){
				if(i == game.gold_Num){
					buttons[i].setIcon(gold);
				}else{
					buttons[i].setIcon(sheep);
				}
			}
			if(firstSelectNum == secondSelectNum){
				//keep
				game.keep_total++;
				if(secondSelectNum == game.gold_Num){
					game.keep_win++;
					label.setText("You kept the choice and Win!");
				}else{
					game.keep_lose++;
					label.setText("You kept the choice and Lose!");
				}
				type = true;
			}else{
				//change
				game.change_total++;
				if(secondSelectNum == game.gold_Num){
					game.change_win++;
					label.setText("You changed the choice and Win!");
				}else{
					game.change_lose++;
					label.setText("You changed the choice and Lose!");
				}
				type = false;
			}
			
			game.Calculate(type);
			
			if(type == true){
				labels[0].setText("Keep Choice : "+game.keep_total+" times");
				labels[1].setText("Win : "+game.keep_win+" Gold ( "+game.keep_win_p+"% )");
				labels[2].setText("Losses : "+game.keep_lose+" sheep ( "+game.keep_lose_p+"% )");
			}else{
				labels[3].setText("Change Choice : "+game.change_total+" times");
				labels[4].setText("Win : "+game.change_win+" Gold ( "+game.change_win_p+"% )");
				labels[5].setText("Losses : "+game.change_lose+" sheep ( "+game.change_lose_p+"% )");
			}
		}
		
		return check;
	}
	
	public void show_autoMotions(JButton[] buttons){
		for(int i = 0; i < 10; i++){
			buttons[1].setIcon(select);
			buttons[2].setIcon(gold);
		}
	}
	
}
