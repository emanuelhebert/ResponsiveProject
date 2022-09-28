package Model;

import java.util.Calendar;
public class User {

    String completeName;
    String birthDate;
    String CPF;
    Contact contact;
    Addres addres;
    String state;
    String city;
    int number;

    public User(String completeName,
                String birthDate,
                String CPF,
                Contact contact,
                Addres addres) {
        this.completeName = completeName;
        this.birthDate = birthDate;
        this.CPF = CPF;
        this.contact = contact;
        this.addres = addres;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "User{" +
                "completeName='" + completeName + '\'' +
                ", birthDate=" + birthDate +
                ", CPF='" + CPF + '\'' +
                ", contact=" + contact +
                ", addres=" + addres +
                '}';
    }
}
