package com.example.demotimeseries.repos;

import com.example.demotimeseries.entity.RatesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatesRepos extends CrudRepository<Integer, RatesEntity> {
}
