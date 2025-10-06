package com.capgebank.accounts.mapper;

import com.capgebank.accounts.dto.AccountsDto;
import com.capgebank.accounts.model.Account;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Account account,AccountsDto accountsDto){
        accountsDto.setAccountNumber(account.getAccountNumber());
        accountsDto.setAccountType(account.getAccountType());
        accountsDto.setBranchAddress(account.getBranchAddress());
        return accountsDto;
    }

    public static Account mapToAccount(AccountsDto accountsDto,Account account){
        account.setAccountNumber(accountsDto.getAccountNumber());
        account.setAccountType(accountsDto.getAccountType());
        account.setBranchAddress(accountsDto.getBranchAddress());
        return account;
    }
}
