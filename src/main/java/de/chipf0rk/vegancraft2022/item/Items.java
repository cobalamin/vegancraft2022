package de.chipf0rk.vegancraft2022.item;

import de.chipf0rk.vegancraft2022.VeganCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VeganCraft.MODID);

    public static final RegistryObject<Item> CHARRED_BITS = ITEMS.register(
            "charred_bits", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CARBON_SHEET_ROUGH = ITEMS.register(
            "carbon_sheet_rough", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CARBON_SHEET_STACKED = ITEMS.register(
            "carbon_sheet_stacked", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CARBON_SHEET_COMPRESSED = ITEMS.register(
            "carbon_sheet_compressed", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CARBON_SHEET_TREATED = ITEMS.register(
            "carbon_sheet_treated", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CARBON_SHEET_PURIFIED = ITEMS.register(
            "carbon_sheet_purified", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CARBON_SHEET_WOVEN = ITEMS.register(
            "carbon_sheet_woven", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
