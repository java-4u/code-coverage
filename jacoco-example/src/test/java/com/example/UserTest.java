package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.models.UserModel;
import com.example.services.UserService;

public class UserTest {
	private UserService userService;

	@Before
	public void init() {
		userService = new UserService();
	}

	@Test
	public void testUsersSize() {
		int userSize = userService.userModels().size();
		Assert.assertEquals(5, userSize);
	}

	@Test
	public void testUserById() {
		String id = "2";
		UserModel userModel = userService.getUserById(id);
		System.out.println(userModel.getName());
		Assert.assertEquals("2", userModel.getId());
		Assert.assertEquals("Name2", userModel.getName());
		Assert.assertEquals("Age2", userModel.getAge());
		Assert.assertEquals("Gender2", userModel.getGender());
	}

}
