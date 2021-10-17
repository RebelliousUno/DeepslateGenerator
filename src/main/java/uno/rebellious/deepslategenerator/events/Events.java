package uno.rebellious.deepslategenerator.events;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import uno.rebellious.deepslategenerator.DeepslateGenerator;

@Mod.EventBusSubscriber(modid = DeepslateGenerator.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {

    @SubscribeEvent
    public static void cobbleGeneratorEvent(BlockEvent.FluidPlaceBlockEvent blockEvent) {
        if (blockEvent.getState().getBlock() == Blocks.COBBLESTONE && blockEvent.getPos().getY() < DeepslateGeneratorConfig.Y_LEVEL.get() ) {
            blockEvent.setNewState(Blocks.COBBLED_DEEPSLATE.defaultBlockState());
        }
        if (blockEvent.getState().getBlock() == Blocks.STONE && blockEvent.getPos().getY() < DeepslateGeneratorConfig.Y_LEVEL.get()) {
            blockEvent.setNewState(Blocks.DEEPSLATE.defaultBlockState());
        }
    }
}

