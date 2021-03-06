package io.github.cottonmc.epicurean.block.crop;

import io.github.cottonmc.epicurean.Epicurean;
import io.github.cottonmc.epicurean.item.EpicureanItems;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EpicureanCrops {

	public static final Block TOMATO_PLANT = register("tomato", new HarvestableCropBlock(EpicureanItems.TOMATO_SEEDS, 2));
	public static final Block PEPPER_PLANT = register("pepper", new PickableCropBlock(EpicureanItems.PEPPER_SEEDS, 1));
	public static final Block ONION_PLANT = register("onion", new HarvestableCropBlock(EpicureanItems.ONION, 0));
	public static final Block SOYBEAN_PLANT = register("soybean", new PickableCropBlock(EpicureanItems.SOYBEAN, 1));

	private static Block register(String name, Block block) {
		Registry.register(Registry.BLOCK, new Identifier(Epicurean.MOD_ID, name), block);
		return block;
	}

	public static void init() {
	}
}
