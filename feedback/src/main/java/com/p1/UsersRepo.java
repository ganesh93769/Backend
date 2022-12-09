package com.p1;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.irctc.springirctc.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {
	
	
	@Query("select emailId,password,pin from Users where emailId = ?1")
	List<String> loginvalidation(String email, String pwd);
	
	@Query("select u from Users u where emailId = ?1")
	List<Users> getUserByEmail(String email);

	Optional<Users> findByemailId(String email);
}