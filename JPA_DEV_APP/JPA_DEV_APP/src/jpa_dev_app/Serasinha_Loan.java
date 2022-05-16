package jpa_dev_app;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Serasinha_Loan {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private Long user_id;
    @Column(nullable=false)
    private Long bank_card_id;
    @Column(nullable=false)
    private Float value;
    @Column(nullable=false)
    private Float loan_rate;
    @Temporal(TemporalType.DATE)
    private Date date;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}