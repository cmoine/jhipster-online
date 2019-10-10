
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
    "communityInterest",
    "downloadsCount",
    "downloadsAcceleration",
    "dependentsCount"
})
public class Popularity {

    @JsonProperty("communityInterest")
    private Integer communityInterest;
    @JsonProperty("downloadsCount")
    private Double downloadsCount;
    @JsonProperty("downloadsAcceleration")
    private Double downloadsAcceleration;
    @JsonProperty("dependentsCount")
    private Integer dependentsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("communityInterest")
    public Integer getCommunityInterest() {
        return communityInterest;
    }

    @JsonProperty("communityInterest")
    public void setCommunityInterest(Integer communityInterest) {
        this.communityInterest = communityInterest;
    }

    @JsonProperty("downloadsCount")
    public Double getDownloadsCount() {
        return downloadsCount;
    }

    @JsonProperty("downloadsCount")
    public void setDownloadsCount(Double downloadsCount) {
        this.downloadsCount = downloadsCount;
    }

    @JsonProperty("downloadsAcceleration")
    public Double getDownloadsAcceleration() {
        return downloadsAcceleration;
    }

    @JsonProperty("downloadsAcceleration")
    public void setDownloadsAcceleration(Double downloadsAcceleration) {
        this.downloadsAcceleration = downloadsAcceleration;
    }

    @JsonProperty("dependentsCount")
    public Integer getDependentsCount() {
        return dependentsCount;
    }

    @JsonProperty("dependentsCount")
    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
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
