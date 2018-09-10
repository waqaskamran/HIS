package com.sd.his.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PATIENT_INVOICE_PAYMENT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientInvoicePayment extends BaseEntity implements Serializable {

    @Column(name = "PAYMENT_AMOUNT")
    private Double paymentAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAYMENT_ID", nullable = false)
    private Payment payment;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVOICE_ID")
    private Invoice invoice;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PATIENT_ID", nullable = false)
    private Patient patient;

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
