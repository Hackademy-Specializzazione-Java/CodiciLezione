public class App {
    //Una funzione statica può richiamare solo funzione che siano static
    //funzione statica chiama altre funzioni statiche
    //funzione non statica può chiamre sia funzioni statiche che funzioninon statiche
    public static void main(String[] args) throws Exception {
        //Programmazione imperativa
        // info1("Christian","D'agostino");
        // info1("Alberto","Comerci");
        // info2();

        // Person p = new Person();
        // p.name = "Christian";
        // p.surname = "D'agostino";

        // Person p2 = new Person();
        // p2.name = "Lara";
        // p2.surname = "Croft";

        // info(p);
        // info(p2);

        // Person lara = new Person("Lara","Croft");

        // Person mario = new Person(23, "Mario","Fioelli");

        Person p1 = new Person("Lara","Croft");

        // Person p2 = new Person(23, "Mario","Fioelli");

        Person p2 = new Person("Lara","Croft");

        // lara.info();
        // mario.info();

        // String name1 = "primoNome";
        // name1 = "secondoNomde";

        //p2 = p1;

        //Side effect
        // p2.name = "Antonio";
        // p2.setName("Antonio");

        // p1.info();

        // System.out.println(p1);
        // System.out.println(p2);

        // int primoNumero = 3;
        // int secondoNumero = 10;

        // sum(primoNumero, secondoNumero);

        //Uguaglianza fra oggetti
        //System.out.println(p1 == p2);

        //equals() è un metodo ereditato da object
        //in java tutti gli oggetti sono figli di object
        System.out.println(p1.equals(p2));

        //System.out.println(p1);

    }

    // public static void info(Person person){
    //     System.out.println("Ciao questa è la prima lezione di oop di "+ person.name +" "+ person.surname +";");
    // }

    // public static void info(Person person, String param){
    //     System.out.println("Ciao questa è la prima lezione di oop di "+ person.name +" "+ person.surname +";");
    // }

    // public static void info1(String name, String surname){
    //     // String name = "Christian";
    //     // String surname = "D'agostino";
    //     System.out.println("Ciao questa è la prima lezione di oop di "+name+" "+surname+";");
    // }

    // public static void info2(){
    //     String name1 = "Alberto";
    //     String surname1 = "Comerci";
    //     System.out.println("Ciao questa è la prima lezione di oop di "+name1+" "+surname1+";");
    // }

    //Funzione pura
    // public static int sum(int num1, int num2){
    //     return num1 + num2;
    // }

    // public static void sum(int num1, int num2){
    //     int sum =  num1 + num2;
    //     System.out.println(sum);
    // }
}