package com.example.demotimeseries.controller;

import com.example.demotimeseries.service.CurrencyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/get")
@RequiredArgsConstructor
public class ValuteController implements TimeSeriesControllerAPI{
    private final CurrencyServiceImpl currencyService;

    @Override
    @GetMapping
    public ResponseEntity<String> getMoneyTimeSeries(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date start_date,
                                                     @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date end_date,
                                                     @RequestParam String base,
                                                     @RequestParam String symbols) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("apiKey", "7WWQcfHr7eQshgbGejQHplOfBvH2cB1c");

        return currencyService.getRemoteCurrence(start_date, end_date, base, symbols);
    }

    @Override
    public ResponseEntity<String> getTimeseriesFromBase() {
        return null;
    }
}
