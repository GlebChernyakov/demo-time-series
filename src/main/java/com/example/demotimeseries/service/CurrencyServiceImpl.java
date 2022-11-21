package com.example.demotimeseries.service;

import com.example.demotimeseries.entity.CurrenceSeriesEntity;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyServiceAPI {

    @Override
    public ResponseEntity<String> getRemoteCurrence(Date startDate, Date endDate, String base, String symbols) {
    String urlStr = "http://data.fixer.io/api/latest/timeseries?access_key=7WWQcfHr7eQshgbGejQHplOfBvH2cB1c&start_date=2018-02-20&end_date=2018-02-26&base=RUB&symbols=EUR";

    Map<String, Object> data = new LinkedHashMap<>();

    data.put("start_date",  startDate);
    data.put("end_date",  endDate);
    data.put("base", base);
    data.put("symbols",  symbols);


    RestTemplate template = new RestTemplate();


    HttpHeaders headers = new HttpHeaders();
    headers.add("access_key", "7WWQcfHr7eQshgbGejQHplOfBvH2cB1c");

    HttpEntity<Map<String, Object>> request = new HttpEntity<>(data, headers);

    return template.exchange(urlStr, HttpMethod.GET, request, String.class );
    }

    @Override
    public CurrenceSeriesEntity getLocalCurrence() {
        return null;
    }
}
