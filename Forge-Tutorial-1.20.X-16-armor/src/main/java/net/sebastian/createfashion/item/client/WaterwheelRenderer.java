package net.sebastian.createfashion.item.client;

import net.sebastian.createfashion.item.custom.WaterwheelItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WaterwheelRenderer extends GeoArmorRenderer<WaterwheelItem> {
    public WaterwheelRenderer() {
        super(new WaterwheelModel());
    }
}
