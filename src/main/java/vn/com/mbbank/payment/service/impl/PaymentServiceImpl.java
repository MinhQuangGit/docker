package vn.com.mbbank.payment.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.mbbank.payment.model.entity.Transaction;
import vn.com.mbbank.payment.repository.TransactionRepository;
import vn.com.mbbank.payment.service.PaymentService;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final TransactionRepository transactionRepository;

    @Override
    public Transaction getTransaction(String transactionId) {
        return transactionRepository.findByTransactionId(transactionId).orElseThrow( () -> new NullPointerException("transaction not exit"));
    }
}
