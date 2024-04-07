package net.pachuderm_pack.ppgmod.item;

import net.pachuderm_pack.ppgmod.PPGmod;
import net.pachuderm_pack.ppgmod.item.custom.*;
import net.pachuderm_pack.ppgmod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PPGmod.MOD_ID);
    public static final RegistryObject<Item> WORM = ITEMS.register("worm",
            () -> new WormItem(new Item.Properties().food(ModFoods.WORM)));

    public static final RegistryObject<Item> ILYALOH = ITEMS.register("ilyaloh",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PPG = ITEMS.register("ppg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COOKED_WORM = ITEMS.register("cooked_worm",
            () -> new CookedWormItem(new Item.Properties().food(ModFoods.COOKED_WORM)));

    public static final RegistryObject<Item> WOB = ITEMS.register("wob",
            () -> new Item( new Item.Properties().food(ModFoods.WOB).stacksTo(1)));

    public static final RegistryObject<Item> WORM_SWORD = ITEMS.register("worm_sword",
            () -> new WormSwordItem(ModToolTiers.PPG,20,-1, new Item.Properties()));
    public static final RegistryObject<Item> WORM_PICKAXE = ITEMS.register("worm_pickaxe",
            () -> new WormPickaxeItem(ModToolTiers.PPG,1,-3, new Item.Properties()));
    public static final RegistryObject<Item> WORM_AXE = ITEMS.register("worm_axe",
            () -> new WormAxeItem(ModToolTiers.PPG,25,-3, new Item.Properties()));
    public static final RegistryObject<Item> WORM_HOE = ITEMS.register("worm_hoe",
            () -> new WormHoeItem(ModToolTiers.PPG,0,-3, new Item.Properties()));
    public static final RegistryObject<Item> WORM_SHOVEL = ITEMS.register("worm_shovel",
            () -> new WormShovelItem(ModToolTiers.PPG,0,-3, new Item.Properties()));

    public static final RegistryObject<Item> PPG_HELMET = ITEMS.register("ppg_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PPG,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PPG_CHESTPLATE = ITEMS.register("ppg_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.PPG,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PPG_LEGGINGS = ITEMS.register("ppg_leggings",
            () -> new ModArmorItem(ModArmorMaterials.PPG,ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PPG_BOOTS = ITEMS.register("ppg_boots",
            () -> new ModArmorItem(ModArmorMaterials.PPG,ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> METAL1_MUSIC_DISC = ITEMS.register("metal1_music_disc",
            () -> new RecordItem(6, ModSounds.METAL1, new Item.Properties().stacksTo(1),3680));
    public static final RegistryObject<Item> METAL2_MUSIC_DISC = ITEMS.register("metal2_music_disc",
            () -> new RecordItem(6, ModSounds.METAL2, new Item.Properties().stacksTo(1),3660));
    public static final RegistryObject<Item> METAL3_MUSIC_DISC = ITEMS.register("metal3_music_disc",
            () -> new RecordItem(6, ModSounds.METAL3, new Item.Properties().stacksTo(1),4640));
    public static final RegistryObject<Item> METAL4_MUSIC_DISC = ITEMS.register("metal4_music_disc",
            () -> new RecordItem(6, ModSounds.METAL4, new Item.Properties().stacksTo(1),4280));
    public static final RegistryObject<Item> METAL5_MUSIC_DISC = ITEMS.register("metal5_music_disc",
            () -> new RecordItem(6, ModSounds.METAL5, new Item.Properties().stacksTo(1),5640));
    public static final RegistryObject<Item> JOPA_MUSIC_DISC = ITEMS.register("jopa_music_disc",
            () -> new RecordItem(6, ModSounds.JOPA, new Item.Properties().stacksTo(1),2840));
    public static final RegistryObject<Item> BARBARIKI_MUSIC_DISC = ITEMS.register("barbariki_music_disc",
            () -> new RecordItem(6, ModSounds.BARBARIKI, new Item.Properties().stacksTo(1),3020));
    public static final RegistryObject<Item> RAP_GOD_MUSIC_DISC = ITEMS.register("rap_god_music_disc",
            () -> new RecordItem(6, ModSounds.RAP_GOD, new Item.Properties().stacksTo(1),7340));
    public static final RegistryObject<Item> GIMN_MUSIC_DISC = ITEMS.register("gimn_music_disc",
            () -> new RecordItem(6, ModSounds.GIMN, new Item.Properties().stacksTo(1),540));
    public static final RegistryObject<Item> SPIRIT_MUSIC_DISC = ITEMS.register("spirit_music_disc",
            () -> new RecordItem(6, ModSounds.SPIRIT, new Item.Properties().stacksTo(1),5560));
    public static final RegistryObject<Item> WORM_MUSIC_DISC = ITEMS.register("worm_music_disc",
            () -> new RecordItem(6, ModSounds.WORM, new Item.Properties().stacksTo(1),4060));
    public static final RegistryObject<Item> SUPERPUPERMEGASWORD = ITEMS.register("superdupermegasword",
            () -> new RecordItem(6, ModSounds.NGGYU, new Item.Properties().stacksTo(1),4060));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
