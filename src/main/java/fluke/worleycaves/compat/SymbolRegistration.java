package fluke.worleycaves.compat;

import com.xcompwiz.mystcraft.api.symbol.IAgeSymbol;

import fluke.worleycaves.Main;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class SymbolRegistration 
{
	@SubscribeEvent
	public static void registerSymbol(RegistryEvent.Register<IAgeSymbol> event) 
	{
		Main.LOGGER.info("Hello symbol registry");
		//event.getRegistry().register(MystcraftCompat.worleysSymbol);
	}
}
