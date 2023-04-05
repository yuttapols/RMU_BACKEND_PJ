package com.it.model;

import lombok.Data;

@Data
public class RoleResponeModel {

	private Integer roleId;
	private String roleName;
	private String roleDesc;
	private String status;
	private String createBy;
}
