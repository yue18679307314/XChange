package bib.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibTickerData {

    private String time;
    private String high;
    private String vol;
    private String last;
    private String low;
    private String buy;
    private String sell;
    private String rose;

    @JsonCreator
    public BibTickerData(@JsonProperty("time") String time, @JsonProperty("high") String high,
                         @JsonProperty("vol") String vol, @JsonProperty("last") String last,
                         @JsonProperty("low") String low, @JsonProperty("buy") String buy,
                         @JsonProperty("sell") String sell, @JsonProperty("rose") String rose) {
        this.time = time;
        this.high = high;
        this.vol = vol;
        this.last = last;
        this.low = low;
        this.buy = buy;
        this.sell = sell;
        this.rose = rose;
    }

    public String getTime() {
        return time;
    }

    public String getHigh() {
        return high;
    }

    public String getVol() {
        return vol;
    }

    public String getLast() {
        return last;
    }

    public String getLow() {
        return low;
    }

    public String getBuy() {
        return buy;
    }

    public String getSell() {
        return sell;
    }

    public String getRose() {
        return rose;
    }

    @Override
    public String toString() {
        return "BibTickerData{" +
                "time='" + time + '\'' +
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
