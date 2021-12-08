package bib.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.service.account.AccountService;

public class BibAccountService extends BibAccountServiceRaw implements AccountService {
    /**
     * Constructor
     *
     * @param exchange
     */
    public BibAccountService(Exchange exchange) {
        super(exchange);
    }


}
