package com.banking.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.entity.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
