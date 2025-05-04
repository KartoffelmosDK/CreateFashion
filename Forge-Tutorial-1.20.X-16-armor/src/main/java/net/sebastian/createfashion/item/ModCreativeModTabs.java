package net.sebastian.createfashion.item;

import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateFashion.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOGGLES.get()))
                    .title(Component.translatable("creativetab.tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.GOGGLES.get());
                        pOutput.accept(ModItems.WATERWHEEL.get());
                        pOutput.accept(ModItems.IGOTIT.get());
                        pOutput.accept(ModItems.CHICKENEGGNEST.get());

                        pOutput.accept(ModItems.SCUBAHELMET.get());
                        pOutput.accept(ModItems.SCUBACHESTPLATE.get());

                        pOutput.accept(ModItems.KITCHENHELMET.get());
                        pOutput.accept(ModItems.KITCHENCHESTPLATE.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
