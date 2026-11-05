package fr.hugman.dawn.block.sapling;

import fr.hugman.dawn.DawnFactory;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.util.Identifier;

import java.util.Optional;

/** Creates a 1.21.1 sapling generator that always selects one configured feature. */
public final class SingleSaplingGenerator {
	private SingleSaplingGenerator() {
	}

	public static SaplingGenerator of(Identifier id) {
		return new SaplingGenerator(id.getPath(), Optional.empty(), Optional.of(DawnFactory.configuredFeature(id)), Optional.empty());
	}
}
