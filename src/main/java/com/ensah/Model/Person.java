package com.ensah.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Person {
	private static long counter = 1;
	private long id;
	@NotBlank(message = "This field is required")
	private String firstName;
	@NotBlank(message = "This field is required")
	private String lastName;
	private String email;
	@NotBlank(message = "This field is required")
	private String phone;
	@NotBlank(message = "This field is required")
	private String address;
	@NotBlank(message = "This field is required")
	private String gender;

	public Person(String firstName, String lastName, String email, String phone, String address, String gender) {
		this.id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}

	public Person() {
		this.id = counter++;
	}
}
