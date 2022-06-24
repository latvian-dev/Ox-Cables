package dev.latvian.mods.ox.forge;

import dev.latvian.mods.ox.Ox;
import net.minecraftforge.fml.common.Mod;

@Mod(Ox.MOD_ID)
public class OxForge {
	public OxForge() {
		Ox.instance = new Ox();
		Ox.instance.setup();
	}
}
