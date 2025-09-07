
public class SoccerPlayer extends Player {
    private int goals;
    private int yellowCards;
    
    public SoccerPlayer(String firstName, String lastName, Height height, String hometown, String state, String Major, String AcademicYear, double GPA, int number, String sports, int gamesPlayed, int goals, int yellowCards) {
        super(firstName, lastName, height, hometown, state, Major, AcademicYear, GPA, number, sports, gamesPlayed);
        
        this.goals = goals;
        this.yellowCards = yellowCards;
        
    }
    
    public SoccerPlayer() {
        super();

        this.goals = 0;
        this.yellowCards = 0;

    }

        @Override//need to fix
    public String toString() { 
          
       return super.toString() + "SoccerPlayer{" + "goals=" + this.goals + ", " + "yellowCards=" + this.yellowCards + ", ratings=" + getRatings() + "}";
          
        
    }
    
    
    public double getRatings() {
        
       if (super.getGamesPlayed() == 0 || goals == 0){
           return 0;
       } else {  
        double spRating = ((double)(goals - yellowCards))/(double)super.getGamesPlayed();
        return spRating;
        
       }
    }
    
    
    //get and set starts here
    
    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }


    
}//soccerplayer class end brace
