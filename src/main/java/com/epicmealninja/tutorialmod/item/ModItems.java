package com.epicmealninja.tutorialmod.item;

import com.epicmealninja.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> PYITE = ITEMS.register("pyite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PYITE = ITEMS.register("raw_pyite",
            () -> new Item(new Item.Properties()));


    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
