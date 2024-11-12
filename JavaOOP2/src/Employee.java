public class Employee extends Person{

    public String role;

    public Employee(String name, String surname, int age, String role) {
        //Ricevi i parametri dal costruttore del figlio e passali al costruttore del padre
        super(name, surname, age);
        this.role = role;
    }

    //Metodi di classe
    //Annotation (danno informazioni al compilatore)
    @Override
    public void displayInfo() {
        // System.out.println("Ciao sono l'implementazione del metodo della classe astratta");
        System.out.println("Ciao sono un impiegato e il mio nome è "+name+" il mio cognome è "+surname+" la mia età è "+age+" anni ed il mio ruolo è "+role+"!!");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
