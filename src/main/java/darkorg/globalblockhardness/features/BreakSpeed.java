package darkorg.globalblockhardness.features;

import darkorg.globalblockhardness.setup.Config;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@SuppressWarnings("unused")
public class BreakSpeed {
    @SubscribeEvent
    public void breakSpeed(PlayerEvent.BreakSpeed event) {
        if (Config.globalHardnessEnabled.get()) {
            double multiplier = 1d / Config.globalHardnessMultiplier.get();
            event.setNewSpeed((float) (event.getNewSpeed() * multiplier));
        }
    }
}
