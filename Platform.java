import java.util.ArrayList;

public class Platform {
    private ArrayList<Player> player;

    public Platform(){
        player = new ArrayList();
    }
    public void addPlayer(Player player){
        this.player.add(player);
    }
    public String bestPlayerName(){
        long max = 0;
        int index = 0;
        for (int i = 0; i < player.size(); i++){
            if (player.get(i).getPoints() > max){
                max = player.get(i).getPoints();
                index = i;
            }
        }
        if (max == 0 || player.isEmpty()){
            return "None";
        }
        return player.get(index).getName();
    }
}
