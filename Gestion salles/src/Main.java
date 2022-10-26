import my.projet.beans.Salle;
import my.projet.service.SalleService;

public class Main {
    public static void main(String[] args) {

        Salle s1=new Salle("rer","fdstrd");
        SalleService sc=new SalleService();
        System.out.println(sc.create(s1));
        System.out.println(sc.create(new Salle("rsdsr","fdstdfsrd")));
        System.out.println(sc.create(new Salle("asdsr","fg")));
        System.out.println(sc.create(new Salle("dsdfa","fdstdfsrd")));
        System.out.println(sc.create(new Salle("rvssdsdsr","fdstdfsrd")));
        System.out.println(sc.create(new Salle("rssddsr","fdstdfsrd")));
        System.out.println(sc.create(new Salle("sd","fdstdfsrd")));
        System.out.println(sc.findAll());
        System.out.println("-----------");
        System.out.println(sc.delete(s1));
        System.out.println(sc.findAll());
    }
}