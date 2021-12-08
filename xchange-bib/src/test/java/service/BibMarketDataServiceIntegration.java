package service;

import bib.BibExchange;
import bib.service.BibMarketDataService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;

import java.util.Map;

public class BibMarketDataServiceIntegration {
    Exchange bibExchange = ExchangeFactory.INSTANCE.createExchange(BibExchange.class);
    BibMarketDataService bibMarketDataService =
            (BibMarketDataService) bibExchange.getMarketDataService();

    @SneakyThrows
    @Test
    public void getTicker(){
        Map map = bibMarketDataService.getTicker("btcusdt");
        System.out.println(map);
    }
}
