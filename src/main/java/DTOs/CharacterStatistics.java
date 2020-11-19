package DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterStatistics implements BlizzardDTO {

    //TODO _links

    private boolean   isValid                     = false;

    private String    characterName               = null;
    private String    characterRealm              = null;

    @JsonProperty("health")
    private int       health                      = -1;

    @JsonProperty("power")
    private int       power                       = -1;

    private String    powerTypeName               = null;
    private int       powerTypeId                 = -1;

    private int       speedRating                 = -1;
    private double    speedBonus                  = -1;

    private int       strengthBase                = -1;
    private int       strengthEffective           = -1;

    private int       agilityBase                 = -1;
    private int       agilityEffective            = -1;

    private int       intellectBase               = -1;
    private int       intellectEffective          = -1;

    private int       staminaBase                 = -1;
    private int       staminaEffective            = -1;

    private int       meleeCritRating             = -1;
    private double    meleeCritRatingBonus        = -1;
    private double    meleeCritValue              = -1;

    private int       meleeHasteRating            = -1;
    private double    meleeHasteRatingBonus       = -1;
    private double    meleeHasteValue             = -1;

    private int       masteryRating               = -1;
    private double    masteryRatingBonus          = -1;
    private double    masteryValue                = -1;

    @JsonProperty("bonus_armor")
    private int       bonusArmor                  = -1;

    private int       lifestealRating             = -1;
    private double    lifestealRatingBonus        = -1;
    private double    lifestealValue              = -1;

    @JsonProperty("versatility")
    private double    versatility                 = -1;

    @JsonProperty("versatility_damage_done_bonus")
    private double    versatilityDamageDoneBonus  = -1;

    @JsonProperty("versatility_healing_done_bonus")
    private double    versatilityHealingDoneBonus = -1;

    @JsonProperty("versatility_damage_taken_bonus")
    private double    versatilityDamageTakenBonus = -1;

    private int       avoidanceRating             = -1;
    private double    avoidanceRatingBonus        = -1;

    @JsonProperty("main_hand_damage_min")
    private double    mainHandDamageMin           = -1;

    @JsonProperty("main_hand_damage_max")
    private double    mainHandDamageMax           = -1;

    @JsonProperty("main_hand_speed")
    private double    mainHandSpeed               = -1;

    @JsonProperty("main_hand_dps")
    private double    mainHandDps                 = -1;

    @JsonProperty("off_hand_damage_min")
    private double    offHandDamageMin            = -1;

    @JsonProperty("off_hand_damage_max")
    private double    offHandDamageMax            = -1;

    @JsonProperty("off_hand_speed")
    private double    offHandSpeed                = -1;

    @JsonProperty("off_hand_dps")
    private double    offHandDps                  = -1;

    @JsonProperty("spell_power")
    private double    spellPower                  = -1;

    @JsonProperty("spell_penetration")
    private double    spellPenetration            = -1;

    private int       spellCritRating;
    private double    spellCritRatingBonus        = -1;
    private double    spellCritValue              = -1;

    @JsonProperty("mana_regen")
    private double    manaRegen                   = -1;

    @JsonProperty("mana_regen_combat")
    private double    manaRegenCombat             = -1;

    private int       armorBase                   = -1;
    private int       armorEffective              = -1;

    private int       dodgeRating                 = -1;
    private double    dodgeRatingBonus            = -1;
    private double    dodgeValue                  = -1;

    private int       parryRating                 = -1;
    private double    parryRatingBonus            = -1;
    private double    parryValue                  = -1;

    private int       blockRating                 = -1;
    private double    blockRatingBonus            = -1;
    private double    blockValue                  = -1;

    private int       rangedCritRating            = -1;
    private double    rangedCritRatingBonus       = -1;
    private double    rangedCritValue             = -1;

    private int       rangedHasteRating           = -1;
    private double    rangedHasteRatingBonus      = -1;
    private double    rangedHasteValue            = -1;

    private int       spellHasteRating            = -1;
    private double    spellHasteRatingBonus       = -1;
    private double    spellHasteValue             = -1;

    /*
     * Data binding private methods
     */

    @JsonProperty("character")
    @SuppressWarnings("unchecked")
    private void characterDeserializer(Map<String, Object> character) {
        this.characterRealm = ((HashMap<String, String>) character.get("realm")).get("name");
        this.characterName  = (String) character.get("name");
    }

    @JsonProperty("power_type")
    private void powerTypeDeserializer(Map<String, Object> powerType) {
        this.powerTypeName = (String) powerType.get("name");
        this.powerTypeId   = (int) powerType.get("id");
    }

    @JsonProperty("speed")
    private void speedDeserializer(Map<String, Object> speed) {
        this.speedRating = (int)    speed.get("rating");
        this.speedBonus  = (double) speed.get("rating_bonus");
    }

    @JsonProperty("strength")
    private void strengthDeserializer(Map<String, Object> strength) {
        this.strengthBase      = (int) strength.get("base");
        this.strengthEffective = (int) strength.get("effective");
    }

    @JsonProperty("agility")
    private void agilityDeserializer(Map<String, Object> agility) {
        this.agilityBase      = (int) agility.get("base");
        this.agilityEffective = (int) agility.get("effective");
    }

    @JsonProperty("intellect")
    private void intellectDeserializer(Map<String, Object> intellect) {
        this.intellectBase      = (int) intellect.get("base");
        this.intellectEffective = (int) intellect.get("effective");
    }

    @JsonProperty("stamina")
    private void staminaDeserializer(Map<String, Object> stamina) {
        this.staminaBase      = (int) stamina.get("base");
        this.staminaEffective = (int) stamina.get("effective");
    }

    @JsonProperty("melee_crit")
    private void meleeCritDeserializer(Map<String, Object> meleeCrit) {
        this.meleeCritRating      = (int)    meleeCrit.get("rating");
        this.meleeCritRatingBonus = (double) meleeCrit.get("rating_bonus");
        this.meleeCritValue       = (double) meleeCrit.get("value");
    }

    @JsonProperty("melee_haste")
    private void meleeHasteDeserializer(Map<String, Object> meleeHaste) {
        this.meleeHasteRating      = (int)    meleeHaste.get("rating");
        this.meleeHasteRatingBonus = (double) meleeHaste.get("rating_bonus");
        this.meleeHasteValue       = (double) meleeHaste.get("value");
    }

    @JsonProperty("mastery")
    private void masteryDeserializer(Map<String, Object> mastery) {
        this.masteryRating      = (int)    mastery.get("rating");
        this.masteryRatingBonus = (double) mastery.get("rating_bonus");
        this.masteryValue       = (double) mastery.get("value");
    }

    @JsonProperty("lifesteal")
    private void lifestealDeserializer(Map<String, Object> lifesteal) {
        this.lifestealRating      = (int)    lifesteal.get("rating");
        this.lifestealRatingBonus = (double) lifesteal.get("rating_bonus");
        this.lifestealValue       = (double) lifesteal.get("value");
    }

    @JsonProperty("avoidance")
    private void avoidanceDeserializer(Map<String, Object> avoidance) {
        this.avoidanceRating      = (int)    avoidance.get("rating");
        this.avoidanceRatingBonus = (double) avoidance.get("rating_bonus");
    }

    @JsonProperty("spell_crit")
    private void spellCritDeserializer(Map<String, Object> spellCrit) {
        this.spellCritRating      = (int)    spellCrit.get("rating");
        this.spellCritRatingBonus = (double) spellCrit.get("rating_bonus");
        this.spellCritValue       = (double) spellCrit.get("value");
    }

    @JsonProperty("armor")
    private void armorDeserializer(Map<String, Object> armor) {
        this.armorBase      = (int) armor.get("base");
        this.armorEffective = (int) armor.get("effective");
    }

    @JsonProperty("dodge")
    private void dodgeDeserializer(Map<String, Object> dodge) {
        this.dodgeRating      = (int)    dodge.get("rating");
        this.dodgeRatingBonus = (double) dodge.get("rating_bonus");
        this.dodgeValue       = (double) dodge.get("value");
    }

    @JsonProperty("parry")
    private void parryDeserializer(Map<String, Object> parry) {
        this.parryRating      = (int)    parry.get("rating");
        this.parryRatingBonus = (double) parry.get("rating_bonus");
        this.parryValue       = (double) parry.get("value");
    }

    @JsonProperty("block")
    private void blockDeserializer(Map<String, Object> block) {
        this.blockRating      = (int)    block.get("rating");
        this.blockRatingBonus = (double) block.get("rating_bonus");
        this.blockValue       = (double) block.get("value");
    }

    @JsonProperty("ranged_crit")
    private void rangedCritDeserializer(Map<String, Object> rangedCrit) {
        this.rangedCritRating      = (int)    rangedCrit.get("rating");
        this.rangedCritRatingBonus = (double) rangedCrit.get("rating_bonus");
        this.rangedCritValue       = (double) rangedCrit.get("value");
    }

    @JsonProperty("ranged_haste")
    private void rangedHasteDeserializer(Map<String, Object> rangedHaste) {
        this.rangedHasteRating      = (int)    rangedHaste.get("rating");
        this.rangedHasteRatingBonus = (double) rangedHaste.get("rating_bonus");
        this.rangedHasteValue       = (double) rangedHaste.get("value");
    }

    @JsonProperty("spell_haste")
    private void spellHasteDeserializer(Map<String, Object> spellHaste) {
        this.spellHasteRating      = (int)    spellHaste.get("rating");
        this.spellHasteRatingBonus = (double) spellHaste.get("rating_bonus");
        this.spellHasteValue       = (double) spellHaste.get("value");
    }

    /*
     * Getters and Setters
     */

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterRealm() {
        return characterRealm;
    }

    public void setCharacterRealm(String characterRealm) {
        this.characterRealm = characterRealm;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getPowerTypeName() {
        return powerTypeName;
    }

    public void setPowerTypeName(String powerType) {
        this.powerTypeName = powerType;
    }

    public int getPowerTypeId() {
        return powerTypeId;
    }

    public void setPowerTypeId(int powerTypeId) {
        this.powerTypeId = powerTypeId;
    }

    public int getSpeedRating() {
        return speedRating;
    }

    public void setSpeedRating(int speedRating) {
        this.speedRating = speedRating;
    }

    public double getSpeedBonus() {
        return speedBonus;
    }

    public void setSpeedBonus(double speedBonus) {
        this.speedBonus = speedBonus;
    }

    public int getStrengthBase() {
        return strengthBase;
    }

    public void setStrengthBase(int strengthBase) {
        this.strengthBase = strengthBase;
    }

    public int getStrengthEffective() {
        return strengthEffective;
    }

    public void setStrengthEffective(int strengthEffective) {
        this.strengthEffective = strengthEffective;
    }

    public int getAgilityBase() {
        return agilityBase;
    }

    public void setAgilityBase(int agilityBase) {
        this.agilityBase = agilityBase;
    }

    public int getAgilityEffective() {
        return agilityEffective;
    }

    public void setAgilityEffective(int agilityEffective) {
        this.agilityEffective = agilityEffective;
    }

    public int getIntellectBase() {
        return intellectBase;
    }

    public void setIntellectBase(int intellectBase) {
        this.intellectBase = intellectBase;
    }

    public int getIntellectEffective() {
        return intellectEffective;
    }

    public void setIntellectEffective(int intellectEffective) {
        this.intellectEffective = intellectEffective;
    }

    public int getStaminaBase() {
        return staminaBase;
    }

    public void setStaminaBase(int staminaBase) {
        this.staminaBase = staminaBase;
    }

    public int getStaminaEffective() {
        return staminaEffective;
    }

    public void setStaminaEffective(int staminaEffective) {
        this.staminaEffective = staminaEffective;
    }

    public int getMeleeCritRating() {
        return meleeCritRating;
    }

    public void setMeleeCritRating(int meleeCritRating) {
        this.meleeCritRating = meleeCritRating;
    }

    public double getMeleeCritRatingBonus() {
        return meleeCritRatingBonus;
    }

    public void setMeleeCritRatingBonus(double meleeCritRatingBonus) {
        this.meleeCritRatingBonus = meleeCritRatingBonus;
    }

    public double getMeleeCritValue() {
        return meleeCritValue;
    }

    public void setMeleeCritValue(double meleeCritValue) {
        this.meleeCritValue = meleeCritValue;
    }

    public int getMeleeHasteRating() {
        return meleeHasteRating;
    }

    public void setMeleeHasteRating(int meleeHasteRating) {
        this.meleeHasteRating = meleeHasteRating;
    }

    public double getMeleeHasteRatingBonus() {
        return meleeHasteRatingBonus;
    }

    public void setMeleeHasteRatingBonus(double meleeHasteRatingBonus) {
        this.meleeHasteRatingBonus = meleeHasteRatingBonus;
    }

    public double getMeleeHasteValue() {
        return meleeHasteValue;
    }

    public void setMeleeHasteValue(double meleeHasteValue) {
        this.meleeHasteValue = meleeHasteValue;
    }

    public int getMasteryRating() {
        return masteryRating;
    }

    public void setMasteryRating(int masteryRating) {
        this.masteryRating = masteryRating;
    }

    public double getMasteryRatingBonus() {
        return masteryRatingBonus;
    }

    public void setMasteryRatingBonus(double masteryRatingBonus) {
        this.masteryRatingBonus = masteryRatingBonus;
    }

    public double getMasteryValue() {
        return masteryValue;
    }

    public void setMasteryValue(double masteryValue) {
        this.masteryValue = masteryValue;
    }

    public int getBonusArmor() {
        return bonusArmor;
    }

    public void setBonusArmor(int bonusArmor) {
        this.bonusArmor = bonusArmor;
    }

    public int getLifestealRating() {
        return lifestealRating;
    }

    public void setLifestealRating(int lifestealRating) {
        this.lifestealRating = lifestealRating;
    }

    public double getLifestealRatingBonus() {
        return lifestealRatingBonus;
    }

    public void setLifestealRatingBonus(double lifestealRatingBonus) {
        this.lifestealRatingBonus = lifestealRatingBonus;
    }

    public double getLifestealValue() {
        return lifestealValue;
    }

    public void setLifestealValue(double lifestealValue) {
        this.lifestealValue = lifestealValue;
    }

    public double getVersatility() {
        return versatility;
    }

    public void setVersatility(double versatility) {
        this.versatility = versatility;
    }

    public double getVersatilityDamageDoneBonus() {
        return versatilityDamageDoneBonus;
    }

    public void setVersatilityDamageDoneBonus(double versatilityDamageDoneBonus) {
        this.versatilityDamageDoneBonus = versatilityDamageDoneBonus;
    }

    public double getVersatilityHealingDoneBonus() {
        return versatilityHealingDoneBonus;
    }

    public void setVersatilityHealingDoneBonus(double versatilityHealingDoneBonus) {
        this.versatilityHealingDoneBonus = versatilityHealingDoneBonus;
    }

    public double getVersatilityDamageTakenBonus() {
        return versatilityDamageTakenBonus;
    }

    public void setVersatilityDamageTakenBonus(double versatilityDamageTakenBonus) {
        this.versatilityDamageTakenBonus = versatilityDamageTakenBonus;
    }

    public int getAvoidanceRating() {
        return avoidanceRating;
    }

    public void setAvoidanceRating(int avoidanceRating) {
        this.avoidanceRating = avoidanceRating;
    }

    public double getAvoidanceRatingBonus() {
        return avoidanceRatingBonus;
    }

    public void setAvoidanceRatingBonus(double avoidanceRatingBonus) {
        this.avoidanceRatingBonus = avoidanceRatingBonus;
    }

    public double getMainHandDamageMin() {
        return mainHandDamageMin;
    }

    public void setMainHandDamageMin(double mainHandDamageMin) {
        this.mainHandDamageMin = mainHandDamageMin;
    }

    public double getMainHandDamageMax() {
        return mainHandDamageMax;
    }

    public void setMainHandDamageMax(double mainHandDamageMax) {
        this.mainHandDamageMax = mainHandDamageMax;
    }

    public double getMainHandSpeed() {
        return mainHandSpeed;
    }

    public void setMainHandSpeed(double mainHandSpeed) {
        this.mainHandSpeed = mainHandSpeed;
    }

    public double getMainHandDps() {
        return mainHandDps;
    }

    public void setMainHandDps(double mainHandDps) {
        this.mainHandDps = mainHandDps;
    }

    public double getOffHandDamageMin() {
        return offHandDamageMin;
    }

    public void setOffHandDamageMin(double offHandDamageMin) {
        this.offHandDamageMin = offHandDamageMin;
    }

    public double getOffHandDamageMax() {
        return offHandDamageMax;
    }

    public void setOffHandDamageMax(double offHandDamageMax) {
        this.offHandDamageMax = offHandDamageMax;
    }

    public double getOffHandSpeed() {
        return offHandSpeed;
    }

    public void setOffHandSpeed(double offHandSpeed) {
        this.offHandSpeed = offHandSpeed;
    }

    public double getOffHandDps() {
        return offHandDps;
    }

    public void setOffHandDps(double offHandDps) {
        this.offHandDps = offHandDps;
    }

    public double getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(double spellPower) {
        this.spellPower = spellPower;
    }

    public double getSpellPenetration() {
        return spellPenetration;
    }

    public void setSpellPenetration(double spellPenetration) {
        this.spellPenetration = spellPenetration;
    }

    public int getSpellCritRating() {
        return spellCritRating;
    }

    public void setSpellCritRating(int spellCritRating) {
        this.spellCritRating = spellCritRating;
    }

    public double getSpellCritRatingBonus() {
        return spellCritRatingBonus;
    }

    public void setSpellCritRatingBonus(double spellCritRatingBonus) {
        this.spellCritRatingBonus = spellCritRatingBonus;
    }

    public double getSpellCritValue() {
        return spellCritValue;
    }

    public void setSpellCritValue(double spellCritValue) {
        this.spellCritValue = spellCritValue;
    }

    public double getManaRegen() {
        return manaRegen;
    }

    public void setManaRegen(double manaRegen) {
        this.manaRegen = manaRegen;
    }

    public double getManaRegenCombat() {
        return manaRegenCombat;
    }

    public void setManaRegenCombat(double manaRegenCombat) {
        this.manaRegenCombat = manaRegenCombat;
    }

    public int getArmorBase() {
        return armorBase;
    }

    public void setArmorBase(int armorBase) {
        this.armorBase = armorBase;
    }

    public int getArmorEffective() {
        return armorEffective;
    }

    public void setArmorEffective(int armorEffective) {
        this.armorEffective = armorEffective;
    }

    public int getDodgeRating() {
        return dodgeRating;
    }

    public void setDodgeRating(int dodgeRating) {
        this.dodgeRating = dodgeRating;
    }

    public double getDodgeRatingBonus() {
        return dodgeRatingBonus;
    }

    public void setDodgeRatingBonus(double dodgeRatingBonus) {
        this.dodgeRatingBonus = dodgeRatingBonus;
    }

    public double getDodgeValue() {
        return dodgeValue;
    }

    public void setDodgeValue(double dodgeValue) {
        this.dodgeValue = dodgeValue;
    }

    public int getParryRating() {
        return parryRating;
    }

    public void setParryRating(int parryRating) {
        this.parryRating = parryRating;
    }

    public double getParryRatingBonus() {
        return parryRatingBonus;
    }

    public void setParryRatingBonus(double parryRatingBonus) {
        this.parryRatingBonus = parryRatingBonus;
    }

    public double getParryValue() {
        return parryValue;
    }

    public void setParryValue(double parryValue) {
        this.parryValue = parryValue;
    }

    public int getBlockRating() {
        return blockRating;
    }

    public void setBlockRating(int blockRating) {
        this.blockRating = blockRating;
    }

    public double getBlockRatingBonus() {
        return blockRatingBonus;
    }

    public void setBlockRatingBonus(double blockRatingBonus) {
        this.blockRatingBonus = blockRatingBonus;
    }

    public double getBlockValue() {
        return blockValue;
    }

    public void setBlockValue(double blockValue) {
        this.blockValue = blockValue;
    }

    public int getRangedCritRating() {
        return rangedCritRating;
    }

    public void setRangedCritRating(int rangedCritRating) {
        this.rangedCritRating = rangedCritRating;
    }

    public double getRangedCritRatingBonus() {
        return rangedCritRatingBonus;
    }

    public void setRangedCritRatingBonus(double rangedCritRatingBonus) {
        this.rangedCritRatingBonus = rangedCritRatingBonus;
    }

    public double getRangedCritValue() {
        return rangedCritValue;
    }

    public void setRangedCritValue(double rangedCritValue) {
        this.rangedCritValue = rangedCritValue;
    }

    public int getRangedHasteRating() {
        return rangedHasteRating;
    }

    public void setRangedHasteRating(int rangedHasteRating) {
        this.rangedHasteRating = rangedHasteRating;
    }

    public double getRangedHasteRatingBonus() {
        return rangedHasteRatingBonus;
    }

    public void setRangedHasteRatingBonus(double rangedHasteRatingBonus) {
        this.rangedHasteRatingBonus = rangedHasteRatingBonus;
    }

    public double getRangedHasteValue() {
        return rangedHasteValue;
    }

    public void setRangedHasteValue(double rangedHasteValue) {
        this.rangedHasteValue = rangedHasteValue;
    }

    public int getSpellHasteRating() {
        return spellHasteRating;
    }

    public void setSpellHasteRating(int spellHasteRating) {
        this.spellHasteRating = spellHasteRating;
    }

    public double getSpellHasteRatingBonus() {
        return spellHasteRatingBonus;
    }

    public void setSpellHasteRatingBonus(double spellHasteRatingBonus) {
        this.spellHasteRatingBonus = spellHasteRatingBonus;
    }

    public double getSpellHasteValue() {
        return spellHasteValue;
    }

    public void setSpellHasteValue(double spellHasteValue) {
        this.spellHasteValue = spellHasteValue;
    }

    @Override
    public boolean isValid() {
        return isValid;
    }

    @Override
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "\nName:        " + characterName +
               "\nRealm:       " + characterRealm +
               "\nPower Type:  " + powerTypeName +
               "\nPower:       " + power +
               "\nHealth:      " + health +
               "\nSpeed:       " + speedRating + " : " + speedBonus +
               "\nStrength:    " + strengthBase + " : " + strengthEffective;

        //TODO formatting and rest of elements for testing
    }

}
