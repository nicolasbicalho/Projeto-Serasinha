package jpa_dev_app;

import java.text.DateFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Bank_Card {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String number;
    @Column(nullable=false)
    private Integer security_code;
    @Column(nullable=false)
    private String date_validity;
    @Column(nullable=false)
    private String agency;
    @Column(nullable=false)
    private String account_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}