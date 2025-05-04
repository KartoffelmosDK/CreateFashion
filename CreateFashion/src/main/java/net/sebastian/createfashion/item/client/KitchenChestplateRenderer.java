package net.sebastian.createfashion.item.client;

import net.sebastian.createfashion.item.custom.KitchenChestplateItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KitchenChestplateRenderer extends GeoArmorRenderer<KitchenChestplateItem> {
    public KitchenChestplateRenderer() {
        super(new KitchenChestplateModel());
    }
}
