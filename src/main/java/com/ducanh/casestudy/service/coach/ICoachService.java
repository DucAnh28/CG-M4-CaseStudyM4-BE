package com.ducanh.casestudy.service.coach;

import com.ducanh.casestudy.model.Coach;
import com.ducanh.casestudy.model.dto.ICountRole;
import com.ducanh.casestudy.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICoachService extends IGeneralService<Coach> {
    Page<Coach> findAllPage(Pageable pageable);

    Page<Coach> findCoachByRoleContaining(String role, Pageable pageable);

    Iterable<Coach> sortCoachSalaryAsc();

    Iterable<Coach> sortCoachSalaryDesc();

    Page<Coach> findCoachByNameContaining(String name,Pageable pageable);

}
