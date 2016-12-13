package oopwatch.app;

import java.sql.Time;

public class Rank_Set {
//make object for Rank
   private String id;
   private int score;
   private String time;
   
   public String getId() {
      return id;
   }	//get id
   public void setId(String id) {
      this.id = id;
   }	//set id
   public int getScore() {
      return score;
   }	//get score
   public void setScore(int score) {
      this.score = score;
   }	//set score
   public String getTime() {
      return time;
   }
   public void setTime(String time) {
      this.time = time;
   }
   
}
