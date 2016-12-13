package oopwatch.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;


public class RankManager {
	int i=0;
	Timer timer;

	public void insertRank(String name, int score, String time){
		
		try{ 
	         FileWriter fw = new FileWriter("save.txt",true);
	         BufferedWriter bf = new BufferedWriter(fw);
	         bf.write(name+";"+score+";"+time+";");
	         bf.write("\n");
	         bf.close();
	         
	      }catch(Exception ex){
	         ex.printStackTrace();
	      }
	}
	
	public ArrayList<Rank_Set> outputRank_Set(){
		
		ArrayList<Rank_Set> rank_sets = new ArrayList<Rank_Set>();
		
		try {
			File csvFile = new File("save.txt");
			FileReader fr = new FileReader(csvFile);
			BufferedReader br = new BufferedReader(fr);

			Rank_Set rank_set;
			String line;

			while ((line = br.readLine()) != null) {

				rank_set = new Rank_Set();
				String[] split = line.split(";");

				rank_set.setId(split[0]);
				rank_set.setScore(Integer.parseInt(split[1]));
				rank_set.setTime(split[2]);

				rank_sets.add(rank_set);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        Collections.sort(rank_sets, new Score_Compare());
		
		return rank_sets;
	}
	
	static class Score_Compare implements Comparator<Rank_Set> {

        @Override
        public int compare(Rank_Set arg0, Rank_Set arg1) {
           return arg0.getScore() > arg1.getScore() ? -1
                 : arg0.getScore() < arg1.getScore() ? 1 : 0;
        }

	}
}