package com.sd.his.repository;


import com.sd.his.model.Cashier;
import com.sd.his.model.Receptionist;
import com.sd.his.model.User;
import com.sd.his.wrapper.response.StaffResponseWrapper;
import com.sd.his.wrapper.response.StaffWrapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
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
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

    Receptionist findByUser(User user);
    @Query("SELECT new com.sd.his.wrapper.response.StaffWrapper(du.id,rt.id,du.username,du.userType,rt.firstName,rt.lastName,rt.email,br.name) FROM Receptionist rt INNER JOIN rt.user du INNER JOIN rt.branchReceptionists branchDr INNER JOIN branchDr.branch  br  WHERE du.active = TRUE AND branchDr.primaryBranch=TRUE")
    List<StaffWrapper> findAllByActive(Pageable pageable);

    @Query("SELECT new com.sd.his.wrapper.response.StaffResponseWrapper(du.id,rt.id,du.userType,rt.firstName,rt.lastName,du.username,rt.email,br.name,rt.homePhone,rt.cellPhone,du.active,br.id,rt.accountExpiry) FROM Receptionist rt INNER JOIN rt.user du INNER JOIN rt.branchReceptionists branchCr INNER JOIN branchCr.branch br WHERE rt.id =:id AND du.active = TRUE")
    StaffResponseWrapper findAllByIdAndStatusActive(@Param("id") Long id);


}

