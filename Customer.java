package com.cts.customer.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="customer_management")
public class Customer {
	@Id
	@Column(name="customer_id")
    private int id;
	
	@Column(name="firstName")
	@NotEmpty(message="firstName cannot be null")
    private String firstName;
	
	@Column(name="lastName")
	@NotEmpty(message="lastName cannot be null")
    private String lastName;
	
	@Column(name="mail_id")
	@Email(message="email should be valid")
    private String email;
	
	@Column(name="contact_number")
	@NotEmpty(message="contact number cannot be null")
	@Pattern(regexp="(^$|[0-9]{10})",message="Enter 10 digit mobile number")
	private String contact;
	
	@Column(name="gender")
	@NotEmpty(message="gender cannot be null")
	private String gender;
	
	@Column(name="price")
	@Min(message="price minimum value is 1000",value=1000)
	private double price;
	
	@Column(name="product_name")
	@NotEmpty(message="product_name cannot be null")
	private String product_name;
   
	public Customer() {}
	public Customer(int id,String firstName, String lastName, String email, String contact, String gender,double price,
			String product_name) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.price = price;
		this.product_name = product_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contact=" + contact + ", gender=" + gender +  ", price=" + price + ",  product_name=" + product_name
				+ "]";
	}
    
}