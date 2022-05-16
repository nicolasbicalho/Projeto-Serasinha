package jpa_dev_app;

import javax.persistence.*;

@Entity
public class Account {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private Long wallet_id;
    @Column(nullable=false)
    private Bank_Card[] Bank_Cards;
    @Column(nullable=false)
    private Long user_id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}