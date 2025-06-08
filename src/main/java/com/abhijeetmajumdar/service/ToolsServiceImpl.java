package com.abhijeetmajumdar.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ToolsServiceImpl implements ToolsService {
    @Override
    @Tool(description = "Get the current date and time in the user's timezone")
    public String getCurrentDateTime() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toString();
    }

    @Override
    @Tool(name = "getChaseAccountHoldings", description = "Get the Chase account holdings.")
    public List<String> getChaseAccountHoldings(@ToolParam(description = "account") String account) {
        return Arrays.asList("AAPL", "TSLA");
    }


    @Override
    @Tool(name = "findAllChaseOfferings", description = "Get the all Chase bank offerings Or services.")
    public List<String> findAllChaseOfferings() {
        return Arrays.asList("Checking", "Saving","Investment");
    }

    @Override
    @Tool(name = "latestMarketPrice", description = "It can provide the latest stock market price of given symbol.")
    public Double latestMarketPrice(@ToolParam(description = "symbol") String symbol) {
        return 2.0;
    }
}
