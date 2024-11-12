public class Enemy implements MoveSet{

    public String name;
    public String role;
    public int point;

    public Enemy(String name, String role, int point) {
        this.name = name;
        this.role = role;
        this.point = point;
    }

    public void moveForward(){
        System.out.println("nemico avanza");
    }

    public void moveBack(){
        System.out.println("nemico va indietro");
    }

    public void jump(){
        System.out.println("nemico BOING BOING");
    }

    public void gratings(){
        System.out.println("ciao sono un nemico");
    }

}
