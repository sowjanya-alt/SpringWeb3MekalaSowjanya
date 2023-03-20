package com.example.SpringStoreApplication.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SpringStoreApplication.dataentity.Sales;
import com.example.SpringStoreApplication.repository.SalesRepository;

@Service
public class SalesServiceImpl implements SalesService
{
	private final SalesRepository salesRepository;

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	   public Sales getSale( int id )
	   {
	     Optional<Sales> sale = salesRepository.findById( id );
		return sale.orElse( null );
	   }
}