package vn.com.mbbank.payment.model.filter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Data
@Accessors
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionFilter {
    String transactionId;
}
