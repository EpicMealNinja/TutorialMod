package com.epicmealninja.jacobs_materials.item;

import com.epicmealninja.jacobs_materials.Jacobs_Materials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Jacobs_Materials.MOD_ID);

    /*********************       Material Items         ********************/
    /***********************************************************************/
    /***********************************************************************/
    /***********************************************************************/

    public static final RegistryObject<Item> PYITE = ITEMS.register("pyite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PYITE = ITEMS.register("raw_pyite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORITITE = ITEMS.register("coritite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CORITITE = ITEMS.register("raw_coritite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AVOUS = ITEMS.register("avous",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EVANUM = ITEMS.register("evanum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_EVANUM = ITEMS.register("raw_evanum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JACORITE = ITEMS.register("jacorite",
            () -> new Item(new Item.Properties()));
    /***********************************************************************/


    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
