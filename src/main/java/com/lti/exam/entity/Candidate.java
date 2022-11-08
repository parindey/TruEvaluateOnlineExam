package com.lti.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table(name = "candidate")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Candidate {
	@Column(name = "user_name")
	private String userName;
	@Id
	@Column(name = "email_address")
    private String mail;
     
    @Column(name = "user_password")
    private String password;
}

