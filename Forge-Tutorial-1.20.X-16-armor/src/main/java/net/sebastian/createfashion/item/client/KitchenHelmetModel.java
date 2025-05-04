package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.KitchenHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class KitchenHelmetModel extends GeoModel<KitchenHelmetItem> {
    @Override
    public ResourceLocation getModelResource(KitchenHelmetItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/kitchenhelmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KitchenHelmetItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/kitchenhelmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KitchenHelmetItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/kitchenhelmet.animation.json");
    }
}
