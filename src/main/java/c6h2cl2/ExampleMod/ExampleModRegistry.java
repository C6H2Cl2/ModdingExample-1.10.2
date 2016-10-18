package c6h2cl2.ExampleMod;

import c6h2cl2.ExampleMod.Item.ExampleItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.jetbrains.annotations.NotNull;

/**
 * @author C6H2Cl2
 */
public class ExampleModRegistry {

    public static final Item exampleItem = new ExampleItem();

    public static void registerPreInit(FMLPreInitializationEvent event){
        GameRegistry.register(exampleItem);

        if(event.getSide().isClient()){
            setCustomModelResourceLocation(exampleItem);
        }
    }

    @NotNull
    private static ModelResourceLocation getModelResourceLocation(@NotNull Item item){
        return new ModelResourceLocation(item.getRegistryName(),"inventory");
    }

    private static void setCustomModelResourceLocation(@NotNull Item item){
        ModelLoader.setCustomModelResourceLocation(item,0,getModelResourceLocation(item));
    }
}
