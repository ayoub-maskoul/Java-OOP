package my.projet.classes;

public class Employe extends People { /* class extends from class people */
    private double salary;


    public Employe(String lastName, String firstName, double salary) {
        super(lastName, firstName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe:" +super.toString() +
                " salary='" + salary+"£";
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
