
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
    "count",
    "openCount",
    "distribution",
    "isDisabled"
})
public class Issues {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("openCount")
    private Integer openCount;
    @JsonProperty("distribution")
    private Distribution distribution;
    @JsonProperty("isDisabled")
    private Boolean isDisabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("openCount")
    public Integer getOpenCount() {
        return openCount;
    }

    @JsonProperty("openCount")
    public void setOpenCount(Integer openCount) {
        this.openCount = openCount;
    }

    @JsonProperty("distribution")
    public Distribution getDistribution() {
        return distribution;
    }

    @JsonProperty("distribution")
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    @JsonProperty("isDisabled")
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    @JsonProperty("isDisabled")
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
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
