package org.knowm.xchange.examples.bib.account;

import bib.BibExchange;
import bib.service.BibAccountService;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class BibAccountDataDemo {
    public static void main(String[] args) throws IOException {
        ExchangeSpecification exSpec =
                new BibExchange().getDefaultExchangeSpecification();
        exSpec.setApiKey("");
        exSpec.setSecretKey("");
        Exchange bibExchange = ExchangeFactory.INSTANCE.createExchange(exSpec);
        BibAccountService bibAccountService =
                (BibAccountService) bibExchange.getAccountService();
        String time = String.valueOf(new Date().getTime());
        // success
        Map map = bibAccountService.getUserAccount(time);
        System.out.println(map);

        // success
        Map userBalanceInfo = bibAccountService.getUserBalanceInfo("10083914", null, null,time);
        System.out.println(userBalanceInfo);
    }
}
