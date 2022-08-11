package com.fourspring.repository;

import com.fourspring.model.Address;
import com.fourspring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BranchRepository extends JpaRepository <Address, Long>{
}
