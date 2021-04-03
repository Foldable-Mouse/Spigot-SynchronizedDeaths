package foldable.technique.syncdeath;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Events implements Listener
{
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event)
	{
		for(Player p : Bukkit.getOnlinePlayers())
		{
			if(p != (Player) event.getEntity())
				p.damage(1000);
		}
		
	}
}
