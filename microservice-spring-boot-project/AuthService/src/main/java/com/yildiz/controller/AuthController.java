package com.yildiz.controller;

import com.yildiz.dto.request.DoLoginRequestDto;
import com.yildiz.dto.request.DoReqisterRequestDto;
import com.yildiz.dto.response.DoReqisterResponseDto;
import com.yildiz.model.Auth;
import com.yildiz.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.yildiz.constant.EndPoint.*;

@RestController
// htpp://localhost:9090/auth
@RequestMapping(ENDPOINT_AUTH)
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
    /*
// htpp://localhost:9090/auth/register
    @PostMapping(ENDPOINT_REGISTER)
    public ResponseEntity<Auth> register(@RequestBody DoReqisterRequestDto dto){
        System.out.println("register = " + dto);

        return ResponseEntity.ok(authService.doRegister(dto));
    }
    */

    // htpp://localhost:9090/auth/register
    @PostMapping(ENDPOINT_REGISTER)
    public ResponseEntity<DoReqisterResponseDto> register(@RequestBody DoReqisterRequestDto dto){
        System.out.println("register = " + dto);

        return ResponseEntity.ok(authService.doRegister(dto));
    }
    // htpp://localhost:9090/auth/login
    @PostMapping(ENDPOINT_LOGIN)
    public ResponseEntity<String> login(@RequestBody DoLoginRequestDto dto){
        return ResponseEntity.ok(authService.doLogin(dto));
    }
    // htpp://localhost:9090/auth/findall
    @GetMapping(ENDPOINT_FINDALL)
    public String findAll(){
        return null;
    }
    // htpp://localhost:9090/auth/getmessage
    @GetMapping(ENDPOINT_GETMESSAGE)
    public String getMessage(){
        return null;
    }
}