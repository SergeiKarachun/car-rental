package by.sergei.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "address_table")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "home_number")
    private String homeNumber;

    @Column(name = "flat_number")
    private String flatNumber;

    @OneToOne(mappedBy = "address")
    private Contact contact;

    public Address() {
    }

    public Address(Integer id, String country, String city, String street, String postalCode, String homeNumber, String flatNumber, Contact contact) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
