package pl.ptroc.microservices.customerservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
@Getter
@Setter
@NoArgsConstructor
public class AccountDTO {

    private Long id;
    private String password;
}
