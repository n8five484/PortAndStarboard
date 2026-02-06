package n8five484.portandstarboard.backport.item;

import n8five484.portandstarboard.PortAndStarboard;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BackportItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PortAndStarboard.MODID);

    public static final DeferredItem<Item> COPPER_SWORD = registerItem("copper_sword", () -> new SwordItem(BackportTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(BackportTiers.COPPER, 3.0F, -2.4F)))); // 1061
    public static final DeferredItem<Item> COPPER_SHOVEL = registerItem("copper_shovel", () -> new ShovelItem(BackportTiers.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(BackportTiers.COPPER, 1.5F, -3.0F))));
    public static final DeferredItem<Item> COPPER_PICKAXE = registerItem("copper_pickaxe", () -> new PickaxeItem(BackportTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(BackportTiers.COPPER, 1.0F, -2.8F))));
    public static final DeferredItem<Item> COPPER_AXE = registerItem("copper_axe", () -> new AxeItem(BackportTiers.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(BackportTiers.COPPER, 7.0F, -3.2F))));
    public static final DeferredItem<Item> COPPER_HOE = registerItem( "copper_hoe", () -> new HoeItem(BackportTiers.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(BackportTiers.COPPER, -1.0F, -2.0F)))); // 1065
    public static final DeferredItem<Item> COPPER_HELMET = registerItem("copper_helmet", () -> new ArmorItem(BackportArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)))); // 1105
    public static final DeferredItem<Item> COPPER_CHESTPLATE = registerItem("copper_chestplate", () -> new ArmorItem(BackportArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(11))));
    public static final DeferredItem<Item> COPPER_LEGGINGS = registerItem("copper_leggings", () -> new ArmorItem(BackportArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(11))));
    public static final DeferredItem<Item> COPPER_BOOTS = registerItem("copper_boots", () -> new ArmorItem(BackportArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(11)))); // 1112
    public static final DeferredItem<Item> COPPER_HORSE_ARMOR = registerItem("copper_horse_armor", () -> new AnimalArmorItem(BackportArmorMaterials.COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1))); // 1604
    public static final DeferredItem<Item> NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor", () -> new AnimalArmorItem(ArmorMaterials.NETHERITE, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1).fireResistant())); // 1608
    public static final DeferredItem<Item> COPPER_NUGGET = registerItem("copper_nugget"); // 1770

    private static DeferredItem<Item> registerItem(String key, Supplier<? extends Item> item) { // 2194
        return ITEMS.register(key, item);
    }

    private static DeferredItem<Item> registerItem(String name) { // 2205
        return registerItem(name, () -> new Item(new Item.Properties()));
    }
}
