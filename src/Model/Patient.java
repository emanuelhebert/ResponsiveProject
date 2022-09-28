package Model;

public class Patient extends  User{

    String psychoProblem;
    String diagnosis;
    String paymentForms;

    public Patient(String completeName,
                   String birthDate,
                   String CPF,
                   Contact contact,
                   Addres addres,
                   String psychoProblem,
                   String diagnosis,
                   String paymentForms) {
        super(completeName, birthDate, CPF, contact, addres);
        this.psychoProblem = psychoProblem;
        this.diagnosis = diagnosis;
        this.paymentForms = paymentForms;
    }

    public String getPsychoProblem() {
        return psychoProblem;
    }

    public void setPsychoProblem(String psychoProblem) {
        this.psychoProblem = psychoProblem;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPaymentForms() {
        return paymentForms;
    }

    public void setPaymentForms(String paymentForms) {
        this.paymentForms = paymentForms;
    }

    @Override
    public String toString() {
        return "Patient{" +
               '\n' + "psychoProblem='" + psychoProblem + '\'' +
                ",\n diagnosis='" + diagnosis + '\'' +
                ", \n paymentForms='" + paymentForms + '\'' +
                ", \n completeName='" + completeName + '\'' +
                ", \n birthDate='" + birthDate + '\'' +
                ", \n CPF='" + CPF + '\'' +
                ", \n contact=" + contact +
                ", \n addres=" + addres +
                '}';
    }
}
