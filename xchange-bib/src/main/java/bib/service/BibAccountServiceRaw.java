package bib.service;

import org.knowm.xchange.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

public class BibAccountServiceRaw extends BibBaseService{
    private final Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * Constructor
     *
     * @param exchange
     */
    protected BibAccountServiceRaw(Exchange exchange) {
        super(exchange);
    }

    public Map getUserAccount(String time) throws IOException {
        Map<String, String> params = getCommonParams();
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.getUserAccount(apiKey,time,sign);
    }

    public Map getUserBalanceInfo(String uid, String mobile_number, String email,String time) throws IOException {
        Map<String, String> params = getCommonParams();
        params.put("uid",uid);
        params.put("mobile_number",mobile_number);
        params.put("email",email);
        String apiKey = params.get("api_key");
        params.put("time",time);
        String sign = BibUtils.signParams(params);
        return bib.getUserBalanceInfo(apiKey,sign,time,uid,mobile_number,email);
    }
}
