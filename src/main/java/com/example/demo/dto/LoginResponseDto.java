package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDto {

    @JsonProperty("authToken")
    private String authToken;

    @JsonProperty("refreshToken")
    private String refreshToken;

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

    // --- NEWLY ADDED PROFILE FIELDS ---
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("nationalId")
    private String nationalId;

    @JsonProperty("address")
    private Address address; // Nested object

    @JsonProperty("profilePictureUrl")
    private String profilePictureUrl;

    @JsonProperty("role") // Primary role, e.g., "Parent", "Teacher"
    private String role;

    @JsonProperty("joinDate")
    private String joinDate; // Can be a simple string like "May 2024" or a full date string

    @JsonProperty("linkedStudents")
    private List<LinkedStudent> linkedStudents; // List of nested objects

    @JsonProperty("isVerified")
    private boolean isVerified;

    @JsonProperty("gender")
    private String gender;

    // --- Nested Data Classes matching your Android CurrentUser structure ---
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Address {
        @JsonProperty("district")
        private String district;
        @JsonProperty("sector")
        private String sector;
        @JsonProperty("cell")
        private String cell;
        @JsonProperty("village")
        private String village;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class LinkedStudent {
        @JsonProperty("id")
        private String id;
        @JsonProperty("firstName")
        private String firstName;
        @JsonProperty("lastName")
        private String lastName;
    }
}