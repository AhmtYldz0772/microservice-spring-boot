package com.yildiz.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@MappedSuperclass // üst sınıf için kullanılır
@SuperBuilder // bir sınıftan nesne türetmek için kullanılır
@Data  // get ve set metodlarını tanımlar
@AllArgsConstructor // yapıcı metodu parametreli verir
@NoArgsConstructor // yapıcı metodu parametresiz verir

public class BaseEntity {
    private Long createAt;
    public Long updateAt;
    private boolean state;
}
