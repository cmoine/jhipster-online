
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
    "readmeSize",
    "testsSize"
})
public class Files {

    @JsonProperty("readmeSize")
    private Integer readmeSize;
    @JsonProperty("testsSize")
    private Integer testsSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("readmeSize")
    public Integer getReadmeSize() {
        return readmeSize;
    }

    @JsonProperty("readmeSize")
    public void setReadmeSize(Integer readmeSize) {
        this.readmeSize = readmeSize;
    }

    @JsonProperty("testsSize")
    public Integer getTestsSize() {
        return testsSize;
    }

    @JsonProperty("testsSize")
    public void setTestsSize(Integer testsSize) {
        this.testsSize = testsSize;
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
