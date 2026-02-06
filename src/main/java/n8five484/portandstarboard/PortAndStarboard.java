package n8five484.portandstarboard;

import n8five484.portandstarboard.backport.item.BackportCreativeModeTabs;
import n8five484.portandstarboard.backport.item.BackportItems;
import n8five484.portandstarboard.backport.sounds.BackportSoundEvents;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(PortAndStarboard.MODID)
public class PortAndStarboard {
    public static final String MODID = "portandstarboard";
    public static final String test = "test";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PortAndStarboard(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        BackportItems.ITEMS.register(modEventBus);
        BackportSoundEvents.SOUND_EVENTS.register(modEventBus);
        modEventBus.register(new BackportCreativeModeTabs());

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // LOGGER.info("HELLO from server starting");
    }
}
