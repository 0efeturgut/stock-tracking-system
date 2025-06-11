package com.StokTakip.controller;

import com.StokTakip.model.StockEntry;
import com.StokTakip.model.StockExit;
import com.StokTakip.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/entry")
    public ResponseEntity<StockEntry> createStockEntry(@RequestBody StockEntry stockEntry) {
        return ResponseEntity.ok(stockService.createStockEntry(stockEntry));
    }

    @PostMapping("/exit")
    public ResponseEntity<StockExit> createStockExit(@RequestBody StockExit stockExit) {
        return ResponseEntity.ok(stockService.createStockExit(stockExit));
    }
}
