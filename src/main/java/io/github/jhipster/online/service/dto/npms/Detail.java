
package io.github.jhipster.online.service.dto.npms;

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
    "quality",
    "popularity",
    "maintenance"
})
public class Detail {

    @JsonProperty("quality")
    private Double quality;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("maintenance")
    private Double maintenance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quality")
    public Double getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Double quality) {
        this.quality = quality;
    }

    @JsonProperty("popularity")
    public Double getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("maintenance")
    public Double getMaintenance() {
        return maintenance;
    }

    @JsonProperty("maintenance")
    public void setMaintenance(Double maintenance) {
        this.maintenance = maintenance;
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
