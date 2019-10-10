
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
    "unstable",
    "deprecated"
})
public class Flags {

    @JsonProperty("unstable")
    private Boolean unstable;
    @JsonProperty("deprecated")
    private String deprecated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unstable")
    public Boolean getUnstable() {
        return unstable;
    }

    @JsonProperty("unstable")
    public void setUnstable(Boolean unstable) {
        this.unstable = unstable;
    }

    @JsonProperty("deprecated")
    public String getDeprecated() {
        return deprecated;
    }

    @JsonProperty("deprecated")
    public void setDeprecated(String deprecated) {
        this.deprecated = deprecated;
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
