package JAVA.gildedrose.src.main.java.edu.pingpong.gildedrose;

public class Item {
    private final String name;
    private int sell_in;
    private int quality;

    Item(String name, int sell_in, int quality){
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    };
}
