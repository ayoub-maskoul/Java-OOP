package my.projet.service;
import java.util.ArrayList;
import my.projet.beans.Salle;
import my.projet.dao.IDao;

import java.util.List;

public class SalleService implements IDao {
    private List<Salle> salles;
    public SalleService() {
        salles = new ArrayList<Salle>();
    }
    @Override
    public boolean create (Salle s){
        return salles.add(s);
    }
    @Override
    public boolean update(Salle s){
        for (int i=0;i<salles.size();i++){
            if(salles.get(i).getId()==s.getId()){
                s.setCode(s.getCode());
                s.setWording(s.getWording());
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean delete(Salle s){
        return  salles.remove(s);

    }
    @Override
    public Salle findById (int id){
        for (int i=0;i<salles.size();i++) {
            if (salles.get(i).getId() == id)
                return salles.get(i);
        }
        return null;
    }
    @Override
    public List findAll (){
        return salles;
    }
}
