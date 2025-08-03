package net.fish_dan_.me_simple.item;

import net.fish_dan_.me_simple.Me_Simple;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Me_Simple.MOD_ID);

    public static final DeferredItem<Item> BLUE_CRYSTAL_LNGOT = ITEMS.register("blue_crystal_ingot",() -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
