package DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterProfileSummary implements BlizzardDTO{

    //TODO _links
    //TODO all hrefs

    private boolean isValid                  = false;

    @JsonProperty("id")
    private int     id                       = -1;

    @JsonProperty("name")
    private String  name                     = null;

    private String  gender                   = null;

    private String  faction                  = null;

    private String  race                     = null;
    private int     raceId                   = -1;

    private String  characterClass           = null;
    private int     characterClassId         = -1;

    private String  activeSpec               = null;
    private int     activeSpecId             = -1;

    private String  realm                    = null;
    private int     realmId                  = -1;

    @JsonProperty("last_login_timestamp")
    private long    lastLogin                = -1;

    @JsonProperty("average_item_level")
    private int     averageItemLevel         = -1;

    @JsonProperty("equipped_item_level")
    private int     equippedItemLevel        = -1;

    private String  activeTitle              = null;
    private int     activeTitleId            = -1;
    private String  activeTitleDisplayString = null;

    @JsonProperty("gender")
    private void genderDeserializer(Map<String, Object> gender) {
        this.gender = (String) gender.get("name");
    }

    @JsonProperty("faction")
    private void factionDeserializer(Map<String, Object> faction) {
        this.faction = (String) faction.get("name");
    }

    @JsonProperty("race")
    private void raceDeserializer(Map<String, Object> race) {
        this.race   = (String) race.get("name");
        this.raceId = (int)    race.get("id");
    }

    @JsonProperty("character_class")
    private void characterClassDeserializer(Map<String, Object> characterClass) {
        this.characterClass   = (String) characterClass.get("name");
        this.characterClassId = (int)    characterClass.get("id");
    }

    @JsonProperty("active_spec")
    private void activeSpecDeserializer(Map<String, Object> activeSpec) {
        this.activeSpec   = (String) activeSpec.get("name");
        this.activeSpecId = (int)    activeSpec.get("id");
    }

    @JsonProperty("realm")
    private void realmDeserializer(Map<String, Object> realm) {
        this.realm   = (String) realm.get("name");
        this.realmId = (int)    realm.get("id");
    }

    @JsonProperty("active_title")
    private void activeTitleDeserializer(Map<String, Object> activeTitle) {
        this.activeTitle              = (String) activeTitle.get("name");
        this.activeTitleId            = (int)    activeTitle.get("id");
        this.activeTitleDisplayString = (String) activeTitle.get("display_string");
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getCharacterClassId() {
        return characterClassId;
    }

    public void setCharacterClassId(int characterClassId) {
        this.characterClassId = characterClassId;
    }

    public String getActiveSpec() {
        return activeSpec;
    }

    public void setActiveSpec(String activeSpec) {
        this.activeSpec = activeSpec;
    }

    public int getActiveSpecId() {
        return activeSpecId;
    }

    public void setActiveSpecId(int activeSpecId) {
        this.activeSpecId = activeSpecId;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public int getRealmId() {
        return realmId;
    }

    public void setRealmId(int realmId) {
        this.realmId = realmId;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getAverageItemLevel() {
        return averageItemLevel;
    }

    public void setAverageItemLevel(int averageItemLevel) {
        this.averageItemLevel = averageItemLevel;
    }

    public int getEquippedItemLevel() {
        return equippedItemLevel;
    }

    public void setEquippedItemLevel(int equippedItemLevel) {
        this.equippedItemLevel = equippedItemLevel;
    }

    public String getActiveTitle() {
        return activeTitle;
    }

    public void setActiveTitle(String activeTitle) {
        this.activeTitle = activeTitle;
    }

    public int getActiveTitleId() {
        return activeTitleId;
    }

    public void setActiveTitleId(int activeTitleId) {
        this.activeTitleId = activeTitleId;
    }

    public String getActiveTitleDisplayString() {
        return activeTitleDisplayString;
    }

    public void setActiveTitleDisplayString(String activeTitleDisplayString) {
        this.activeTitleDisplayString = activeTitleDisplayString;
    }
}
