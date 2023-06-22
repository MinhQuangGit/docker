package vn.com.mbbank.payment.repository;

import jakarta.persistence.LockModeType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;
import vn.com.mbbank.payment.model.entity.Transaction;

import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    Optional<Transaction> findByTransactionId(String transactionId);

    @Transactional
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    default Optional<Transaction> getLockedByTransactionId(String transactionId) {
        return findByTransactionId(transactionId);
    }
}
