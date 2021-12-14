package darkorg.globalblockhardness.setup;

import darkorg.globalblockhardness.features.BreakSpeed;
import net.minecraftforge.common.MinecraftForge;

public class Events {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new BreakSpeed());
    }
}
