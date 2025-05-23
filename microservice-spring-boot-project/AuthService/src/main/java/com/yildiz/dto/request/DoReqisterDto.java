package com.yildiz.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder  // bir sınfın kolayca nesne oluşturulmasını sağlar
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoReqisterDto {
    private String username;
    private String password;
    private String rePassword;
    private String email;
}
