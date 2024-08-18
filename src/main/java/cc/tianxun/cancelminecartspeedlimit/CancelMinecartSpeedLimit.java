package cc.tianxun.cancelminecartspeedlimit;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CancelMinecartSpeedLimit implements ModInitializer {
	public static final String MOD_ID = "cancekminecartspeedlimit";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("Loading!");
	}
}
