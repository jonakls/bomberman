package me.jonakls.bomberman;

import me.jonakls.bomberman.commands.registry.CommandRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bomberman extends JavaPlugin {

    private final CommandRegistry registry = new CommandRegistry(this);

    @Override
    public void onEnable() {
        registry.register();

    }

    @Override
    public void onDisable() {
        registry.unregister();
    }
}
