package pl.ptroc.microservices.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ptroc.microservices.accountservice.model.Account;
import pl.ptroc.microservices.accountservice.repository.AccountRepository;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Paweł Troć on 2017-12-29.
 */
@RestController
@RequestMapping(path = "/account")
public class AccountController {

    private Logger logger = Logger.getLogger(AccountController.class.getName());

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/findAll")
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public List<Account> getAccountForCustomer(@PathVariable("customerId") Long customerId) {
        logger.info(String.format("Getting accounts for customer(%s)", customerId));
        return accountRepository.findByCustomerId(customerId);
    }
}
