
public class FootballPlayer extends Player {
    private int yards;
    private int minutesPlayed;
    
    
    public FootballPlayer(String firstName, String lastName, Height height, String hometown, String state, String Major, String AcademicYear, double GPA, int number, String sports, int gamesPlayed, int yards, int minutesPlayed) {
        super(firstName, lastName, height, hometown, state, Major, AcademicYear, GPA, number, sports, gamesPlayed);
        
        this.yards = yards;
        this.minutesPlayed = minutesPlayed;

    }
    
    public FootballPlayer() {
        super();

        this.yards = 0;
        this.minutesPlayed = 0;
    }
    
        @Override
    public String toString() { 
          
       return super.toString() + "FootballPlayer{" + "yards=" + this.yards + ", " + "minutesPlayed=" + this.minutesPlayed + ", ratings=" + getRatings() + "}";
          
        
    }
    

    public double getRatings() {
        
       if (minutesPlayed == 0 || yards == 0){
           return 0;
       } else {  

        double fpRating = ((double)(yards - minutesPlayed/10.0))/(double)super.getGamesPlayed();
        return fpRating;
       }
    }
    
    //get and set starts here
    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }


    
}//football player class end brace
