package com.prasad.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.model.Product;
import com.prasad.repository.ProductRepository;

@RestController
@RequestMapping("/service")
public class MainController {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private Product product;

	@PostMapping("/addProduct")
	public Product save(@RequestBody Product product) {
		System.out.println("the product details are i am from productclient: " + product);
		productRepository.save(product);
		return product;
	}

}
