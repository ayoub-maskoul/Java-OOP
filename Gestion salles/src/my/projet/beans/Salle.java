package my.projet.beans;

public class Salle {
    private int id;
    private String code;
    private String wording;
    private static int comp;
    public Salle(String code, String libelle) {
        this.id = ++comp;
        this.code = code;
        this.wording = libelle;
    }

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

    public void setWording(String libelle) {
        this.wording = libelle;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + wording + '\'' +
                '}';
    }
}
