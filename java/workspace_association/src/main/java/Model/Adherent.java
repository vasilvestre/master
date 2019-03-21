package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "adherent")
public class Adherent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "dateSubscription", nullable = false)
    private String dateSubscription = null;
    @Column(name = "dateBirth", nullable = false)
    private String dateBirth;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "hasPaid")
    private Integer hasPaid;
    @Column(name = "cooptation")
    private Integer cooptation;

    public Adherent() {
    }

    public Adherent(String firstName, String lastName, String dateBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.email = email;
    }

    public Adherent(String firstName, String lastName, String dateBirth, String email, Integer hasPaid, Integer cooptation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.email = email;
        this.hasPaid = hasPaid;
        this.cooptation = cooptation;
    }

    public Adherent(String firstName, String lastName, String dateSubscription, String dateBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateSubscription = dateSubscription;
        this.dateBirth = dateBirth;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateSubscription='" + dateSubscription + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateSubscription() {
        return dateSubscription;
    }

    public void setDateSubscription(String dateSubscription) {
        this.dateSubscription = dateSubscription;
    }

    public void setHasPaid(Integer hasPaid) {
        this.hasPaid = hasPaid;
    }

    public void setCooptation(Integer cooptation) {
        this.cooptation = cooptation;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(int hasPaid) {
        this.hasPaid = hasPaid;
    }

    public int getCooptation() {
        return cooptation;
    }

    public void setCooptation(int cooptation) {
        this.cooptation = cooptation;
    }

    @PrePersist
    protected void prePersist() {
        if (this.dateSubscription == null) {
            String pattern = "dd/MM/yy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            this.dateSubscription = simpleDateFormat.format(new Date());
        }
    }

}
