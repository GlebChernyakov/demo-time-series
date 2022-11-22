package com.example.demotimeseries.service;

import com.example.demotimeseries.entity.CurrencySeriesEntity;
import okhttp3.Response;

import java.util.Date;

public interface CurrencyServiceAPI {
    Response getRemoteCurrence(Date startDate,
                               Date endDate,
                               String base,
                               String symbols);
    CurrencySeriesEntity getLocalCurrence();
}
