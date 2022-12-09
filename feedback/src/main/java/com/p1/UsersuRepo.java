package com.p1;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.irctc.springirctc.model.Users;

@Repository
public interface UsersuRepo extends JpaRepository<Usersu, Long> {
	
	
	@Query("select emailId,password,pin from Usersu where emailId = ?1")
	List<String> loginvalidation(String email, String pwd);
	
	@Query("select u from Usersu u where emailId = ?1")
	List<Usersu> getUserByEmail(String email);

	Optional<Usersu> findByemailId(String email);
}