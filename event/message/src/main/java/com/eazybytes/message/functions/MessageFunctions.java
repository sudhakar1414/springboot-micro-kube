package com.eazybytes.message.functions;

import com.eazybytes.message.dto.AccountsDtoMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {

    private static final Logger logger = LoggerFactory.getLogger(MessageFunctions.class);

    @Bean
    public Function<AccountsDtoMsg, AccountsDtoMsg> email(){
        return accountsDtoMsg -> {
          logger.info("Sending email with the details :"+accountsDtoMsg.toString());
          return accountsDtoMsg;
        };
    }

    @Bean
    public Function<AccountsDtoMsg, Long> sms(){
        return accountsDtoMsg -> {
            logger.info("Sending sms with the details :"+accountsDtoMsg.toString());
            return accountsDtoMsg.accountNumber();
        };
    }
}
