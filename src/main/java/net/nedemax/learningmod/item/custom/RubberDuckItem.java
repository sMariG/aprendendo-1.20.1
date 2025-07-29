package net.nedemax.learningmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.nedemax.learningmod.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RubberDuckItem extends Item {
    public RubberDuckItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {return true;}



    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pPlayer.playSound(ModSounds.DUCK_SOUND.get(), 1.0F, 1.0F);
        pPlayer.getCooldowns().addCooldown(this, 10);

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
