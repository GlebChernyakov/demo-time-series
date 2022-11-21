package com.example.demotimeseries.model;

import lombok.Data;

import java.util.Date;

@Data
public class CurrencyDTO {
    private Date startDate;

    private Date endDate;

    private String base;

    private String symbols;

    private Double value;
}
