package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.IGotItItem;
import software.bernie.geckolib.model.GeoModel;

public class IGotItModel extends GeoModel<IGotItItem> {
    @Override
    public ResourceLocation getModelResource(IGotItItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/igotit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IGotItItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/igotit.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IGotItItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/igotit.animation.json");
    }
}
