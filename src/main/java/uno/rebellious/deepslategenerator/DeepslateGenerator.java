package uno.rebellious.deepslategenerator;


import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uno.rebellious.deepslategenerator.events.DeepslateGeneratorConfig;

@Mod(DeepslateGenerator.MODID)
public class DeepslateGenerator {

    public static final String MODID = "deepslategenerator";

    public static final Logger LOGGER = LogManager.getLogger();

    public DeepslateGenerator() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, DeepslateGeneratorConfig.SERVER_CONFIG);
    }
}