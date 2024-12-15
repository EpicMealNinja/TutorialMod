package com.epicmealninja.tutorialmod.item;

import com.epicmealninja.tutorialmod.TutorialMod;
import com.epicmealninja.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JACOBS_MATERIALS_TAB = CREATIVE_MODE_TABS.register("jacobs_materials_tab",
            ()-> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.JACORITE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.jacobs_materials"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.JACORITE.get());
                        output.accept(ModItems.PYITE.get());
                        output.accept(ModItems.RAW_PYITE.get());
                        //output.accept(ModItems.CORITITE.get());
                        //output.accept(ModItems.RAW_CORITITE.get());
                        output.accept(ModItems.AVOUS.get());
                        output.accept(ModItems.EVANUM.get());
                        //output.accept(ModItems.RAW_EVANUM.get());

                        output.accept(ModBlocks.AVOUS_SPRUCE_LOG.get());
                        output.accept(ModBlocks.STRIPPED_AVOUS_SPRUCE_LOG.get());
                        output.accept(ModBlocks.ALEXIUM_MUSHROOM.get());
                    }).build());

    public static void registerCreativeModeTab(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
