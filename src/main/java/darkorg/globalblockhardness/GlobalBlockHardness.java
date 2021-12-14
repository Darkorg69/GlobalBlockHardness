package darkorg.globalblockhardness;

import darkorg.globalblockhardness.setup.Config;
import darkorg.globalblockhardness.setup.Events;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")
@Mod(GlobalBlockHardness.MOD_ID)
public class GlobalBlockHardness {

    public static final String MOD_ID = "globalblockhardness";
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    public GlobalBlockHardness() {
        Config.init();
        Events.init();
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {}
}
