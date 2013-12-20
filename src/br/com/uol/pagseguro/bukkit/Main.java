package br.com.uol.pagseguro.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
    public void onEnable() {
		getLogger().info("Enabling PagSeguro API (V"+getDescription().getVersion()+") for Bukkit - Author: UOL.com.br & SubZero0");
	}
	
	@Override
    public void onDisable() {
		getLogger().info("Disabling PagSeguro API for Bukkit");
	}
}
