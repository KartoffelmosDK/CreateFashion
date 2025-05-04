package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.WaterwheelItem;
import software.bernie.geckolib.model.GeoModel;

public class WaterwheelModel extends GeoModel<WaterwheelItem> {
    @Override
    public ResourceLocation getModelResource(WaterwheelItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/waterwheel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaterwheelItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/waterwheel.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WaterwheelItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/waterwheel.animation.json");
    }
}
