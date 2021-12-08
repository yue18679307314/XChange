package org.knowm.xchange.examples.bib.marketdata;

import bib.BibExchange;
import bib.service.BibMarketDataService;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class BibMarketDataDemo {

    public static void main(String[] args)throws IOException {
        Exchange bibExchange = ExchangeFactory.INSTANCE.createExchange(BibExchange.class);
        BibMarketDataService marketDataService =
                (BibMarketDataService) bibExchange.getMarketDataService();
        String time = String.valueOf(new Date().getTime());
        // success
        Map allTicker = marketDataService.getAllTicker();
        System.out.println(allTicker);
        // success
        Map symbols = marketDataService.getSymbols();
        System.out.println(symbols);
        // success {code=0, msg=suc, data=[], message=null}
        Map records = marketDataService.getRecords("btcusdt","10",1,1);
        System.out.println(records);
        // success
        Map ticker = marketDataService.getTicker("btcusdt");
        System.out.println(ticker);
        // success
        Map market = marketDataService.getMarket(time);
        System.out.println(market);
        // success
        Map marketDept = marketDataService.getMarketDept("btcusdt","step0");
        System.out.println(marketDept);

    }
}
