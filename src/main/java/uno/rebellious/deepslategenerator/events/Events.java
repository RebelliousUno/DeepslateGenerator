package uno.rebellious.deepslategenerator.events;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import uno.rebellious.deepslategenerator.DeepslateGenerator;

@Mod.EventBusSubscriber(modid = DeepslateGenerator.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {

    @SubscribeEvent
    public static void cobbleGeneratorEvent(BlockEvent.FluidPlaceBlockEvent blockEvent) {
        if (blockEvent.getPos().getY() < DeepslateGeneratorConfig.Y_LEVEL.get()) {
            if (blockEvent.getState().getBlock() == Blocks.COBBLESTONE) {
                blockEvent.setNewState(Blocks.COBBLED_DEEPSLATE.defaultBlockState());
            } else if (blockEvent.getState().getBlock() == Blocks.STONE) {
                blockEvent.setNewState(Blocks.DEEPSLATE.defaultBlockState());
            }
        }
    }
}

