package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	Author a1=new Author();
    a1.setName("Nikola");
        Referate r1=new Referate("Comedy", 360, a1 );
        Referate rc1= (Referate) r1.clone();
        Referate rc2= (Referate) r1.clone();
        Referate rc3= (Referate) r1.clone();
        Author a2=new Author();
        a2.setName("Mitko");
        Author a3=new Author();
        a3.setName("Velizar");
        Author a4=new Author();
        a4.setName("Stamati");

        rc1.setAuthor(a2);
        rc2.setAuthor(a3);
        rc3.setAuthor(a4);
        System.out.println(rc1.toString());
        System.out.println(rc2.toString());
        System.out.println(rc3.toString());

    }
}
