package bib.dto.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibAccountData {

    private BigDecimal total_asset;

    private List<BibAccount> coin_list;

    public BibAccountData(@JsonProperty("total_asset") BigDecimal total_asset, @JsonProperty("coin_list") List<BibAccount> coin_list) {
        this.total_asset = total_asset;
        this.coin_list = coin_list;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BibAccount {
        private String coin;
        private BigDecimal normal;
        private BigDecimal locked;
        private BigDecimal btcValuatin;

        public String getCoin() {
            return coin;
        }

        public BigDecimal getNormal() {
            return normal;
        }

        public BigDecimal getLocked() {
            return locked;
        }

        public BigDecimal getBtcValuatin() {
            return btcValuatin;
        }
        @JsonCreator
        public BibAccount(@JsonProperty("coin") String coin, @JsonProperty("normal") BigDecimal normal,
                               @JsonProperty("locked") BigDecimal locked, @JsonProperty("btcValuatin") BigDecimal btcValuatin) {
            this.coin = coin;
            this.normal = normal;
            this.locked = locked;
            this.btcValuatin = btcValuatin;
        }

        @Override
        public String toString() {
            return "BibAccount{" +
                    "coin='" + coin + '\'' +
                    ", normal=" + normal +
                    ", locked=" + locked +
                    ", btcValuatin=" + btcValuatin +
                    '}';
        }
    }

    public BigDecimal getTotal_asset() {
        return total_asset;
    }

    public List<BibAccount> getCoin_list() {
        return Collections.unmodifiableList(coin_list);
    }

    @Override
    public String toString() {
        return "BibAccountData{" +
                "total_asset=" + total_asset +
                ", coin_list=" + coin_list +
                '}';
    }
}
