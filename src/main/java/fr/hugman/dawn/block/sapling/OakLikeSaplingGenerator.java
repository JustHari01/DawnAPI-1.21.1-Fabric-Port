package fr.hugman.dawn.block.sapling;

import fr.hugman.dawn.DawnFactory;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.util.Identifier;

import java.util.Optional;

/** Creates a 1.21.1 sapling generator with the oak-like variant selection rules. */
public final class OakLikeSaplingGenerator {
	private OakLikeSaplingGenerator() {
	}

	/**
	 * Builds the standard feature IDs {@code tree/<path>/{regular,bees,fancy,fancy_bees}}.
	 */
	public static SaplingGenerator of(Identifier baseId) {
		String namespace = baseId.getNamespace();
		String path = baseId.getPath();
		return of(
				Identifier.of(namespace, "tree/" + path + "/regular"),
				Identifier.of(namespace, "tree/" + path + "/bees"),
				Identifier.of(namespace, "tree/" + path + "/fancy"),
				Identifier.of(namespace, "tree/" + path + "/fancy_bees"));
	}

	/**
	 * Keeps the vanilla oak distribution: a 10% fancy-tree chance and nearby-flower bee variants.
	 */
	public static SaplingGenerator of(Identifier regular, Identifier bees, Identifier fancy, Identifier fancyBees) {
		return new SaplingGenerator(
				regular.getPath(), 0.1F,
				Optional.empty(), Optional.empty(),
				Optional.of(DawnFactory.configuredFeature(regular)),
				Optional.of(DawnFactory.configuredFeature(fancy)),
				Optional.of(DawnFactory.configuredFeature(bees)),
				Optional.of(DawnFactory.configuredFeature(fancyBees)));
	}
}
