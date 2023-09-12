package projectR.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import projectR.enums.Sections;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "tab_cliente")
public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customerId;
    @Column(name = "customer_name" ,nullable = false, length = 150)
    private String customerName;
    @Column(name = "customer_name", nullable = false, length = 50)
    private Long numberPeoples;
    private Boolean waiting;
    @Enumerated(EnumType.STRING)
    private Sections sections;
}
