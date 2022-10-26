package my.projet.dao;
import my.projet.beans.Salle;
import java.util.List;

public interface IDao {
    boolean create(Salle o);
    boolean update(Salle o);
    boolean delete(Salle o);
    Salle findById (int id);
    List findAll ();
}
