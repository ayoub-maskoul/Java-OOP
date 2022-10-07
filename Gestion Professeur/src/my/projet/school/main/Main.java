package my.projet.school.main;

import my.projet.school.Professeur;
import my.projet.school.Speciality;

public class Main {

    public static void main(String[] args) {
        Speciality sp1;
        sp1=new Speciality("m202","dev");
        System.out.println(sp1.getId());
        Speciality sp2;
        sp2=new Speciality("m203","full.stack");
        System.out.println(sp2.getId());

        Professeur pr1;
        pr1= new Professeur("omar","ahmed","+263-6342-42743","zjehd@ezhrez.zw",sp2);
        System.out.println(pr1);
    }

}

