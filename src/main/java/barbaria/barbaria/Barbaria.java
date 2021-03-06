package barbaria.barbaria;

import barbaria.barbaria.proxy.CommonProxy;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = BarbariaConstants.MOD_ID,
        name = BarbariaConstants.MOD_NAME,
        version = BarbariaConstants.VERSION
)
public class Barbaria {

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(BarbariaConstants.MOD_ID)

    public static final Logger LOGGER = LogManager.getLogger(BarbariaConstants.MOD_ID);

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Pre-initializing Barbaria Mod.");
        BarbariaConstants.setModInstance(this);
        proxy.preInit(event);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info("Initializing Barbaria Mod.");
        proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LOGGER.info("Loaded Barbaria Mod.");
        proxy.postInit(event);
    }

    @SidedProxy(serverSide = "barbaria.barbaria.proxy.ServerProxy", clientSide = "barbaria.barbaria.proxy.ClientProxy")
    private static CommonProxy proxy;
}
