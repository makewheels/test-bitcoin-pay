package com.eg.testbitcoinpay.huobi;

import com.alibaba.fastjson.JSON;
import com.eg.testbitcoinpay.huobi.markettrade.MarketTradeResponse;
import com.eg.testbitcoinpay.util.HttpUtil;

import java.math.BigDecimal;

/**
 * 查询币价
 */
public class QueryPriceUtil {
    public static BigDecimal getBitcoinPrice() {
        String url = "https://api.huobi.com/market/trade?symbol=btcusdt";
        MarketTradeResponse marketTradeResponse = JSON.parseObject(HttpUtil.getProxy(url), MarketTradeResponse.class);
        return marketTradeResponse.getTick().getData().get(0).getPrice();
    }
}
