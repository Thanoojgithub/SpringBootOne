package org.learning.springboot.springbootwithdocker.repository;

import org.learning.springboot.springbootwithdocker.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
}
