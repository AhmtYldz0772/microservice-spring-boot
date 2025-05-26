package com.yildiz.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder  // bir sınfın kolayca nesne oluşturulmasını sağlar
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoReqisterResponseUserNameDto {
    private String username;

}
