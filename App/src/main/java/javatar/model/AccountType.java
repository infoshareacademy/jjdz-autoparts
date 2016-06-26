package javatar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AccountType {

    @JsonProperty("LINKEDIN")
    LINKEDIN,
    GOOGLE,
    FACEBOOK
}
