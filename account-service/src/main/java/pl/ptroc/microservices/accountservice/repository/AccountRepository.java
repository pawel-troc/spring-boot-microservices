package pl.ptroc.microservices.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ptroc.microservices.accountservice.model.Account;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {


}
