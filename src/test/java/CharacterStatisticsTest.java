import DTOs.CharacterProfileSummary;
import DTOs.CharacterStatistics;
import Util.JsonParserUtil;
import Util.TestUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test to make sure CharacterProfileSummary is properly loaded from mock data
 * This test assumes the mock character is a valid WoW character.
 */
public class CharacterStatisticsTest {
    String characterStatsJson;

    @Before
    public void initialize() {
        characterStatsJson = TestUtil.jsonFileToString("./src/test/resources/CharacterStats.json");
    }

    @Test
    public void testJsonParser() {
        CharacterStatistics stats = (CharacterStatistics) JsonParserUtil.parseJson(characterStatsJson, CharacterStatistics.class);

        assertNotNull(stats.getCharacterName());
        assertNotNull(stats.getCharacterRealm());

        assertNotEquals(-1, stats.getHealth());

        assertNotEquals(-1, stats.getPower());

        assertNotNull(stats.getPowerTypeName());
        assertNotEquals(-1, stats.getPowerTypeId());

        assertNotEquals(-1, stats.getSpeedRating());
        assertNotEquals(-1, stats.getSpeedBonus());

        assertNotEquals(-1, stats.getStrengthBase());
        assertNotEquals(-1, stats.getStrengthEffective());

        assertNotEquals(-1, stats.getAgilityBase());
        assertNotEquals(-1, stats.getAgilityEffective());

        assertNotEquals(-1, stats.getIntellectBase());
        assertNotEquals(-1, stats.getIntellectEffective());

        assertNotEquals(-1, stats.getStaminaBase());
        assertNotEquals(-1, stats.getStaminaEffective());

        assertNotEquals(-1, stats.getMeleeCritRating());
        assertNotEquals(-1, stats.getMeleeCritRatingBonus());
        assertNotEquals(-1, stats.getMeleeCritValue());

        assertNotEquals(-1, stats.getMeleeHasteRating());
        assertNotEquals(-1, stats.getMeleeHasteRatingBonus());
        assertNotEquals(-1, stats.getMeleeHasteValue());

        assertNotEquals(-1, stats.getMasteryRating());
        assertNotEquals(-1, stats.getMasteryRatingBonus());
        assertNotEquals(-1, stats.getMasteryValue());

        assertNotEquals(-1, stats.getBonusArmor());

        assertNotEquals(-1, stats.getLifestealRating());
        assertNotEquals(-1, stats.getLifestealRatingBonus());
        assertNotEquals(-1, stats.getLifestealValue());

        assertNotEquals(-1, stats.getVersatility());
        assertNotEquals(-1, stats.getVersatilityDamageDoneBonus());
        assertNotEquals(-1, stats.getVersatilityHealingDoneBonus());
        assertNotEquals(-1, stats.getVersatilityDamageTakenBonus());

        assertNotEquals(-1, stats.getAvoidanceRating());
        assertNotEquals(-1, stats.getAvoidanceRatingBonus());

        assertNotEquals(-1, stats.getMainHandDamageMin());
        assertNotEquals(-1, stats.getMainHandDamageMax());
        assertNotEquals(-1, stats.getMainHandSpeed());
        assertNotEquals(-1, stats.getMainHandDps());

        assertNotEquals(-1, stats.getOffHandDamageMin());
        assertNotEquals(-1, stats.getOffHandDamageMax());
        assertNotEquals(-1, stats.getOffHandSpeed());
        assertNotEquals(-1, stats.getOffHandDps());

        assertNotEquals(-1, stats.getSpellPower());
        assertNotEquals(-1, stats.getSpellPenetration());

        assertNotEquals(-1, stats.getSpellCritRating());
        assertNotEquals(-1, stats.getSpellCritRatingBonus());
        assertNotEquals(-1, stats.getSpellCritValue());

        assertNotEquals(-1, stats.getManaRegen());
        assertNotEquals(-1, stats.getManaRegenCombat());

        assertNotEquals(-1, stats.getArmorBase());
        assertNotEquals(-1, stats.getArmorEffective());

        assertNotEquals(-1, stats.getDodgeRating());
        assertNotEquals(-1, stats.getDodgeRatingBonus());
        assertNotEquals(-1, stats.getDodgeValue());

        assertNotEquals(-1, stats.getParryRating());
        assertNotEquals(-1, stats.getParryRatingBonus());
        assertNotEquals(-1, stats.getParryValue());

        assertNotEquals(-1, stats.getBlockRating());
        assertNotEquals(-1, stats.getBlockRatingBonus());
        assertNotEquals(-1, stats.getBlockValue());

        assertNotEquals(-1, stats.getRangedCritRating());
        assertNotEquals(-1, stats.getRangedCritRatingBonus());
        assertNotEquals(-1, stats.getRangedCritValue());

        assertNotEquals(-1, stats.getRangedHasteRating());
        assertNotEquals(-1, stats.getRangedHasteRatingBonus());
        assertNotEquals(-1, stats.getRangedHasteValue());

        assertNotEquals(-1, stats.getSpellHasteRating());
        assertNotEquals(-1, stats.getSpellHasteRatingBonus());
        assertNotEquals(-1, stats.getSpellHasteValue());

    }
}
