package Model;

import java.util.Calendar;

public class Psychologist extends User {
    String attendanceTopics;
    String searchAreas;
    String academicFormation;
    String course;
    String college;
    String period;
    String description;

    public Psychologist(String completeName,
                        String birthDate,
                        String CPF,
                        Contact contact,
                        Addres addres,
                        String attendanceTopics,
                        String academicFormation,
                        String course,
                        String college,
                        String period,
                        String description) {
        super(completeName, birthDate, CPF, contact, addres);
        this.attendanceTopics = attendanceTopics;
        this.academicFormation = academicFormation;
        this.course = course;
        this.college = college;
        this.period = period;
        this.description = description;
    }

    public String getAttendanceTopics() {
        return attendanceTopics;
    }

    public void setAttendanceTopics(String attendanceTopics) {
        this.attendanceTopics = attendanceTopics;
    }
    public String getAcademicFormation() {
        return academicFormation;
    }

    public void setAcademicFormation(String academicFormation) {
        this.academicFormation = academicFormation;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Psychologist{" +
                '\n' + "attendanceTopics='" + attendanceTopics + '\'' +
                ", \n academicFormation='" + academicFormation + '\'' +
                ", \n course='" + course + '\'' +
                ", \n college='" + college + '\'' +
                ", \n period='" + period + '\'' +
                ", \n description='" + description + '\'' +
                ", \n completeName='" + completeName + '\'' +
                ", \n birthDate=" + birthDate +
                ", \n CPF='" + CPF + '\'' +
                ", \n contact=" + contact +
                ", \n addres=" + addres +
                '}';
    }
}
