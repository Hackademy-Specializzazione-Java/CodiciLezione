public class Person {

    //Attributi (proprietà) di classe (Fields)
    //Sono caratteristiche fondamentali che distunguono la tipologia di classe che stiamo creando
    private String name;
    private String surname;
    private int age;

    //Costruttore
    //Overloading del costruttore
    //Java in base alla tipologia e ORDINE dei parametri reali passati capisce quale costruttore andare a richiamare

    //Il costruttore possiede lo stesso nome della classe(seguendo anche le maiuscole) ed ha la stessa struttura di una funzione
    public Person(){}

    public Person(String name, String surname){
        //this è un costrutto del linguaggio che indica nel costruttore l'oggetto che verrà creato
        this.name = name;
        this.surname = surname;
    }

    public Person( int age, String name, String surname){
        //this è un costrutto del linguaggio che indica nel costruttore l'oggetto che verrà creato
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Metodi (comportamenti)
    public void info(){
        //this nella classe sta facendo riferimento all'oggetto che ho creato
        //System.out.println("Ciao questa è la prima lezione di oop di "+ this.name +" "+ this.surname +";");
        System.out.println("Ciao questa è la prima lezione di oop di "+ name +" "+ surname +";");
    }

    //Una sovrscrittura andrà a buon fine SOLO ED ESCLUSIVAMENTE SE il metodo ha la stessa firma di quello del padre, la firma non è altro che quello che scriviamo nella dichiarazione della funzione
    @Override
    public boolean equals(Object obj) {
        //System.out.println(p1.equals(p2));
        Person newP = (Person) obj;
        return ((this.name == newP.name) && (this.surname == newP.surname));
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
