
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
    "quality",
    "popularity",
    "maintenance"
})
public class Evaluation {

    @JsonProperty("quality")
    private Quality quality;
    @JsonProperty("popularity")
    private Popularity popularity;
    @JsonProperty("maintenance")
    private Maintenance maintenance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quality")
    public Quality getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @JsonProperty("popularity")
    public Popularity getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("maintenance")
    public Maintenance getMaintenance() {
        return maintenance;
    }

    @JsonProperty("maintenance")
    public void setMaintenance(Maintenance maintenance) {
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
