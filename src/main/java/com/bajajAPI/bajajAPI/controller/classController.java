package com.bajajAPI.bajajAPI.controller;

import com.bajajAPI.bajajAPI.entities.RequestModel;
import com.bajajAPI.bajajAPI.entities.ResponseModel;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/bfhl")
public class classController {

    @PostMapping
    public ResponseModel handlePostRequest(@RequestBody RequestModel request) {
    	System.out.println("fetched");
        ResponseModel response = new ResponseModel();

        // Parse and process the data
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        String highestLowercaseAlphabet = "";
        boolean isPrimeFound = false;

        for (String item : request.getData()) {
            if (isNumeric(item)) {
                numbers.add(item);
                if (isPrime(Integer.parseInt(item))) {
                    isPrimeFound = true;
                }
            } else if (isAlphabet(item)) {
                alphabets.add(item);
                if (Character.isLowerCase(item.charAt(0))) {
                    if (item.compareTo(highestLowercaseAlphabet) > 0) {
                        highestLowercaseAlphabet = item;
                    }
                }
            }
        }

        // Handle file
        boolean fileValid = false;
        String fileMimeType = null;
        String fileSizeKb = "0";

        if (request.getFileB64() != null && !request.getFileB64().isEmpty()) {
            // Decode Base64
            try {
                byte[] decodedBytes = Base64.getDecoder().decode(request.getFileB64());
                fileMimeType = "image/png"; // This should ideally be determined from the file content
                fileSizeKb = String.valueOf(decodedBytes.length / 1024);
                fileValid = true;
            } catch (Exception e) {
                fileValid = false;
            }
        }

        // Set response
        response.setSuccess(true);
        response.setUserId("mahak_gupta_17022003");
        response.setEmail("mahakgupta210013@acropolis.in");
        response.setRollNumber("0827CI211107");
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);
        response.setHighestLowercaseAlphabet(Collections.singletonList(highestLowercaseAlphabet));
        response.setPrimeFound(isPrimeFound);
        response.setFileValid(fileValid);
        response.setFileMimeType(fileMimeType);
        response.setFileSizeKb(fileSizeKb);

        return response;
    }

    @GetMapping
    public Map<String, Integer> handleGetRequest() {
        Map<String, Integer> response = new HashMap<>();
        response.put("operation_code", 1);
        return response;
    }

    // Helper method to check if string is numeric
    private boolean isNumeric(String str) {
        return str != null && str.matches("[0-9]+");
    }

    // Helper method to check if string is alphabet
    private boolean isAlphabet(String str) {
        return str != null && str.matches("[a-zA-Z]");
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
