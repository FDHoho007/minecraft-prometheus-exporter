package com.drewburr.mcprom.core.dto;

/**
 * A player stat entry, as exported by the {@code mc_player_stat_total} metric.
 *
 * @param id The player's unique id (UUID string).
 * @param name The player's name.
 * @param code The stat code (e.g., "minecraft:talked_to_villager").
 * @param statName The readable stat name.
 * @param value The value of the stat.
 */
public record PlayerStat(String id, String name, String code, String statName, double value) {
}
