package pl.ptroc.microservices.customerservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.ptroc.microservices.customerservice.dto.AccountDTO;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Transient
    private List<AccountDTO> accountsList;
}
