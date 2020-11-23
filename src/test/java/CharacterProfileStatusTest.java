import com.maphus.kafa.DTOs.CharacterProfileStatus;
import com.maphus.kafa.Util.JsonParserUtil;
import com.maphus.kafa.Util.TestUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test to make sure CharacterProfileStatus is properly loaded from mock data
 * This test assumes the mock character is a valid WoW character.
 */
public class CharacterProfileStatusTest {

    String characterProfileStatusJson;

    @Before
    public void initialize() {
        characterProfileStatusJson = TestUtil.jsonFileToString("./src/test/resources/CharacterProfileStatus.json");
    }

    @Test
    public void testJsonParser() {

        CharacterProfileStatus status = (CharacterProfileStatus) JsonParserUtil.parseJson(characterProfileStatusJson, CharacterProfileStatus.class);

        assertTrue(status.isValid());
        assertNotEquals(-1, status.getId());
    }

}
