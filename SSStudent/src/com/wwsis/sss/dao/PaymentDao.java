ppackage com.wwsis.sss.dao;

import com.wwsis.sss.entity.Payment;
import java.util.List;

public interface PaymentDao {
    void addPayment(Payment payment);
    void updatePayment(Payment payment);
    void deletePayment(int paymentId);
    Payment getPaymentById(int paymentId);
    List<Payment> getAllPayments();
}
