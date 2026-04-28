
import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Game> games;

    public Player(String name){
        this.name = name;
        games = new ArrayList();
    }

    public String getName(){return name;}
    public void addGame(Game game){
        games.add(game);
    }
    public void Play(){
        for (Game e: games){
            if(!e.isPlayed()){
                e.play();
            }
        }
    }
    public long getPoints(){
        long points = 0;
        for (Game e: games){
            if(e.isPlayed()){
                points += e.getpoints();
            }
        }
        return points;
    }
    public int getNumberOfPlayedGames(){
        int played = 0;
        for (Game e: games){
            if(e.isPlayed()){
                played++;
            }
        }
        return played;
    }
}
