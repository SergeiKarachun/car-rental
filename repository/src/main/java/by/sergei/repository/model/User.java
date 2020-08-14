package by.sergei.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Order order;

    @OneToOne
    @JoinColumn(name = "user_description_id", referencedColumnName = "id")
    private UserDescription userDescription;


    public User() {
    }

    public User(Integer id, String username, String email, String password, Order order, UserDescription userDescription) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.order = order;
        this.userDescription = userDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(UserDescription userDescription) {
        this.userDescription = userDescription;
    }
}
