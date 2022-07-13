package com.devsuperior.dsmesta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmesta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
