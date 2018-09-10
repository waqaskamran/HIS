package com.sd.his.repository;

import com.sd.his.model.Branch;
import com.sd.his.model.LabOrder;
import com.sd.his.model.Patient;
import com.sd.his.wrapper.response.BranchResponseWrapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

        /*
         * @author    : waqas kamran
         * @Date      : 17-Apr-18
         * @version   : ver. 1.0.0
         *
         * ________________________________________________________________________________________________
         *
         *  Developer				Date		     Version		Operation		Description
         * ________________________________________________________________________________________________
         *
         *
         * ________________________________________________________________________________________________
         *
         * @Project   : HIS
         * @Package   : com.sd.his.*
         * @FileName  : UserAuthAPI
         *
         * Copyright ©
         * SolutionDots,
         * All rights reserved.
         *
         */
@Repository
public interface LabOrderRepository extends JpaRepository<LabOrder, Long> {

    List<LabOrderProjection> findAllProjectedBy(Pageable pageable);
    LabOrderProjection findById(Long id);
    List<LabOrder> findAllById(Long id);
    @Modifying
    Integer deleteById(long id);
    List<LabOrderProjection> findAllByPatient(Pageable pageable, Patient patient);
}

