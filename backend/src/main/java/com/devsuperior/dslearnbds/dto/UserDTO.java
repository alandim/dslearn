package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.devsuperior.dslearnbds.entities.User;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	
	@NotBlank(message = "Campo obrigatório")
	private String name;
	
	@Email(message = "Entrar com um email válido")
	private String email;
	
	//private Set<RoleDTO> roles = new HashSet<>();
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		//entity.getRoles().forEach(cat -> this.roles.add(new RoleDTO(cat)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//public Set<RoleDTO> getRoles() {
	//	return roles;
	//}
}
