package jpa_dev_app;

import javax.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(length=50)
    private String name;
    private String email;
    private String phone;
    @Column(nullable=false)
    private String password;
    @Column(nullable=false)
    private Long account_id;
    @Transient
    private Float score;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}