package com.example.demotimeseries.service;

import com.example.demotimeseries.entity.CurrenceSeriesEntity;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public interface CurrencyServiceAPI {
    ResponseEntity<String> getRemoteCurrence(Date startDate,
                                     Date endDate,
                                     String base,
                                     String symbols);
    CurrenceSeriesEntity getLocalCurrence();
}
