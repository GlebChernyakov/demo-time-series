package com.example.demotimeseries.repos;

import com.example.demotimeseries.entity.CurrenceSeriesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepos extends CrudRepository<Integer, CurrenceSeriesEntity> {
}
