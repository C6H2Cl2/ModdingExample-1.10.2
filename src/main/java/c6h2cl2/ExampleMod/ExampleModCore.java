package c6h2cl2.ExampleMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author C6H2Cl2
 */
@Mod(modid = ExampleModCore.ModID,useMetadata = true)
public class ExampleModCore {
    //Mod ID
    public static final String ModID = "ExampleMod";
    //Modのバージョン
    public static final String Version = "1.0.0";
    //クリエイティブ
    public static CreativeTabs tabExampleMod = new CreativeTabs("exampleMod") {
        @Override
        public Item getTabIconItem() {
            //アイコンに使うItemを返す
            return Items.DIAMOND;
            //Blockを使いたいときはこちら
            //return Item.getItemFromBlock(Block block)
        }
    };

    //Modの情報を格納する。 mcmod.infoの上位互換
    @Mod.Metadata
    public static ModMetadata metadata;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){
        //PreInitでMetadataの情報を読み込む
        loadMeta();
        ExampleModRegistry.registerPreInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event){

    }

    private void loadMeta(){
        metadata.authorList.add("C6H2Cl2");
        metadata.modId = ModID;
        metadata.name = ModID;
        metadata.version = Version;
        // Modのアップデートをチェックする為のJson 詳細は、 https://mcforge.readthedocs.io/en/latest/gettingstarted/autoupdate/ 参照
        // metadata.updateJSON
        //これをfalseにしておかないと、ModMetadataが読み込まれない
        metadata.autogenerated = false;
    }
}
