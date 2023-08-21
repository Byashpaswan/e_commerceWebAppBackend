package com.Byas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Byas.exception.ProductException;
import com.Byas.model.Rating;
import com.Byas.model.User;
import com.Byas.request.RatingRequest;

@Service
public interface RatingService {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	public List<Rating> getProductsRating(Long productId);

}
