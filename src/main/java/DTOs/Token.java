package DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token implements BlizzardDTO {

    private boolean isValid;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private int expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public boolean isValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "\nValid:        " + isValid +
               "\nAccess Token: " + accessToken +
               "\nToken Type:   " + tokenType;
    }
}
