package edu.pingpong.gildedrose;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ItemTest {

    @Test
    public void constructor_item(){
        Item item = new Item("+5 Dexterity Vest", 10, 10);
        assertNotNull(item);
    }
}
