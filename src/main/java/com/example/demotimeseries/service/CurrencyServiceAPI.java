package com.example.demotimeseries.service;

import com.example.demotimeseries.entity.CurrenceSeriesEntity;

import java.util.Date;

public interface CurrencyServiceAPI {
    String getRemoteCurrence(Date startDate,
                             Date endDate,
                             String base,
                             String symbols);
    CurrenceSeriesEntity getLocalCurrence();
}
