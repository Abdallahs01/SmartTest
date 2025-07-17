package com.example.smarttest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "test_results")
public class TestResult {

    @Id
    private String id;

    private String testId;
    private String testName;
    private String status; // PASS or FAIL
    private double duration; // in seconds
    private LocalDateTime timestamp;
    private List<String> tags;
    private String environment; // staging, production, etc.

    // Constructors
    public TestResult() {
    }

    public TestResult(String testId, String testName, String status, double duration,
                      LocalDateTime timestamp, List<String> tags, String environment) {
        this.testId = testId;
        this.testName = testName;
        this.status = status;
        this.duration = duration;
        this.timestamp = timestamp;
        this.tags = tags;
        this.environment = environment;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    // toString
    @Override
    public String toString() {
        return "TestResult{" +
                "id='" + id + '\'' +
                ", testId='" + testId + '\'' +
                ", testName='" + testName + '\'' +
                ", status='" + status + '\'' +
                ", duration=" + duration +
                ", timestamp=" + timestamp +
                ", tags=" + tags +
                ", environment='" + environment + '\'' +
                '}';
    }
}
