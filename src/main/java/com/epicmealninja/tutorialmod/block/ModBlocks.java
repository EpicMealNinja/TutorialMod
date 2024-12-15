package com.epicmealninja.tutorialmod.block;

import com.epicmealninja.tutorialmod.TutorialMod;
import com.epicmealninja.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> PYITE_ORE = registerBlock("pyite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_PYITE_ORE = registerBlock("deepslate_pyite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> AVOUS_SPRUCE_LOG = registerBlock("avous_spruce_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_AVOUS_SPRUCE_LOG = registerBlock("stripped_avous_spruce_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ALEXIUM_MUSHROOM = registerBlock("alexium_mushroom",
            () -> new FlowerBlock(SuspiciousStewEffects.EMPTY, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM)
                    .lightLevel(p_50886_->3)));

    public static final RegistryObject<Block> EVANUM_ORE = registerBlock("evanum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> JACORITE_ORE = registerBlock("jacorite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
