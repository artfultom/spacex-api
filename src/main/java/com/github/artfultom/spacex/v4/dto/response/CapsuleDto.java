package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CapsuleDto implements Serializable {

    private String id;

    @JsonProperty("reuse_count")
    private Integer reuseCount;

    @JsonProperty("water_landings")
    private Integer waterLandings;

    @JsonProperty("land_landings")
    private Integer landLandings;

    @JsonProperty("last_update")
    private String last_update;

    private List<String> launches;

    private String serial;

    private String status;

    private String type;

    public CapsuleDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getReuseCount() {
        return reuseCount;
    }

    public void setReuseCount(Integer reuseCount) {
        this.reuseCount = reuseCount;
    }

    public Integer getWaterLandings() {
        return waterLandings;
    }

    public void setWaterLandings(Integer waterLandings) {
        this.waterLandings = waterLandings;
    }

    public Integer getLandLandings() {
        return landLandings;
    }

    public void setLandLandings(Integer landLandings) {
        this.landLandings = landLandings;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public List<String> getLaunches() {
        return launches;
    }

    public void setLaunches(List<String> launches) {
        this.launches = launches;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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
}
