package com.yildiz.service;

import com.yildiz.dto.request.DoLoginRequestDto;
import com.yildiz.dto.request.DoReqisterRequestDto;
import com.yildiz.dto.response.DoReqisterResponseDto;
import com.yildiz.model.Auth;
import com.yildiz.repository.IAuthRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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


    // DoReqisterResponseDto
    public Auth doRegisterv0(DoReqisterRequestDto dto) {
        // TODO parolayı belirli bir kurala göre al bunun kontrolunu yap
        /*
         String reqExpn = "^(?_.*[9])(?=.*[a-z); "
         Pattern pattern =  Pattern.compile(reqExpn, Pattern.CASE_INSENSITIVE);
         MATCHER matcher = pattern.matcher(dto.getPassword());
        * */
        //TODO bu username var mı yok mu? Exception
        /*
        if (repository.existsByUsername(dto.getUsername())) {

                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

        }
        */
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        //TODO parola kontrolu yapman gerekiyor
        //dto.getRePassword();
        auth.setPassword(dto.getPassword());
        auth.setState(true);
        auth.setCreateAt(System.currentTimeMillis());
        save(auth);




        return auth;
    }
    public DoReqisterResponseDto doRegister(DoReqisterRequestDto dto) {
        // TODO parolayı belirli bir kurala göre al bunun kontrolunu yap
        /*
         String reqExpn = "^(?_.*[9])(?=.*[a-z); "
         Pattern pattern =  Pattern.compile(reqExpn, Pattern.CASE_INSENSITIVE);
         MATCHER matcher = pattern.matcher(dto.getPassword());
        * */
        //TODO bu username var mı yok mu? Exception
        /*
        if (repository.existsByUsername(dto.getUsername())) {

                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

        }
        */
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        //TODO parola kontrolu yapman gerekiyor
        //dto.getRePassword();
        auth.setPassword(dto.getPassword());
        auth.setState(true);
        auth.setCreateAt(System.currentTimeMillis());
        save(auth);


        DoReqisterResponseDto responseDto = new DoReqisterResponseDto();
        responseDto.setId(auth.getId());
        responseDto.setUsername(auth.getUsername());
        responseDto.setEmail(auth.getEmail());





        return responseDto;
    }
    // doLogin
    public String doLogin(DoLoginRequestDto dto) {
        Optional<Auth> auth = repository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        //FIXME burada kullanıcı var mı yok mu kontrol edilmeli
       /*
        if (auth.isPresent()) {
            return auth.get().getUsername();
        }
        */

        return auth.get().getId().toString();
    }


}
