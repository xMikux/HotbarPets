package io.github.thebusybiscuit.hotbarpets.groups;

import io.github.thebusybiscuit.hotbarpets.PetTexture;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.BedPet;
import io.github.thebusybiscuit.hotbarpets.pets.EnderChestPet;
import io.github.thebusybiscuit.hotbarpets.pets.WorkbenchPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public final class UtilityPets implements PetGroup {

    public UtilityPets(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return "&a效用 (友善)";
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        new BedPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_BED", Material.RED_BED, "&f床寵物", getName(), "&7喜愛的食物: 羊毛", "", "&f右鍵點擊: &7睡Zzz..."), new ItemStack(Material.WHITE_WOOL), new ItemStack[] {
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.RED_BED), new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.DIAMOND), new ItemStack(Material.WHITE_WOOL),
                new ItemStack(Material.OAK_PLANKS), SlimefunItems.GOLD_14K, new ItemStack(Material.OAK_PLANKS)
        }).register(plugin);

        new EnderChestPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_ENDER_CHEST", PetTexture.ENDER_CHEST_PET.getHash(), "&5終界箱寵物", getName(), "&7喜愛的食物: 終界珍珠", "", "&f右鍵點擊: &7開啟"), new ItemStack(Material.ENDER_PEARL), new ItemStack[] {
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.ENDER_EYE), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.EMERALD), new ItemStack(Material.ENDER_PEARL),
                new ItemStack(Material.OBSIDIAN), SlimefunItems.GOLD_16K, new ItemStack(Material.OBSIDIAN)
        }).register(plugin);

        new WorkbenchPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_WORKBENCH", PetTexture.WORKBENCH_PET.getHash(), "&6工作臺寵物", getName(), "&7喜愛的食物: 木材", "", "&f右鍵點擊: &7開啟"), new ItemStack(Material.OAK_PLANKS), new ItemStack[] {
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.CRAFTING_TABLE), new ItemStack(Material.OAK_PLANKS),
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.OAK_PLANKS),
                new ItemStack(Material.OAK_PLANKS), SlimefunItems.GOLD_16K, new ItemStack(Material.OAK_PLANKS)
        }).register(plugin);
        // @formatter:on
    }

}
