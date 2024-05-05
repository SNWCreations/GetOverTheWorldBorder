package snw.gotwb;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GOTWB.MODID)
public class GOTWB {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "gotwb";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
}
