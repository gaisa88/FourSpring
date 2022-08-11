package com.fourspring.repository;

import com.fourspring.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository <Address, Long>{
}
