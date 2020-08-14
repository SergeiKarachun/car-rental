package by.sergei.repository.model;

import javax.persistence.*;

@Entity(name = "passport_table")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "valid_from")
    private String validFrom;

    @Column(name = "valid_before")
    private String validBefore;

    @Column(name = "nationality")
    private String nationality;

    @OneToOne(mappedBy = "passport", fetch = FetchType.LAZY)
    private UserDescription userDescription;

    public Passport(Integer id, String passportNumber, String validFrom, String validBefore, String nationality, UserDescription userDescription) {
        this.id = id;
        this.passportNumber = passportNumber;
        this.validFrom = validFrom;
        this.validBefore = validBefore;
        this.nationality = nationality;
        this.userDescription = userDescription;
    }

    public Passport() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidBefore() {
        return validBefore;
    }

    public void setValidBefore(String validBefore) {
        this.validBefore = validBefore;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(UserDescription userDescription) {
        this.userDescription = userDescription;
    }
}
