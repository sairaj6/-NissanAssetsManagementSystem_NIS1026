package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nissan.dao.ILoginDAO;
import com.nissan.model.Login;

@Service
public class LoginService implements ILoginService {

	@Autowired
	ILoginDAO logindao;
	
	
	@Override
	public Login addLogin(Login login) {
		
		return logindao.save(login);
	}

	@Override
	public Login updatelogin(Login login) {
		
		return logindao.save(login);
	}

	@Override
	public void deleteLogin(Integer loginId) {
		
		logindao.deleteById(loginId);

	}

	@Override
	public List<Login> getAllLogin() {
		
		return logindao.findAll();
	}

	@Override
	public Login getByLoginId(Integer loginId) {
		return logindao.findById(loginId).get();
	}

}
