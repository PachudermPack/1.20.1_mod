package net.pachuderm_pack.ppgmod.sound;

import net.minecraft.commands.arguments.NbtTagArgument;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.pachuderm_pack.ppgmod.PPGmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PPGmod.MOD_ID);




        public static final RegistryObject<SoundEvent> PPGLOGO_BLOCK_BREAK = registerSoundEvents("ppglogo_block_break");
        public static final RegistryObject<SoundEvent> PPGLOGO_BLOCK_STEP = registerSoundEvents("ppglogo_block_step");
        public static final RegistryObject<SoundEvent> PPGLOGO_BLOCK_FALL = registerSoundEvents("ppglogo_block_fall");
        public static final RegistryObject<SoundEvent> PPGLOGO_BLOCK_PLACE = registerSoundEvents("ppglogo_block_place");
        public static final RegistryObject<SoundEvent> PPGLOGO_BLOCK_HIT = registerSoundEvents("ppglogo_block_hit");

        public static final RegistryObject<SoundEvent> METAL1 = registerSoundEvents("metal1");
        public static final RegistryObject<SoundEvent> METAL2 = registerSoundEvents("metal2");
        public static final RegistryObject<SoundEvent> METAL3 = registerSoundEvents("metal3");
        public static final RegistryObject<SoundEvent> METAL4 = registerSoundEvents("metal4");
        public static final RegistryObject<SoundEvent> METAL5 = registerSoundEvents("metal5");
        public static final RegistryObject<SoundEvent> JOPA = registerSoundEvents("jopa");
        public static final RegistryObject<SoundEvent> BARBARIKI = registerSoundEvents("barbariki");
        public static final RegistryObject<SoundEvent> RAP_GOD = registerSoundEvents("rap_god");
        public static final RegistryObject<SoundEvent> GIMN = registerSoundEvents("gimn");
        public static final RegistryObject<SoundEvent> SPIRIT = registerSoundEvents("spirit");
        public static final RegistryObject<SoundEvent> WORM = registerSoundEvents("worm");


    public static final ForgeSoundType PPGLOGO_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.PPGLOGO_BLOCK_BREAK, ModSounds.PPGLOGO_BLOCK_STEP, ModSounds.PPGLOGO_BLOCK_PLACE,
            ModSounds.PPGLOGO_BLOCK_HIT, ModSounds.PPGLOGO_BLOCK_FALL);



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(PPGmod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
