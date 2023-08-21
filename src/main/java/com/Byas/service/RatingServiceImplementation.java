package com.Byas.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Byas.exception.ProductException;
import com.Byas.model.Product;
import com.Byas.model.Rating;
import com.Byas.model.User;
import com.Byas.repository.RatingRepository;
import com.Byas.request.RatingRequest;

@Service
public class RatingServiceImplementation  implements RatingService{

	private RatingRepository ratingRepository;
	private ProductService productService;
	
	public RatingServiceImplementation(RatingRepository ratingRepository,ProductService productService) {
		this.ratingRepository=ratingRepository;
		this.productService=productService;
	}

	
	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		
           Product product=productService.findProductById(req.getProductId());
		
		Rating rating=new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		
		return ratingRepository.save(rating);
		
		
	
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		
		return ratingRepository.getAllProductsRating(productId);
	}

}
