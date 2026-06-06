package com.nx.payflow.service;

import com.nx.payflow.model.Transaction;
import com.nx.payflow.repository.TransactionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService{

    private final TransactionRepo transactionRepo;

    public Transaction findByTransactionId(String transactionId){
        return transactionRepo.findById(transactionId).orElse(null);
    }

    public Transaction saveTransaction(Transaction transaction){
        return transactionRepo.save(transaction);
    }


    public List<Transaction> getTransactions() {
        return transactionRepo.findAll();
    }
}
