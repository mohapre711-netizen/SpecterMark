package com.example.mixin;

import com.example.ExampleMod;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.render.VertexConsumerProvider;

@Mixin(EntityRenderer.class)
public class ExampleMixin {

    @Inject(at = @At("HEAD"), method = "render")
    private void onRender(Object state, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo info) {
        if (state instanceof PlayerEntityRenderState renderState) {
            ExampleMod.LOGGER.info("Rendering player: " + renderState.name);
        }
    }
}
