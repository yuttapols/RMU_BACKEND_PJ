package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.RoleRequestModel;
import com.it.model.RoleResponeModel;
import com.it.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	RoleService roleService;
	
	// ดึงข้อมูลของ table Role ขึ้นมาทั้งหมด
	@GetMapping("/role")
	public List<RoleResponeModel> getRoleAll(){
		return roleService.getRoleAll();
	}
	
	// ดึงข้อมูลของ table Role ขึ้นมาตาม RoleId
	@GetMapping("/role/{roleId}")
	public RoleResponeModel getRoleById(@PathVariable Integer roleId) {
		
		return roleService.getRoleById(roleId);
	}
	
	@PostMapping("/role")
	public void saveRole(@RequestBody RoleRequestModel request) {
		roleService.saveRole(request);
	}
	
	@PutMapping("/role/{roleId}")
	public void updateRole(@RequestBody RoleRequestModel request, @PathVariable Integer roleId) {
		roleService.updateRole(request, roleId);
	}
	
	@DeleteMapping("/role/{roleId}")
	public void deleteRole(@PathVariable Integer roleId) {
		roleService.deleteRole(roleId);
	}
	
}
