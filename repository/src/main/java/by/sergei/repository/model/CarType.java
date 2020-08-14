package by.sergei.repository.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_type_table")
public class CarType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "carType", fetch = FetchType.LAZY)
    private List<Car> cars;

    public CarType() {
    }

    public CarType(Integer id, String typeName, String description, List<Car> cars) {
        this.id = id;
        this.typeName = typeName;
        this.description = description;
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
