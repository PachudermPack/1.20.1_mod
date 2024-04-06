package net.pachuderm_pack.ppgmod.item;

import net.pachuderm_pack.ppgmod.PPGmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pachuderm_pack.ppgmod.block.custom.ModBlocks;
import net.pachuderm_pack.ppgmod.item.ModItems;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PPGmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PPG_TAB = CREATIVE_MODE_TABS.register("ppg_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WORM.get()))
                    .title(Component.translatable("creativetab.PPG_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.WORM.get());
                        pOutput.accept(ModItems.ILYALOH.get());
                        pOutput.accept(ModItems.PPG.get());
                        pOutput.accept(ModItems.WORM_AXE.get());
                        pOutput.accept(ModItems.WORM_SWORD.get());
                        pOutput.accept(ModItems.WORM_SHOVEL.get());
                        pOutput.accept(ModItems.WORM_HOE.get());
                        pOutput.accept(ModItems.WORM_PICKAXE.get());
                        pOutput.accept(ModBlocks.PPGLOGO_BLOCK.get());
                        pOutput.accept(ModItems.PPG_HELMET.get());
                        pOutput.accept(ModItems.PPG_CHESTPLATE.get());
                        pOutput.accept(ModItems.PPG_LEGGINGS.get());
                        pOutput.accept(ModItems.PPG_BOOTS.get());
                        pOutput.accept(ModItems.METAL1_MUSIC_DISC.get());
                        pOutput.accept(ModItems.METAL2_MUSIC_DISC.get());
                        pOutput.accept(ModItems.METAL3_MUSIC_DISC.get());
                        pOutput.accept(ModItems.METAL4_MUSIC_DISC.get());
                        pOutput.accept(ModItems.METAL5_MUSIC_DISC.get());
                        pOutput.accept(ModItems.JOPA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BARBARIKI_MUSIC_DISC.get());
                        pOutput.accept(ModItems.RAP_GOD_MUSIC_DISC.get());
                        pOutput.accept(ModItems.GIMN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.SPIRIT_MUSIC_DISC.get());
                        pOutput.accept(ModItems.WORM_MUSIC_DISC.get());
                        pOutput.accept(ModItems.COOKED_WORM.get());
                        //pOutput.accept(ModItems.WOB.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}