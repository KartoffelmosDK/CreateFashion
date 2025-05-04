package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.KitchenChestplateItem;
import software.bernie.geckolib.model.GeoModel;

public class KitchenChestplateModel extends GeoModel<KitchenChestplateItem> {
    @Override
    public ResourceLocation getModelResource(KitchenChestplateItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/kitchenchestplate.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KitchenChestplateItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/kitchenchestplate.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KitchenChestplateItem animatable) {
        // This should point to a single animation file containing both "idle" and "crouch" animations
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/kitchenchestplate.animation.json");
    }
}
