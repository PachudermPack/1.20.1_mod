package net.pachuderm_pack.ppgmod.block.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pachuderm_pack.ppgmod.PPGmod;
import net.pachuderm_pack.ppgmod.item.ModItems;
import net.pachuderm_pack.ppgmod.sound.ModSounds;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PPGmod.MOD_ID);

    public static final RegistryObject<Block> PPGLOGO_BLOCK = regesterBlock("ppglogo_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(ModSounds.PPGLOGO_BLOCK_SOUNDS)));


    private static <T extends Block> RegistryObject<T> regesterBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn =  BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public  static  void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
