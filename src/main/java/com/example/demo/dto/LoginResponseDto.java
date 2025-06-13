package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder; // Optional: For easy building of objects
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Lombok: Adds a builder pattern for easier object creation
public class LoginResponseDto {

    @JsonProperty("authToken")
    private String authToken;

    @JsonProperty("refreshToken")
    private String refreshToken; // Can be null, hence no primitive type

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("activeRoles")
    private List<String> activeRoles;
}
