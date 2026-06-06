package com.nx.payflow.controller;

import com.nx.payflow.model.Transaction;
import com.nx.payflow.service.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable String id) {
        return ResponseEntity.ok(transactionService.findByTransactionId(id));
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody @Valid Transaction transaction) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(transactionService.saveTransaction(transaction));
    }
}