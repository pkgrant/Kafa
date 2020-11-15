package API.ProfileAPI;

import DTOs.CharacterProfileStatus;
import DTOs.CharacterProfileSummary;
import DTOs.CharacterStatistics;
import Util.HttpUtil;
import Util.JsonParserUtil;

import java.net.http.HttpResponse;

public class CharacterProfileAPI {

    public static CharacterProfileSummary getCharacterProfileSummary(String realmSlug, String characterSlug, String token) {

        //TODO: make sure slugs are lowercase

        String uri = "https://us.api.blizzard.com/profile/wow/character/"
                + realmSlug + "/" + characterSlug
                + "?namespace=profile-us&locale=en_US&access_token=" + token;

        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response

        CharacterProfileSummary summary =
                (CharacterProfileSummary) JsonParserUtil.parseJson(response.body(), CharacterProfileSummary.class);


        return summary;
    }

    public static CharacterProfileSummary getCharacterProfileSummary(String uri, String token) {
        //TODO: make sure slugs are lowercase

        uri += "&access_token=" + token;
        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response

        CharacterProfileSummary summary =
                (CharacterProfileSummary) JsonParserUtil.parseJson(response.body(), CharacterProfileSummary.class);

        return summary;
    }

//
//    Returns the status and a unique ID for a character. A client should delete information about a character from their application if any of the following conditions occur:
//    an HTTP 404 Not Found error is returned
//    the is_valid value is false
//    the returned character ID doesn't match the previously recorded value for the character
//    The following example illustrates how to use this endpoint:
//    A client requests and stores information about a character, including its unique character ID and the timestamp of the request.
//            After 30 days, the client makes a request to the status endpoint to verify if the character information is still valid.
//    If character cannot be found, is not valid, or the characters IDs do not match, the client removes the information from their application.
//    If the character is valid and the character IDs match, the client retains the data for another 30 days.

    public static CharacterProfileStatus getCharacterProfileStatus(String realmSlug, String characterSlug, String token) {

//        https://us.api.blizzard.com/profile/wow/character/sargeras/maphus/status?namespace=profile-us&locale=en_US&access_token=USUCsy6qG84hvxaFst8x5tNBloYt690PX5
        //TODO: make sure slugs are lowercase

        String uri = "https://us.api.blizzard.com/profile/wow/character/"
                + realmSlug + "/" + characterSlug + "/status"
                + "?namespace=profile-us&locale=en_US&access_token=" + token;

        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response

        CharacterProfileStatus status =
                (CharacterProfileStatus) JsonParserUtil.parseJson(response.body(), CharacterProfileStatus.class);

        return status;
    }

    public static CharacterProfileStatus getCharacterProfileStatus(String uri, String token) {

        //TODO: make sure slugs are lowercase

        uri += "&access_token=" + token;
        HttpResponse<String> response = HttpUtil.getRequest(uri);

        //TODO checks for 200 response

        CharacterProfileStatus status =
                (CharacterProfileStatus) JsonParserUtil.parseJson(response.body(), CharacterProfileStatus.class);

        return status;
    }

}
