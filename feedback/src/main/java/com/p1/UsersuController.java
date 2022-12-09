package com.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.irctc.springirctc.exception.ResourceNotFoundException;
//import com.irctc.springirctc.model.Users;
//import com.irctc.springirctc.repository.UsersRepo;

@RestController
@RequestMapping("usersu/")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UsersuController {
	@Autowired
	private UsersuRepo usersRepo;

	// get all users
	@GetMapping("get")
	public List<Usersu> getAllUsers() {
		return usersRepo.findAll();
	}

	// create user rest api
	@PostMapping("createuser")
	public Usersu createUser(@RequestBody Usersu user) {
		return usersRepo.save(user);
	}

	// get Users by id rest api
	@GetMapping("/get/{id}")
	public ResponseEntity<Usersu> getUsersById(@PathVariable Long id) {
		Usersu user = usersRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not exist with id :" + id));
		return ResponseEntity.ok(user);
	}

	// update Users rest api
	@PutMapping("update/{id}")
	public ResponseEntity<Usersu> updateUsers(@PathVariable Long id, @RequestBody Usersu UsersDetails) {
		Usersu user = usersRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not exist with id :" + id));

//		user.setFirstName(UsersDetails.getFirstName());
//		user.setLastName(UsersDetails.getLastName());
//		user.setEmailId(UsersDetails.getEmailId());

		user.setEmailId(UsersDetails.getEmailId());
		

		Usersu updatedUsers = usersRepo.save(user);
		return ResponseEntity.ok(updatedUsers);
	}

	// update Users with email rest api
	@PutMapping("updatepass/{Email}")
	public ResponseEntity<Usersu> updateUsersWithEmail(@PathVariable String Email, @RequestBody Usersu UsersDetails) {
		Usersu user = usersRepo.findByemailId(Email)
				.orElseThrow(() -> new ResourceNotFoundException("Users not exist with Email :" + Email));

//		user.setFirstName(UsersDetails.getFirstName());
//		user.setLastName(UsersDetails.getLastName());
//		user.setEmailId(UsersDetails.getEmailId());

		user.setPassword(UsersDetails.getPassword());
		

		Usersu updatedUsers = usersRepo.save(user);
		return ResponseEntity.ok(updatedUsers);
	}
	// delete Users rest api
	@DeleteMapping("/drop/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUsers(@PathVariable Long id) {
		Usersu Users = usersRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not exist with id :" + id));

		usersRepo.delete(Users);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

//		login validation using password
	@GetMapping("loginvalidate/{email}/pwd/{pwd}")
	public List<Boolean> loginvalidatebyemail(@PathVariable String email, @PathVariable String pwd) {
		List<Boolean> isvalid = Arrays.asList(false, false);
		try {
			List<String> logindata = new ArrayList<String>(
					Arrays.asList(usersRepo.loginvalidation(email, pwd).get(0).split(",")));
			System.out.println(logindata);
			isvalid.set(0, true);

			if (logindata.get(1).equals(pwd)) {
				System.out.println("user exists");
				isvalid.set(1, true);
				return isvalid;
			}
			return isvalid;

		} catch (java.lang.IndexOutOfBoundsException usernotfound) {
			return isvalid;
		}
	}

//	login validation using pin
	@GetMapping("loginvalidate/{email}/pin/{pin}")
	public boolean loginvalidatebypin(@PathVariable String email, @PathVariable String pin) {
		List<String> logindata = new ArrayList<String>(
				Arrays.asList(usersRepo.loginvalidation(email, pin).get(0).split(",")));
		boolean isvalid = false;
		if (logindata.get(2).equals(pin)) {
			System.out.println("user exists");
			isvalid = true;
		}
		return isvalid;

	}
	
	@GetMapping("getuser/{email}")
	public List<Usersu> getBookingsByUseEmail(@PathVariable String email){
		System.out.println(usersRepo.getUserByEmail(email));
		return usersRepo.getUserByEmail(email);
		
	}
	
	
	
	

}
