package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LandpadDto implements Serializable {

    private String id;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    private String status;

    private String type;

    private String locality;

    private String region;

    private Double latitude;

    private Double longitude;

    @JsonProperty("landing_attempts")
    private Integer landingAttempts;

    @JsonProperty("landing_successes")
    private Integer landingSuccesses;

    private String wikipedia;

    private String details;

    private List<String> launches;

    public LandpadDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getLandingAttempts() {
        return landingAttempts;
    }

    public void setLandingAttempts(Integer landingAttempts) {
        this.landingAttempts = landingAttempts;
    }

    public Integer getLandingSuccesses() {
        return landingSuccesses;
    }

    public void setLandingSuccesses(Integer landingSuccesses) {
        this.landingSuccesses = landingSuccesses;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<String> getLaunches() {
        return launches;
    }

    public void setLaunches(List<String> launches) {
        this.launches = launches;
    }
}
