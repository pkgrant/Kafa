package Util;

import DTOs.BlizzardDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserUtil {

    public static BlizzardDTO parseJson(String body, Class<? extends BlizzardDTO> dto) {

        ObjectMapper objectMapper = new ObjectMapper();
        BlizzardDTO stats = null;
        try {
            stats = (BlizzardDTO) objectMapper.readValue(body, dto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return stats;

    }
}
