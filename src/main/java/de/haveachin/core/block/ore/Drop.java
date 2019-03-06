package de.haveachin.core.block.ore;

import java.util.concurrent.ThreadLocalRandom;

import net.minecraft.item.Item;

public class Drop
{
	public final Item item;
	public final int min, max;
	public final float chance;
	
	public Drop(Item item)
	{
		this(item, 1, 1, 1);
	}
	
	public Drop(Item item, int min, int max)
	{
		this(item, min, max, 1);
	}
	
	public Drop(Item item, int min, int max, float chance)
	{
		this.item = item;
		this.min = min;
		this.max = max;
		
		if (chance > 1F)
			chance = 1F;
		else if (chance < 0F)
			chance = 0F;
		
		this.chance = chance;
	}
	
	public int drop()
	{
		if (ThreadLocalRandom.current().nextInt(1, 101) > (int) (chance * 100F))
			return 64;
		
		if (min < max)
			return ThreadLocalRandom.current().nextInt(min, max + 1);
		else if (min > max)
			return ThreadLocalRandom.current().nextInt(max, min + 1);

		return max;
	}
	
	public int drop(int fortune)
	{
		return drop() * ThreadLocalRandom.current().nextInt(1, fortune + 2);
	}
}