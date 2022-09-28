package Model;

public class Addres {
    String country;
    String State;
    String city;
    String addres;
    int number;
    String complement;

    public Addres(String country, String state, String city, String addres, int number, String complement) {
        this.country = country;
        State = state;
        this.city = city;
        this.addres = addres;
        this.number = number;
        this.complement = complement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public String toString() {
        return "Addres{" +
                '\n' + "country='" + country + '\'' +
                ", \n State='" + State + '\'' +
                ", \n city='" + city + '\'' +
                ", \n addres='" + addres + '\'' +
                ", \n number=" + number +
                ", \n complement='" + complement + '\'' +
                '}';
    }
}
