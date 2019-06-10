package com.lab2.service;

import org.springframework.stereotype.Service;

import com.exception.product.ProductNotFoundException;
import com.lab2.dao.ProductDAO;
import com.lab2.model.Product;
@Service
public class ProductService {
	ProductDAO productDAO;
	
	public ProductService(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	public Product create(Product product) {
		return this.productDAO.save(product);
	}
	
	public Product update(Product productToUpdate) {
		Product product = findById(productToUpdate.getId());
		if(product == null) {
			throw new ProductNotFoundException("Could not update. The product does not exist.");
		}
		return productDAO.save(productToUpdate);
	}
	
	public void delete(long id) {
		this.productDAO.deleteById(id);
	}
	
	public Product findById(long id) {
		return this.productDAO.findById(id);
	}
	
	
	
}
