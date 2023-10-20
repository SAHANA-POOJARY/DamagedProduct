package com.lulu.ReturnProducts_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DamagedProducts")
public class DamagedProducts {
	@Id
	int id;
	String product_name;
	String reason_to_return;
	String customer_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getReason_to_return() {
		return reason_to_return;
	}
	public void setReason_to_return(String reason_to_return) {
		this.reason_to_return = reason_to_return;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Override
	public String toString() {
		return "DamagedProducts [id=" + id + ", product_name=" + product_name + ", reason_to_return=" + reason_to_return
				+ ", customer_name=" + customer_name + "]";
	}
	public DamagedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
