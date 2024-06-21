package com.nabil.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.nabil.bookclub.models.LoginUser;
import com.nabil.bookclub.models.User;
import com.nabil.bookclub.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User register(User newUser, BindingResult result) {
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		if (potentialUser.isPresent()) {
			result.rejectValue("email", "unique", "This email is already registered!");
		}

		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Matches", "Passwords must match!");
		}

		if (result.hasErrors()) {
			return null;
		} else {
			String hashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashedPassword);
			return userRepo.save(newUser);
		}
	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		Optional<User> optionalUser = userRepo.findByEmail(newLoginObject.getEmail());
		if (optionalUser.isEmpty()) {
			result.rejectValue("email", "NotFound", "Email not found");
			return null;
		}

		User user = optionalUser.get();

		if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Incorrect", "Incorrect password");
			return null;
		}

		return user;
	}

	public User findUser(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
	}
}