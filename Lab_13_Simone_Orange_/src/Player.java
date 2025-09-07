
public abstract class Player extends Student {
    private int number;
    private String sports;
    private int gamesPlayed;

    
    
    public Player(String firstName, String lastName, Height height, String hometown, String state, String Major, String AcademicYear, double GPA, int number, String sports, int gamesPlayed) {
        super(firstName, lastName, height, hometown, state, Major, AcademicYear, GPA);
        
        this.number = number;
        this.sports = sports;
        this.gamesPlayed = gamesPlayed;
    }
    
    public Player() {
        super();

        this.number = 0;
        this.sports = "none";
        this.gamesPlayed = 0;
    }
    
    @Override
    public String toString() { 
          
       return super.toString() + "Player{" + "number=" + this.number + ", " + "sports=" + this.sports + ", gamesPlayed=" + this.gamesPlayed + "}\n";
          
        
    }
    
    //get and set starts here
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public abstract double getRatings();
}//end of player class brace
