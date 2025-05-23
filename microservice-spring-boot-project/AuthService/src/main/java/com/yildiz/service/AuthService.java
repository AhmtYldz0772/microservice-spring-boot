package com.yildiz.service;

import com.yildiz.dto.request.DoLoginRequestDto;
import com.yildiz.model.Auth;
import com.yildiz.repository.IAuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Service
public class AuthService extends ServiceManager<Auth,Long> {
    /*
    @Autowired
    private final IAuthRepository repository;
*/

/*
    public AuthService(IAuthRepository repository) {
        this.repository = repository;
    }
*/
    private final IAuthRepository repository;
    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public String doLogin(DoLoginRequestDto dto) {
        return null;
    }
    // doRegister

    // doLogin

}
