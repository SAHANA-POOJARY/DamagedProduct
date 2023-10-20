package com.lulu.ReturnProducts_Management.Controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

//we use it create rest api end point along with http Methods

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lulu.ReturnProducts_Management.Entity.DamagedProducts;
import com.lulu.ReturnProducts_Management.Repository.ProductRepositorys;

import jakarta.persistence.EntityNotFoundException;


 




    // we use it create REST API end Point along with http Methods 

                   //Like GET ,POST,DELETE,PUT ,PATCH
@RequestMapping("/pps")
@RestController           //POSTMAN
public class ProductMyController {

@Autowired
ProductRepositorys productRepo;


@GetMapping("/VeiwProduct")
public List<DamagedProducts>getJPQL(){
	return productRepo.findAll();//select *from <Table name>
}







@PostMapping("/postProduct")

public DamagedProducts createuser(@RequestBody DamagedProducts prod) {

	return productRepo.save(prod);

}




	@DeleteMapping("/deletesProduct/{id}")

	public void deletProduct(@PathVariable("id") Integer id  ) {

 

		productRepo.deleteById(id); // select * from <TableName>;

 

	}
	
	


	@PutMapping("/updatesport/{id}")

	 

			public DamagedProducts updatePurchase(@PathVariable int id, @RequestBody DamagedProducts updatedProduct) {

	 

			    Optional<DamagedProducts> existingProduct = productRepo.findById(id);

	 

		

	 

			    if (existingProduct.isPresent()) {

	 

			    	DamagedProducts productToUpdate = existingProduct.get();

	 

			        

	 

			        // Update the fields of the existing product with the new data

	 

			        if (updatedProduct.getProduct_name() != null) {

	 

			            productToUpdate.setProduct_name(updatedProduct.getProduct_name());

	 

			        }

	 

	 

			        if (updatedProduct.getReason_to_return() != null) {

	 

			            productToUpdate.setReason_to_return(updatedProduct.getReason_to_return());

	 

			        }

	 
			        if (updatedProduct.getCustomer_name() != null) {

			       	 

			            productToUpdate.setCustomer_name(updatedProduct.getCustomer_name());

	 

			        }
		

	 

			        // Save the updated product to the repository

	 

			        return productRepo.save(productToUpdate);

	 

			    } else {

	 

			        // Handle the case where the product with the given ID doesn't exist

	 

			        throw new EntityNotFoundException("Damaged Product with ID " + id + " not found");

	 

			    }

	 

			}
	
	
 

}
