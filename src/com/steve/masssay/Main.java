package com.steve.masssay;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("masssay").setExecutor(new MassSay());
        System.out.println("Enalbed masssay plugin Developed by Steve");
        super.onEnable();
    }



}
