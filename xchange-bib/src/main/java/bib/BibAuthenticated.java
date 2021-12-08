package bib;

import bib.dto.BibException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Map;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface BibAuthenticated extends Bib{
    String BIB_ACCESS_KEY = "api_key";
    String BIB_ACCESS_SIGN = "sign";
    String BIB_ACCESS_TIMESTAMP = "time";
    @GET
    @Path("open/api/user/account")
    Map getUserAccount(
            @QueryParam(BIB_ACCESS_KEY) String apiKey,
            @QueryParam(BIB_ACCESS_TIMESTAMP) String time,
            @QueryParam(BIB_ACCESS_SIGN) String sign)
            throws IOException, BibException;
    @GET
    @Path("open/api/v2/all_order")
    Map getAllOrderV2(
            @QueryParam(BIB_ACCESS_KEY) String apiKey,
            @QueryParam(BIB_ACCESS_SIGN) String sign,
            @QueryParam(BIB_ACCESS_TIMESTAMP) String time,
            @QueryParam("symbol") String symbol,
            @QueryParam("startDate") String startDate,
            @QueryParam("endDate") String endDate,
            @QueryParam("pageSize") String pageSize,
            @QueryParam("page") String page)
            throws IOException, BibException;

    @GET
    @Path("open/api/all_trade")
    Map getAllTrade(
            @QueryParam(BIB_ACCESS_KEY) String apiKey,
            @QueryParam(BIB_ACCESS_SIGN) String sign,
            @QueryParam(BIB_ACCESS_TIMESTAMP) String time,
            @QueryParam("symbol") String symbol,
            @QueryParam("startDate") String startDate,
            @QueryParam("endDate") String endDate,
            @QueryParam("pageSize") Integer pageSize,
            @QueryParam("page") Integer page,
            @QueryParam("sort") Integer sort)
            throws IOException, BibException;

    @POST
    @Path("open/api/cancel_order")
    Map cancelOrder(
            @FormParam(BIB_ACCESS_KEY) String apiKey,
            @FormParam(BIB_ACCESS_SIGN) String sign,
            @FormParam(BIB_ACCESS_TIMESTAMP) String time,
            @FormParam("symbol") String symbol,
            @FormParam("order_id") Long orderId)
            throws IOException, BibException;

    @POST
    @Path("open/api/cancel_order_all")
    Map cancelAllOrder(
            @FormParam(BIB_ACCESS_KEY) String apiKey,
            @FormParam(BIB_ACCESS_SIGN) String sign,
            @FormParam(BIB_ACCESS_TIMESTAMP) String time,
            @FormParam("symbol") String symbol)
            throws IOException, BibException;

    @POST
    @Path("open/api/create_order")
    Map createOrder(
            @FormParam(BIB_ACCESS_KEY) String apiKey,
            @FormParam(BIB_ACCESS_SIGN) String sign,
            @FormParam(BIB_ACCESS_TIMESTAMP) String time,
            @FormParam("symbol") String symbol,
            @FormParam("side") String side,
            @FormParam("type") String type,
            @FormParam("volume") String volume,
            @FormParam("price") String price,
            @FormParam("fee_is_user_exchange_coin") String feeIsUserExchangeCoin)
            throws IOException, BibException;


    @GET
    @Path("open/api/get_records")
    Map getRecords(@QueryParam("symbol") String symbol,
                   @QueryParam("period") String period,
                   @QueryParam("pageNo") Integer pageNo,
                   @QueryParam("pageSize") Integer pageSize)
                    throws IOException, BibException;

    @GET
    @Path("open/api/get_ticker")
    Map getTicker(@QueryParam("symbol") String symbol)throws IOException, BibException;

    @GET
    @Path("open/api/get_trades")
    Map getTrades(@QueryParam("symbol") String symbol)throws IOException, BibException;

    @GET
    @Path("open/api/market")
    Map getMarket(@QueryParam(BIB_ACCESS_KEY) String apiKey,
                            @QueryParam(BIB_ACCESS_SIGN) String sign,
                            @QueryParam(BIB_ACCESS_TIMESTAMP) String time)
                            throws IOException, BibException;

    @GET
    @Path("open/api/market_dept")
    Map getMarketDept(@QueryParam("symbol") String symbol,
                  @QueryParam("type") String type)throws IOException, BibException;

    @POST
    @Path("open/api/mass_replaceV2")
    Map massReplaceV2(
            @FormParam(BIB_ACCESS_KEY) String apiKey,
            @FormParam(BIB_ACCESS_SIGN) String sign,
            @FormParam(BIB_ACCESS_TIMESTAMP) String time,
            @FormParam("symbol") String symbol,
            @FormParam("mass_cancel") String mass_cancel,
            @FormParam("mass_place") String mass_place)
            throws IOException, BibException;

    @GET
    @Path("open/api/v2/new_order")
    Map newOrderV2(
            @QueryParam(BIB_ACCESS_KEY) String apiKey,
            @QueryParam(BIB_ACCESS_SIGN) String sign,
            @QueryParam(BIB_ACCESS_TIMESTAMP) String time,
            @QueryParam("symbol") String symbol,
            @QueryParam("pageSize") Integer pageSize,
            @QueryParam("page") Integer page)
            throws IOException, BibException;

    @GET
    @Path("open/api/order_info")
    Map orderInfo(@QueryParam(BIB_ACCESS_KEY) String apiKey,
                  @QueryParam(BIB_ACCESS_SIGN) String sign,
                  @QueryParam(BIB_ACCESS_TIMESTAMP) String time,
                  @QueryParam("symbol") String symbol,
                  @QueryParam("order_id") Long order_id)
                    throws IOException, BibException;

    @POST
    @Path("open/api/user_balance_info")
    Map getUserBalanceInfo(@FormParam(BIB_ACCESS_KEY) String apiKey,
                            @FormParam(BIB_ACCESS_SIGN) String sign,
                            @FormParam(BIB_ACCESS_TIMESTAMP) String time,
                            @FormParam("uid") String uid,
                            @FormParam("mobile_number") String mobile_number,
                           @FormParam("email") String email)
                            throws IOException, BibException;

    @POST
    @Path("open/api/mass_replace")
    Map massReplace(
            @FormParam(BIB_ACCESS_KEY) String apiKey,
            @FormParam(BIB_ACCESS_SIGN) String sign,
            @FormParam(BIB_ACCESS_TIMESTAMP) String time,
            @FormParam("symbol") String symbol,
            @FormParam("mass_cancel") String mass_cancel,
            @FormParam("mass_place") String mass_place)
            throws IOException, BibException;

}
