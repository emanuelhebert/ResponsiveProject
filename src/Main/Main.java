package Main;

import Model.Addres;
import Model.Contact;
import Model.Patient;
import Model.Psychologist;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient(
                "Emanuel Hebert Rocha Almeida",
                "16/01/2002",
                "056.804.524-64",
                new Contact("(83) 991506190",
                        "emanuelhebert00@gmail.com"),
                new Addres("Brazil",
                        "Paraiba",
                        "Cajazeiras",
                        "Street: Perpetuo Correia Lima",
                        230,
                        "House"),
                "Anxiety",
                "Need medicine",
                "Money");

        Psychologist psychologist = new Psychologist(
                "Jose nao sei das quantas",
                "16/01/2002",
                "658.541.544-56",
                new Contact("(85) 991563278",
                        "josenaoseidasquantas@gmail.com"),
                new Addres("Brazil",
                        "Ceara",
                        "Acarape",
                        "Street: Joao rei delas",
                        56,
                        "Apartment"),
                "Anxiety, Depression, Racism",
                "Anxiety, Depression, Racism, LGBTQIA+, OCD",
                "Psychology",
                "Saint Mary University",
                "10º",
                "Recently graduated in the main areas of psychic problems and ready to help you");

        System.out.println(patient);
        System.out.println("---------------------------------");
        System.out.println(psychologist);
    }

}
