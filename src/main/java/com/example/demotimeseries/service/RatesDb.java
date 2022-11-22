package com.example.demotimeseries.service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RatesDb {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        /* Create MySQL Database Connection */
        Class.forName( "org.postgresql.Driver" );
        Connection connect = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/user_series" ,
                "user_series",
                "1234");

        Statement statement = connect.createStatement( );
        ResultSet resultSet = statement.executeQuery("select * from rates_entity" );
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        while( resultSet.next( ) ) {
            dataset.setValue(
                    resultSet.getDouble("values"),
                     "currency",
                    resultSet.getDate("date"));
        }

        JFreeChart chart = ChartFactory.createLineChart(
                "RUB/EUR Vs Time",
                "Time",
                "RUB/EUR",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        int width = 560;    /* Width of the image */
        int height = 370;   /* Height of the image */
        File pieChart = new File( "time_series.jpeg" );
        ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
        }
}
