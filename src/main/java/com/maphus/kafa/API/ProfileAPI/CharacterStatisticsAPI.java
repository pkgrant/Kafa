package com.maphus.kafa.API.ProfileAPI;

import com.maphus.kafa.DTOs.CharacterStatistics;
import com.maphus.kafa.Util.HttpUtil;
import com.maphus.kafa.Util.JsonParserUtil;

import java.net.http.HttpResponse;


public class CharacterStatisticsAPI {

    public static CharacterStatistics getCharacterStatistics (String realmSlug, String characterSlug, String token) {

        String uri = "https://us.api.blizzard.com/profile/wow/character/"
                + realmSlug + "/" + characterSlug + "/statistics"
                + "?namespace=profile-us&locale=en_US&access_token=" + token;

        HttpResponse<String> response = HttpUtil.getRequest(uri);

        if(HttpUtil.isSuccess(response.statusCode()))
            return (CharacterStatistics) JsonParserUtil.parseJson(response.body(), CharacterStatistics.class);
        else
            return new CharacterStatistics();

    }

    public static CharacterStatistics getCharacterStatistics (String uri, String token) {

        uri += "&access_token=" + token;
        HttpResponse<String> response = HttpUtil.getRequest(uri);

        if(HttpUtil.isSuccess(response.statusCode()))
            return (CharacterStatistics) JsonParserUtil.parseJson(response.body(), CharacterStatistics.class);
        else
            return new CharacterStatistics();
    }

}
