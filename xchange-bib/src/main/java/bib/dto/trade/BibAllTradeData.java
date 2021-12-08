package bib.dto.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibAllTradeData {
    private String count;

    private List<BibAllTrade> resultList;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BibAllTrade{
        private String volume;
        private String side;
        private String feeCoin;
        private String price;
        private String fee;
        private String ctime;
        private String deal_price;
        private String id;
        private String type;
        private String bid_id;
        private String ask_id;
        private String bid_user_id;
        private String ask_user_id;
        @JsonCreator
        public BibAllTrade(@JsonProperty("volume") String volume, @JsonProperty("side") String side,
                           @JsonProperty("feeCoin") String feeCoin, @JsonProperty("price") String price,
                           @JsonProperty("fee") String fee, @JsonProperty("ctime") String ctime,
                           @JsonProperty("deal_price") String deal_price, @JsonProperty("id") String id,
                           @JsonProperty("type") String type, @JsonProperty("bid_id") String bid_id,
                           @JsonProperty("ask_id") String ask_id, @JsonProperty("bid_user_id") String bid_user_id,
                           @JsonProperty("ask_user_id") String ask_user_id) {
            this.volume = volume;
            this.side = side;
            this.feeCoin = feeCoin;
            this.price = price;
            this.fee = fee;
            this.ctime = ctime;
            this.deal_price = deal_price;
            this.id = id;
            this.type = type;
            this.bid_id = bid_id;
            this.ask_id = ask_id;
            this.bid_user_id = bid_user_id;
            this.ask_user_id = ask_user_id;
        }

        @Override
        public String toString() {
            return "BibAllTrade{" +
                    "volume='" + volume + '\'' +
                    ", side='" + side + '\'' +
                    ", feeCoin='" + feeCoin + '\'' +
                    ", price='" + price + '\'' +
                    ", fee='" + fee + '\'' +
                    ", ctime='" + ctime + '\'' +
                    ", deal_price='" + deal_price + '\'' +
                    ", id='" + id + '\'' +
                    ", type='" + type + '\'' +
                    ", bid_id='" + bid_id + '\'' +
                    ", ask_id='" + ask_id + '\'' +
                    ", bid_user_id='" + bid_user_id + '\'' +
                    ", ask_user_id='" + ask_user_id + '\'' +
                    '}';
        }
    }

    public BibAllTradeData(@JsonProperty("count") String count, @JsonProperty("resultList") List<BibAllTrade> resultList) {
        this.count = count;
        this.resultList = resultList;
    }

    public String getCount() {
        return count;
    }

    public List<BibAllTrade> getResultList() {
        return resultList;
    }

    @Override
    public String toString() {
        return "BibAllTradeData{" +
                "count='" + count + '\'' +
                ", resultList=" + resultList +
                '}';
    }
}
