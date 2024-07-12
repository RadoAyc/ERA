package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.PaymentDao;
import com.wwsis.sss.entity.Payment;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PaymentDaoImpl implements PaymentDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addPayment(Payment payment) {
        entityManager.persist(payment);
    }

    @Override
    public void updatePayment(Payment payment) {
        entityManager.merge(payment);
    }

    @Override
    public void deletePayment(int paymentId) {
        Payment payment = entityManager.find(Payment.class, paymentId);
        if (payment != null) {
            entityManager.remove(payment);
        }
    }

    @Override
    public Payment getPaymentById(int paymentId) {
        return entityManager.find(Payment.class, paymentId);
    }

    @Override
    public List<Payment> getAllPayments() {
        return entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
    }
}

