
package io.github.jhipster.online.service.dto.npms.details;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "releasesFrequency",
    "commitsFrequency",
    "openIssues",
    "issuesDistribution"
})
public class Maintenance {

    @JsonProperty("releasesFrequency")
    private Integer releasesFrequency;
    @JsonProperty("commitsFrequency")
    private Double commitsFrequency;
    @JsonProperty("openIssues")
    private Integer openIssues;
    @JsonProperty("issuesDistribution")
    private Double issuesDistribution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("releasesFrequency")
    public Integer getReleasesFrequency() {
        return releasesFrequency;
    }

    @JsonProperty("releasesFrequency")
    public void setReleasesFrequency(Integer releasesFrequency) {
        this.releasesFrequency = releasesFrequency;
    }

    @JsonProperty("commitsFrequency")
    public Double getCommitsFrequency() {
        return commitsFrequency;
    }

    @JsonProperty("commitsFrequency")
    public void setCommitsFrequency(Double commitsFrequency) {
        this.commitsFrequency = commitsFrequency;
    }

    @JsonProperty("openIssues")
    public Integer getOpenIssues() {
        return openIssues;
    }

    @JsonProperty("openIssues")
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    @JsonProperty("issuesDistribution")
    public Double getIssuesDistribution() {
        return issuesDistribution;
    }

    @JsonProperty("issuesDistribution")
    public void setIssuesDistribution(Double issuesDistribution) {
        this.issuesDistribution = issuesDistribution;
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
