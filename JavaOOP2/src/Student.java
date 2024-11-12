public class Student extends Person{

    public String course;

    public Student(String name, String surname, int age, String course) {
        super(name, surname, age);
        this.course = course;
    }

    //Metodi di classe
    @Override
    public void displayInfo() {
        System.out.println("Ciao sono uno studente e il mio nome è "+name+" il mio cognome è "+surname+" la mia età è "+age+" anni ed il corso che frequento è "+course+"!!");
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
