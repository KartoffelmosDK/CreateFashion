package net.sebastian.createfashion.item.client;

import net.sebastian.createfashion.item.custom.KitchenHelmetItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KitchenHelmetRenderer extends GeoArmorRenderer<KitchenHelmetItem> {
    public KitchenHelmetRenderer() {
        super(new KitchenHelmetModel());
    }
}
