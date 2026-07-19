package SmartHospitalManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Smart Hospital Management System ");

        Hospital hospital = new Hospital();
        System.out.println("Welcome to Smart Hospital Management System--: ");

        while (true) {
            System.out.println(" 1. Add Patient : ");
            System.out.println(" 2. All Display : ");
            System.out.println(" 3. Search ID : ");
            System.out.println(" 4. Search Name : ");
            System.out.println(" 5. Exit");
            System.out.println("Please Enter Your Choice : ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter The Patient Name : ");
                    String name = input.next();
                    System.out.print("Enter Patient Id : ");
                    int Id = input.nextInt();
                    System.out.print("Enter the Patient Age : ");
                    int age = input.nextInt();
                    System.out.print("Enter the Disease : ");
                    String disease = input.next();
                    input.nextLine();

                    Patient patient = new Patient(name, Id, age, disease);
                    hospital.addPatient(patient);
                    System.out.println("Patient Add Successfully");
                }
                case 2 -> {
                    System.out.println("ALL Display Patient : ");
                    hospital.displayAllPatients();
                }
                case 3 -> {
                    System.out.println("Search Through Id : ");
                    int foundId = input.nextInt();
                    hospital.searchPatient(foundId);


                }
                case 4 -> {
                    System.out.println("Search Through Name : ");
                    String foundName = input.nextLine();
                    hospital.searchPatient(foundName);

                }
                case 5 ->{
                    System.out.println("Thank You for using Smart Hospital Management System ");
                    System.exit(0);
                }

                }

            }


        }
    }





