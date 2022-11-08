package com.lti.exam.repository;

import com.lti.exam.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateLoginRepository extends JpaRepository<Candidate, String>{
	
	@Query(value = "Select * from candidate where email_address = ?1", nativeQuery = true)
	Optional<Candidate> findByMail(String mailString);
	
}
