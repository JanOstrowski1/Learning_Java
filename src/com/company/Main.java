package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        LoadingData loadingData = new LoadingData() ;
        loadingData.getCryptoCurrencyFromDateToDate("btc.csv") ;

    }
}
