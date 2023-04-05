package com.it.model;

import lombok.Data;

@Data
public class LoginRequestModel {
	
	private Integer id;
	private String username;
	private String password;
	private Integer roleId;
	private String status;
}
