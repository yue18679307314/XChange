package bib.dto.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibAllOrderData {
    private String count;

    private List<BibAllOrder> orderList;

    public String getCount() {
        return count;
    }

    public List<BibAllOrder> getOrderList() {
        return orderList;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BibAllOrder{
        private String side;
        private String total_price;
        private String created_at;
        private String avg_price;
        private String countCoin;
        private String source;
        private String type;
        private String side_msg;
        private String volume;
        private String price;
        private String source_msg;
        private String status_msg;
        private String deal_volume;
        private String id;
        private String remain_volume;
        private String baseCoin;
        private String status;
        @JsonCreator
        public BibAllOrder(@JsonProperty("side") String side, @JsonProperty("total_price") String total_price,
                           @JsonProperty("created_at") String created_at, @JsonProperty("avg_price") String avg_price,
                           @JsonProperty("countCoin") String countCoin, @JsonProperty("source") String source,
                           @JsonProperty("type") String type, @JsonProperty("side_msg") String side_msg,
                           @JsonProperty("volume") String volume, @JsonProperty("price") String price,
                           @JsonProperty("source_msg") String source_msg, @JsonProperty("status_msg") String status_msg,
                           @JsonProperty("deal_volume") String deal_volume, @JsonProperty("id") String id,
                           @JsonProperty("remain_volume") String remain_volume, @JsonProperty("baseCoin") String baseCoin,
                           @JsonProperty("status") String status) {
            this.side = side;
            this.total_price = total_price;
            this.created_at = created_at;
            this.avg_price = avg_price;
            this.countCoin = countCoin;
            this.source = source;
            this.type = type;
            this.side_msg = side_msg;
            this.volume = volume;
            this.price = price;
            this.source_msg = source_msg;
            this.status_msg = status_msg;
            this.deal_volume = deal_volume;
            this.id = id;
            this.remain_volume = remain_volume;
            this.baseCoin = baseCoin;
            this.status = status;
        }

        @Override
        public String toString() {
            return "BibAllOrder{" +
                    "side='" + side + '\'' +
                    ", total_price='" + total_price + '\'' +
                    ", created_at='" + created_at + '\'' +
                    ", avg_price='" + avg_price + '\'' +
                    ", countCoin='" + countCoin + '\'' +
                    ", source='" + source + '\'' +
                    ", type='" + type + '\'' +
                    ", side_msg='" + side_msg + '\'' +
                    ", volume='" + volume + '\'' +
                    ", price='" + price + '\'' +
                    ", source_msg='" + source_msg + '\'' +
                    ", status_msg='" + status_msg + '\'' +
                    ", deal_volume='" + deal_volume + '\'' +
                    ", id='" + id + '\'' +
                    ", remain_volume='" + remain_volume + '\'' +
                    ", baseCoin='" + baseCoin + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

    public BibAllOrderData(@JsonProperty("count") String count, @JsonProperty("orderList") List<BibAllOrder> orderList) {
        this.count = count;
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "BibTradeData{" +
                "count='" + count + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
