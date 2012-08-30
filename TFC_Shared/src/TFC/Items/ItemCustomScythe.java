package TFC.Items;

import java.util.List;

import TFC.Core.TFC_Settings;
import net.minecraft.src.*;

public class ItemCustomScythe extends ItemTool
{
    static Block[] blocks = {Block.blocksList[18]};
	private int weaponDamage;
	public ItemCustomScythe(int i, EnumToolMaterial e)
	{
		super(i, e.getDamageVsEntity(),e, blocks);
		this.setMaxDamage(e.getMaxUses()*3);
		this.weaponDamage = e.getDamageVsEntity();
		this.efficiencyOnProperMaterial = e.getEfficiencyOnProperMaterial();
	}

	public int getDamageVsEntity(Entity par1Entity)
	{
		return this.weaponDamage;
	}

	public String getTextureFile() {
		return "/bioxx/terratools.png";
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}
	public void addInformation(ItemStack is, List arraylist) 
    {
        if(TFC_Settings.enableDebugMode)
            arraylist.add("Damage: "+is.getItemDamage());
    }
}