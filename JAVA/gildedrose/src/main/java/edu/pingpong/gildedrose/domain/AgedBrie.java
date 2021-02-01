package edu.pingpong.gildedrose.domain;

public class AgedBrie extends NormalItem{
    public AgedBrie(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if(getSell_in() > 0) {
            setQuality(1);
        }
        else{
            setQuality(2);
        }
        setSell_in();
    }
}
