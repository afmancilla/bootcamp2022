package com.nttdata.bootcamp.demo1.expose;

import com.nttdata.bootcamp.demo1.model.Customer;
import com.nttdata.bootcamp.demo1.repostitory.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link CustomerController}<br/>
 * <b>Copyright</b>: &Copy; 2022 Everis Per&uacute;. <br/>
 * <b>Company</b>: Everis del Per&uacute;. <br/>
 *
 * @author Everis Per&uacute;. (EVE) <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>{USERNAME}. (acronym) From (EVE)</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>ene. 04, 2022 (acronym) Creation class.</li>
 * </ul>
 * @version 1.0
 */
@RestController
@Slf4j
public class CustomerController {

  @Autowired
  CustomerRepository customerRepository;

  @GetMapping("/api/customer/{id}")
  public Mono<Customer> byId(@PathVariable("id") String id) {
    return customerRepository.findById(id);
  }

  @GetMapping("/api/customer")
  public Flux<Customer> findAll() {
    log.info("findAll>>>>>");
    return customerRepository.findAll();
  }

  @PostMapping("/api/customer")
  public Mono<Void> create(@RequestBody Customer customer) {
    return customerRepository.create(customer);
  }

  @PutMapping("/api/customer")
  public Mono<Customer> update(@RequestBody Customer customer) {
    return customerRepository.update(customer);
  }

  @PatchMapping("/api/customer")
  public Mono<Customer> change(@RequestBody Customer customer) {
    return customerRepository.change(customer);
  }

  @DeleteMapping("/api/customer/{id}")
  public Mono<Void> delete(@PathVariable("id") String id) {
    return customerRepository.remove(id);
  }
}
