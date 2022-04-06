package com.vehicleLoanManagement.Interface;

import java.util.List;

import com.vehicleLoanManagement.entity.Account;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface AccountInterface {
    public Account getAccountByEmail(String email) throws RecordNotFoundException;
    public List<Account> AddAccount(Account account) throws RecordNotFoundException;
    public List<Account> UpdateAccount(Account account)throws RecordNotFoundException;

}
