
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
    "name",
    "scope",
    "version",
    "description",
    "keywords",
    "date",
    "author",
    "publisher",
    "maintainers",
    "repository",
    "links",
    "license",
    "dependencies",
    "devDependencies",
    "releases",
    "hasTestScript",
    "hasSelectiveFiles",
    "readme"
})
public class Metadata {

    @JsonProperty("name")
    private String name;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("version")
    private String version;
    @JsonProperty("description")
    private String description;
    @JsonProperty("keywords")
    private List<String> keywords = null;
    @JsonProperty("date")
    private String date;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("publisher")
    private Publisher publisher;
    @JsonProperty("maintainers")
    private List<Maintainer> maintainers = null;
    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("license")
    private String license;
    @JsonProperty("dependencies")
    private Map<String, String> dependencies;
    @JsonProperty("devDependencies")
    private Map<String, String> devDependencies;
    @JsonProperty("releases")
    private List<Release> releases = null;
    @JsonProperty("hasTestScript")
    private Boolean hasTestScript;
    @JsonProperty("hasSelectiveFiles")
    private Boolean hasSelectiveFiles;
    @JsonProperty("readme")
    private String readme;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("publisher")
    public Publisher getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("maintainers")
    public List<Maintainer> getMaintainers() {
        return maintainers;
    }

    @JsonProperty("maintainers")
    public void setMaintainers(List<Maintainer> maintainers) {
        this.maintainers = maintainers;
    }

    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("dependencies")
    public Map<String, String> getDependencies() {
        return dependencies;
    }

    @JsonProperty("dependencies")
    public void setDependencies(Map<String, String> dependencies) {
        this.dependencies = dependencies;
    }

    @JsonProperty("devDependencies")
    public Map<String, String> getDevDependencies() {
        return devDependencies;
    }

    @JsonProperty("devDependencies")
    public void setDevDependencies(Map<String, String> devDependencies) {
        this.devDependencies = devDependencies;
    }

    @JsonProperty("releases")
    public List<Release> getReleases() {
        return releases;
    }

    @JsonProperty("releases")
    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

    @JsonProperty("hasTestScript")
    public Boolean getHasTestScript() {
        return hasTestScript;
    }

    @JsonProperty("hasTestScript")
    public void setHasTestScript(Boolean hasTestScript) {
        this.hasTestScript = hasTestScript;
    }

    @JsonProperty("hasSelectiveFiles")
    public Boolean getHasSelectiveFiles() {
        return hasSelectiveFiles;
    }

    @JsonProperty("hasSelectiveFiles")
    public void setHasSelectiveFiles(Boolean hasSelectiveFiles) {
        this.hasSelectiveFiles = hasSelectiveFiles;
    }

    @JsonProperty("readme")
    public String getReadme() {
        return readme;
    }

    @JsonProperty("readme")
    public void setReadme(String readme) {
        this.readme = readme;
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
