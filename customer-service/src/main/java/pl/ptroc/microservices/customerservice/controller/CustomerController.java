package pl.ptroc.microservices.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ptroc.microservices.customerservice.client.AccountClient;
import pl.ptroc.microservices.customerservice.dto.AccountDTO;
import pl.ptroc.microservices.customerservice.model.Customer;
import pl.ptroc.microservices.customerservice.repository.CustomerRepository;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    private Logger logger = Logger.getLogger(CustomerController.class.getName());

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountClient accountClient;

    @GetMapping("/findAll")
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") Long customerId) {
        logger.info(String.format("Get data for customer(%s)", customerId));
        Customer customer = customerRepository.findOne(customerId);
        List<AccountDTO> accountDTOList = accountClient.getAccountsForCustomer(customerId);
        customer.setAccountsList(accountDTOList);
        return customer;
    }
}
