package com.nx.payflow;

import com.nx.payflow.model.Transaction;
import com.nx.payflow.repository.TransactionRepo;
import com.nx.payflow.service.TransactionService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
@RestController
public class PayflowApplication {

	private final TransactionService transactionService;
	public static void main(String[] args) {
		SpringApplication.run(PayflowApplication.class, args);
	}

}
