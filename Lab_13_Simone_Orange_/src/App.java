
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App
{
    static ArrayList<Player> fps = new ArrayList<>();
    static Player[] ps = new Player[10];

    public static void main(String[] args)
    {


        loadPlayers();
        Collections.shuffle(fps);

        Collections.addAll(fps, ps);
        

        Player fpHighest = highestRatings("Football");
        System.out.println(fpHighest.getFirstName() + 
                " has the highest ratings in football, which is " + fpHighest.getRatings());

        Player scHighest = highestRatings("Soccer");
        System.out.println(scHighest.getFirstName() + 
                " has the highest ratings in soccer, which is " + scHighest.getRatings());

        
        Player fpcHighestYards = highestYards();
        System.out.println(fpcHighestYards.getFirstName() + 
                " has the highest yards, which is " + 
                ((FootballPlayer) fpcHighestYards).getYards());

    }//main end
    public static void loadPlayers()
    {
        Height height1 = new Height(5, 7);
        Height height2 = new Height(5, 11);
        Height height3 = new Height(6, 0);
        ps[0] = new SoccerPlayer("jillian", "Jennings", height1, "Montclair", "NJ", "Cyber", "Sr.", 3.5, 7,"Soccer", 10, 5, 2);
        ps[1] = new SoccerPlayer("Olivia", "Damico", height1, "Victor", "NY", "IST", "Jr.", 3.6, 20,"Soccer", 20, 5, 1);
        ps[2] = new SoccerPlayer("Amelia", "White", height1, "Fort Wayne", "IND", "SRA", "Fr.", 3.8, 21,"Soccer", 10, 6, 1);
        ps[3] = new SoccerPlayer("Luciana", "Latino", height1, "Norwood", "NJ", "IST", "Fr.", 3.7, 31,"Soccer", 10, 6, 4);
        ps[4] = new SoccerPlayer();

        ps[5] = new FootballPlayer("KEATON", "Ellis", height2, "State College", "PA", "IST", "Jr.", 3.5, 26,"Football", 10, 60, 30);
        ps[6] = new FootballPlayer("Jaylen", "Reed", height3, "Martinsville", "VA", "Cyber", "So.", 3.5, 2,"Football", 10, 90, 40);
        ps[7] = new FootballPlayer("Kaytron", "Allen", height2, "York", "PA", "SRA", "Fr.", 3.5, 11,"Football", 10, 120, 35);
        ps[8] = new FootballPlayer("Mason", "Stahl", height2, "Pittsburgh", "PA", "SRA", "Fr.", 3.5, 17,"Football", 10, 121, 55);
        ps[9] = new FootballPlayer();
    }//loadplayers end
    
    public static Player highestRatings(String sports)
    {
         Player player = fps.get(0);
         for (int i = 1; i < fps.size(); i++) {
             if (fps.get(i).getSports().equals(sports)) {

                if (fps.get(i).getRatings() > player.getRatings()) {
                    player = fps.get(i);
                }

             }  
         }
         return player;
    }//highestratings end

    public static Player highestYards()
    {
        ArrayList<Player> localps = new ArrayList<>();
        for (int i = 0; i < fps.size(); i++) {
            if (fps.get(i).getSports().equals("Football")) {
                localps.add(fps.get(i));
            }
        }
        Player player = localps.get(0);
        double largest = 0;
        for (int i = 0; i < localps.size(); i++) {
            FootballPlayer fp = (FootballPlayer)localps.get(i);
            double playerYards = fp.getYards();

                if (playerYards > largest) {
                   largest = playerYards;
                   player = localps.get(i);
                }
        }
        return player;
    }//highestyards end
}//app class end

