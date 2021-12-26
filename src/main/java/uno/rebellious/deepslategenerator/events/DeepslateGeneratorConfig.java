package uno.rebellious.deepslategenerator.events;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber
public class DeepslateGeneratorConfig {
    public static final String CATEGORY_GENERAL = "general";
    public static final String SUBCATEGORY_Y_LEVEL = "yLevel";

    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.IntValue Y_LEVEL;

    static {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        SERVER_BUILDER.comment("General settings").push(CATEGORY_GENERAL);
        Y_LEVEL = SERVER_BUILDER.comment("Y Level below which Deepslate will generate from a cobblegen").push(SUBCATEGORY_Y_LEVEL).defineInRange("y_level", 0, -64, 320);
        SERVER_BUILDER.pop();
        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading configEvent) {
    }
}
