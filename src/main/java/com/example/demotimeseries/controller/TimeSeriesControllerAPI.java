package com.example.demotimeseries.controller;

import okhttp3.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

public interface TimeSeriesControllerAPI {
    Response getMoneyTimeSeries(@PathVariable Date start_date,
                                @PathVariable Date end_date,
                                @PathVariable(required = false) String base,
                                @PathVariable(required = false) String symbols);
//                                              @RequestHeader Map<String, String> headers);
    ResponseEntity<String> getTimeseriesFromBase();

}
