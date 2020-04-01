package com.banking.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.entity.Account;

@Repository
@Transactional
public interface AccountRepo extends JpaRepository<Account, Long> {

}
