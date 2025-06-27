package com.example.demo.service;

import com.example.demo.dto.LoginResponseDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections; // Import for empty lists
import java.util.Random;
import java.util.UUID;
import java.time.LocalDate; // For joinDate
import java.time.format.DateTimeFormatter; // For formatting date

@Service
public class AuthService {

    /**
     * Authenticates a user based on username/email and password.
     * In a real application, this would involve:
     * 1. Looking up the user in a database.
     * 2. Verifying the hashed password.
     * 3. Generating a JWT (JSON Web Token) for authToken.
     * 4. Potentially generating a refresh token.
     * 5. Populating comprehensive user details into the LoginResponseDto.
     *
     * This version uses fake data for testing purposes.
     *
     * @param usernameOrEmail The user's identifier.
     * @param password The user's password.
     * @return LoginResponseDto containing authentication tokens and user details.
     * @throws RuntimeException if authentication fails.
     */
    public LoginResponseDto authenticateUser(String usernameOrEmail, String password) {
        String currentJoinDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM yyyy")); // e.g., "Jun 2025"
        Random random = new Random();
        System.out.println("received id is user: "+usernameOrEmail+" and password is: "+password);
        if ("user@example.com".equals(usernameOrEmail) && "password123".equals(password)) {
            return LoginResponseDto.builder()
                    .authToken( UUID.randomUUID().toString())
                    .refreshToken(UUID.randomUUID().toString())
                    .userId("USR001")
                    .email(usernameOrEmail)
                    .firstName("Jeanne")
                    .lastName("Kwizera")
                    .activeRoles(Arrays.asList("PARENT", "STUDENT"))
                    .phoneNumber("+250 788 123 456")
                    .nationalId("11990800000000010")
                    .address(LoginResponseDto.Address.builder()
                            .district("Gasabo")
                            .sector("Remera")
                            .cell("Kibagabaga")
                            .village("Kagugu")
                            .build())
                    .profilePictureUrl("https://example.com/images/jeanne_kwizera.jpg") // Example URL
                    .role("Parent") // Primary role
                    .joinDate(currentJoinDate)
                    .linkedStudents(Arrays.asList(
                            LoginResponseDto.LinkedStudent.builder().id("std_001").firstName("Mariya").lastName("Kwizera").build(),
                            LoginResponseDto.LinkedStudent.builder().id("std_002").firstName("David").lastName("Kwizera").build()
                    ))
                    .isVerified(random.nextBoolean())
                    .gender("FEMALE")
                    .build();
        } else if ("teacher@example.com".equals(usernameOrEmail) && "teacherpass".equals(password)) {
            return LoginResponseDto.builder()
                    .authToken("test_auth_token_teacher_" + UUID.randomUUID().toString())
                    .refreshToken("test_refresh_token_teacher_" + UUID.randomUUID().toString())
                    .userId("usr_teacher_007")
                    .email(usernameOrEmail)
                    .firstName("Sarah")
                    .lastName("Umuhoza")
                    .activeRoles(Arrays.asList("TEACHER", "SCHOOL_ADMIN"))
                    .phoneNumber("+250 780 987 654")
                    .nationalId("11985700000000020")
                    .isVerified(random.nextBoolean())
                    .gender("FEMALE")
                    .address(LoginResponseDto.Address.builder()
                            .district("Nyarugenge")
                            .sector("Muhima")
                            .cell("Biryogo")
                            .village("Gatenga")
                            .build())
                    .profilePictureUrl("https://example.com/images/sarah_umuhoza.jpg")
                    .role("Teacher")
                    .joinDate(currentJoinDate)
                    .linkedStudents(Collections.emptyList()) // Teachers might not have linked students
                    .build();
        } else {
            // Simulate failed authentication: THROW AN EXCEPTION!
            throw new RuntimeException("Invalid username or password. Please try 'user@example.com' with 'password123' or 'teacher@example.com' with 'teacherpass'.");
        }
    }
}