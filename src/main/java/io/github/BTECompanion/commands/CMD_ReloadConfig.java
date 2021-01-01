package github.BTECompanion.commands;

import github.BTECompanion.BTECompanion;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_ReloadConfig implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(sender instanceof Player) {
            if(sender.hasPermission("companion.creload")) {
                BTECompanion.getPlugin().saveConfig();
                BTECompanion.getPlugin().reloadConfig();

                sender.sendMessage("§8§l>> §aSuccessfully reloaded config.");
            }
        }
        return true;
    }
}
