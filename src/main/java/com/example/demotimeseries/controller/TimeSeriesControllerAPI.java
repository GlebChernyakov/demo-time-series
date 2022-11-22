package com.example.demotimeseries.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Date;
import java.util.Map;

public interface TimeSeriesControllerAPI {
    String getMoneyTimeSeries(@PathVariable Date start_date,
                                              @PathVariable Date end_date,
                                              @PathVariable(required = false) String base,
                                              @PathVariable(required = false) String symbols);
//                                              @RequestHeader Map<String, String> headers);
    ResponseEntity<String> getTimeseriesFromBase();

}
