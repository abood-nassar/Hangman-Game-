public abstract class Game {
    protected long points;
    protected boolean status;
    private final String description;

    public Game(String description){
        this.description = description;
        points = 0;
        status = false;
    }
    public boolean isPlayed(){return status;}
    public long getpoints(){return points;}
    public abstract void play();

    @Override
    public String toString(){
        return description;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Game)
            return description.equals(((Game)o).toString());
        return false;
    }
}
