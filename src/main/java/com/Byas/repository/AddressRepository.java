package com.Byas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Byas.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	

}
