package com.danharding.creditcounter.Repositories;

import com.danharding.creditcounter.Models.CreditsCoaster;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditsRepository extends JpaRepository<CreditsCoaster, Long> {
    
}
