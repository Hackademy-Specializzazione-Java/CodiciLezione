public class Player implements MoveSet{

    public String name;
    public String role;
    public int point;

    public Player(String name, String role, int point) {
        this.name = name;
        this.role = role;
        this.point = point;
    }

    public void moveForward(){
        System.out.println("mi movo in avanti");
    }

    public void moveBack(){
        System.out.println("mi muovo indietro");
    }

    public void jump(){
        //TODO
    }

    public void gratings(){
         //TODO
    }

}


// public class Player extends PingoPallino implements MoveSet, Pippo, Pluto, Paperino{}
