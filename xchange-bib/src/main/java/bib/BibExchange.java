package bib;

import bib.service.BibAccountService;
import bib.service.BibMarketDataService;
import bib.service.BibTradeService;
import org.knowm.xchange.BaseExchange;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeSpecification;

public class BibExchange extends BaseExchange implements Exchange {
    @Override
    protected void initServices() {
        this.marketDataService = new BibMarketDataService(this);
        this.accountService = new BibAccountService(this);
        this.tradeService = new BibTradeService(this);
    }

    @Override
    public ExchangeSpecification getDefaultExchangeSpecification() {
        final ExchangeSpecification exchangeSpecification = new ExchangeSpecification(this.getClass());
        exchangeSpecification.setSslUri("https://openapi.bibvip.com");
        exchangeSpecification.setHost("openapi.bibvip.com");
        exchangeSpecification.setExchangeName("Bib");
        exchangeSpecification.setExchangeDescription(
                "Founded in June of 2021, Bib is a bitcoin wallet and platform where merchants and consumers can transact with the new digital currency bitcoin.");
        return exchangeSpecification;
    }
}
