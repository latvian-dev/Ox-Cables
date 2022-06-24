package dev.latvian.mods.ox;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LatvianModder
 */
public class Ox {
	public static final String MOD_ID = "ox";
	public static final String MOD_NAME = "Ox Cables";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

	public static Ox instance;

	public static OxCommon PROXY;

	public Ox() {
	}

	public void setup() {
	}
}