package com.lti.exam.service.candidate;

import com.lti.exam.model.AuthenticationStatus;
import com.lti.exam.model.LoginDetails;
import org.springframework.stereotype.Service;

@Service
public interface CandidateLoginService {
    public AuthenticationStatus getLoginStatus(LoginDetails loginDetails);
}
