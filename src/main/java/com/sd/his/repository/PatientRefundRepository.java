package com.sd.his.repository;


import com.sd.his.model.PatientRefund;
import com.sd.his.wrapper.response.RefundListResponseWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PatientRefundRepository extends JpaRepository<PatientRefund, Long> {


    @Query(" SELECT NEW com.sd.his.wrapper.response.RefundListResponseWrapper(pr) FROM PatientRefund pr ")
    List<RefundListResponseWrapper> findAllRefund();
}