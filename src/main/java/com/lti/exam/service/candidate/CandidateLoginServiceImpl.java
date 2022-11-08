package com.lti.exam.service.candidate;

import com.lti.exam.entity.Candidate;
import com.lti.exam.model.AuthenticationStatus;
import com.lti.exam.model.LoginDetails;
import com.lti.exam.repository.CandidateLoginRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidateLoginServiceImpl implements CandidateLoginService {

    @Autowired
    CandidateLoginRepository candidateLoginRepository;

    @Override
    public AuthenticationStatus getLoginStatus(LoginDetails loginDetails) {
        Optional<Candidate> candidate = candidateLoginRepository.findByMail(loginDetails.getEmailAddress());
        String password = candidate.map(Candidate::getPassword).orElse("");
        if (StringUtils.isNotEmpty(password) && password.equalsIgnoreCase(loginDetails.getPassword()))
            return AuthenticationStatus.builder()
                    .status("Authentication Success")
                    .statusMessage("Authenticated Successfully")
                    .build();
        else
            return AuthenticationStatus.builder()
                    .status("Authentication Failiure")
                    .statusMessage("Authentication Error - Incorrect Password")
                    .build();
    }
}
