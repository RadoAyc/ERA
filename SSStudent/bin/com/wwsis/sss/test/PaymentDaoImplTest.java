package com.wwsis.sss.test;

import com.wwsis.sss.dao.impl.PaymentDaoImpl;
import com.wwsis.sss.entity.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import javax.persistence.EntityManager;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PaymentDaoImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private PaymentDaoImpl paymentDao;

    private Payment payment;

    @BeforeEach
    void setUp() {
        payment = new Payment();
        payment.setId(1);
        payment.setAmount(100.0);
    }

    @Test
    void addPayment() {
        paymentDao.savePayment(payment);
        verify(entityManager, times(1)).persist(payment);
    }

    @Test
    void updatePayment() {
        paymentDao.savePayment(payment);
        verify(entityManager, times(1)).merge(payment);
    }

    @Test
    void deletePayment() {
        when(entityManager.find(Payment.class, payment.getId())).thenReturn(payment);
        paymentDao.deletePayment(payment.getId());
        verify(entityManager, times(1)).remove(payment);
    }

    @Test
    void getPaymentById() {
        when(entityManager.find(Payment.class, payment.getId())).thenReturn(payment);
        Payment found = paymentDao.getPaymentById(payment.getId());
        assertEquals(payment, found);
    }

    @Test
    void getAllPayments() {
        List<Payment> payments = List.of(payment);
        when(entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList()).thenReturn(payments);
        List<Payment> found = paymentDao.getAllPayments();
        assertEquals(payments, found);
    }
}
