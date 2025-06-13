package com.example.demo.service;


import com.example.demo.dto.LoginResponseDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.UUID;

@Service
public class AuthService {

    /**
     * Authenticates a user based on username/email and password.
     * In a real application, this would involve:
     * 1. Looking up the user in a database.
     * 2. Verifying the hashed password.
     * 3. Generating a JWT (JSON Web Token) for authToken.
     * 4. Potentially generating a refresh token.
     * 5. Populating user details into the LoginResponseDto.
     *
     * @param usernameOrEmail The user's identifier.
     * @param password The user's password.
     * @return LoginResponseDto containing authentication tokens and user details.
     * @throws RuntimeException if authentication fails.
     */
    /**
     * Authenticates a user based on username/email and password.
     * ... (rest of your Javadoc) ...
     */
    public LoginResponseDto authenticateUser(String usernameOrEmail, String password) {
        if ("user@example.com".equals(usernameOrEmail) && "password123".equals(password)) {
            return LoginResponseDto.builder()
                    .authToken("your-generated-jwt-token-" + UUID.randomUUID().toString())
                    .refreshToken("your-generated-refresh-token-" + UUID.randomUUID().toString())
                    .userId("usr_" + UUID.randomUUID().toString().substring(0, 8))
                    .email(usernameOrEmail)
                    .firstName("Mock")
                    .lastName("User")
                    .activeRoles(Arrays.asList("PARENT", "STUDENT"))
                    .build();
        } else if ("admin@example.com".equals(usernameOrEmail) && "adminpass".equals(password)) {
            LoginResponseDto.LoginResponseDtoBuilder builder = LoginResponseDto.builder()
                    .authToken("your-generated-jwt-token-admin-" + UUID.randomUUID().toString())
                    .refreshToken("your-generated-refresh-token-admin-" + UUID.randomUUID().toString())
                    .userId("usr_" + UUID.randomUUID().toString().substring(0, 8))
                    .email(usernameOrEmail)
                    .firstName("Admin")
                    .lastName("User")
                    .activeRoles(Arrays.asList("ADMIN"));
            /*return LoginResponseDto.builder()
                    .authToken("your-generated-jwt-token-admin-" + UUID.randomUUID().toString())
                    .refreshToken("your-generated-refresh-token-admin-" + UUID.randomUUID().toString())
                    .userId("usr_" + UUID.randomUUID().toString().substring(0, 8))
                    .email(usernameOrEmail)
                    .firstName("Admin")
                    .lastName("User")
                    .activeRoles(Arrays.asList("ADMIN"))
                    .build();*/
            System.out.println("builder = $" + builder );
            return builder.build();
        } else {
            // Simulate failed authentication: THROW AN EXCEPTION!
            throw new RuntimeException("Invalid username or password. username: "+usernameOrEmail+" password: "+password); // <--- UNCOMMENT OR RE-ADD THIS!
            // Do NOT return a LoginResponseDto here. This is an authentication failure.
        }
    }
}
