package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryDto implements Serializable {

    private String id;

    private String title;

    @JsonProperty("event_date_utc")
    private String eventDateUtc;

    @JsonProperty("event_date_unix")
    private Long eventDateUnix;

    private String details;

    private Link links;

    public HistoryDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDateUtc() {
        return eventDateUtc;
    }

    public void setEventDateUtc(String eventDateUtc) {
        this.eventDateUtc = eventDateUtc;
    }

    public Long getEventDateUnix() {
        return eventDateUnix;
    }

    public void setEventDateUnix(Long eventDateUnix) {
        this.eventDateUnix = eventDateUnix;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }

    public static class Link implements Serializable {

        private String article;

        public Link() {
        }

        public String getArticle() {
            return article;
        }

        public void setArticle(String article) {
            this.article = article;
        }
    }
}
