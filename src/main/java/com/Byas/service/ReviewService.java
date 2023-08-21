package com.Byas.service;

import java.util.List;

import com.Byas.exception.ProductException;
import com.Byas.model.Review;
import com.Byas.model.User;
import com.Byas.request.ReviewRequest;

public interface ReviewService {
	
public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);

}
