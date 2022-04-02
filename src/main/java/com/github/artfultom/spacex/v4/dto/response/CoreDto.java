package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoreDto implements Serializable {

    private String id;

    private Integer block;

    @JsonProperty("reuse_count")
    private Integer reuseCount;

    @JsonProperty("rtls_attempts")
    private Integer rtlsAttempts;

    @JsonProperty("rtls_landings")
    private Integer rtlsLandings;

    @JsonProperty("asds_attempts")
    private Integer asdsAttempts;

    @JsonProperty("asds_landings")
    private Integer asdsLandings;

    @JsonProperty("last_update")
    private String lastUpdate;

    private List<String> launches;

    private String serial;

    private String status;

    public CoreDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getReuseCount() {
        return reuseCount;
    }

    public void setReuseCount(Integer reuseCount) {
        this.reuseCount = reuseCount;
    }

    public Integer getRtlsAttempts() {
        return rtlsAttempts;
    }

    public void setRtlsAttempts(Integer rtlsAttempts) {
        this.rtlsAttempts = rtlsAttempts;
    }

    public Integer getRtlsLandings() {
        return rtlsLandings;
    }

    public void setRtlsLandings(Integer rtlsLandings) {
        this.rtlsLandings = rtlsLandings;
    }

    public Integer getAsdsAttempts() {
        return asdsAttempts;
    }

    public void setAsdsAttempts(Integer asdsAttempts) {
        this.asdsAttempts = asdsAttempts;
    }

    public Integer getAsdsLandings() {
        return asdsLandings;
    }

    public void setAsdsLandings(Integer asdsLandings) {
        this.asdsLandings = asdsLandings;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
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
}
