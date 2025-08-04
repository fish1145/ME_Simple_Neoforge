package net.fish_dan_.simple_ae.item;

import net.fish_dan_.simple_ae.Simple_AE;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Simple_AE.MOD_ID);

    public static final DeferredItem<Item> BLUE_CRYSTAL_LNGOT = ITEMS.register("blue_crystal_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MYSTERIOUS_BIT = ITEMS.register("mysterious_bit",() -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
