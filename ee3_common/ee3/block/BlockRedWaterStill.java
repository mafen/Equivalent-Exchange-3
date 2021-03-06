package ee3.block;

import java.util.ArrayList;

import ee3.core.helper.LocalizationHelper;
import ee3.lib.Reference;
import net.minecraft.src.BlockStationary;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockRedWaterStill extends BlockStationary {

	protected BlockRedWaterStill(int id, Material material) {
		super(id, material);
		this.blockHardness = 100F;
		this.setLightOpacity(3);
		setBlockName("redWaterStill");
		disableStats();
		setRequiresSelfNotify();
	}
	
	@Override
	public String getTextureFile() {
		return Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET;
	}
	
	@Override
	public void addCreativeItems(ArrayList itemList) {
		itemList.add(new ItemStack(this));
    }
}
