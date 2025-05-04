package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.ScubaChestplateItem;
import software.bernie.geckolib.model.GeoModel;

public class ScubaChestplateModel extends GeoModel<ScubaChestplateItem> {
    @Override
    public ResourceLocation getModelResource(ScubaChestplateItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/scubachestplate.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ScubaChestplateItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/scubachestplate.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScubaChestplateItem animatable) {
        // This should point to a single animation file containing both "idle" and "crouch" animations
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/scubachestplate.animation.json");
    }
}
