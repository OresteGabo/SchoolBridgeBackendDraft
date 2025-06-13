package com.example.demo.dto;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok: Generates getters, setters, equals, hashCode, and toString
@NoArgsConstructor // Lombok: Generates a no-argument constructor
@AllArgsConstructor // Lombok: Generates a constructor with all fields
public class LoginRequestDto {

    @JsonProperty("usernameOrEmail")
    private String usernameOrEmail;

    @JsonProperty("password")
    private String password;
}
