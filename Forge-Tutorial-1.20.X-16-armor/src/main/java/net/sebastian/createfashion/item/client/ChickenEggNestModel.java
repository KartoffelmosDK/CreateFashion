package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.ChickenEggNestItem;
import net.sebastian.createfashion.item.custom.ChickenEggNestItem;
import net.sebastian.createfashion.item.custom.WaterwheelItem;
import software.bernie.geckolib.model.GeoModel;

public class ChickenEggNestModel extends GeoModel<ChickenEggNestItem> {
    @Override
    public ResourceLocation getModelResource(ChickenEggNestItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/chickeneggnest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChickenEggNestItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/chickeneggnest.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChickenEggNestItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/chickenegg.animation.json");
    }
}
