package com.yildiz.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder // bir sınıftan nesne türetmek için kullanılır
@Data  // get ve set metodlarını tanımlar
@AllArgsConstructor // yapıcı metodu parametreli verir
@NoArgsConstructor // yapıcı metodu parametresiz verir

@ToString // nesne bilgisini terminale yazdırmak için kullanılır


@Entity
@Table(name = "/auth")
public class Auth extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Email
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String password;



}
