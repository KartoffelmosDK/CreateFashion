package net.sebastian.createfashion.item.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.item.custom.ScubaChestplateItem;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;


public class ScubaChestplateRenderer extends GeoArmorRenderer<ScubaChestplateItem> {
    public ScubaChestplateRenderer() {
        super(new ScubaChestplateModel());
    }

    @Override
    public RenderType getRenderType(ScubaChestplateItem animatable, ResourceLocation texture,
                                    @Nullable MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
