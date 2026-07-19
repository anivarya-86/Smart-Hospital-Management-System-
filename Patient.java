package SmartHospitalManagementSystem;

import java.util.Scanner;

public class Patient {

     String name;
     int patientID;
     int age;
     String disease;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Patient(String name , int patientID , int age , String disease) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.disease = disease;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", patientID=" + patientID +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }
}
