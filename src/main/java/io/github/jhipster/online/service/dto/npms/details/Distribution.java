
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
    "3600",
    "10800",
    "32400",
    "97200",
    "291600",
    "874800",
    "2624400",
    "7873200",
    "23619600",
    "70858800",
    "212576400"
})
public class Distribution {

    @JsonProperty("3600")
    private Integer _3600;
    @JsonProperty("10800")
    private Integer _10800;
    @JsonProperty("32400")
    private Integer _32400;
    @JsonProperty("97200")
    private Integer _97200;
    @JsonProperty("291600")
    private Integer _291600;
    @JsonProperty("874800")
    private Integer _874800;
    @JsonProperty("2624400")
    private Integer _2624400;
    @JsonProperty("7873200")
    private Integer _7873200;
    @JsonProperty("23619600")
    private Integer _23619600;
    @JsonProperty("70858800")
    private Integer _70858800;
    @JsonProperty("212576400")
    private Integer _212576400;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("3600")
    public Integer get3600() {
        return _3600;
    }

    @JsonProperty("3600")
    public void set3600(Integer _3600) {
        this._3600 = _3600;
    }

    @JsonProperty("10800")
    public Integer get10800() {
        return _10800;
    }

    @JsonProperty("10800")
    public void set10800(Integer _10800) {
        this._10800 = _10800;
    }

    @JsonProperty("32400")
    public Integer get32400() {
        return _32400;
    }

    @JsonProperty("32400")
    public void set32400(Integer _32400) {
        this._32400 = _32400;
    }

    @JsonProperty("97200")
    public Integer get97200() {
        return _97200;
    }

    @JsonProperty("97200")
    public void set97200(Integer _97200) {
        this._97200 = _97200;
    }

    @JsonProperty("291600")
    public Integer get291600() {
        return _291600;
    }

    @JsonProperty("291600")
    public void set291600(Integer _291600) {
        this._291600 = _291600;
    }

    @JsonProperty("874800")
    public Integer get874800() {
        return _874800;
    }

    @JsonProperty("874800")
    public void set874800(Integer _874800) {
        this._874800 = _874800;
    }

    @JsonProperty("2624400")
    public Integer get2624400() {
        return _2624400;
    }

    @JsonProperty("2624400")
    public void set2624400(Integer _2624400) {
        this._2624400 = _2624400;
    }

    @JsonProperty("7873200")
    public Integer get7873200() {
        return _7873200;
    }

    @JsonProperty("7873200")
    public void set7873200(Integer _7873200) {
        this._7873200 = _7873200;
    }

    @JsonProperty("23619600")
    public Integer get23619600() {
        return _23619600;
    }

    @JsonProperty("23619600")
    public void set23619600(Integer _23619600) {
        this._23619600 = _23619600;
    }

    @JsonProperty("70858800")
    public Integer get70858800() {
        return _70858800;
    }

    @JsonProperty("70858800")
    public void set70858800(Integer _70858800) {
        this._70858800 = _70858800;
    }

    @JsonProperty("212576400")
    public Integer get212576400() {
        return _212576400;
    }

    @JsonProperty("212576400")
    public void set212576400(Integer _212576400) {
        this._212576400 = _212576400;
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
