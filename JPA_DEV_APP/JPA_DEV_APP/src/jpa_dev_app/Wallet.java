package jpa_dev_app;

import javax.persistence.*;

@Entity
public class Wallet {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private Long account_id;
    @Column(nullable=false)
    private Float amount;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}