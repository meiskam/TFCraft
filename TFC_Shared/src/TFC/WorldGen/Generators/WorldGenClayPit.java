package TFC.WorldGen.Generators;

import java.util.Random;

import TFC.Core.TFC_Core;
import TFC.WorldGen.DataLayer;
import TFC.WorldGen.TFCBiome;
import TFC.WorldGen.TFCWorldChunkManager;

import net.minecraft.src.*;

public class WorldGenClayPit extends WorldGenerator
{
	/** The block ID for clay. */
	private int clayBlockId;
	private TFCBiome biome;

	/** The number of blocks to generate. */
	private int numberOfBlocks;

	public WorldGenClayPit(int par1, TFCBiome b)
	{
		biome = b;
		this.numberOfBlocks = par1;
	}

	public boolean generate(World world, Random par2Random, int i, int j, int k)
	{
		int var6 = par2Random.nextInt(this.numberOfBlocks - 2) + 2;
		byte var7 = 2;

		if(par2Random.nextInt(30) == 0 && j <= 147)
		{
			for (int xCoord = i - var6; xCoord <= i + var6; ++xCoord)
			{
				for (int zCoord = k - var6; zCoord <= k + var6; ++zCoord)
				{
					int var10 = xCoord - i;
					int var11 = zCoord - k;

					if (var10 * var10 + var11 * var11 <= var6 * var6)
					{
						for (int yCoord = j - var7; yCoord <= j + var7; ++yCoord)
						{
							int ID = world.getBlockId(xCoord, yCoord, zCoord);

							DataLayer rockLayer1 = ((TFCWorldChunkManager)world.getWorldChunkManager()).getRockLayerAt(xCoord, zCoord, 0);
							
							if (ID == TFCBlocks.terraDirt.blockID || ID == TFCBlocks.terraDirt2.blockID)
							{
								world.setBlockAndMetadata(xCoord, yCoord, zCoord, TFC_Core.getTypeForClay(rockLayer1.data2), TFC_Core.getMetaForGrass(rockLayer1.data1, rockLayer1.data2));
							}
							else if(ID == TFCBlocks.terraGrass.blockID || ID == TFCBlocks.terraGrass2.blockID)
							{
								world.setBlockAndMetadata(xCoord, yCoord, zCoord, TFC_Core.getTypeForClayGrass(rockLayer1.data2), TFC_Core.getMetaForGrass(rockLayer1.data1, rockLayer1.data2));
							}
						}
					}
				}
			}
		}

		return true;
	}
}
