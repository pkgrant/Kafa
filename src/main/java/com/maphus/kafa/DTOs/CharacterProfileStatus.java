package com.maphus.kafa.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterProfileStatus implements BlizzardDTO{

    //TODO _links
    //TODO hrefs

    @JsonProperty("is_valid")
    private boolean isValid  = false;

    @JsonProperty("id")
    private long    id       = -1;

    @Override
    public boolean isValid() {
        return isValid;
    }

    @Override
    public void setValid(boolean valid) {
        isValid = valid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
