package com.abhijeetmajumdar.service;

import java.util.List;


public interface ToolsService {

    String getCurrentDateTime();
    List<String> getChaseAccountHoldings(String account);

    List<String> findAllChaseOfferings();
    public Double latestMarketPrice(String symbol);


}
