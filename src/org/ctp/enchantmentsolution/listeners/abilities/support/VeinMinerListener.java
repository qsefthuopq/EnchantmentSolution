package org.ctp.enchantmentsolution.listeners.abilities.support;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.ctp.enchantmentsolution.EnchantmentSolution;

import wtf.choco.veinminer.api.event.PlayerVeinMineEvent;

public class VeinMinerListener implements Listener{
	
	private static List<Player> VEIN_MINERS = new ArrayList<Player>();

	@EventHandler
	public void onVeinMine(PlayerVeinMineEvent event){
		VEIN_MINERS.add(event.getPlayer());
		Bukkit.getScheduler().runTaskLater(EnchantmentSolution.getPlugin(), new Runnable() {
			public void run() {
				VEIN_MINERS.remove(event.getPlayer());
			}
		}, 1l);
	}
	
	public static boolean hasVeinMiner(Player player) {
		return VEIN_MINERS.contains(player);
	}
}
