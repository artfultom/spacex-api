package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DragonDto implements Serializable {

    private String id;

    @JsonProperty("heat_shield")
    private HeatShield heatShield;

    @JsonProperty("launch_payload_mass")
    private Mass launchPayloadMass;

    @JsonProperty("launch_payload_vol")
    private Vol launchPayloadVol;

    @JsonProperty("return_payload_mass")
    private Mass returnPayloadMass;

    @JsonProperty("return_payload_vol")
    private Vol returnPayloadVol;

    @JsonProperty("pressurized_capsule")
    private PressurizedCapsule pressurizedCapsule;

    private Trunk trunk;

    @JsonProperty("height_w_trunk")
    private Measure heightWTrunk;

    private Measure diameter;

    @JsonProperty("first_flight")
    private String firstFlight; // TODO to date

    @JsonProperty("flickr_images")
    private List<String> flickrImages;

    private String name;

    private String type;

    private Boolean active;

    @JsonProperty("crew_capacity")
    private Integer crewCapacity;

    @JsonProperty("sidewall_angle_deg")
    private Integer sidewallAngleDeg;

    @JsonProperty("orbit_duration_yr")
    private Integer orbitDurationYr;

    @JsonProperty("dry_mass_kg")
    private Integer dryMassKg;

    @JsonProperty("dry_mass_lb")
    private Integer dryMassLb;

    private String wikipedia;

    private String description;

    private List<Thruster> thrusters;

    public DragonDto() {
    }

    public static class HeatShield implements Serializable {

        private String material;

        @JsonProperty("size_meters")
        private Double sizeMeters;

        @JsonProperty("temp_degrees")
        private Integer tempDegrees;

        @JsonProperty("dev_partner")
        private String devPartner;

        public HeatShield() {
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public Double getSizeMeters() {
            return sizeMeters;
        }

        public void setSizeMeters(Double sizeMeters) {
            this.sizeMeters = sizeMeters;
        }

        public Integer getTempDegrees() {
            return tempDegrees;
        }

        public void setTempDegrees(Integer tempDegrees) {
            this.tempDegrees = tempDegrees;
        }

        public String getDevPartner() {
            return devPartner;
        }

        public void setDevPartner(String devPartner) {
            this.devPartner = devPartner;
        }
    }

    public static class Mass implements Serializable {

        private Integer kg;

        private Integer lb;

        public Mass() {
        }

        public Integer getKg() {
            return kg;
        }

        public void setKg(Integer kg) {
            this.kg = kg;
        }

        public Integer getLb() {
            return lb;
        }

        public void setLb(Integer lb) {
            this.lb = lb;
        }
    }

    public static class Vol implements Serializable {

        @JsonProperty("cubic_meters")
        private Integer cubicMeters;

        @JsonProperty("cubic_feet")
        private Integer cubicFeet;

        public Vol() {
        }

        public Integer getCubicMeters() {
            return cubicMeters;
        }

        public void setCubicMeters(Integer cubicMeters) {
            this.cubicMeters = cubicMeters;
        }

        public Integer getCubicFeet() {
            return cubicFeet;
        }

        public void setCubicFeet(Integer cubicFeet) {
            this.cubicFeet = cubicFeet;
        }
    }

    public static class PressurizedCapsule implements Serializable {

        @JsonProperty("payload_volume")
        private Vol payloadVolume;

        public PressurizedCapsule() {
        }

        public Vol getPayloadVolume() {
            return payloadVolume;
        }

        public void setPayloadVolume(Vol payloadVolume) {
            this.payloadVolume = payloadVolume;
        }
    }

    public static class Trunk implements Serializable {

        @JsonProperty("trunk_volume")
        private Vol trunkVolume;

        private Cargo cargo;

        public Trunk() {
        }

        public Vol getTrunkVolume() {
            return trunkVolume;
        }

        public void setTrunkVolume(Vol trunkVolume) {
            this.trunkVolume = trunkVolume;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public void setCargo(Cargo cargo) {
            this.cargo = cargo;
        }
    }

    public static class Cargo implements Serializable {

        @JsonProperty("solar_array")
        private Integer solarArray;

        @JsonProperty("unpressurized_cargo")
        private Boolean unpressurizedCargo;

        public Cargo() {
        }

        public Integer getSolarArray() {
            return solarArray;
        }

        public void setSolarArray(Integer solarArray) {
            this.solarArray = solarArray;
        }

        public Boolean getUnpressurizedCargo() {
            return unpressurizedCargo;
        }

        public void setUnpressurizedCargo(Boolean unpressurizedCargo) {
            this.unpressurizedCargo = unpressurizedCargo;
        }
    }

    public static class Measure implements Serializable {

        private Double meters;

        private Double feet;

        public Measure() {
        }

        public Double getMeters() {
            return meters;
        }

        public void setMeters(Double meters) {
            this.meters = meters;
        }

        public Double getFeet() {
            return feet;
        }

        public void setFeet(Double feet) {
            this.feet = feet;
        }
    }

    public static class Thruster implements Serializable {

        private String type;

        private Integer amount;

        private Integer pods;

        @JsonProperty("fuel_1")
        private String fuel1;

        @JsonProperty("fuel_2")
        private String fuel2;

        private Integer isp;

        private Thrust thrust;

        public Thruster() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Integer getPods() {
            return pods;
        }

        public void setPods(Integer pods) {
            this.pods = pods;
        }

        public String getFuel1() {
            return fuel1;
        }

        public void setFuel1(String fuel1) {
            this.fuel1 = fuel1;
        }

        public String getFuel2() {
            return fuel2;
        }

        public void setFuel2(String fuel2) {
            this.fuel2 = fuel2;
        }

        public Integer getIsp() {
            return isp;
        }

        public void setIsp(Integer isp) {
            this.isp = isp;
        }

        public Thrust getThrust() {
            return thrust;
        }

        public void setThrust(Thrust thrust) {
            this.thrust = thrust;
        }
    }

    private static class Thrust implements Serializable {

        private Double kN;

        private Integer lbf;

        public Thrust() {
        }

        public Double getkN() {
            return kN;
        }

        public void setkN(Double kN) {
            this.kN = kN;
        }

        public Integer getLbf() {
            return lbf;
        }

        public void setLbf(Integer lbf) {
            this.lbf = lbf;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HeatShield getHeatShield() {
        return heatShield;
    }

    public void setHeatShield(HeatShield heatShield) {
        this.heatShield = heatShield;
    }

    public Mass getLaunchPayloadMass() {
        return launchPayloadMass;
    }

    public void setLaunchPayloadMass(Mass launchPayloadMass) {
        this.launchPayloadMass = launchPayloadMass;
    }

    public Vol getLaunchPayloadVol() {
        return launchPayloadVol;
    }

    public void setLaunchPayloadVol(Vol launchPayloadVol) {
        this.launchPayloadVol = launchPayloadVol;
    }

    public Mass getReturnPayloadMass() {
        return returnPayloadMass;
    }

    public void setReturnPayloadMass(Mass returnPayloadMass) {
        this.returnPayloadMass = returnPayloadMass;
    }

    public Vol getReturnPayloadVol() {
        return returnPayloadVol;
    }

    public void setReturnPayloadVol(Vol returnPayloadVol) {
        this.returnPayloadVol = returnPayloadVol;
    }

    public PressurizedCapsule getPressurizedCapsule() {
        return pressurizedCapsule;
    }

    public void setPressurizedCapsule(PressurizedCapsule pressurizedCapsule) {
        this.pressurizedCapsule = pressurizedCapsule;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public Measure getHeightWTrunk() {
        return heightWTrunk;
    }

    public void setHeightWTrunk(Measure heightWTrunk) {
        this.heightWTrunk = heightWTrunk;
    }

    public Measure getDiameter() {
        return diameter;
    }

    public void setDiameter(Measure diameter) {
        this.diameter = diameter;
    }

    public String getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(Integer crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public Integer getSidewallAngleDeg() {
        return sidewallAngleDeg;
    }

    public void setSidewallAngleDeg(Integer sidewallAngleDeg) {
        this.sidewallAngleDeg = sidewallAngleDeg;
    }

    public Integer getOrbitDurationYr() {
        return orbitDurationYr;
    }

    public void setOrbitDurationYr(Integer orbitDurationYr) {
        this.orbitDurationYr = orbitDurationYr;
    }

    public Integer getDryMassKg() {
        return dryMassKg;
    }

    public void setDryMassKg(Integer dryMassKg) {
        this.dryMassKg = dryMassKg;
    }

    public Integer getDryMassLb() {
        return dryMassLb;
    }

    public void setDryMassLb(Integer dryMassLb) {
        this.dryMassLb = dryMassLb;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Thruster> getThrusters() {
        return thrusters;
    }

    public void setThrusters(List<Thruster> thrusters) {
        this.thrusters = thrusters;
    }
}
