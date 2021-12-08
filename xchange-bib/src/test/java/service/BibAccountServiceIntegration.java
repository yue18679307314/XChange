package service;

import bib.BibExchange;
import bib.service.BibAccountService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;

import java.util.Map;

public class BibAccountServiceIntegration {
    Exchange bibExchange = ExchangeFactory.INSTANCE.createExchange(BibExchange.class);
    BibAccountService bibAccountService =
            (BibAccountService) bibExchange.getAccountService();

    @SneakyThrows
    @Test
    public void symbolsTest(){
        Map map = bibAccountService.getSymbols();
        System.out.println(map);
    }
}
