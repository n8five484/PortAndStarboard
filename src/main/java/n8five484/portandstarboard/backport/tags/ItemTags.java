package n8five484.portandstarboard.backport.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ItemTags {
    public static final TagKey<Item> COPPER_TOOL_MATERIALS = bind("copper_tool_materials"); // 131
    public static final TagKey<Item> NETHERITE_TOOL_MATERIALS = bind("netherite_tool_materials"); // 135
    public static final TagKey<Item> REPAIRS_COPPER_ARMOR = bind("repairs_copper_armor"); // 137


    private static TagKey<Item> bind(String id) {
        return TagKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace(id));
    }
}
