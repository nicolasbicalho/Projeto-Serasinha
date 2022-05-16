package jpa_dev_app;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Transaction {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private Long buyer_id;
    @Column(nullable=false)
    private Long seller_id;
    @Column(nullable=false)
    private Float value;
    @Temporal(TemporalType.DATE)
    private Date date;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}