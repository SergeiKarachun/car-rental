package by.sergei.repository.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "date_start_using")
    private Date dateStartUsing;

    @Column(name = "date_end_using")
    private Date dateEndUsing;

    @Column(name = "permission")
    private boolean permission;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;


    public Order() {
    }

    public Order(Integer id, Date dateStartUsing, Date dateEndUsing, boolean permission, User user, Car car) {
        this.id = id;
        this.dateStartUsing = dateStartUsing;
        this.dateEndUsing = dateEndUsing;
        this.permission = permission;
        this.user = user;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateStartUsing() {
        return dateStartUsing;
    }

    public void setDateStartUsing(Date dateStartUsing) {
        this.dateStartUsing = dateStartUsing;
    }

    public Date getDateEndUsing() {
        return dateEndUsing;
    }

    public void setDateEndUsing(Date dateEndUsing) {
        this.dateEndUsing = dateEndUsing;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
