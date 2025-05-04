package net.sebastian.createfashion.item.client;

import net.sebastian.createfashion.item.custom.GogglesItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GogglesRenderer extends GeoArmorRenderer<GogglesItem> {
    public GogglesRenderer() {
        super(new GogglesModel());
    }
}
