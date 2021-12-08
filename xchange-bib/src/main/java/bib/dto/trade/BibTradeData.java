package bib.dto.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibTradeData {
    private String amount;//成交量
    private String price;//成交价
    private String id;
    private String type;//买卖type，买为buy，买sell
    @JsonCreator
    public BibTradeData(@JsonProperty("amount") String amount, @JsonProperty("price") String price,
                        @JsonProperty("id") String id, @JsonProperty("type") String type) {
        this.amount = amount;
        this.price = price;
        this.id = id;
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public String getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BibTradeData{" +
                "amount='" + amount + '\'' +
                ", price='" + price + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
