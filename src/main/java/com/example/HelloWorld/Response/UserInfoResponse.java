package com.example.HelloWorld.Response;

public class UserInfoResponse {
    private String id;
    private String username;
    private String email;


    public UserInfoResponse(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
