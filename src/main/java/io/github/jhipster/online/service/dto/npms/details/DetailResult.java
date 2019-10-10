
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
    "analyzedAt",
    "collected",
    "evaluation",
    "score"
})
public class DetailResult {

    @JsonProperty("analyzedAt")
    private String analyzedAt;
    @JsonProperty("collected")
    private Collected collected;
    @JsonProperty("evaluation")
    private Evaluation evaluation;
    @JsonProperty("score")
    private Score score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("analyzedAt")
    public String getAnalyzedAt() {
        return analyzedAt;
    }

    @JsonProperty("analyzedAt")
    public void setAnalyzedAt(String analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    @JsonProperty("collected")
    public Collected getCollected() {
        return collected;
    }

    @JsonProperty("collected")
    public void setCollected(Collected collected) {
        this.collected = collected;
    }

    @JsonProperty("evaluation")
    public Evaluation getEvaluation() {
        return evaluation;
    }

    @JsonProperty("evaluation")
    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    @JsonProperty("score")
    public Score getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Score score) {
        this.score = score;
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
