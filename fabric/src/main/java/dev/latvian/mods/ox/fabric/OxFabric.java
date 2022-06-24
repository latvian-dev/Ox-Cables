package dev.latvian.mods.ox.fabric;

import dev.latvian.mods.ox.Ox;
import net.fabricmc.api.ModInitializer;

public class OxFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		try {
			Ox.instance = new Ox();
			Ox.instance.setup();
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}
}
