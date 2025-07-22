package com.example.smarttest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Document(collection = "test_results")
@Schema(description = "Represents a result from an automated test execution")
public class TestResult {

    @Id
    @Schema(description = "Unique database ID", example = "64b8c9016d5e3c0021aabcde", accessMode = Schema.AccessMode.READ_ONLY)
    private String id;

    @Schema(description = "Unique ID for the test execution", example = "TST-20250721-001")
    private String testId;

    @Schema(description = "Descriptive name of the test case", example = "LoginFunctionalityTest")
    private String testName;

    @Schema(description = "Execution result of the test case", example = "PASS")
    private String status;

    @Schema(description = "Duration in seconds", example = "3.24")
    private double duration;

    @Schema(description = "Date and time when the test was run", example = "2025-07-21T15:30:00")
    private LocalDateTime timestamp;

    @Schema(description = "Tags assigned to the test (e.g., functional, smoke)", example = "[\"smoke\", \"login\"]")
    private List<String> tags;

    @Schema(description = "Test environment", example = "staging")
    private String environment;

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
