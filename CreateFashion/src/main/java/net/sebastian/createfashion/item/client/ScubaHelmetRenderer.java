package net.sebastian.createfashion.item.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.sebastian.createfashion.item.custom.ScubaHelmetItem;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;


public class ScubaHelmetRenderer extends GeoArmorRenderer<ScubaHelmetItem> {
    public ScubaHelmetRenderer() {
        super(new ScubaHelmetModel());
    }

    @Override
    public RenderType getRenderType(ScubaHelmetItem animatable, ResourceLocation texture,
                                    @Nullable MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
