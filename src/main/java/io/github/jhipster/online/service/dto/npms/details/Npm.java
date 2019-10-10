
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
    "downloads",
    "dependentsCount",
    "starsCount"
})
public class Npm {

    @JsonProperty("downloads")
    private List<Download> downloads = null;
    @JsonProperty("dependentsCount")
    private Integer dependentsCount;
    @JsonProperty("starsCount")
    private Integer starsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("downloads")
    public List<Download> getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(List<Download> downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("dependentsCount")
    public Integer getDependentsCount() {
        return dependentsCount;
    }

    @JsonProperty("dependentsCount")
    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

    @JsonProperty("starsCount")
    public Integer getStarsCount() {
        return starsCount;
    }

    @JsonProperty("starsCount")
    public void setStarsCount(Integer starsCount) {
        this.starsCount = starsCount;
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
