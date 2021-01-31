package edu.pingpong.gildedrose;

import javax.lang.model.element.Name;

public class ConjuredItem implements Updateable{
    
    private Item item = null;

    ConjuredItem(String name, int sell_in, int quality){
        this.item = new Item(name, sell_in, quality);
    }

    @Override
    public String toString(){
        return item.toString();
    }

    Item getItem(){
        return this.item;
    }

    public String getName(){
        return item.getName();
    }

    public int getSell_in(){
        return item.getSell_in();
    }

    void setSell_in(){
        item.setSell_in();
    }

    public int getQuality(){
        return item.getQuality();
    }

    void setQuality(int valor){
        if(getQuality() + valor > 50){
            item.setQuality(50);
        }
        else if(getQuality() + valor >= 0){
            item.setQuality(getQuality + valor);
        }
        else{
            item.setQuality(0);
        }
    }

    @Override
    public void updateQuality(){
        if(getSell_in() > 0){
            setQuality(-2);
        }
        else{
            setQuality(-4);
        }
        setSell_in();
    }
}
