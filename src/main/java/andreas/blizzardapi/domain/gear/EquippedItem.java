
package andreas.blizzardapi.domain.gear;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquippedItem {

    private Item item;
    private Slot slot;
    private Integer quantity;
    private Integer context;
    private List<Integer> bonus_list = null;
    private Quality quality;
    private String name;
    private Integer modified_appearance_id;
    private AzeriteDetails azerite_details;
    private Media_ media;
    private ItemClass item_class;
    private ItemSubclass item_subclass;
    private InventoryType inventory_type;
    private Binding binding;
    private Armor armor;
    private List<Stat> stats = null;
    private Requirements requirements;
    private Level__ level;
    private Transmog transmog;
    private Durability durability;
    private NameDescription name_description;
    private String unique_equipped;
    private List<Spell___> spells = null;
    private String description;
    private Boolean is_subclass_hidden;
    private SellPrice sell_price;
    private List<Socket> sockets = null;
    private List<Enchantment> enchantments = null;
    private Weapon weapon;
    private Map<String, Object> additional_properties = new HashMap<String, Object>();

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getContext() {
        return context;
    }

    public void setContext(Integer context) {
        this.context = context;
    }

    public List<Integer> getBonus_list() {
        return bonus_list;
    }

    public void setBonus_list(List<Integer> bonus_list) {
        this.bonus_list = bonus_list;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModified_appearance_id() {
        return modified_appearance_id;
    }

    public void setModified_appearance_id(Integer modified_appearance_id) {
        this.modified_appearance_id = modified_appearance_id;
    }

    public AzeriteDetails getAzerite_details() {
        return azerite_details;
    }

    public void setAzerite_details(AzeriteDetails azerite_details) {
        this.azerite_details = azerite_details;
    }

    public Media_ getMedia() {
        return media;
    }

    public void setMedia(Media_ media) {
        this.media = media;
    }

    public ItemClass getItem_class() {
        return item_class;
    }

    public void setItem_class(ItemClass item_class) {
        this.item_class = item_class;
    }

    public ItemSubclass getItem_subclass() {
        return item_subclass;
    }

    public void setItem_subclass(ItemSubclass item_subclass) {
        this.item_subclass = item_subclass;
    }

    public InventoryType getInventory_type() {
        return inventory_type;
    }

    public void setInventory_type(InventoryType inventory_type) {
        this.inventory_type = inventory_type;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public void setRequirements(Requirements requirements) {
        this.requirements = requirements;
    }

    public Level__ getLevel() {
        return level;
    }

    public void setLevel(Level__ level) {
        this.level = level;
    }

    public Transmog getTransmog() {
        return transmog;
    }

    public void setTransmog(Transmog transmog) {
        this.transmog = transmog;
    }

    public Durability getDurability() {
        return durability;
    }

    public void setDurability(Durability durability) {
        this.durability = durability;
    }

    public NameDescription getName_description() {
        return name_description;
    }

    public void setName_description(NameDescription name_description) {
        this.name_description = name_description;
    }

    public String getUnique_equipped() {
        return unique_equipped;
    }

    public void setUnique_equipped(String unique_equipped) {
        this.unique_equipped = unique_equipped;
    }

    public List<Spell___> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell___> spells) {
        this.spells = spells;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIs_subclass_hidden() {
        return is_subclass_hidden;
    }

    public void setIs_subclass_hidden(Boolean is_subclass_hidden) {
        this.is_subclass_hidden = is_subclass_hidden;
    }

    public SellPrice getSell_price() {
        return sell_price;
    }

    public void setSell_price(SellPrice sell_price) {
        this.sell_price = sell_price;
    }

    public List<Socket> getSockets() {
        return sockets;
    }

    public void setSockets(List<Socket> sockets) {
        this.sockets = sockets;
    }

    public List<Enchantment> getEnchantments() {
        return enchantments;
    }

    public void setEnchantments(List<Enchantment> enchantments) {
        this.enchantments = enchantments;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Map<String, Object> getAdditional_properties() {
        return this.additional_properties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additional_properties.put(name, value);
    }

}
