import DTOs.CharacterProfileSummary;
import Util.JsonParserUtil;
import Util.TestUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test to make sure CharacterProfileSummary is properly loaded from mock data
 * This test assumes the mock character is a valid WoW character.
 */
public class CharacterProfileSummaryTest {

    String characterProfileSummaryJson;

    @Before
    public void initialize() {
        characterProfileSummaryJson = TestUtil.jsonFileToString("./src/test/resources/CharacterProfileSummary.json");
    }

    @Test
    public void testJsonParser() {

        CharacterProfileSummary summary = (CharacterProfileSummary) JsonParserUtil.parseJson(characterProfileSummaryJson, CharacterProfileSummary.class);

        assertNotEquals(-1, summary.getId());

        assertNotNull(summary.getName());

        assertNotNull(summary.getGender());

        assertNotNull(summary.getFaction());

        assertNotNull(summary.getRace());
        assertNotEquals(-1, summary.getRaceId());

        assertNotNull(summary.getCharacterClass());
        assertNotEquals(-1, summary.getCharacterClassId());

        assertNotNull(summary.getActiveSpec());
        assertNotEquals(-1, summary.getActiveSpecId());

        assertNotNull(summary.getRealm());
        assertNotEquals(-1, summary.getRealmId());

        assertNotEquals(-1, summary.getLastLogin());

        assertNotEquals(-1, summary.getAverageItemLevel());

        assertNotEquals(-1, summary.getEquippedItemLevel());

        assertNotNull(summary.getActiveTitle());
        assertNotEquals(-1, summary.getActiveTitleId());
        assertNotNull(summary.getActiveTitleDisplayString());
    }
}
