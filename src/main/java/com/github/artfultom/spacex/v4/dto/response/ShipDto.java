package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipDto implements Serializable {

    private String id;

    @JsonProperty("legacy_id")
    private String legacyId;

    private String model;

    private String type;

    private List<String> roles;

    private Long imo;

    private Long mmsi;

    private Long abs;

    @JsonProperty("class")
    private Long clazz;

    @JsonProperty("mass_kg")
    private Long massKg;

    @JsonProperty("mass_lbs")
    private Long massLbs;

    @JsonProperty("year_built")
    private Integer yearBuilt;

    @JsonProperty("home_port")
    private String homePort;

    private String status;

    @JsonProperty("speed_kn")
    private Double speedKn;

    @JsonProperty("course_deg")
    private Double courseDeg;

    private Double latitude;

    private Double longitude;

    private Boolean active;

    private String name;

    private List<String> launches;

    private String image;

    private String link;

    @JsonProperty("last_ais_update")
    private String lastAisUpdate;

    public ShipDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Long getImo() {
        return imo;
    }

    public void setImo(Long imo) {
        this.imo = imo;
    }

    public Long getMmsi() {
        return mmsi;
    }

    public void setMmsi(Long mmsi) {
        this.mmsi = mmsi;
    }

    public Long getAbs() {
        return abs;
    }

    public void setAbs(Long abs) {
        this.abs = abs;
    }

    public Long getClazz() {
        return clazz;
    }

    public void setClazz(Long clazz) {
        this.clazz = clazz;
    }

    public Long getMassKg() {
        return massKg;
    }

    public void setMassKg(Long massKg) {
        this.massKg = massKg;
    }

    public Long getMassLbs() {
        return massLbs;
    }

    public void setMassLbs(Long massLbs) {
        this.massLbs = massLbs;
    }

    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getSpeedKn() {
        return speedKn;
    }

    public void setSpeedKn(Double speedKn) {
        this.speedKn = speedKn;
    }

    public Double getCourseDeg() {
        return courseDeg;
    }

    public void setCourseDeg(Double courseDeg) {
        this.courseDeg = courseDeg;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLaunches() {
        return launches;
    }

    public void setLaunches(List<String> launches) {
        this.launches = launches;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLastAisUpdate() {
        return lastAisUpdate;
    }

    public void setLastAisUpdate(String lastAisUpdate) {
        this.lastAisUpdate = lastAisUpdate;
    }
}



