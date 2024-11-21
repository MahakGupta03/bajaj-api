package com.bajajAPI.bajajAPI.entities;

import java.util.List;

public class RequestModel {
    private List<String> data;
    private String fileB64;

    // Getters and Setters
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public String getFileB64() {
        return fileB64;
    }

    public void setFileB64(String fileB64) {
        this.fileB64 = fileB64;
    }
}

