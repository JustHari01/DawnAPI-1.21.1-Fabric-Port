package fr.hugman.dawn.block;

import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

/**
 * Describes a custom boat family for the Terraform 12 boat registration helpers.
 * The planks item is retained for callers that associate the vehicle with its wood set.
 */
public record DawnBoatType(Identifier id, ItemConvertible planks, boolean raft) {
}
