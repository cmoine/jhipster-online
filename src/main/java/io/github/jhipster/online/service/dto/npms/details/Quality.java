
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
    "carefulness",
    "tests",
    "health",
    "branding"
})
public class Quality {

    @JsonProperty("carefulness")
    private Double carefulness;
    @JsonProperty("tests")
    private Double tests;
    @JsonProperty("health")
    private Integer health;
    @JsonProperty("branding")
    private Double branding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("carefulness")
    public Double getCarefulness() {
        return carefulness;
    }

    @JsonProperty("carefulness")
    public void setCarefulness(Double carefulness) {
        this.carefulness = carefulness;
    }

    @JsonProperty("tests")
    public Double getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(Double tests) {
        this.tests = tests;
    }

    @JsonProperty("health")
    public Integer getHealth() {
        return health;
    }

    @JsonProperty("health")
    public void setHealth(Integer health) {
        this.health = health;
    }

    @JsonProperty("branding")
    public Double getBranding() {
        return branding;
    }

    @JsonProperty("branding")
    public void setBranding(Double branding) {
        this.branding = branding;
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
