package my.projet.classes;

public class Student extends People{ /* class extends from class people */
    private String cne;


    public Student(String getFirstName, String firstName, String cne) {
        super(getFirstName, firstName);
        this.cne = cne;
    }

    @Override
    public String toString() {
        return "Student: " +super.toString() +
                " cne='" + cne ;
    }
}
