package cc.tianxun.cancelminecartspeedlimit.mixin;

import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(GameRules.IntRule.class)
public class IntRuleMixin {
	@ModifyVariable(method = "create(IIILnet/minecraft/resource/featuretoggle/FeatureSet;Ljava/util/function/BiConsumer;)Lnet/minecraft/world/GameRules$Type;", at = @At("HEAD"), ordinal = 2, argsOnly = true)
	private static int create(int value) {
		return Integer.MAX_VALUE;
	}
}
