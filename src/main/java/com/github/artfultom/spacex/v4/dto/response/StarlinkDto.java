package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarlinkDto implements Serializable {

    private String id;

    private Map<String, String> spaceTrack;

    private String version;

    private String launch;

    private Double longitude;

    private Double latitude;

    @JsonProperty("height_km")
    private Double heightKm;

    @JsonProperty("velocity_kms")
    private Double velocityKms;

    public StarlinkDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getSpaceTrack() {
        return spaceTrack;
    }

    public void setSpaceTrack(Map<String, String> spaceTrack) {
        this.spaceTrack = spaceTrack;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getHeightKm() {
        return heightKm;
    }

    public void setHeightKm(Double heightKm) {
        this.heightKm = heightKm;
    }

    public Double getVelocityKms() {
        return velocityKms;
    }

    public void setVelocityKms(Double velocityKms) {
        this.velocityKms = velocityKms;
    }
}
