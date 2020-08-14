package by.sergei.repository.model;

import by.sergei.repository.model.enums.Fuel;

import javax.persistence.*;

@Entity
@Table(name = "car_description_table")
public class CarDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @Column(name = "type_of_transmission")
    private String typeOfTransmission;

    @Column(name = "number_of_seats")
    private String numberOfSeats;

    @Column(name = "has_air_conditioner")
    private boolean hasAirConditioner;

    @Column(name = "colour")
    private String colour;

    @Column(name = "interior_material")
    private String interiorMaterial;

    @Enumerated(EnumType.STRING)
    @Column(name = "fuel")
    private Fuel fuel;

    @OneToOne(mappedBy = "carDescription", fetch = FetchType.LAZY)
    private Car car;

    public CarDescription() {
    }

    public CarDescription(Integer id, String yearOfIssue, String typeOfTransmission, String numberOfSeats, boolean hasAirConditioner, String colour, String interiorMaterial, Fuel fuel, Car car) {
        this.id = id;
        this.yearOfIssue = yearOfIssue;
        this.typeOfTransmission = typeOfTransmission;
        this.numberOfSeats = numberOfSeats;
        this.hasAirConditioner = hasAirConditioner;
        this.colour = colour;
        this.interiorMaterial = interiorMaterial;
        this.fuel = fuel;
        this.car = car;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getInteriorMaterial() {
        return interiorMaterial;
    }

    public void setInteriorMaterial(String interiorMaterial) {
        this.interiorMaterial = interiorMaterial;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
