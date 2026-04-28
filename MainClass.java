

public class MainClass {

    
    public static void main(String[] args) {
        Platform myPlatform=new Platform();
        System.out.println(myPlatform.bestPlayerName());
        Player p1=new Player("abd");
        p1.addGame(new HangMan(" sddsadasd", "iron man" , "Movie"));
        p1.addGame(new HangMan(" sdedgsadasd", "The Office" , "series"));
        p1.addGame(new HangMan(" gddfg", "batman" , "Movie"));
        
        Player p2=new Player("ahmad");
        p2.addGame(new HangMan(" sddsfgggadasd", "the ring" , "Movie"));
        p2.addGame(new HangMan(" sddsadasd", "the godfather" , "Movie"));
        p2.addGame(new HangMan(" sddsfdsssadasd", "spider man" , "Movie"));
        
        Player p3=new Player("mohammad");
        p3.addGame(new HangMan(" sddffffsadasd", "the falcon" , "series"));
        p3.addGame(new HangMan(" sddsddddddadasd", "the hulk" , "Movie"));
        p3.addGame(new HangMan(" sddsyyyyadasd", "jordan" , "country"));
        
        myPlatform.addPlayer(p1);
        myPlatform.addPlayer(p2);
        myPlatform.addPlayer(p3);
        //HangMan h1=new HangMan(" sddsadasd", "iron man" , "Movie");
        p1.Play();
        System.out.println("NumberOfPlayedGames for "+p1.getName()+" :"+p1.getNumberOfPlayedGames());
        System.out.println("player name :"+p1.getName());
        System.out.println(p1.getName()+" ponits :"+p1.getPoints());
        System.out.println("");
        p2.Play();
        System.out.println("NumberOfPlayedGames for "+p2.getName()+" :"+p2.getNumberOfPlayedGames());
        System.out.println("player name :"+p2.getName());
        System.out.println(p2.getName()+" ponits :"+p2.getPoints());
        System.out.println("");
        p3.Play();
        System.out.println("NumberOfPlayedGames for "+p3.getName()+" :"+p3.getNumberOfPlayedGames());
        System.out.println("player name :"+p3.getName());
        System.out.println(p3.getName()+" ponits :"+p3.getPoints());
        System.out.println("\nbest player:");
        System.out.println(myPlatform.bestPlayerName());
    }
}


