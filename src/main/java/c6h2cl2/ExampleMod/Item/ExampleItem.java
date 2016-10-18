package c6h2cl2.ExampleMod.Item;

import c6h2cl2.ExampleMod.ExampleModCore;
import net.minecraft.item.Item;

/**
 * @author C6H2Cl2
 */
public class ExampleItem extends Item {
    public ExampleItem(){
        setUnlocalizedName("sampleItem");
        setRegistryName(ExampleModCore.ModID,"sampleItem");
        setCreativeTab(ExampleModCore.tabExampleMod);
    }
}
