package com.bajajAPI.bajajAPI.entities;

import java.util.List;

public class ResponseModel {
    private boolean isSuccess;
    private String userId;
    private String email;
    private String rollNumber;
    private List<String> numbers;
    private List<String> alphabets;
    private List<String> highestLowercaseAlphabet;
    private boolean isPrimeFound;
    private boolean fileValid;
    private String fileMimeType;
    private String fileSizeKb;

    // Getters and Setters
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getHighestLowercaseAlphabet() {
        return highestLowercaseAlphabet;
    }

    public void setHighestLowercaseAlphabet(List<String> highestLowercaseAlphabet) {
        this.highestLowercaseAlphabet = highestLowercaseAlphabet;
    }

    public boolean isPrimeFound() {
        return isPrimeFound;
    }

    public void setPrimeFound(boolean primeFound) {
        isPrimeFound = primeFound;
    }

    public boolean isFileValid() {
        return fileValid;
    }

    public void setFileValid(boolean fileValid) {
        this.fileValid = fileValid;
    }

    public String getFileMimeType() {
        return fileMimeType;
    }

    public void setFileMimeType(String fileMimeType) {
        this.fileMimeType = fileMimeType;
    }

    public String getFileSizeKb() {
        return fileSizeKb;
    }

    public void setFileSizeKb(String fileSizeKb) {
        this.fileSizeKb = fileSizeKb;
    }
}

