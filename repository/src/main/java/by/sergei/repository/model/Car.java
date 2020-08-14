package by.sergei.repository.model;


import by.sergei.repository.model.enums.CarStatus;

import javax.persistence.*;

@Entity
@Table(name = "car_table")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "car_number")
    private Integer carNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_type_id", referencedColumnName = "id")
    private CarType carType;

    @OneToOne
    @JoinColumn(name = "car_description_id", referencedColumnName = "id")
    private CarDescription carDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_status")
    private CarStatus carStatus;

    @OneToOne(mappedBy = "car", fetch = FetchType.LAZY)
    private Order order;

    public Car() {
    }

    public Car(Integer id, Integer carNumber, CarType carType, CarDescription carDescription, CarStatus carStatus, Order order) {
        this.id = id;
        this.carNumber = carNumber;
        this.carType = carType;
        this.carDescription = carDescription;
        this.carStatus = carStatus;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarDescription getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(CarDescription carDescription) {
        this.carDescription = carDescription;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
