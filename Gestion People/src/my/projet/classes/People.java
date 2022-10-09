package my.projet.classes;

public class People {  /* Add mother class */
    private int id;
    private String lastName;
    private String firstName;
    private static int count;
    public People(String lastName,String firstName){
        this.id=++count;
        this.lastName = lastName;
        this.firstName = firstName;

    }
    @Override
    public String toString() {
        return  lastName.toUpperCase() + " "
                + firstName + " ";
    }


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
}
