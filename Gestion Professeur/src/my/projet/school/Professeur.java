package my.projet.school;

public class Professeur {
    /* Add Attributes */
    private int id;
    private String lastName;
    private String firstName;
    private String telephone;
    private String email;
    private Speciality speciality;
    private static int count;
    /* Add Constructor */
    public Professeur(String lastName, String firstName, String telephone, String email, Speciality speciality) {
        this.id = ++count;
        this.lastName = lastName;
        this.firstName = firstName;
        this.telephone = telephone;
        this.email = email;
        this.speciality = speciality;
    }
    /* Add Method toString */
    @Override
    public String toString() {
        return "Professeur{" +
                "id=" + id +
                ", nom='" + lastName + '\'' +
                ", prenom='" + firstName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", specialite=" + speciality +
                '}';
    }
    /* Add Methods get and set */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
