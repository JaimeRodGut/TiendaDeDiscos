package org.iesfm.shop;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class ShopTest {
    private MusicShop musicShop;
    private TreeSet<Disk> disks;

    @Test
    public void getDisks()  {
        disks = new TreeSet<>();

        HashSet<String> genres = new HashSet<>();
        genres.add("Metal");

        disks.add(new Disk("","artist", new HashSet<>()));
        disks.add(new Disk("","artist2", genres));
        disks.add(new Disk("","artist3", new HashSet<>()));
    }

    @Test
    public void authorDisksTests() {
        HashMap<String, Disk> disks = new HashMap<String, Disk>();

        disks.put("name1", new Disk("name1","artist1",new HashSet<>());
        disks.put("name2", new Disk("name2","artist2",new HashSet<>());
        disks.put("name3", new Disk("name3","artist3",new HashSet<>());

        MusicShop musicShop = new MusicShop("name1", "addres1", disks, new HashMap<>()));

        TreeSet<Disk> author1Disks = musicShop.findAuthorDisks("artist1"));

        TreeSet<Disk> expectedDisks = new TreeSet<>();

        expectedDisks.add()

        Assert.assertEquals(expectedDisks, author1Disks);
    }
}
