package com.example.course.dto;

import java.io.Serializable;

import com.example.course.entities.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String email;
	private String phone;
	
	public UserDTO() {
	}

	public UserDTO(Long id, String nome, String email, String phone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.phone = phone;
	}
	
	public UserDTO(User entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.email = entity.getEmail();
		this.phone = entity.getPhone();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public User toEntity() {
		return new User(id, nome, email, phone, null);
	}

}