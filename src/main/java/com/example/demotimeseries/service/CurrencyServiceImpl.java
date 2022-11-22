package com.example.demotimeseries.service;

import com.example.demotimeseries.entity.CurrenceSeriesEntity;
import lombok.RequiredArgsConstructor;

import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyServiceAPI {

    @SneakyThrows
    @Override
    public String getRemoteCurrence(Date startDate, Date endDate, String base, String symbols) {


        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://api.apilayer.com/fixer/timeseries?start_date=2018-02-18&end_date=2018-02-29")
                .addHeader("apikey", "7WWQcfHr7eQshgbGejQHplOfBvH2cB1c")
                .get()
            .build();
    Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        return  response.body().string();
        
        
//    String urlStr = "http://data.fixer.io/api/latest/timeseries?access_key=7WWQcfHr7eQshgbGejQHplOfBvH2cB1c&start_date=2018-02-20&end_date=2018-02-26&base=RUB&symbols=EUR";
//
//    Map<String, Object> data = new LinkedHashMap<>();
//
//    data.put("start_date",  startDate);
//    data.put("end_date",  endDate);
//    data.put("base", base);
//    data.put("symbols",  symbols);
//
//
//    RestTemplate template = new RestTemplate();
//
//
//    HttpHeaders headers = new HttpHeaders();
//    headers.add("access_key", "7WWQcfHr7eQshgbGejQHplOfBvH2cB1c");
//
//    HttpEntity<Map<String, Object>> request = new HttpEntity<>(data, headers);
//
//    return template.exchange(urlStr, HttpMethod.GET, request, String.class );
    }

    @Override
    public CurrenceSeriesEntity getLocalCurrence() {
        return null;
    }
}
