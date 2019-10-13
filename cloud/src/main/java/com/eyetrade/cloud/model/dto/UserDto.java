package com.eyetrade.cloud.model.dto;

import com.eyetrade.cloud.util.constants.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
 * Created by Emir Gökdemir
 * on 12 Eki 2019
 */
@Getter
@Setter
@ToString
public class UserDto {

    private String email;
    private String name;
    private String surname;
    private String phone;
    private String authority;
    private String iban;
    private String identityNo;
    private String city;
    private String locationX;
    private String locationY;
    private String userType;

    @Length(min = 5, message = "The field must be at least 5 characters")
    @Length(max = 50, message = "The field must be less than 50 characters")
    private String password;
}
