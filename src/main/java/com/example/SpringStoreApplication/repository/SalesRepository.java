package com.example.SpringStoreApplication.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringStoreApplication.dataentity.Sales;

public interface SalesRepository extends CrudRepository<Sales, Integer>  {

	

}
