package by.sergei.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "contact_table")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "phone_namber")
    private String phoneNumber;

    @OneToOne(mappedBy = "contact", fetch = FetchType.LAZY)
    private UserDescription userDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address adress;

    public Contact() {
    }

    public Contact(Integer id, String phoneNumber, UserDescription userDescription, Address adress) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.userDescription = userDescription;
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(UserDescription userDescription) {
        this.userDescription = userDescription;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
