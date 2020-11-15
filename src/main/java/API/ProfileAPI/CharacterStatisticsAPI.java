package API.ProfileAPI;

import DTOs.CharacterStatistics;
import Util.HttpUtil;
import Util.JsonParserUtil;

import java.net.http.HttpResponse;


public class CharacterStatisticsAPI {

    public static CharacterStatistics getCharacterStatistics (String realmSlug, String characterSlug, String token) {

        //TODO: make sure slugs are lowercase

        String uri = "https://us.api.blizzard.com/profile/wow/character/"
                + realmSlug + "/" + characterSlug + "/statistics"
                + "?namespace=profile-us&locale=en_US&access_token=" + token;

        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response

        CharacterStatistics stats =
                (CharacterStatistics) JsonParserUtil.parseJson(response.body(), CharacterStatistics.class);

        return stats;

    }

    public static CharacterStatistics getCharacterStatistics (String uri, String token) {

        uri += "&access_token=" + token;
        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response
        //TODO maybe put object mapping in own method?

        CharacterStatistics stats = (CharacterStatistics) JsonParserUtil.parseJson(response.body(), CharacterStatistics.class);

        return stats;
    }

}
