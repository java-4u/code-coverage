package com.example.services;

import java.util.ArrayList;
import java.util.List;

import com.example.models.UserModel;

public class UserService {

	public UserService() {
		super();
		userModels();
	}

	public UserModel getUserById(String id) {
		UserModel model = new UserModel();
		try {
			for (UserModel userModel : userModels()) {
				if (id.equals(userModel.getId()))
					model= userModel;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	public List<UserModel> userModels() {
		List<UserModel> models = new ArrayList<UserModel>();
		int len = 5;
		for (int i = 0; i < len; i++) {
			//models.add(new UserModel(String.valueOf(i), "Name" + i, "Age" + i, "Gender" + i));
			UserModel model = new UserModel();
			model.setId(String.valueOf(i));
			model.setName("Name"+i);
			model.setAge("Age"+i);
			model.setGender("Gender"+i);
			models.add(model);
		}
		return models;
	}
}
