package com.sd.his.wrapper.request;

import java.util.List;

public class GenerateInvoiceRequestWrapper {

    String invoicePrefix;
    Boolean completed;

    List<PatientInvoiceRequestWrapper> invoiceRequestWrapper;

    public String getInvoicePrefix() {
        return invoicePrefix;
    }

    public void setInvoicePrefix(String invoicePrefix) {
        this.invoicePrefix = invoicePrefix;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public List<PatientInvoiceRequestWrapper> getInvoiceRequestWrapper() {
        return invoiceRequestWrapper;
    }

    public void setInvoiceRequestWrapper(List<PatientInvoiceRequestWrapper> invoiceRequestWrapper) {
        this.invoiceRequestWrapper = invoiceRequestWrapper;
    }
}