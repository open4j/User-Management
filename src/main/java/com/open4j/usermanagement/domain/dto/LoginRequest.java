package com.open4j.usermanagement.domain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class LoginRequest implements Serializable {

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;
    @NotBlank
    @Size(min = 8, max = 20)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
