package TFC.WorldGen.GenLayers;

import TFC.WorldGen.TFCBiome;
import net.minecraft.src.GenLayer;
import net.minecraft.src.IntCache;

public class GenLayerShoreTFC extends GenLayerTFC
{
    public GenLayerShoreTFC(long par1, GenLayer par3GenLayer)
    {
        super(par1);
        this.parent = (GenLayerTFC) par3GenLayer;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int[] var5 = this.parent.getInts(par1 - 1, par2 - 1, par3 + 2, par4 + 2);
        int[] var6 = IntCache.getIntCache(par3 * par4);

        for (int var7 = 0; var7 < par4; ++var7)
        {
            for (int var8 = 0; var8 < par3; ++var8)
            {
                this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
                int var9 = var5[var8 + 1 + (var7 + 1) * (par3 + 2)];
                int var10;
                int var11;
                int var12;
                int var13;

                if (var9 == TFCBiome.mushroomIsland.biomeID)
                {
                    var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                    var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                    var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                    var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                    if (var10 != TFCBiome.ocean.biomeID && var11 != TFCBiome.ocean.biomeID && var12 != TFCBiome.ocean.biomeID && var13 != TFCBiome.ocean.biomeID)
                    {
                        var6[var8 + var7 * par3] = var9;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = TFCBiome.mushroomIslandShore.biomeID;
                    }
                }
                else if (var9 != TFCBiome.ocean.biomeID && var9 != TFCBiome.river.biomeID && var9 != TFCBiome.swampland.biomeID && var9 != TFCBiome.extremeHills.biomeID)
                {
                    var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                    var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                    var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                    var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                    if (var10 != TFCBiome.ocean.biomeID && var11 != TFCBiome.ocean.biomeID && var12 != TFCBiome.ocean.biomeID && var13 != TFCBiome.ocean.biomeID)
                    {
                        var6[var8 + var7 * par3] = var9;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = TFCBiome.beach.biomeID;
                    }
                }
                else if (var9 == TFCBiome.extremeHills.biomeID)
                {
                    var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                    var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                    var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                    var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                    if (var10 == TFCBiome.extremeHills.biomeID && var11 == TFCBiome.extremeHills.biomeID && var12 == TFCBiome.extremeHills.biomeID && var13 == TFCBiome.extremeHills.biomeID)
                    {
                        var6[var8 + var7 * par3] = var9;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = TFCBiome.extremeHillsEdge.biomeID;
                    }
                }
                else
                {
                    var6[var8 + var7 * par3] = var9;
                }
            }
        }

        return var6;
    }
}
