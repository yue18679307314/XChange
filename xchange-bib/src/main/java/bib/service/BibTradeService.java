package bib.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.service.trade.TradeService;

import java.io.IOException;
import java.util.Map;

public class BibTradeService extends BibTradeServiceRaw implements TradeService {
    /**
     * Constructor
     *
     * @param exchange
     */
    public BibTradeService(Exchange exchange) {
        super(exchange);
    }

    public Map getAllOrderV2(String time, String symbol, String startDate, String endDate, String pageSize, String page) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("startDate",startDate);
        params.put("endDate",endDate);
        params.put("pageSize",pageSize);
        params.put("page",page);
        params.put("time",time);
        String apiKey = params.get("api_key");
        String sign = BibUtils.signParams(params);
        return bib.getAllOrderV2(apiKey,sign,time,symbol,startDate,endDate,pageSize,page);
    }
    public Map getAllTrade(String time, String symbol, String startDate, String endDate, Integer pageSize, Integer page, Integer sort) throws IOException{
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("startDate",startDate);
        params.put("endDate",endDate);
        params.put("pageSize",String.valueOf(pageSize));
        params.put("page",String.valueOf(page));
        params.put("sort",String.valueOf(sort));
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.getAllTrade(apiKey,sign,time,symbol,startDate,endDate,pageSize,page,sort);
    }

    public Map cancelOrder(String time, String symbol, Long orderId) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("order_id",String.valueOf(orderId));
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.cancelOrder(apiKey,sign,time,symbol,orderId);
    }

    public Map cancelAllOrder(String time, String symbol) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.cancelAllOrder(apiKey,sign,time,symbol);
    }

    public Map createOrder(String time, String symbol, String side, String type, String volume, String price,
                            String feeIsUserExchangeCoin) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("side",side);
        params.put("type",type);
        params.put("volume",volume);
        params.put("price",price);
        params.put("feeIsUserExchangeCoin",feeIsUserExchangeCoin);
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.createOrder(apiKey,sign,time,symbol,side,type,volume,price,feeIsUserExchangeCoin);
    }

    public Map getTrades(String symbol) throws IOException {
        return bib.getTrades(symbol);
    }

    public Map massReplaceV2(String time, String symbol, String mass_cancel, String mass_place) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("mass_cancel",mass_cancel);
        params.put("mass_place",mass_place);
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.massReplaceV2(apiKey,sign,time,symbol,mass_cancel,mass_place);
    }

    public Map newOrderV2(String time, String symbol, Integer pageSize, Integer page) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("pageSize",String.valueOf(pageSize));
        params.put("page",String.valueOf(page));
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.newOrderV2(apiKey,sign,time,symbol,pageSize,page);
    }

    public Map orderInfo(String time, String symbol, Long order_id) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("order_id",String.valueOf(order_id));
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.orderInfo(apiKey,sign,time,symbol,order_id);
    }

    public Map massReplace(String time, String symbol, String mass_cancel, String mass_place) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("symbol",symbol);
        params.put("mass_cancel",mass_cancel);
        params.put("mass_place",mass_place);
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.massReplace(apiKey,sign,time,symbol,mass_cancel,mass_place);
    }
}
