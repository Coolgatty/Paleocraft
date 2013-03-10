package fisherman77.zeuscraft.common.cbronze;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import fisherman77.zeuscraft.common.Zeuscraft;

public class WorldGeneratorCBronzeOre implements IWorldGenerator {

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

switch(world.provider.dimensionId) {

case -1:
generateNether(world, random, chunkX * 16, chunkZ * 16);
case 0:
generateSurface(world, random, chunkX * 16, chunkZ * 16);
}

}

private void generateNether(World world, Random random, int blockX, int blockZ) {


}

private void generateSurface(World world, Random random, int blockX, int blockZ) {

for (int i = 0; i < 8; i++) {

int Xcoord = blockX + random.nextInt(16);
int Ycoord = random.nextInt(45);
int Zcoord = blockZ + random.nextInt(16);

(new WorldGenMinable(Zeuscraft.CBronzeOre.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
}

}
}