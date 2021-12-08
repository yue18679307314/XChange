package org.knowm.xchange.examples.bib.trade;

import bib.BibExchange;
import bib.service.BibTradeService;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class BibTradeDataDemo {
    public static void main(String[] args)throws IOException {
        ExchangeSpecification exSpec =
                new BibExchange().getDefaultExchangeSpecification();
        exSpec.setApiKey("");
        exSpec.setSecretKey("");
        Exchange bibExchange = ExchangeFactory.INSTANCE.createExchange(exSpec);
        BibTradeService bibTradeService = (BibTradeService)bibExchange.getTradeService();
        String time = String.valueOf(new Date().getTime());
// success
//        Map allOrderV2 = bibTradeService.getAllOrderV2(time,"btcusdt",null,null,null,null);
//        System.out.println(allOrderV2);
        // success
//        Map allTrade = bibTradeService.getAllTrade(time,"btcusdt", null, null, 1, 1, 1);
//        System.out.println(allTrade);
        // success
//        Map cancelOrder = bibTradeService.cancelOrder(time, "btcusdt", Long.valueOf("27534490"));
//        System.out.println(cancelOrder);
        // success
//        Map cancelAllOrder = bibTradeService.cancelAllOrder(time,"btcusdt");
//        System.out.println(cancelAllOrder);
        // success
//        Map order = bibTradeService.createOrder(time,"btcusdt","BUY","2",null,null,null);
//        System.out.println(order);
        // success
//        Map trades = bibTradeService.getTrades("btcusdt");
//        System.out.println(trades);
        // success
//        Map massReplaceV2 = bibTradeService.massReplaceV2(time,"btcusdt",null,null);
//        System.out.println(massReplaceV2);
        // success
        Map newOrderV2 = bibTradeService.newOrderV2(time,"btcusdt", 0, 0);
        System.out.println(newOrderV2);
        // success
//        Map orderInfo = bibTradeService.orderInfo(time,"btcusdt",Long.valueOf("1111"));
//        System.out.println(orderInfo);
        // success
//        Map massReplace = bibTradeService.massReplace(time,"btcusdt",null,null);
//        System.out.println(massReplace);
    }
}
