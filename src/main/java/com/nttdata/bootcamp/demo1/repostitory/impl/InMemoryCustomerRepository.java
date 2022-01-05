package com.nttdata.bootcamp.demo1.repostitory.impl;

import com.nttdata.bootcamp.demo1.model.Customer;
import com.nttdata.bootcamp.demo1.repostitory.CustomerRepository;
import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link InMemoryCustomerRepository}<br/>
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
@Component
public class InMemoryCustomerRepository implements CustomerRepository {

  private final CopyOnWriteArrayList<Customer> customers = new CopyOnWriteArrayList<>();

  @Override
  public Mono<Void> create(Customer customer) {
    return Mono.fromRunnable(() -> customers.add(customer));
  }

  @Override
  public Mono<Customer> findById(String customerId) {
    return Flux.fromIterable(customers)
        .filter(customer -> customer.getId().equalsIgnoreCase(customerId))
        .next();
  }

  @Override
  public Flux<Customer> findAll() {
    return Flux.fromIterable(customers);
  }

  @Override
  public Mono<Customer> update(Customer customer) {
    return null;
  }

  @Override
  public Mono<Customer> change(Customer customer) {
    return null;
  }

  @Override
  public Mono<Void> remove(String customerId) {
    return null;
  }
}
