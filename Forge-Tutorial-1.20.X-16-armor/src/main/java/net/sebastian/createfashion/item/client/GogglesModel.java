package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.GogglesItem;
import software.bernie.geckolib.model.GeoModel;

public class GogglesModel extends GeoModel<GogglesItem> {
    @Override
    public ResourceLocation getModelResource(GogglesItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/goggles.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GogglesItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/goggles.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GogglesItem animatable) {
        // This should point to a single animation file containing both "idle" and "crouch" animations
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/goggles.animation.json");
    }
}
