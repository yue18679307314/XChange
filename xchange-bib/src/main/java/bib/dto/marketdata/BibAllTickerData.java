package bib.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibAllTickerData {
    private String date;
    private List<BibAllTicker> ticker;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BibAllTicker{
        private String symbol;
        private String high;
        private String vol;
        private String last;
        private String low;
        private String buy;
        private String sell;
        private String rose;
        @JsonCreator
        public BibAllTicker(@JsonProperty("symbol") String symbol, @JsonProperty("high") String high,
                            @JsonProperty("vol") String vol, @JsonProperty("last") String last,
                            @JsonProperty("low") String low, @JsonProperty("buy") String buy,
                            @JsonProperty("sell") String sell, @JsonProperty("rose") String rose) {
            this.symbol = symbol;
            this.high = high;
            this.vol = vol;
            this.last = last;
            this.low = low;
            this.buy = buy;
            this.sell = sell;
            this.rose = rose;
        }

        @Override
        public String toString() {
            return "BibAllTicker{" +
                    "symbol='" + symbol + '\'' +
                    ", high='" + high + '\'' +
                    ", vol='" + vol + '\'' +
                    ", last='" + last + '\'' +
                    ", low='" + low + '\'' +
                    ", buy='" + buy + '\'' +
                    ", sell='" + sell + '\'' +
                    ", rose='" + rose + '\'' +
                    '}';
        }
    }

    public BibAllTickerData(@JsonProperty("date") String date, @JsonProperty("ticker") List<BibAllTicker> ticker) {
        this.date = date;
        this.ticker = ticker;
    }

    public String getDate() {
        return date;
    }

    public List<BibAllTicker> getTicker() {
        return ticker;
    }

    @Override
    public String toString() {
        return "BibAllTickerData{" +
                "date='" + date + '\'' +
                ", ticker=" + ticker +
                '}';
    }
}
