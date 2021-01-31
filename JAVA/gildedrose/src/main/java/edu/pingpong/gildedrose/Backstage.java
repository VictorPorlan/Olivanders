package edu.pingpong.gildedrose;

public class Backstage extends NormalItem{
    public Backstage(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }
    @Override
    public void updateQuality() {
        if (getSell_in() > 10) {
            setQuality(1);
        }
        else if (getSell_in() > 5){
            setQuality(2);
        }

        else if (getSell_in() > 0){
            setQuality(3);
        }
        else {
            setQuality(0);
        }
    }