package service;

import bib.BibExchange;
import bib.service.BibTradeService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;

import java.util.Map;

public class BibTradeServiceIntegration {

    Exchange bibExchange = ExchangeFactory.INSTANCE.createExchange(BibExchange.class);
    BibTradeService bibTradeService =
            (BibTradeService) bibExchange.getTradeService();

    @SneakyThrows
    @Test
    public void getTrades(){
        Map map = bibTradeService.getTrades("btcusdt");
        System.out.println(map);
    }

}
