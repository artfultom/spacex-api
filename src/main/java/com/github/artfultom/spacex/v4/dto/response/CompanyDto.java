package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDto implements Serializable {

    private Headquarters headquarters;

    private Links links;

    private String id;

    private String name;

    private String founder;

    private Integer founded;

    private Integer employees;

    private Integer vehicles;

    @JsonProperty("launch_sites")
    private Integer launchSites;

    @JsonProperty("test_sites")
    private Integer testSites;

    private String ceo;

    private String cto;

    private String coo;

    @JsonProperty("cto_propulsion")
    private String ctoPropulsion;

    private Long valuation;

    private String summary;

    public CompanyDto() {
    }

    public Headquarters getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Headquarters headquarters) {
        this.headquarters = headquarters;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
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

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Integer getFounded() {
        return founded;
    }

    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public Integer getVehicles() {
        return vehicles;
    }

    public void setVehicles(Integer vehicles) {
        this.vehicles = vehicles;
    }

    public Integer getLaunchSites() {
        return launchSites;
    }

    public void setLaunchSites(Integer launchSites) {
        this.launchSites = launchSites;
    }

    public Integer getTestSites() {
        return testSites;
    }

    public void setTestSites(Integer testSites) {
        this.testSites = testSites;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCto() {
        return cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }

    public String getCoo() {
        return coo;
    }

    public void setCoo(String coo) {
        this.coo = coo;
    }

    public String getCtoPropulsion() {
        return ctoPropulsion;
    }

    public void setCtoPropulsion(String ctoPropulsion) {
        this.ctoPropulsion = ctoPropulsion;
    }

    public Long getValuation() {
        return valuation;
    }

    public void setValuation(Long valuation) {
        this.valuation = valuation;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public static class Headquarters implements Serializable {

        private String address;

        private String city;

        private String state;

        public Headquarters() {
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public static class Links implements Serializable {

        private String website;

        private String flickr;

        private String twitter;

        @JsonProperty("elon_twitter")
        private String elonTwitter;

        public Links() {
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getFlickr() {
            return flickr;
        }

        public void setFlickr(String flickr) {
            this.flickr = flickr;
        }

        public String getTwitter() {
            return twitter;
        }

        public void setTwitter(String twitter) {
            this.twitter = twitter;
        }

        public String getElonTwitter() {
            return elonTwitter;
        }

        public void setElonTwitter(String elonTwitter) {
            this.elonTwitter = elonTwitter;
        }
    }
}