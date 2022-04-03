package com.github.artfultom.spacex.v4.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryDto implements Serializable {

    private String title;

    @JsonProperty("event_date_utc")
    private String eventDateUtc;  // TODO to date

    @JsonProperty("event_date_unix")
    private Long eventDateUnix;

    private String details;

    private List<Link> links;

    public HistoryDto() {
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

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
