package com.cts.customer.entity;


import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class Admin {
	@NotEmpty(message="username should not be empty")
 private String username;
	@NotEmpty(message="password should not be empty")
 private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}

