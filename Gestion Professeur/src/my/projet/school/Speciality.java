package my.projet.school;

public class Speciality {
    /* Add Attributes */
    private int id;
    private String code;
    private String wording;
    private static int count;
    public Speciality(String code, String wording) {
        this.id = ++count;
        this.code = code;
        this.wording = wording;
    }
    /* Add Method toString */
    @Override
    public String toString() {
        return "Specialite{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + wording + '\'' +
                '}';
    }
    /* Add Methods get and set */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }
}
