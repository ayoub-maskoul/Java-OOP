package my.projet.classes;

public class Professor extends Employe{ /* class extends from class Employe */
    private String special;

    public Professor(String nom, String firstName, double salary, String special) {
        super(nom, firstName, salary);
        this.special = special;
    }

    @Override
    public String toString() {
        return "Professor: "+super.getFirstName() +' '+super.getLastName()+' '+
                +super.getSalary()+'£'+
                " special=" + special  ;
    }
}
