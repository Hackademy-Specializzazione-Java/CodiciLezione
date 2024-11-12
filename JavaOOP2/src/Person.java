public abstract class Person {

    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Metodi concreti

    //Sono proprio loro che definiscono una classe come astratta
    //Se una classe possiede ALMENO UN METODO ASTRATTO possiamo definirla astratta, in caso contrario essa è concreta
    //Metodi astratti
    //Metodo polimorfo
    public abstract void displayInfo();

}