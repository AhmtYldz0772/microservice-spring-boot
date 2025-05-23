package com.yildiz.controller;

import com.yildiz.dto.request.DoLoginRequestDto;
import com.yildiz.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.yildiz.constant.EndPoint.*;

@RestController
@RequestMapping
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    /*
    @GetMapping("/")
    public String hello() {
        return "Hello AuthService";
    }
    @GetMapping("/info")
    public String info() {
        return "info: AuthService";
    }

     */

    @PostMapping(ENDPOINT_REGISTER)
    public String register(){
        return null;
    }
    @PostMapping(ENDPOINT_LOGIN)
    public ResponseEntity<String> login(@RequestBody DoLoginRequestDto dto){
        return ResponseEntity.ok(authService.doLogin(dto));
    }
    @GetMapping(ENDPOINT_FINDALL)
    public String findAll(){
        return null;
    }
    @GetMapping(ENDPOINT_GETMESSAGE)
    public String getMessage(){
        return null;
    }
}