package com.tnsif.spring_data_jpa_mapping.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	 @Autowired
	    private CustomerRepository customerRepository;
	    @Autowired
	    private ProductRepository productRepository;

	    @PostMapping("/placeOrder")
	    public Customer placeOrder(@RequestBody OrderRequest request){
	       return customerRepository.save(request.getCustomer());
	    }

	    @GetMapping("/findAllOrders")
	    public List<Customer> findAllOrders(){
	        return customerRepository.findAll();
	    }

	    @GetMapping("/getInfo")
	    public List<OrderResponse> getJoinInformation(){
	        return customerRepository.getJoinInformation();
	    }
}
