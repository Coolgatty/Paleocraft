package bladeking68.paleocraft.dimension;



import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fisherman77.paleocraft.common.Paleocraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPortalPaleocraft extends BlockBreakable {
public BlockPortalPaleocraft(int par1, int par2) {
super(par1, par2, Material.portal, false);
this.setTickRandomly(true);
this.setCreativeTab(Paleocraft.PaleocraftBlocks);
this.setHardness(-1.0F);
this.setStepSound(Block.soundGlassFootstep);
this.setBlockName("PaleoPortal");
}

@Override
public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
super.updateTick(par1World, par2, par3, par4, par5Random);

if (par1World.provider.isSurfaceWorld() && par5Random.nextInt(2000) < par1World.difficultySetting) {
int var6;

for (var6 = par3; !par1World.doesBlockHaveSolidTopSurface(par2, var6, par4) && var6 > 0; --var6) {
;
}

if (var6 > 0 && !par1World.isBlockNormalCube(par2, var6 + 1, par4)) {
Entity var7 = ItemMonsterPlacer.spawnCreature(par1World, 57, (double) par2 + 0.5D, (double) var6 + 1.1D, (double) par4 + 0.5D);
}
}
}

@Override
public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
return null;
}

@Override
public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
float var5;
float var6;

if (par1IBlockAccess.getBlockId(par2 - 1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2 + 1, par3, par4) != this.blockID) {
var5 = 0.125F;
var6 = 0.5F;
this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
} else {
var5 = 0.5F;
var6 = 0.125F;
this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
}
}

@Override
public boolean isOpaqueCube() {
return false;
}

@Override
public boolean renderAsNormalBlock() {
return false;
}

public static boolean tryToCreatePortal(World par1World, int par2, int par3, int par4) {
byte var5 = 0;
byte var6 = 0;

if (par1World.getBlockId(par2 - 1, par3, par4) == Block.cobblestoneMossy.blockID || par1World.getBlockId(par2 + 1, par3, par4) == Block.cobblestoneMossy.blockID) {
var5 = 1;
}

if (par1World.getBlockId(par2, par3, par4 - 1) == Block.cobblestoneMossy.blockID || par1World.getBlockId(par2, par3, par4 + 1) == Block.cobblestoneMossy.blockID) {
var6 = 1;
}

if (var5 == var6) {
return false;
} else {
if (par1World.getBlockId(par2 - var5, par3, par4 - var6) == 0) {
par2 -= var5;
par4 -= var6;
}

int var7;
int var8;

for (var7 = -1; var7 <= 2; ++var7) {
for (var8 = -1; var8 <= 3; ++var8) {
boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;

if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3) {
int var10 = par1World.getBlockId(par2 + var5 * var7, par3 + var8, par4 + var6 * var7);

if (var9) {
if (var10 != Block.cobblestoneMossy.blockID) {
return false;
}
}  else if (var10 != 0 && var10 != Paleocraft.portalPlacer2.blockID) {
return false;
}
}
}
}

par1World.editingBlocks = true;

for (var7 = 0; var7 < 2; ++var7) {
for (var8 = 0; var8 < 3; ++var8) {
par1World.setBlockWithNotify(par2 + var5 * var7, par3 + var8, par4 + var6 * var7, Paleocraft.PaleocraftPortal.blockID);
}
}

par1World.editingBlocks = false;
return true;
}
}

@Override
public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
byte var6 = 0;
byte var7 = 1;

if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID) {
var6 = 1;
var7 = 0;
}

int var8;

for (var8 = par3; par1World.getBlockId(par2, var8 - 1, par4) == this.blockID; --var8) {
;
}

if (par1World.getBlockId(par2, var8 - 1, par4) != Block.cobblestoneMossy.blockID) {
par1World.setBlockWithNotify(par2, par3, par4, 0);
} else {
int var9;

for (var9 = 1; var9 < 4 && par1World.getBlockId(par2, var8 + var9, par4) == this.blockID; ++var9) {
;
}

if (var9 == 3
&& par1World.getBlockId(par2, var8 + var9, par4) == Block.cobblestoneMossy.blockID) {
boolean var10 = par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID;
boolean var11 = par1World.getBlockId(par2, par3, par4 - 1) == this.blockID || par1World.getBlockId(par2, par3, par4 + 1) == this.blockID;

if (var10 && var11) {
par1World.setBlockWithNotify(par2, par3, par4, 0);
} else {
if ((par1World.getBlockId(par2 + var6, par3, par4 + var7) != Block.cobblestoneMossy.blockID || par1World.getBlockId(par2 - var6, par3, par4 - var7) != this.blockID) && (par1World.getBlockId(par2 - var6, par3, par4 - var7) != Block.cobblestoneMossy.blockID || par1World.getBlockId(par2 + var6, par3, par4 + var7) != this.blockID)) {
par1World.setBlockWithNotify(par2, par3, par4, 0);
}
}
} else {
par1World.setBlockWithNotify(par2, par3, par4, 0);
}
}
}

@Override
@SideOnly(Side.CLIENT)
public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
if (par1IBlockAccess.getBlockId(par2, par3, par4) == this.blockID) {
return false;
} else {
boolean var6 = par1IBlockAccess.getBlockId(par2 - 1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2 - 2, par3, par4) != this.blockID;
boolean var7 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2 + 2, par3, par4) != this.blockID;
boolean var8 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4 - 2) != this.blockID;
boolean var9 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4 + 2) != this.blockID;
boolean var10 = var6 || var7;
boolean var11 = var8 || var9;
return var10 && par5 == 4 ? true : (var10 && par5 == 5 ? true : (var11 && par5 == 2 ? true : var11 && par5 == 3));
}
}

@Override
public int quantityDropped(Random par1Random) {
return 0;
}

@Override
public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null && par5Entity instanceof EntityPlayerMP) {
if (par5Entity instanceof EntityPlayerMP) {
EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
if (par5Entity.dimension != Paleocraft.PaleocraftDimension) {
thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Paleocraft.PaleocraftDimension, new TeleporterPaleocraft(thePlayer.mcServer.worldServerForDimension(Paleocraft.PaleocraftDimension)));
} else {
if (par5Entity.dimension == Paleocraft.PaleocraftDimension) {
thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterPaleocraft(thePlayer.mcServer.worldServerForDimension(0)));
}
}
}
}
}

@Override
@SideOnly(Side.CLIENT)
public int getRenderBlockPass() {
return 1;
}

@Override
@SideOnly(Side.CLIENT)
public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
if (par5Random.nextInt(100) == 0) {
par1World.playSoundEffect((double) par2 + 0.5D, (double) par3 + 0.5D, (double) par4 + 0.5D, "portal.portal", 0.5F, par5Random.nextFloat() * 0.4F + 0.8F);
}

for (int var6 = 0; var6 < 4; ++var6) {
double var7 = (double) ((float) par2 + par5Random.nextFloat());
double var9 = (double) ((float) par3 + par5Random.nextFloat());
double var11 = (double) ((float) par4 + par5Random.nextFloat());
double var13 = 0.0D;
double var15 = 0.0D;
double var17 = 0.0D;
int var19 = par5Random.nextInt(2) * 2 - 1;
var13 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
var15 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
var17 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;

if (par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && par1World.getBlockId(par2 + 1, par3, par4) != this.blockID) {
var7 = (double) par2 + 0.5D + 0.25D * (double) var19;
var13 = (double) (par5Random.nextFloat() * 2.0F * (float) var19);
} else {
var11 = (double) par4 + 0.5D + 0.25D * (double) var19;
var17 = (double) (par5Random.nextFloat() * 2.0F * (float) var19);
}

par1World.spawnParticle("portal", var7, var9, var11, var13, var15, var17);
}
}

@Override
@SideOnly(Side.CLIENT)
public int idPicked(World par1World, int par2, int par3, int par4) {
return 0;
}

@Override
public String getTextureFile()
{
return "/Paleocraft/PaleocraftBlocks.png";
}}