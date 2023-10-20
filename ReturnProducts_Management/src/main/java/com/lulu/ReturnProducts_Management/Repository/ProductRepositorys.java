package com.lulu.ReturnProducts_Management.Repository;




import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lulu.ReturnProducts_Management.Entity.DamagedProducts;






public interface ProductRepositorys extends JpaRepository< DamagedProducts, Integer> {
	

}

