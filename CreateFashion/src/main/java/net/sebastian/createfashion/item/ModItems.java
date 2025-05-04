package net.sebastian.createfashion.item;

import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateFashion.MOD_ID);

    public static final RegistryObject<Item> GOGGLES = ITEMS.register("goggles",
            () -> new GogglesItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WATERWHEEL = ITEMS.register("waterwheel",
            () -> new WaterwheelItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IGOTIT = ITEMS.register("igotit",
            () -> new IGotItItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHICKENEGGNEST = ITEMS.register("chickeneggnest",
            () -> new ChickenEggNestItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> SCUBAHELMET = ITEMS.register("scubahelmet",
            () -> new ScubaHelmetItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SCUBACHESTPLATE = ITEMS.register("scubachestplate",
            () -> new ScubaChestplateItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> KITCHENHELMET = ITEMS.register("kitchenhelmet",
            () -> new KitchenHelmetItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KITCHENCHESTPLATE = ITEMS.register("kitchenchestplate",
            () -> new KitchenChestplateItem(ModArmorMaterials.GOGGLES,ArmorItem.Type.CHESTPLATE, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
