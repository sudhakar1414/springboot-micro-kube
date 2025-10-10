package com.capgebank.accounts.service;

import com.capgebank.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {

    CustomerDetailsDto fetchCustomerDetails(String mobileNumber,String correlationId);

}
