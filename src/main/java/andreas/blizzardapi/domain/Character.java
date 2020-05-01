
package andreas.blizzardapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character implements Serializable
{

    private Links links;
    private Integer id;
    private String name;
    private Gender gender;
    private Faction faction;
    private Race race;
    private CharacterClass characterClass;
    private ActiveSpec activeSpec;
    private Realm realm;
    private Guild guild;
    private Integer level;
    private Integer experience;
    private Integer achievementPoints;
    private Achievements achievements;
    private Titles titles;
    private PvpSummary pvpSummary;
    private Encounters encounters;
    private Media media;
    private Integer lastLoginTimestamp;
    private Integer averageItemLevel;
    private Integer equippedItemLevel;
    private Specializations specializations;
    private Statistics statistics;
    private MythicKeystoneProfile mythicKeystoneProfile;
    private Equipment equipment;
    private Appearance appearance;
    private Collections collections;
    private ActiveTitle activeTitle;
    private Reputations reputations;
    private Quests quests;
    private AchievementsStatistics achievementsStatistics;
    private Professions professions;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8143134024977172733L;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public ActiveSpec getActiveSpec() {
        return activeSpec;
    }

    public void setActiveSpec(ActiveSpec activeSpec) {
        this.activeSpec = activeSpec;
    }

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(Integer achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public Achievements getAchievements() {
        return achievements;
    }

    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public PvpSummary getPvpSummary() {
        return pvpSummary;
    }

    public void setPvpSummary(PvpSummary pvpSummary) {
        this.pvpSummary = pvpSummary;
    }

    public Encounters getEncounters() {
        return encounters;
    }

    public void setEncounters(Encounters encounters) {
        this.encounters = encounters;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Integer getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }

    public void setLastLoginTimestamp(Integer lastLoginTimestamp) {
        this.lastLoginTimestamp = lastLoginTimestamp;
    }

    public Integer getAverageItemLevel() {
        return averageItemLevel;
    }

    public void setAverageItemLevel(Integer averageItemLevel) {
        this.averageItemLevel = averageItemLevel;
    }

    public Integer getEquippedItemLevel() {
        return equippedItemLevel;
    }

    public void setEquippedItemLevel(Integer equippedItemLevel) {
        this.equippedItemLevel = equippedItemLevel;
    }

    public Specializations getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Specializations specializations) {
        this.specializations = specializations;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public MythicKeystoneProfile getMythicKeystoneProfile() {
        return mythicKeystoneProfile;
    }

    public void setMythicKeystoneProfile(MythicKeystoneProfile mythicKeystoneProfile) {
        this.mythicKeystoneProfile = mythicKeystoneProfile;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Collections getCollections() {
        return collections;
    }

    public void setCollections(Collections collections) {
        this.collections = collections;
    }

    public ActiveTitle getActiveTitle() {
        return activeTitle;
    }

    public void setActiveTitle(ActiveTitle activeTitle) {
        this.activeTitle = activeTitle;
    }

    public Reputations getReputations() {
        return reputations;
    }

    public void setReputations(Reputations reputations) {
        this.reputations = reputations;
    }

    public Quests getQuests() {
        return quests;
    }

    public void setQuests(Quests quests) {
        this.quests = quests;
    }

    public AchievementsStatistics getAchievementsStatistics() {
        return achievementsStatistics;
    }

    public void setAchievementsStatistics(AchievementsStatistics achievementsStatistics) {
        this.achievementsStatistics = achievementsStatistics;
    }

    public Professions getProfessions() {
        return professions;
    }

    public void setProfessions(Professions professions) {
        this.professions = professions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
