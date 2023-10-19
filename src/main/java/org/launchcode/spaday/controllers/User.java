package org.launchcode.spaday.controllers;




        import javax.validation.constraints.Email;
        import javax.validation.constraints.NotBlank;
        import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Username is required")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @Email(message = "Email must be a valid email address")
    private String email;

    // Constructors, Getters, and Setters

    // ...

}

