package pl.ptroc.microservices.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ptroc.microservices.customerservice.model.Customer;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
