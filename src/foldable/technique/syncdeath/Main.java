package foldable.technique.syncdeath;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		System.out.println("\nFoldable's syncrhonized deaths plugin initializing...\n");
		this.getServer().getPluginManager().registerEvents(new Events(), this);
	}
}
