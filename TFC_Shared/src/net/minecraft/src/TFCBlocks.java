package net.minecraft.src;

import java.io.File;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import TFC.Blocks.BlockChestTFC;
import TFC.Blocks.BlockCrop;
import TFC.Blocks.BlockCustomFlower;
import TFC.Blocks.BlockCustomIce;
import TFC.Blocks.BlockCustomLeaves;
import TFC.Blocks.BlockCustomMushroom;
import TFC.Blocks.BlockCustomReed;
import TFC.Blocks.BlockCustomSapling;
import TFC.Blocks.BlockCustomSnow;
import TFC.Blocks.BlockCustomStairs;
import TFC.Blocks.BlockCustomTallGrass;
import TFC.Blocks.BlockCustomVine;
import TFC.Blocks.BlockFiniteWater;
import TFC.Blocks.BlockFirepit;
import TFC.Blocks.BlockFruitLeaves;
import TFC.Blocks.BlockFruitWood;
import TFC.Blocks.BlockLooseRock;
import TFC.Blocks.BlockSlab;
import TFC.Blocks.BlockStair;
import TFC.Blocks.BlockStalactite;
import TFC.Blocks.BlockTerraAnvil;
import TFC.Blocks.BlockTerraBellows;
import TFC.Blocks.BlockTerraBloomery;
import TFC.Blocks.BlockTerraClayGrass;
import TFC.Blocks.BlockTerraClayGrass2;
import TFC.Blocks.BlockTerraFarmland;
import TFC.Blocks.BlockTerraForge;
import TFC.Blocks.BlockTerraGrass;
import TFC.Blocks.BlockTerraGrass2;
import TFC.Blocks.BlockTerraIgEx;
import TFC.Blocks.BlockTerraIgExCobble;
import TFC.Blocks.BlockTerraIgExSmooth;
import TFC.Blocks.BlockTerraIgIn;
import TFC.Blocks.BlockTerraIgInCobble;
import TFC.Blocks.BlockTerraIgInSmooth;
import TFC.Blocks.BlockTerraLogPile;
import TFC.Blocks.BlockTerraMM;
import TFC.Blocks.BlockTerraMMCobble;
import TFC.Blocks.BlockTerraMMSmooth;
import TFC.Blocks.BlockTerraMetallurgy;
import TFC.Blocks.BlockTerraMolten;
import TFC.Blocks.BlockTerraOre;
import TFC.Blocks.BlockTerraOre2;
import TFC.Blocks.BlockTerraOre3;
import TFC.Blocks.BlockTerraPeatGrass;
import TFC.Blocks.BlockTerraPlanks;
import TFC.Blocks.BlockTerraScribe;
import TFC.Blocks.BlockTerraSed;
import TFC.Blocks.BlockTerraSedCobble;
import TFC.Blocks.BlockTerraSedSmooth;
import TFC.Blocks.BlockTerraSluice;
import TFC.Blocks.BlockTerraSulfur;
import TFC.Blocks.BlockTerraWood;
import TFC.Blocks.BlockTerraWoodSupport;
import TFC.Blocks.BlockTerraWorkbench;
import TFC.Core.TFCSettings;
import TFC.TileEntities.TileEntityFruitTreeWood;
import TFC.TileEntities.TileEntityTerraAnvil;
import TFC.TileEntities.TileEntityTerraBloomery;
import TFC.TileEntities.TileEntityTerraFirepit;
import TFC.TileEntities.TileEntityTerraForge;
import TFC.TileEntities.TileEntityTerraLogPile;
import TFC.TileEntities.TileEntityTerraMetallurgy;
import TFC.TileEntities.TileEntityTerraScribe;
import TFC.TileEntities.TileEntityTerraSluice;
import TFC.TileEntities.TileEntityTerraWorkbench;

public class TFCBlocks 
{

	//////////////////////////////////////////////
	public static int sulfurRenderId;
	public static int woodFruitRenderId;
	public static int leavesFruitRenderId;
	public static int woodThickRenderId;
	public static int woodSupportRenderIdH;
	public static int woodSupportRenderIdV;
	public static int grassRenderId;
	public static int oreRenderId;
	public static int moltenRenderId;
	public static int looseRockRenderId;
	public static int snowRenderId;
	public static int terraFirepitRenderId;
	public static int terraAnvilRenderId;
	public static int terraBellowsRenderId;
	public static int terraScribeRenderId;
	public static int terraForgeRenderId;
	public static int sluiceRenderId;
	public static int toolRackRenderId;
	public static int finiteWaterRenderId;
	public static int partialRenderId;
	public static int stairRenderId;
	public static int slabRenderId;
	public static int cropRenderId;
	public static int cookingPitRenderId;
	public static int leavesRenderId;
	public static Block terraStoneIgIn;
	public static Block terraStoneIgEx;
	public static Block terraStoneSed;
	public static Block terraStoneMM;
	public static Block terraStoneIgInCobble;
	public static Block terraStoneIgExCobble;
	public static Block terraStoneSedCobble;
	public static Block terraStoneMMCobble;
	public static Block terraStoneIgInBrick;
	public static Block terraStoneIgExBrick;
	public static Block terraStoneSedBrick;
	public static Block terraStoneMMBrick;
	public static Block terraStoneIgInSmooth;
	public static Block terraStoneIgExSmooth;
	public static Block terraStoneSedSmooth;
	public static Block terraStoneMMSmooth;
	public static Block terraOre;
	public static Block terraOre2;
	public static Block terraOre3;
	public static Block terraSulfur;
	public static Block terraWood;
	public static Block terraLeaves;
	public static Block terraSapling;
	public static Block terraWoodSupportV;
	public static Block terraWoodSupportH;
	public static BlockTerraGrass terraGrass;
	public static BlockTerraGrass2 terraGrass2;
	public static Block terraDirt;
	public static Block terraDirt2;
	public static Block terraClay;
	public static Block terraClay2;
	public static BlockTerraClayGrass terraClayGrass;
	public static BlockTerraClayGrass2 terraClayGrass2;
	public static Block terraPeat;
	public static BlockTerraPeatGrass terraPeatGrass;
	public static Block LooseRock;
	public static Block LogPile;
	public static Block tilledSoil;
	public static Block tilledSoil2;
	public static Block finiteWater;
	public static Block terraFirepit;
	public static Block terraFirepitOn;
	public static Block terraBellows;
	public static Block terraAnvil;
	public static Block terraAnvil2;
	public static Block terraScribe;
	public static Block terraForge;
	public static Block terraForgeOn;
	public static Block terraBloomery;
	public static Block terraBloomeryOn;
	public static Block terraMetalTable;
	public static Block terraMolten;
	public static Block terraSluice;
	public static Block fruitTreeWood;
	public static Block fruitTreeLeaves;
	public static Block fruitTreeLeaves2;
	public static Block stoneStairs;
	public static Block stoneSlabs;
	public static Block stoneStalac;
	
	
	static Configuration config;
	
	public static void RegisterBlocks()
	{
		GameRegistry.registerBlock(terraOre, TFC.Items.ItemOre1.class);
		GameRegistry.registerBlock(terraOre2, TFC.Items.ItemOre2.class);
		GameRegistry.registerBlock(terraOre3, TFC.Items.ItemOre3.class);
		GameRegistry.registerBlock(terraStoneIgIn, TFC.Items.ItemIgIn.class);
		GameRegistry.registerBlock(terraStoneIgEx, TFC.Items.ItemIgEx.class);
		GameRegistry.registerBlock(terraStoneSed, TFC.Items.ItemSed.class);
		GameRegistry.registerBlock(terraStoneMM, TFC.Items.ItemMM.class);

		GameRegistry.registerBlock(terraStoneIgInCobble, TFC.Items.ItemIgInCobble.class);
		GameRegistry.registerBlock(terraStoneIgExCobble, TFC.Items.ItemIgExCobble.class);
		GameRegistry.registerBlock(terraStoneSedCobble, TFC.Items.ItemSedCobble.class);
		GameRegistry.registerBlock(terraStoneMMCobble, TFC.Items.ItemMMCobble.class);
		GameRegistry.registerBlock(terraStoneIgInSmooth, TFC.Items.ItemIgInCobble.class);
		GameRegistry.registerBlock(terraStoneIgExSmooth, TFC.Items.ItemIgExCobble.class);
		GameRegistry.registerBlock(terraStoneSedSmooth, TFC.Items.ItemSedCobble.class);
		GameRegistry.registerBlock(terraStoneMMSmooth, TFC.Items.ItemMMCobble.class);
		GameRegistry.registerBlock(terraStoneIgInBrick, TFC.Items.ItemIgInCobble.class);
		GameRegistry.registerBlock(terraStoneIgExBrick, TFC.Items.ItemIgExCobble.class);
		GameRegistry.registerBlock(terraStoneSedBrick, TFC.Items.ItemSedCobble.class);
		GameRegistry.registerBlock(terraStoneMMBrick, TFC.Items.ItemMMCobble.class);

		GameRegistry.registerBlock(terraDirt);
		GameRegistry.registerBlock(terraDirt2);
		GameRegistry.registerBlock(terraClay);
		GameRegistry.registerBlock(terraClay2);
		GameRegistry.registerBlock(terraGrass);
		GameRegistry.registerBlock(terraGrass2);
		GameRegistry.registerBlock(terraClayGrass);
		GameRegistry.registerBlock(terraClayGrass2);
		GameRegistry.registerBlock(terraPeatGrass);
		GameRegistry.registerBlock(terraPeat);
		GameRegistry.registerBlock(LooseRock);
		GameRegistry.registerBlock(LogPile);

		GameRegistry.registerBlock(tilledSoil);
		GameRegistry.registerBlock(tilledSoil2);

		GameRegistry.registerBlock(finiteWater);

		GameRegistry.registerBlock(terraWoodSupportV);
		GameRegistry.registerBlock(terraWoodSupportH);
		GameRegistry.registerBlock(terraSulfur);
		GameRegistry.registerBlock(Block.wood, TFC.Items.ItemCustomWood.class);
		GameRegistry.registerBlock(Block.leaves, TFC.Items.ItemCustomLeaves.class);
		GameRegistry.registerBlock(Block.sapling, TFC.Items.ItemSapling.class);
		GameRegistry.registerBlock(Block.planks, TFC.Items.ItemTerraPlanks.class);

		GameRegistry.registerBlock(terraFirepit);
		GameRegistry.registerBlock(terraBellows);
		GameRegistry.registerBlock(terraAnvil);
		GameRegistry.registerBlock(terraScribe);
		GameRegistry.registerBlock(terraForge);
		GameRegistry.registerBlock(terraMetalTable);
		GameRegistry.registerBlock(terraMolten);
		GameRegistry.registerBlock(terraBloomery);
		GameRegistry.registerBlock(terraSluice);

		GameRegistry.registerBlock(fruitTreeWood);
		GameRegistry.registerBlock(fruitTreeLeaves);
		GameRegistry.registerBlock(fruitTreeLeaves2);

		GameRegistry.registerBlock(stoneStairs);
		GameRegistry.registerBlock(stoneSlabs);
		GameRegistry.registerBlock(stoneStalac);

		TFCBlocks.terraGrass.setIDs(TFCBlocks.terraGrass.blockID, TFCBlocks.terraGrass2.blockID, TFCBlocks.terraDirt.blockID, TFCBlocks.terraDirt2.blockID, 
				TFCBlocks.terraClay.blockID, TFCBlocks.terraClay2.blockID, TFCBlocks.terraClayGrass.blockID, TFCBlocks.terraClayGrass2.blockID, TFCBlocks.terraPeat.blockID, TFCBlocks.terraPeatGrass.blockID);
		TFCBlocks.terraGrass2.setIDs(TFCBlocks.terraGrass.blockID, TFCBlocks.terraGrass2.blockID, TFCBlocks.terraDirt.blockID, TFCBlocks.terraDirt2.blockID, 
				TFCBlocks.terraClay.blockID, TFCBlocks.terraClay2.blockID, TFCBlocks.terraClayGrass.blockID, TFCBlocks.terraClayGrass2.blockID, TFCBlocks.terraPeat.blockID, TFCBlocks.terraPeatGrass.blockID);
		TFCBlocks.terraClayGrass.setIDs(TFCBlocks.terraGrass.blockID, TFCBlocks.terraGrass2.blockID, TFCBlocks.terraDirt.blockID, TFCBlocks.terraDirt2.blockID, 
				TFCBlocks.terraClay.blockID, TFCBlocks.terraClay2.blockID, TFCBlocks.terraClayGrass.blockID, TFCBlocks.terraClayGrass2.blockID, TFCBlocks.terraPeat.blockID, TFCBlocks.terraPeatGrass.blockID);
		TFCBlocks.terraClayGrass2.setIDs(TFCBlocks.terraGrass.blockID, TFCBlocks.terraGrass2.blockID, TFCBlocks.terraDirt.blockID, TFCBlocks.terraDirt2.blockID, 
				TFCBlocks.terraClay.blockID, TFCBlocks.terraClay2.blockID, TFCBlocks.terraClayGrass.blockID, TFCBlocks.terraClayGrass2.blockID, TFCBlocks.terraPeat.blockID, TFCBlocks.terraPeatGrass.blockID);
		TFCBlocks.terraPeatGrass.setIDs(TFCBlocks.terraGrass.blockID, TFCBlocks.terraGrass2.blockID, TFCBlocks.terraDirt.blockID, TFCBlocks.terraDirt2.blockID, 
				TFCBlocks.terraClay.blockID, TFCBlocks.terraClay2.blockID, TFCBlocks.terraClayGrass.blockID, TFCBlocks.terraClayGrass2.blockID, TFCBlocks.terraPeat.blockID, TFCBlocks.terraPeatGrass.blockID);

	}
	
	public static void LoadBlocks()
	{
		try
		{
			config = new Configuration(new File(TerraFirmaCraft.proxy.getMinecraftDir(), "/config/TFC.cfg"));
			config.load();
		} catch (Exception e) {
			System.out.println(new StringBuilder().append("[TFC] Error while trying to access block configuration: " + e.getLocalizedMessage()).toString());
			config = null;
		}

		System.out.println(new StringBuilder().append("[TFC] Loading Blocks").toString());

		TFCBlocks.terraStoneIgInCobble = new BlockTerraIgInCobble(TFCSettings.getIntFor(config,"block","terraStoneIgInCobble", 198), Material.rock).setHardness(10F).setResistance(10F).setBlockName("IgInRockCobble");
		TFCBlocks.terraStoneIgIn = new BlockTerraIgIn(TFCSettings.getIntFor(config,"block","TerraIgIn", 209), Material.rock, TFCBlocks.terraStoneIgInCobble.blockID).setHardness(10F).setResistance(10F).setBlockName("IgInRock");	
		TFCBlocks.terraStoneIgInSmooth = new BlockTerraIgInSmooth(TFCSettings.getIntFor(config,"block","terraStoneIgInSmooth", 182), 48).setHardness(10F).setResistance(20F).setBlockName("IgInRockSmooth");
		TFCBlocks.terraStoneIgInBrick = new BlockTerraIgInSmooth(TFCSettings.getIntFor(config,"block","terraStoneIgInBrick", 186), 32).setHardness(10F).setResistance(15F).setBlockName("IgInRockBrick");

		TFCBlocks.terraStoneSedCobble = new BlockTerraSedCobble(TFCSettings.getIntFor(config,"block","terraStoneSedCobble", 199), Material.rock).setHardness(10F).setResistance(10F).setBlockName("SedRockCobble");
		TFCBlocks.terraStoneSed = new BlockTerraSed(TFCSettings.getIntFor(config,"block","TerraSed", 210), Material.rock, TFCBlocks.terraStoneSedCobble.blockID).setHardness(10F).setResistance(7F).setBlockName("SedRock");
		TFCBlocks.terraStoneSedSmooth = new BlockTerraSedSmooth(TFCSettings.getIntFor(config,"block","terraStoneSedSmooth", 183), 112).setHardness(10F).setResistance(20F).setBlockName("SedRockSmooth");
		TFCBlocks.terraStoneSedBrick = new BlockTerraSedSmooth(TFCSettings.getIntFor(config,"block","terraStoneSedBrick", 187), 96).setHardness(10F).setResistance(15F).setBlockName("SedRockBrick");

		TFCBlocks.terraStoneIgExCobble = new BlockTerraIgExCobble(TFCSettings.getIntFor(config,"block","terraStoneIgExCobble", 200), Material.rock).setHardness(10F).setResistance(10F).setBlockName("IgExRockCobble");
		TFCBlocks.terraStoneIgEx = new BlockTerraIgEx(TFCSettings.getIntFor(config,"block","TerraIgEx", 211), Material.rock, TFCBlocks.terraStoneIgExCobble.blockID).setHardness(10F).setResistance(10F).setBlockName("IgExRock");
		TFCBlocks.terraStoneIgExSmooth = new BlockTerraIgExSmooth(TFCSettings.getIntFor(config,"block","terraStoneIgExSmooth", 184), 51).setHardness(10F).setResistance(20F).setBlockName("IgExRockSmooth");
		TFCBlocks.terraStoneIgExBrick = new BlockTerraIgExSmooth(TFCSettings.getIntFor(config,"block","terraStoneIgExBrick", 188), 35).setHardness(1F).setResistance(15F).setBlockName("IgExRockBrick");

		TFCBlocks.terraStoneMMCobble = new BlockTerraMMCobble(TFCSettings.getIntFor(config,"block","terraStoneMMCobble", 201), Material.rock).setHardness(10F).setResistance(10F).setBlockName("MMRockCobble");
		TFCBlocks.terraStoneMM = new BlockTerraMM(TFCSettings.getIntFor(config,"block","TerraMM", 212), Material.rock, TFCBlocks.terraStoneMMCobble.blockID).setHardness(10F).setResistance(8F).setBlockName("MMRock");
		TFCBlocks.terraStoneMMSmooth = new BlockTerraMMSmooth(TFCSettings.getIntFor(config,"block","terraStoneMMSmooth", 185), 122).setHardness(10F).setResistance(20F).setBlockName("MMRockSmooth");
		TFCBlocks.terraStoneMMBrick = new BlockTerraMMSmooth(TFCSettings.getIntFor(config,"block","terraStoneMMBrick", 189), 106).setHardness(10F).setResistance(15F).setBlockName("MMRockBrick");

		TFCBlocks.terraDirt = (new TFC.Blocks.BlockTerraDirt(TFCSettings.getIntFor(config,"block","terraDirt", 190), 112,TFCBlocks.tilledSoil)).setHardness(2F).setStepSound(Block.soundGravelFootstep).setBlockName("dirt");
		TFCBlocks.terraDirt2 = (new TFC.Blocks.BlockTerraDirt2(TFCSettings.getIntFor(config,"block","terraDirt2", 191), 128,TFCBlocks.tilledSoil2)).setHardness(2F).setStepSound(Block.soundGravelFootstep).setBlockName("dirt");
		TFCBlocks.terraClay = (new TFC.Blocks.BlockTerraClay(TFCSettings.getIntFor(config,"block","terraClay", 192), 144)).setHardness(3F).setStepSound(Block.soundGravelFootstep).setBlockName("clay");
		TFCBlocks.terraClay2 = (new TFC.Blocks.BlockTerraClay2(TFCSettings.getIntFor(config,"block","terraClay2", 193), 160)).setHardness(3F).setStepSound(Block.soundGravelFootstep).setBlockName("clay");
		TFCBlocks.terraClayGrass = (BlockTerraClayGrass) (new TFC.Blocks.BlockTerraClayGrass(TFCSettings.getIntFor(config,"block","terraClayGrass", 194), 144, TFCBlocks.terraClay)).setHardness(3F).setStepSound(Block.soundGrassFootstep).setBlockName("ClayGrass"); 
		TFCBlocks.terraClayGrass2 = (BlockTerraClayGrass2) (new TFC.Blocks.BlockTerraClayGrass2(TFCSettings.getIntFor(config,"block","terraClayGrass2", 195), 160, TFCBlocks.terraClay2)).setHardness(3F).setStepSound(Block.soundGrassFootstep).setBlockName("ClayGrass"); 
		TFCBlocks.terraGrass = (BlockTerraGrass) (new TFC.Blocks.BlockTerraGrass(TFCSettings.getIntFor(config,"block","terraGrass", 196), 112, TFCBlocks.terraDirt)).setHardness(2F).setStepSound(Block.soundGrassFootstep).setBlockName("Grass");
		TFCBlocks.terraGrass2 = (BlockTerraGrass2) (new TFC.Blocks.BlockTerraGrass2(TFCSettings.getIntFor(config,"block","terraGrass2", 197), 128, TFCBlocks.terraDirt2)).setHardness(2F).setStepSound(Block.soundGrassFootstep).setBlockName("Grass");  
		TFCBlocks.terraPeat = (new TFC.Blocks.BlockTerraPeat(TFCSettings.getIntFor(config,"block","terraPeat", 180), 135)).setHardness(3F).setStepSound(Block.soundGravelFootstep).setBlockName("peat");
		TFCBlocks.terraPeatGrass = (BlockTerraPeatGrass)(new TFC.Blocks.BlockTerraPeatGrass(TFCSettings.getIntFor(config,"block","terraPeatGrass", 181), 135, TFCBlocks.terraPeat)).setHardness(3F).setStepSound(Block.soundGrassFootstep).setBlockName("PeatGrass");

		TFCBlocks.terraOre = new BlockTerraOre(TFCSettings.getIntFor(config,"block","TerraOre", 213), Material.rock).setHardness(10F).setResistance(10F).setBlockName("Ore");
		TFCBlocks.terraOre2 = new BlockTerraOre2(TFCSettings.getIntFor(config,"block","TerraOre2", 214), Material.rock).setHardness(10F).setResistance(10F).setBlockName("Ore");
		TFCBlocks.terraOre3 = new BlockTerraOre3(TFCSettings.getIntFor(config,"block","TerraOre3", 215), Material.rock).setHardness(10F).setResistance(10F).setBlockName("Ore");
		TFCBlocks.LooseRock = new BlockLooseRock(TFCSettings.getIntFor(config,"block","LooseRock", 179)).setHardness(0.05F).setResistance(1F).setBlockName("LooseRock");
		TFCBlocks.LogPile = new BlockTerraLogPile(TFCSettings.getIntFor(config,"block","LogPile", 178), TileEntityTerraLogPile.class).setHardness(10F).setResistance(1F).setBlockName("LogPile");

		TFCBlocks.terraSulfur = new BlockTerraSulfur(TFCSettings.getIntFor(config,"block","TerraSulfur", 208), Material.rock).setBlockName("Sulfur").setHardness(0.5F).setResistance(1F);
		TFCBlocks.terraWoodSupportV = new BlockTerraWoodSupport(TFCSettings.getIntFor(config,"block","terraWoodSupportV", 203), Material.wood).setBlockName("WoodSupportV").setHardness(0.5F).setResistance(1F);
		TFCBlocks.terraWoodSupportH = new BlockTerraWoodSupport(TFCSettings.getIntFor(config,"block","terraWoodSupportH", 202), Material.wood).setBlockName("WoodSupportH").setHardness(0.5F).setResistance(1F);

		TFCBlocks.tilledSoil = new BlockTerraFarmland(TFCSettings.getIntFor(config,"block","tilledSoil", 177), TFCBlocks.terraDirt.blockID).setHardness(2F).setStepSound(Block.soundGravelFootstep).setBlockName("tilledSoil");
		TFCBlocks.tilledSoil2 = new BlockTerraFarmland(TFCSettings.getIntFor(config,"block","tilledSoil2", 176), TFCBlocks.terraDirt2.blockID).setHardness(2F).setStepSound(Block.soundGravelFootstep).setBlockName("tilledSoil2");

		TFCBlocks.fruitTreeWood = new BlockFruitWood(TFCSettings.getIntFor(config,"block","fruitTreeWood", 175), 0, TileEntityFruitTreeWood.class).setBlockName("fruitTreeWood").setHardness(5.5F).setResistance(2F);
		TFCBlocks.fruitTreeLeaves = new BlockFruitLeaves(TFCSettings.getIntFor(config,"block","fruitTreeLeaves", 174), 48).setBlockName("fruitTreeLeaves").setHardness(0.5F).setResistance(1F).setStepSound(Block.soundGrassFootstep);
		TFCBlocks.fruitTreeLeaves2 = new BlockFruitLeaves(TFCSettings.getIntFor(config,"block","fruitTreeLeaves2", 173), 56).setBlockName("fruitTreeLeaves2").setHardness(0.5F).setResistance(1F).setStepSound(Block.soundGrassFootstep);

		Block.blocksList[5] = null;
		Block.blocksList[6] = null;
		//Block.blocksList[8] = null;
		//Block.blocksList[9] = null;
		Block.blocksList[17] = null;
		Block.blocksList[18] = null;
		Block.blocksList[31] = null;
		Block.blocksList[37] = null;
		Block.blocksList[38] = null;
		Block.blocksList[39] = null;
		Block.blocksList[40] = null;
		Block.blocksList[53] = null;
		Block.blocksList[54] = null;
		Block.blocksList[58] = null;
		Block.blocksList[59] = null;
		Block.blocksList[78] = null;
		Block.blocksList[79] = null;
		Block.blocksList[83] = null;
		Block.blocksList[106] = null;

		Block.blocksList[5] = (new BlockTerraPlanks(5, Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("wood").setRequiresSelfNotify();
		Block.blocksList[6] = (new BlockCustomSapling(6, 160)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("sapling").setRequiresSelfNotify();
		//Block.blocksList[8]= (new BlockCustomFlowing(8, Material.water)).setHardness(100.0F).setLightOpacity(3).setBlockName("water").disableStats().setRequiresSelfNotify();
		//Block.blocksList[9] = (new BlockCustomStationary(9, Material.water)).setHardness(100.0F).setLightOpacity(3).setBlockName("water").disableStats().setRequiresSelfNotify();
		Block.blocksList[17] = (new BlockTerraWood(17)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("log").setRequiresSelfNotify();
		Block.blocksList[18] = (new BlockCustomLeaves(18, 96)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setBlockName("leaves").setRequiresSelfNotify();
		Block.blocksList[31] = (BlockTallGrass)(new BlockCustomTallGrass(31, 39)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("tallgrass");
		Block.blocksList[37] = (BlockFlower)(new BlockCustomFlower(37, 13)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("flower");
		Block.blocksList[38] = (BlockFlower)(new BlockCustomFlower(38, 12)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("rose");
		Block.blocksList[39] = (BlockFlower)(new BlockCustomMushroom(39, 29)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setLightValue(0.125F).setBlockName("mushroom");
		Block.blocksList[40] = (BlockFlower)(new BlockCustomMushroom(40, 28)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("mushroom");
		Block.blocksList[53] = (new BlockCustomStairs(53, Block.planks)).setBlockName("stairsWood").setRequiresSelfNotify();
		Block.blocksList[54] = (new BlockChestTFC(54)).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setBlockName("chest").setRequiresSelfNotify();
		Block.blocksList[58] = (new BlockTerraWorkbench(58, TileEntityTerraWorkbench.class)).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setBlockName("workbench");
		Block.blocksList[59] = (new BlockCrop(59, 88)).setHardness(0.3F).setStepSound(Block.soundGrassFootstep).setBlockName("crops").disableStats().setRequiresSelfNotify();
		Block.blocksList[78] = (new BlockCustomSnow(78, 66)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("snow").setLightOpacity(1);
		Block.blocksList[79] = (new BlockCustomIce(79, 67)).setHardness(0.5F).setLightOpacity(3).setStepSound(Block.soundGlassFootstep).setBlockName("ice");
		Block.blocksList[83] = (new BlockCustomReed(83, 73)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("reeds").disableStats();
		Block.blocksList[106] = (new BlockCustomVine(106)).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setBlockName("vine").setRequiresSelfNotify();


		TFCBlocks.terraWood = Block.blocksList[17];
		TFCBlocks.terraLeaves = Block.blocksList[18];
		TFCBlocks.terraSapling = Block.blocksList[6];

		TFCBlocks.finiteWater = new BlockFiniteWater(TFCSettings.getIntFor(config,"block","bucketWater", 224)).setHardness(100.0F).setLightOpacity(3).disableStats().setRequiresSelfNotify().setBlockName("bucketWater");

		TFCBlocks.terraFirepit = new BlockFirepit(TFCSettings.getIntFor(config,"block","terraFirepit", 207), TileEntityTerraFirepit.class, 80).setBlockName("terraFirepit").setHardness(1).setLightValue(0F);
		TFCBlocks.terraBellows = new BlockTerraBellows(TFCSettings.getIntFor(config,"block","terraBellows", 206),Material.wood).setBlockName("terraBellows").setHardness(2);
		TFCBlocks.terraForge= new BlockTerraForge(TFCSettings.getIntFor(config,"block","terraForge", 216), TileEntityTerraForge.class, 90).setBlockName("terraForge").setHardness(20).setLightValue(0F);
		TFCBlocks.terraScribe = new BlockTerraScribe(TFCSettings.getIntFor(config,"block","terraScribe", 204), TileEntityTerraScribe.class).setBlockName("terraScribe").setHardness(2);
		TFCBlocks.terraAnvil = new BlockTerraAnvil(TFCSettings.getIntFor(config,"block","terraAnvil", 205),192, TileEntityTerraAnvil.class).setBlockName("terraAnvil").setHardness(3);
		TFCBlocks.terraAnvil2 = new BlockTerraAnvil(TFCSettings.getIntFor(config,"block","terraAnvil2", 225),208, TileEntityTerraAnvil.class).setBlockName("terraAnvil2").setHardness(3);

		TFCBlocks.terraMetalTable = new BlockTerraMetallurgy(TFCSettings.getIntFor(config,"block","terraMetallurgy", 218), TileEntityTerraMetallurgy.class).setBlockName("terraMetallurgy").setHardness(3);
		TFCBlocks.terraMolten = new BlockTerraMolten(TFCSettings.getIntFor(config,"block","terraMolten", 219)).setBlockName("terraMolten").setHardness(20);
		TFCBlocks.terraBloomery = new BlockTerraBloomery(TFCSettings.getIntFor(config,"block","terraBloomery", 220), TileEntityTerraBloomery.class, 65).setBlockName("terraBloomery").setHardness(20).setLightValue(0F);
		TFCBlocks.terraBloomeryOn = new BlockTerraBloomery(TFCSettings.getIntFor(config,"block","terraBloomeryOn", 221), TileEntityTerraBloomery.class, 66).setBlockName("terraBloomeryOn").setHardness(20).setLightValue(1.0F);
		TFCBlocks.terraFirepitOn = new BlockFirepit(TFCSettings.getIntFor(config,"block","terraFirepitOn", 222), TileEntityTerraFirepit.class, 81).setBlockName("terraFirepitOn").setHardness(1).setLightValue(1.0F);
		TFCBlocks.terraForgeOn = new BlockTerraForge(TFCSettings.getIntFor(config,"block","terraForgeOn", 223), TileEntityTerraForge.class, 91).setBlockName("terraForgeOn").setHardness(20).setLightValue(1.0F);
		TFCBlocks.terraSluice = new BlockTerraSluice(TFCSettings.getIntFor(config,"block","TerraSluice", 217), TileEntityTerraSluice.class).setBlockName("Sluice").setHardness(2F).setResistance(20F);

		TFCBlocks.stoneStairs = new BlockStair(TFCSettings.getIntFor(config,"block","stoneStairs", 2000)).setBlockName("stoneStairs").setRequiresSelfNotify().setHardness(5).setResistance(15F);
		TFCBlocks.stoneSlabs = new BlockSlab(TFCSettings.getIntFor(config,"block","stoneSlabs", 2001)).setBlockName("stoneSlabs").setRequiresSelfNotify().setHardness(5).setResistance(15F);
		TFCBlocks.stoneStalac = new BlockStalactite(TFCSettings.getIntFor(config,"block","stoneStalac", 2002)).setBlockName("stoneStalac").setRequiresSelfNotify().setHardness(5);

		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraStoneIgIn, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraStoneIgEx, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraStoneSed, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraStoneMM, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.stoneStalac, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraOre2, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraOre3, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraDirt, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraDirt2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraGrass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraGrass2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraClay, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraClay2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraClayGrass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraClayGrass2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraWood, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraPeat, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.terraPeatGrass, "shovel", 0);

		if (config != null) {
			config.save();
		}
	}
	
}