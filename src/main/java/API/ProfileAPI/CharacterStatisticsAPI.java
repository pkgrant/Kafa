package API.ProfileAPI;

import DTOs.CharacterStatistics;
import Http.HttpUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpResponse;


public class CharacterStatisticsAPI {

    public static CharacterStatistics getCharacterStatistics (String realmSlug, String characterSlug, String token) {

        //TODO: make sure slugs are lowercase

        String uri = "https://us.api.blizzard.com/profile/wow/character/"
                + realmSlug + "/" + characterSlug + "/statistics"
                + "?namespace=profile-us&locale=en_US&access_token=" + token;

        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response

        ObjectMapper objectMapper = new ObjectMapper();
        CharacterStatistics stats = null;
        try {
            stats = objectMapper.readValue(response.body(), CharacterStatistics.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return stats;

    }

}
