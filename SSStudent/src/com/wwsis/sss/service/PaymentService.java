
package com.wwsis.sss.service;

import com.wwsis.sss.entity.Student;

public class PaymentService {

	private final PaymentDao paymentDao;

    @Autowired
    public PaymentService(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }
	
}
