package com.sd.his.repository;

import com.sd.his.model.PatientInvoicePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInvoicePaymentRepository  extends JpaRepository<PatientInvoicePayment, Long> {
}
