public class Freelancer extends Employee{

    public String project;
    public int commision;

    public Freelancer(String name, String surname, int age, String role, String project, int commision) {
        super(name, surname, age, role);
        this.project = project;
        this.commision = commision;
    }

    public void workOnProject(){
        System.out.println("Il freelancer " + name + " " + surname + " sta lavorando al progetto " + project);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    
    

}
