package pl.ptroc.microservices.customerservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.ptroc.microservices.customerservice.dto.AccountDTO;

import java.util.List;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
@FeignClient("account-service")
public interface AccountClient {

    @GetMapping("/account/customer/{customerId}")
    List<AccountDTO> getAccountsForCustomer(@PathVariable("customerId") Long id);
}
