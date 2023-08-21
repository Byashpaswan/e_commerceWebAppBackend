package com.Byas.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Byas.exception.ProductException;
import com.Byas.model.Product;
import com.Byas.request.CreateProductRequest;

public interface ProductService {
	public Product createProduct(CreateProductRequest req);
	 
	public String deleteProduct(Long productId)throws ProductException;
    
	public Product updateProduct(Long productId,Product req)throws ProductException;
	
	public Product findProductById(Long id) throws ProductException;
	public List<Product> getAllProducts();
    
	public List<Product> findProductByCategory(String category);
	
	
	
	public Page<Product>getAllProduct(String category,List<String>colors, List<String>sizes,Integer minPrice,Integer maxPrice,
			Integer minDiscount,String sort,String stock,Integer pageNumber,Integer  pageSize);
	
	
	
}
