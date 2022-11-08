package com.lti.exam.controller;

import com.lti.exam.model.AuthenticationStatus;
import com.lti.exam.model.LoginDetails;
import com.lti.exam.service.candidate.CandidateLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CandidateLoginController {

    @Autowired
    CandidateLoginService service;

    @PostMapping("/login/candidate")
    @Validated
    public AuthenticationStatus candidateLogin(
           @Valid @RequestBody LoginDetails loginDetails) {
            return service.getLoginStatus(loginDetails);
    }

}
