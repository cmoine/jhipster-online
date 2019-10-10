
package io.github.jhipster.online.service.dto.npms.details;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starsCount",
    "forksCount",
    "subscribersCount",
    "issues",
    "contributors",
    "commits",
    "statuses"
})
public class Github {

    @JsonProperty("starsCount")
    private Integer starsCount;
    @JsonProperty("forksCount")
    private Integer forksCount;
    @JsonProperty("subscribersCount")
    private Integer subscribersCount;
    @JsonProperty("issues")
    private Issues issues;
    @JsonProperty("contributors")
    private List<Contributor> contributors = null;
    @JsonProperty("commits")
    private List<Commit> commits = null;
    @JsonProperty("statuses")
    private List<Status> statuses = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("starsCount")
    public Integer getStarsCount() {
        return starsCount;
    }

    @JsonProperty("starsCount")
    public void setStarsCount(Integer starsCount) {
        this.starsCount = starsCount;
    }

    @JsonProperty("forksCount")
    public Integer getForksCount() {
        return forksCount;
    }

    @JsonProperty("forksCount")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    @JsonProperty("subscribersCount")
    public Integer getSubscribersCount() {
        return subscribersCount;
    }

    @JsonProperty("subscribersCount")
    public void setSubscribersCount(Integer subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    @JsonProperty("issues")
    public Issues getIssues() {
        return issues;
    }

    @JsonProperty("issues")
    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    @JsonProperty("contributors")
    public List<Contributor> getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("commits")
    public List<Commit> getCommits() {
        return commits;
    }

    @JsonProperty("commits")
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
