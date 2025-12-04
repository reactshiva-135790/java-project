package com.coding.shuttle.learningRestAPIs.dto;

public class StudentDto {

    private long id;
    private String name;
    private String email;

    // ✅ Default Constructor (needed by Spring)
    public StudentDto() {
    }

    // ✅ Constructor with parameters
    public StudentDto(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // ✅ Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
