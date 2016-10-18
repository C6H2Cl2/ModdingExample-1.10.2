package c6h2cl2.ExampleMod.Item;

import c6h2cl2.ExampleMod.ExampleModCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

/**
 * @author C6H2Cl2
 */
public class RightClickExampleItem extends Item {
    public RightClickExampleItem(){
        setUnlocalizedName("rightClickExampleItem");
        setRegistryName(ExampleModCore.ModID,"rightClickExampleItem");
        setCreativeTab(ExampleModCore.tabExampleMod);
    }

    @NotNull
    @Override
    public ActionResult<ItemStack> onItemRightClick(@NotNull ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if(!worldIn.isRemote){
            playerIn.addChatComponentMessage(new TextComponentString("Item Right Clicked !!"));
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS,itemStackIn);
    }

    @NotNull
    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            playerIn.addChatComponentMessage(new TextComponentString("Item Used"));
        }
        return EnumActionResult.SUCCESS;
    }
}
