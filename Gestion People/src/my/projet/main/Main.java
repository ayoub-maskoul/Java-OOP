package my.projet.main;

import my.projet.classes.Employe;
import my.projet.classes.Student;
import my.projet.classes.Professor;


public class Main {
    public static void main(String[] args) {

        Employe empl1 = new Employe("Douk", "Rachid", 10000);
        Employe empl2 = new Employe("Ngoye", "ahmed", 7000);
        System.out.println(empl1+"\n"+empl2);

        Student etu1 = new Student("bakali", "Mohammed", "kb678754");
        Student etu2 = new Student("aloui", "ali", "ac543543");
        System.out.println(etu2+"\n"+etu1);

        Professor prof1 = new Professor("Oba", "massoudi", 22000, "php-crud");
        Professor prof2 = new Professor("riad", "amal", 20000, "bureautique");
        System.out.println(prof1+"\n"+prof2);
    }
}