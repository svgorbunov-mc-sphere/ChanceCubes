package chanceCubes.hookins;

import org.apache.logging.log4j.Level;

import chanceCubes.CCubesCore;
import chanceCubes.hookins.mods.ExtraUtilsModHook;
import chanceCubes.hookins.mods.VoidDecayHook;
import cpw.mods.fml.common.Loader;

public class ModHookUtil
{
	
	public static void loadCustomModRewards()
	{
		
		if(Loader.isModLoaded("voiddecay"))
		{
			new VoidDecayHook();
			CCubesCore.logger.log(Level.INFO, "Loading custom rewards for the mod Void Decay");
		}
		
		if(Loader.isModLoaded("ExtraUtilities"))
		{
			new ExtraUtilsModHook();
			CCubesCore.logger.log(Level.INFO, "Loading custom rewards for the mod ExtraUtilities");
		}
		
	}
}
