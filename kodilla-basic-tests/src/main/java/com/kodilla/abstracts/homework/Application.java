package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Nurse nurse = new Nurse();
        Person Kamila = new Person("Kamila", 30, nurse);
        String kamilaResponsibilities = nurse.getResponsibilities();
        System.out.println("Kamila's duties at work are: " + kamilaResponsibilities);

        Manager manager = new Manager();
        Person Marek = new Person("Marek", 37, manager);
        String marekResponsibilities = manager.getResponsibilities();
        System.out.println("Marek's duties at work are: "+marekResponsibilities);

        Seller seller = new Seller();
        Person Ola = new Person("Ola", 24, seller);
        String olaResponsibilities = seller.getResponsibilities();
        System.out.println("Ola's duties at work are: "+olaResponsibilities);


    }
}
