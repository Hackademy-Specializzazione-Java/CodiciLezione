public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Employee alek = new Employee("Alek", "Leo", 36, "Docente");

        Student mario = new Student("Mario", "Fiorelli", 28, "Java");

        //UPCASTING
        //Organizzazione del codice
        Person emp = new Employee("Roberto", "Russo", 32, "Docente");
        Person emp2 = new Teacher(null, null, 0, null, null, 0);

        alek.displayInfo();
        mario.displayInfo();

        emp.displayInfo();


    }
}
