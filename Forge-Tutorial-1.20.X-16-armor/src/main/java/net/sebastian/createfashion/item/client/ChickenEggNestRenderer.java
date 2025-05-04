package net.sebastian.createfashion.item.client;

import net.sebastian.createfashion.item.custom.ChickenEggNestItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ChickenEggNestRenderer extends GeoArmorRenderer<ChickenEggNestItem> {
    public ChickenEggNestRenderer() {
        super(new ChickenEggNestModel());
    }
}
