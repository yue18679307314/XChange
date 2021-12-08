package bib.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.service.marketdata.MarketDataService;

import java.io.IOException;
import java.util.Map;

public class BibMarketDataService extends BibMarketDataServiceRaw
        implements MarketDataService {
    /**
     * Constructor
     *
     * @param exchange
     */
    public BibMarketDataService(Exchange exchange) {
        super(exchange);
    }

    public Map getRecords(String symbol, String period, Integer pageNo, Integer pageSize) throws IOException  {
        return bib.getRecords(symbol,period,pageNo,pageSize);
    }

    public Map getTicker(String symbol) throws IOException {
        return bib.getTicker(symbol);
    }

    public Map getMarket(String time) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("time",time);
        String apiKey = params.get("api_key");
        String sign = BibUtils.signParams(params);
        return bib.getMarket(apiKey,sign,time);
    }

    public Map getMarketDept(String symbol, String type) throws IOException {
        return bib.getMarketDept(symbol,type);
    }
}
