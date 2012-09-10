package TFC.Containers;

import TFC.Items.ItemLogs;
import TFC.TileEntities.TileEntityTerraLogPile;
import net.minecraft.src.Block;
import net.minecraft.src.Container;
import net.minecraft.src.CraftingManager;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.InventoryCraftResult;
import net.minecraft.src.InventoryCrafting;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;
import net.minecraft.src.SlotCrafting;
import net.minecraft.src.World;

public class ContainerTerraLogPile extends Container
{
	private World world;
	private int posX;
	private int posY;
	private int posZ;
	private TileEntityTerraLogPile logpile;
	private EntityPlayer player;

	public ContainerTerraLogPile(InventoryPlayer playerinv, TileEntityTerraLogPile pile, World world, int x, int y, int z)
	{
		this.player = playerinv.player;
		this.logpile = pile;
		this.world = world;
		this.posX = x;
		this.posY = y;
		this.posZ = z;
		pile.openChest();

		layoutContainer(playerinv, pile, 0, 0);
	}

	/**
	 * Callback for when the crafting gui is closed.
	 */
	public void onCraftGuiClosed(EntityPlayer par1EntityPlayer)
	{
		super.onCraftGuiClosed(par1EntityPlayer);
		
		if(!world.isRemote)
		{
			logpile.closeChest();
		}
	}

	/**
	 * Called to transfer a stack from one inventory to the other eg. when shift clicking.
	 */
	public ItemStack transferStackInSlot(int par1)
	{
		ItemStack var2 = null;
		Slot var3 = (Slot)this.inventorySlots.get(par1);

		if (var3 != null && var3.getHasStack() && var3.getStack().getItem() instanceof ItemLogs)
		{
			ItemStack var4 = var3.getStack();
			var2 = var4.copy();

			if (par1 < 4)
			{
				if (!this.mergeItemStack(var4, 4, 40, true))
				{
					return null;
				}

			}
			else if (par1 >= 4 && par1 < 40)
			{
				if (!this.mergeItemStack(var4, 0, 4, false))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(var4, 4, 40, false))
			{
				return null;
			}

			if (var4.stackSize == 0)
			{
				var3.putStack((ItemStack)null);
			}
			else
			{
				var3.onSlotChanged();
			}

			if (var4.stackSize == var2.stackSize)
			{
				return null;
			}

			var3.onPickupFromSlot(var4);
		}

		return var2;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return true;
	}

	protected void layoutContainer(IInventory playerInventory, IInventory chestInventory, int xSize, int ySize) 
	{
		this.addSlotToContainer(new SlotLogPile(getPlayer(),chestInventory, 0, 71, 25));
		this.addSlotToContainer(new SlotLogPile(getPlayer(),chestInventory, 1, 89, 25));
		this.addSlotToContainer(new SlotLogPile(getPlayer(),chestInventory, 2, 71, 43));
		this.addSlotToContainer(new SlotLogPile(getPlayer(),chestInventory, 3, 89, 43));

		int row;
		int col;

		for (row = 0; row < 3; ++row)
		{
			for (col = 0; col < 9; ++col)
			{
				this.addSlotToContainer(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
			}
		}

		for (row = 0; row < 9; ++row)
		{
			this.addSlotToContainer(new Slot(playerInventory, row, 8 + row * 18, 142));
		}
	}
	public EntityPlayer getPlayer() {
		return player;
	}
	
    protected boolean mergeItemStack(ItemStack par1ItemStack, int par2, int par3, boolean par4)
    {
        boolean var5 = false;
        int var6 = par2;

        if (par4)
        {
            var6 = par3 - 1;
        }

        Slot var7;
        ItemStack var8;
        int stackSize = par1ItemStack.getMaxStackSize();

        if (par1ItemStack.isStackable())
        {
            while (par1ItemStack.stackSize > 0 && (!par4 && var6 < par3 || par4 && var6 >= par2))
            {
            	if(var6 < 4)
            		stackSize = 4;
            	else stackSize = par1ItemStack.getMaxStackSize();
                var7 = (Slot)this.inventorySlots.get(var6);
                var8 = var7.getStack();

                if (var8 != null && var8.itemID == par1ItemStack.itemID && (!par1ItemStack.getHasSubtypes() || par1ItemStack.getItemDamage() == var8.getItemDamage()) && ItemStack.func_77970_a(par1ItemStack, var8))
                {
                    int var9 = var8.stackSize + par1ItemStack.stackSize;

                    if (var9 <= stackSize)
                    {
                        par1ItemStack.stackSize = 0;
                        var8.stackSize = var9;
                        var7.onSlotChanged();
                        var5 = true;
                    }
                    else if (var8.stackSize < stackSize)
                    {
                        par1ItemStack.stackSize -= stackSize - var8.stackSize;
                        if(par1ItemStack.stackSize < 0)
                        	par1ItemStack.stackSize = 0;
                        var8.stackSize = stackSize;
                        var7.onSlotChanged();
                        var5 = true;
                    }
                }

                if (par4)
                {
                    --var6;
                }
                else
                {
                    ++var6;
                }
            }
        }

        if (par1ItemStack.stackSize > 0)
        {
            if (par4)
            {
                var6 = par3 - 1;
            }
            else
            {
                var6 = par2;
            }

            while (!par4 && var6 < par3 || par4 && var6 >= par2)
            {
            	if(var6 < 4)
            		stackSize = 4;
            	else stackSize = par1ItemStack.getMaxStackSize();
            	
                var7 = (Slot)this.inventorySlots.get(var6);
                var8 = var7.getStack();

                if (var8 == null)
                {
                    var7.putStack(par1ItemStack.copy());
                    var7.onSlotChanged();
                    par1ItemStack.stackSize -= stackSize;
                    var5 = true;
                    if(par1ItemStack.stackSize <= 0)
                    {
                    	par1ItemStack.stackSize = 0;
                    	break;
                    }
                }

                if (par4)
                {
                    --var6;
                }
                else
                {
                    ++var6;
                }
            }
        }

        return var5;
    }
}
