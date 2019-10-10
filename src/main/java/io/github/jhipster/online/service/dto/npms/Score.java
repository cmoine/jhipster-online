
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
    "final",
    "detail"
})
public class Score {

    @JsonProperty("final")
    private Double _final;
    @JsonProperty("detail")
    private Detail detail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("final")
    public Double getFinal() {
        return _final;
    }

    @JsonProperty("final")
    public void setFinal(Double _final) {
        this._final = _final;
    }

    @JsonProperty("detail")
    public Detail getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
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
