package com.amjath.BankingManagemt.Repository;

import com.amjath.BankingManagemt.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
