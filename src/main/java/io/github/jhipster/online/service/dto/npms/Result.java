
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
    "package",
    "flags",
    "score",
    "searchScore"
})
public class Result {

    @JsonProperty("package")
    private Package _package;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("score")
    private Score score;
    @JsonProperty("searchScore")
    private Double searchScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("package")
    public Package getPackage() {
        return _package;
    }

    @JsonProperty("package")
    public void setPackage(Package _package) {
        this._package = _package;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("score")
    public Score getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Score score) {
        this.score = score;
    }

    @JsonProperty("searchScore")
    public Double getSearchScore() {
        return searchScore;
    }

    @JsonProperty("searchScore")
    public void setSearchScore(Double searchScore) {
        this.searchScore = searchScore;
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
