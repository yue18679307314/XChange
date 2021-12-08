package bib.service;

import bib.BibAuthenticated;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.client.ExchangeRestProxyBuilder;
import org.knowm.xchange.service.BaseExchangeService;
import org.knowm.xchange.service.BaseService;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class BibBaseService extends BaseExchangeService implements BaseService {

    protected final BibAuthenticated bib;
    protected final String apiKey;
    protected final String secretKey;


    /**
     * Constructor
     *
     * @param exchange
     */
    public BibBaseService(Exchange exchange) {
        super(exchange);
        bib = ExchangeRestProxyBuilder.forInterface(
                                BibAuthenticated.class, exchange.getExchangeSpecification())
                        .build();
        apiKey = exchange.getExchangeSpecification().getApiKey();
        secretKey = exchange.getExchangeSpecification().getSecretKey();
    }

    protected Map<String, String> getCommonParams() {
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("api_key", apiKey);
        params.put("secret_key", secretKey);
        return params;
    }

    public Map getAllTicker()throws IOException {
        return bib.getAllTicker();
    }

    public Map getSymbols()throws IOException{
        return bib.getSymbols();
    }
}
