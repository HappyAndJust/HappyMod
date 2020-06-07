package happyandjust.happymod.commands;

import java.util.HashMap;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Command extends CommandBase {

	private HashMap<String, String> collection = new HashMap<String, String>();

	@Override
	public String getCommandName() {
		return "collection";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "collection <enchant name>";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {

		collection.put("harvesting", "Wheat Collection Level 2");
		collection.put("cubism", "Pumpkin Collection Level 5");
		collection.put("piercing", "Cactus Collection Level 6");
		collection.put("thorns", "Cactus Collection Level 7");
		collection.put("projectile_protection", "Feather Collection Level 1");
		collection.put("feather_falling", "Feather Collection Level 2");
		collection.put("aiming", "Feather Collection Level 6");
		collection.put("snipe", "Feather Collection Level 8");
		collection.put("rainbow", "Mutton Collection Level 6");
		collection.put("luck", "Raw Rabbit Collection Level 5");
		collection.put("luck_of_the_sea", "Raw Rabbit Collection Level 7");
		collection.put("smelting_touch", "Coal Collection Level 1");
		collection.put("protection", "Iron Collection Level 3");
		collection.put("looting", "Gold Collection Level 3");
		collection.put("scavenger", "Gold Collection Level 6");
		collection.put("fortune", "Gold Collection Level 8");
		collection.put("execute", "Diamond Collection Level 2");
		collection.put("critical", "Diamond Collection Level 5");
		collection.put("experience", "Lapis Lazuli Collection Level 3");
		collection.put("efficiency", "Redstone Collection Level 3");
		collection.put("lethality", "Obsidian Collection Level 2");
		collection.put("sharpness", "Gravel Collection Level 4");
		collection.put("first_strike", "Gravel Collection Level 6");
		collection.put("frost_walker", "Ice Collection Level 2");
		collection.put("smite", "Zombie Collection Level 3");
		collection.put("power", "Bone Collection Level 3");
		collection.put("silk_touch", "String Collection Level 5");
		collection.put("infinite_quiver", "String Collection Level 6");
		collection.put("bane_of_arthropods", "Spider Eye Collection Level 5");
		collection.put("venomous", "Spider Eye Collection Level 6");
		collection.put("blast_protection", "Gunpowder Collection Level 3");
		collection.put("thunderlord", "Gunpowder Collection Level 5");
		collection.put("ender_slayer", "Ender Pearl Collection Level 3");
		collection.put("giant_killer", "Ghast Tear Collection Level 3");
		collection.put("vampirism", "Ghast Tear Collection Level 5");
		collection.put("knockback", "Slimeball Collection Level 3");
		collection.put("punch", "Slimeball Collection Level 6");
		collection.put("fire_aspect", "Blaze Rod Collection Level 3");
		collection.put("flame", "Blaze Rod Collection Level 6");
		collection.put("fire_protection", "Magma Cream Collection Level 3");
		collection.put("growth", "Dark Oak Wood Collection Level 7");
		collection.put("lure", "Raw Salmon Collection Level 3");
		collection.put("magnet", "Clownfish Collection Level 3");
		collection.put("cleave", "Pufferfish Collection Level 3");
		collection.put("depth_strider", "Pufferfish Collection Level 4");
		collection.put("spiked_hook", "Pufferfish Collection Level 6");
		collection.put("impaling", "Prismarine Shard Collection Level 1");
		collection.put("aqua_affinity", "Prismarine Crystals Collection Level 4");
		collection.put("blessing", "Prismarine Crystals Collection Level 7");
		collection.put("respiration", "Clay Collection Level 3");
		collection.put("frail", "Clay Collection Level 4");
		collection.put("caster", "Ink Sac Collection Level 5");
		collection.put("angler", "Ink Sac Collection Level 7");

		if (args.length < 1) {
			sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /collection [Enchant Name]"));
			return;
		}

		if (args.length == 1) {
			String enchant_name = args[0].toLowerCase();
			String collec = collection.get(enchant_name);
			if (collec == null) {
				sender.addChatMessage(new ChatComponentText(
						EnumChatFormatting.RED + enchant_name.toUpperCase() + " is not valid Enchant Name"));
				return;
			}
			sender.addChatMessage(new ChatComponentText(
					EnumChatFormatting.GREEN + enchant_name.toUpperCase() + " is at " + collection.get(enchant_name)));
		}

	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
		
	}

}
