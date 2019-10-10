
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
    "npm",
    "homepage",
    "repository",
    "bugs"
})
public class Links {

    @JsonProperty("npm")
    private String npm;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("repository")
    private String repository;
    @JsonProperty("bugs")
    private String bugs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("npm")
    public String getNpm() {
        return npm;
    }

    @JsonProperty("npm")
    public void setNpm(String npm) {
        this.npm = npm;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(String repository) {
        this.repository = repository;
    }

    @JsonProperty("bugs")
    public String getBugs() {
        return bugs;
    }

    @JsonProperty("bugs")
    public void setBugs(String bugs) {
        this.bugs = bugs;
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
