package n8five484.portandstarboard.backport.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class BlockTags {
    // public static TagKey<Block> PALE_OAK_LOGS = ofVanilla("pale_oak_logs");
    public static TagKey<Block> INCORRECT_FOR_COPPER_TOOL = ofVanilla("incorrect_for_copper_tool");

    private static TagKey<Block> ofVanilla(String id) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.withDefaultNamespace(id));
    }
}
