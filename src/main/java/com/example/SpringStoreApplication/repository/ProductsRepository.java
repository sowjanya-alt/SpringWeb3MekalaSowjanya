package com.example.SpringStoreApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringStoreApplication.dataentity.Products;

public interface ProductsRepository extends CrudRepository<Products, Long>{

	
}
