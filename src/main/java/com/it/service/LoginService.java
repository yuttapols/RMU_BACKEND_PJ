package com.it.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.TblLoginEntity;
import com.it.model.LoginRequestModel;
import com.it.model.LoginResponeModel;
import com.it.repository.TblLoginRepository;

@Service
public class LoginService {

	@Autowired
	private TblLoginRepository tblLoginRepository;
	
	public LoginResponeModel getLoginById(Integer id) {

		LoginResponeModel model = new LoginResponeModel();
		
		TblLoginEntity entity = tblLoginRepository.findById(id).orElse(null);
		
		if(null != entity) {
			model.setUserId(entity.getUserId());
			model.setUsername(entity.getUsername());
			model.setPassword(entity.getPassword());
			model.setStatus(entity.getStatus());
			model.setRoleId(entity.getRoleId());
			model.setCreateBy(entity.getCreateBy());
			model.setCreateDate(entity.getCreateDate());
		}

		return model;
	}
	
	public void save(LoginRequestModel request) {
		
		TblLoginEntity entity = new TblLoginEntity();
		entity.setUsername(request.getUsername());
		entity.setPassword(request.getPassword());
		entity.setRoleId(request.getRoleId());
		entity.setStatus(request.getStatus());
		entity.setCreateBy("joey");
		entity.setCreateDate(new Date());
		tblLoginRepository.save(entity);
	}
}
