package snw.gotwb.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Entity.class)
public class EntityMixin {

    @Redirect(method = "collideBoundingBox", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/border/WorldBorder;isInsideCloseToBorder(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Z"))
    private static boolean alwaysNotCollideWithBorder(WorldBorder instance, Entity entity, AABB aABB) {
        return false;
    }
}
