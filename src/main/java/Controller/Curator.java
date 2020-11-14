package Controller;

import API.Authorization;
import API.ProfileAPI.CharacterStatisticsAPI;
import DTOs.CharacterStatistics;
import DTOs.Token;

public class Curator {

    private Token token;

    //actually need to store each clientID / clientSecret for regeneration & add setters for both of them

    //creating a Curator implies you're sending a request to open API connection
    //you need to feed the Curator your clientId and clientSecret

    public Curator(String clientId, String clientSecret) {
        this.token  = Authorization.generateToken(clientId, clientSecret);

    }

    /**
     * Request all statistics for a given character on a given realm. Includes all primary,
     * secondary and tertiary stats.
     *
     * @param realmSlug All lowercase name of realm of requested character
     * @param characterSlug All lowercase name of character to request
     * @return POJO containing all character statistics
     */
    public CharacterStatistics getCharacterStatistics(String realmSlug, String characterSlug) {
        return CharacterStatisticsAPI.getCharacterStatistics(realmSlug, characterSlug, token.getAccessToken());
    }

}
