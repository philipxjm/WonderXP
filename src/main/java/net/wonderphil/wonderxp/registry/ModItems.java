package net.wonderphil.wonderxp.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wonderphil.wonderxp.WonderXP;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(WonderXP.ITEM_GROUP));
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(WonderXP.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WonderXP.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(WonderXP.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
