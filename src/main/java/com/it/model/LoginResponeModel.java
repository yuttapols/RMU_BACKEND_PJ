package com.it.model;


import java.util.Date;

import lombok.Data;

@Data
public class LoginResponeModel {
	
	private Integer userId;
	private String username;
	private String password;
	private Integer roleId;
	private String status;
	private String createBy;
	private Date createDate;
}
