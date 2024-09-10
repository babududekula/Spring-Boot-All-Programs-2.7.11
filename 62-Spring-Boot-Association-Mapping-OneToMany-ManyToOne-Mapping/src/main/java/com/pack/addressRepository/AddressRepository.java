package com.pack.addressRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> 
{

}
