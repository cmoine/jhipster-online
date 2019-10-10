
package io.github.jhipster.online.service.dto.npms.details;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "files",
    "badges",
    "linters",
    "coverage"
})
public class Source {

    @JsonProperty("files")
    private Files files;
    @JsonProperty("badges")
    private List<Badge> badges = null;
    @JsonProperty("linters")
    private List<String> linters = null;
    @JsonProperty("coverage")
    private Integer coverage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("files")
    public Files getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(Files files) {
        this.files = files;
    }

    @JsonProperty("badges")
    public List<Badge> getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    @JsonProperty("linters")
    public List<String> getLinters() {
        return linters;
    }

    @JsonProperty("linters")
    public void setLinters(List<String> linters) {
        this.linters = linters;
    }

    @JsonProperty("coverage")
    public Integer getCoverage() {
        return coverage;
    }

    @JsonProperty("coverage")
    public void setCoverage(Integer coverage) {
        this.coverage = coverage;
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
