package com.StokTakip.service;

import com.StokTakip.model.StockEntry;
import com.StokTakip.model.StockExit;
import com.StokTakip.repository.StockEntryRepository;
import com.StokTakip.repository.StockExitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockEntryRepository stockEntryRepository;

    @Autowired
    private StockExitRepository stockExitRepository;

    public StockEntry createStockEntry(StockEntry stockEntry) {
        stockEntry.setEntryDate(java.time.LocalDateTime.now());
        return stockEntryRepository.save(stockEntry);
    }

    public StockExit createStockExit(StockExit stockExit) {
        stockExit.setExitDate(java.time.LocalDateTime.now());
        return stockExitRepository.save(stockExit);
    }
}
