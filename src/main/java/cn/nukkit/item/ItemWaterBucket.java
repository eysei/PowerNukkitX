package cn.nukkit.item;

public class ItemWaterBucket extends ItemBucket {
    public ItemWaterBucket() {
        super(WATER_BUCKET);
    }

    @Override
    public int getBucketType() {
        return 8;
    }
}