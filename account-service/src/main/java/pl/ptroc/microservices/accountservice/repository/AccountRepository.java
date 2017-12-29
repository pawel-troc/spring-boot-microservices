package pl.ptroc.microservices.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ptroc.microservices.accountservice.model.Account;

import java.util.List;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByCustomerId(Long customerId);
}
