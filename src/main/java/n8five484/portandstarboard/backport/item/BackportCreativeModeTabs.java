package n8five484.portandstarboard.backport.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import static net.minecraft.world.item.CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;

public class BackportCreativeModeTabs {
    @SubscribeEvent
    void bootstrap(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            insertAfter(Items.STONE_HOE, BackportItems.COPPER_SHOVEL, event);
            insertAfter(BackportItems.COPPER_SHOVEL, BackportItems.COPPER_PICKAXE, event);
            insertAfter(BackportItems.COPPER_PICKAXE, BackportItems.COPPER_AXE, event);
            insertAfter(BackportItems.COPPER_AXE, BackportItems.COPPER_HOE, event); // 1311
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            insertAfter(Items.STONE_SWORD, BackportItems.COPPER_SWORD, event);
            insertAfter(Items.LEATHER_BOOTS, BackportItems.COPPER_HELMET, event);
            insertAfter(BackportItems.COPPER_HELMET, BackportItems.COPPER_CHESTPLATE, event);
            insertAfter(BackportItems.COPPER_CHESTPLATE, BackportItems.COPPER_LEGGINGS, event);
            insertAfter(BackportItems.COPPER_LEGGINGS, BackportItems.COPPER_BOOTS, event);
            insertAfter(Items.LEATHER_HORSE_ARMOR, BackportItems.COPPER_HORSE_ARMOR, event);
            insertAfter(Items.DIAMOND_HORSE_ARMOR, BackportItems.NETHERITE_HORSE_ARMOR, event); // 1519
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            insertAfter(Items.AMETHYST_SHARD, BackportItems.COPPER_NUGGET, event); // 1622
        }
    }

    private static void insertAfter(ItemLike existingEntry, ItemLike newEntry, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(existingEntry), new ItemStack(newEntry), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
