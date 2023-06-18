package vn.com.mbbank.payment.service;

import vn.com.mbbank.payment.model.entity.Transaction;

public interface PaymentService {
    Transaction getTransaction(String transactionId);
}
