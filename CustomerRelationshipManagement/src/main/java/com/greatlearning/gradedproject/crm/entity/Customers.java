package com.greatlearning.gradedproject.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerId")
	private long customerId;

	@Column(name = "firstName", columnDefinition = "varchar(50)")
	@NotEmpty(message = "This is required field")
	@NotBlank(message = "This is required field")
	private String firstName;

	@Column(name = "lastName", columnDefinition = "varchar(50)")
	@NotEmpty(message = "This is required field")
	@NotBlank(message = "This is required field")
	private String lastName;

	@Column(name = "email", columnDefinition = "varchar(50)")
	@Email(message = "Email format is not correct- it should be abc@test.com")
	private String email;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public long getCustomerId() {
		return customerId;
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

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}

}
