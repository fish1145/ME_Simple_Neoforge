package net.fish_dan_.simple_ae.item;

import net.fish_dan_.simple_ae.Simple_AE;
import net.fish_dan_.simple_ae.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Simple_AE.MOD_ID);

    public static final Supplier<CreativeModeTab> ME_SIMPLE_MATERIAL = CREATIVE_MODE_TAB.register("simple_ae_material",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLUE_CRYSTAL_LNGOT.get()))
                    .title(Component.translatable("creative_tab.simple_ae.material"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.BLUE_CRYSTAL_LNGOT);
                        output.accept(ModItems.MYSTERIOUS_BIT);

                    }).build());


    public static final Supplier<CreativeModeTab> BLUE_MACHINES_LNGOT = CREATIVE_MODE_TAB.register("simple_ae_machines",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EIG_ENTRO_BUDDING))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Simple_AE.MOD_ID, "simple_ae_material"))
                    .title(Component.translatable("creative_tab.simple_ae.machines"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.EIG_ENTRO_BUDDING);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
