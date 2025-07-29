package net.nedemax.learningmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nedemax.learningmod.LearningMod;
import net.nedemax.learningmod.item.custom.FuelItem;
import net.nedemax.learningmod.item.custom.MetalDetectorItem;
import net.nedemax.learningmod.item.custom.RubberDuckItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MOD_ID);

    public static final RegistryObject<Item> SHARD = ITEMS.register("shard",
            () -> new MetalDetectorItem(new Item.Properties().durability(10)));
    public static final RegistryObject<Item> MAX_CHIBI = ITEMS.register("max_chibi",
            () -> new SimpleFoiledItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_DUCK = ITEMS.register("rubber_duck",
            () -> new RubberDuckItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROTTEN_APPLE = ITEMS.register("rotten_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROTTEN_APPLE)));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
