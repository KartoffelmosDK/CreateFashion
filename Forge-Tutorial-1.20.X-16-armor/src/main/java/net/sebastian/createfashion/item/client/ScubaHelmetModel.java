package net.sebastian.createfashion.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.CreateFashion;
import net.sebastian.createfashion.item.custom.ScubaHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class ScubaHelmetModel extends GeoModel<ScubaHelmetItem> {
    @Override
    public ResourceLocation getModelResource(ScubaHelmetItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "geo/scubahelmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ScubaHelmetItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "textures/item/scubahelmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScubaHelmetItem animatable) {
        return new ResourceLocation(CreateFashion.MOD_ID, "animations/scubahelmet.animation.json");
    }
}
