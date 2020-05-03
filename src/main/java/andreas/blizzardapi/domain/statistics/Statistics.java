
package andreas.blizzardapi.domain.statistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Statistics implements Serializable
{

    private Links links;
    private Integer health;
    private Integer power;
    private PowerType powerType;
    private Speed speed;
    private Strength strength;
    private Agility agility;
    private Intellect intellect;
    private Stamina stamina;
    private MeleeCrit meleeCrit;
    private MeleeHaste meleeHaste;
    private Mastery mastery;
    private Integer bonusArmor;
    private Lifesteal lifesteal;
    private Double versatility;
    private Double versatilityDamageDoneBonus;
    private Double versatilityHealingDoneBonus;
    private Double versatilityDamageTakenBonus;
    private Avoidance avoidance;
    private Integer attackPower;
    private Double mainHandDamageMin;
    private Double mainHandDamageMax;
    private Double mainHandSpeed;
    private Double mainHandDps;
    private Double offHandDamageMin;
    private Double offHandDamageMax;
    private Double offHandSpeed;
    private Double offHandDps;
    private Integer spellPower;
    private Integer spellPenetration;
    private SpellCrit spellCrit;
    private Double manaRegen;
    private Double manaRegenCombat;
    private Armor armor;
    private Dodge dodge;
    private Parry parry;
    private Block block;
    private RangedCrit rangedCrit;
    private RangedHaste rangedHaste;
    private SpellHaste spellHaste;
    private Character character;
    private Corruption corruption;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6252242619195368842L;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Strength getStrength() {
        return strength;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public Agility getAgility() {
        return agility;
    }

    public void setAgility(Agility agility) {
        this.agility = agility;
    }

    public Intellect getIntellect() {
        return intellect;
    }

    public void setIntellect(Intellect intellect) {
        this.intellect = intellect;
    }

    public Stamina getStamina() {
        return stamina;
    }

    public void setStamina(Stamina stamina) {
        this.stamina = stamina;
    }

    public MeleeCrit getMeleeCrit() {
        return meleeCrit;
    }

    public void setMeleeCrit(MeleeCrit meleeCrit) {
        this.meleeCrit = meleeCrit;
    }

    public MeleeHaste getMeleeHaste() {
        return meleeHaste;
    }

    public void setMeleeHaste(MeleeHaste meleeHaste) {
        this.meleeHaste = meleeHaste;
    }

    public Mastery getMastery() {
        return mastery;
    }

    public void setMastery(Mastery mastery) {
        this.mastery = mastery;
    }

    public Integer getBonusArmor() {
        return bonusArmor;
    }

    public void setBonusArmor(Integer bonusArmor) {
        this.bonusArmor = bonusArmor;
    }

    public Lifesteal getLifesteal() {
        return lifesteal;
    }

    public void setLifesteal(Lifesteal lifesteal) {
        this.lifesteal = lifesteal;
    }

    public Double getVersatility() {
        return versatility;
    }

    public void setVersatility(Double versatility) {
        this.versatility = versatility;
    }

    public Double getVersatilityDamageDoneBonus() {
        return versatilityDamageDoneBonus;
    }

    public void setVersatilityDamageDoneBonus(Double versatilityDamageDoneBonus) {
        this.versatilityDamageDoneBonus = versatilityDamageDoneBonus;
    }

    public Double getVersatilityHealingDoneBonus() {
        return versatilityHealingDoneBonus;
    }

    public void setVersatilityHealingDoneBonus(Double versatilityHealingDoneBonus) {
        this.versatilityHealingDoneBonus = versatilityHealingDoneBonus;
    }

    public Double getVersatilityDamageTakenBonus() {
        return versatilityDamageTakenBonus;
    }

    public void setVersatilityDamageTakenBonus(Double versatilityDamageTakenBonus) {
        this.versatilityDamageTakenBonus = versatilityDamageTakenBonus;
    }

    public Avoidance getAvoidance() {
        return avoidance;
    }

    public void setAvoidance(Avoidance avoidance) {
        this.avoidance = avoidance;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Double getMainHandDamageMin() {
        return mainHandDamageMin;
    }

    public void setMainHandDamageMin(Double mainHandDamageMin) {
        this.mainHandDamageMin = mainHandDamageMin;
    }

    public Double getMainHandDamageMax() {
        return mainHandDamageMax;
    }

    public void setMainHandDamageMax(Double mainHandDamageMax) {
        this.mainHandDamageMax = mainHandDamageMax;
    }

    public Double getMainHandSpeed() {
        return mainHandSpeed;
    }

    public void setMainHandSpeed(Double mainHandSpeed) {
        this.mainHandSpeed = mainHandSpeed;
    }

    public Double getMainHandDps() {
        return mainHandDps;
    }

    public void setMainHandDps(Double mainHandDps) {
        this.mainHandDps = mainHandDps;
    }

    public Double getOffHandDamageMin() {
        return offHandDamageMin;
    }

    public void setOffHandDamageMin(Double offHandDamageMin) {
        this.offHandDamageMin = offHandDamageMin;
    }

    public Double getOffHandDamageMax() {
        return offHandDamageMax;
    }

    public void setOffHandDamageMax(Double offHandDamageMax) {
        this.offHandDamageMax = offHandDamageMax;
    }

    public Double getOffHandSpeed() {
        return offHandSpeed;
    }

    public void setOffHandSpeed(Double offHandSpeed) {
        this.offHandSpeed = offHandSpeed;
    }

    public Double getOffHandDps() {
        return offHandDps;
    }

    public void setOffHandDps(Double offHandDps) {
        this.offHandDps = offHandDps;
    }

    public Integer getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(Integer spellPower) {
        this.spellPower = spellPower;
    }

    public Integer getSpellPenetration() {
        return spellPenetration;
    }

    public void setSpellPenetration(Integer spellPenetration) {
        this.spellPenetration = spellPenetration;
    }

    public SpellCrit getSpellCrit() {
        return spellCrit;
    }

    public void setSpellCrit(SpellCrit spellCrit) {
        this.spellCrit = spellCrit;
    }

    public Double getManaRegen() {
        return manaRegen;
    }

    public void setManaRegen(Double manaRegen) {
        this.manaRegen = manaRegen;
    }

    public Double getManaRegenCombat() {
        return manaRegenCombat;
    }

    public void setManaRegenCombat(Double manaRegenCombat) {
        this.manaRegenCombat = manaRegenCombat;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Dodge getDodge() {
        return dodge;
    }

    public void setDodge(Dodge dodge) {
        this.dodge = dodge;
    }

    public Parry getParry() {
        return parry;
    }

    public void setParry(Parry parry) {
        this.parry = parry;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public RangedCrit getRangedCrit() {
        return rangedCrit;
    }

    public void setRangedCrit(RangedCrit rangedCrit) {
        this.rangedCrit = rangedCrit;
    }

    public RangedHaste getRangedHaste() {
        return rangedHaste;
    }

    public void setRangedHaste(RangedHaste rangedHaste) {
        this.rangedHaste = rangedHaste;
    }

    public SpellHaste getSpellHaste() {
        return spellHaste;
    }

    public void setSpellHaste(SpellHaste spellHaste) {
        this.spellHaste = spellHaste;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Corruption getCorruption() {
        return corruption;
    }

    public void setCorruption(Corruption corruption) {
        this.corruption = corruption;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
