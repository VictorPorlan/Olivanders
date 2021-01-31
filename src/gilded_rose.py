class Inventory:
    def __init__(self, items):
        self.items = items
    
    def update_inventory(self):
        for item in self.items:
            item.update_quality()

class Item:
    def __init__ (self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality
    
    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)


class Updateable:
    def update_quality(self):
        pass

class NormalItem(Item, Updateable):
    def __init__(self, name, sell_in, quality):
        Item.__init__(self, name, sell_in, quality)

    def setSell_in(self):
        self.sell_in -= 1

    def setQuality(self, valor):
        if self.quality + valor > 50:
            self.quality = 50
        elif self.quality + valor >= 0:
            self.quality = self.quality + valor
        else:
            self.quality = 0
            
    def update_quality(self):
        if self.sell_in > 0:
            self.Quality(-1)
        else:
            self.Quality(-2)
        self.setSell_in()           

class ConjuredItem(NormalItem):
    def __init__(self, name, sell_in, quality):
        Item.__init__(self, name, sell_in, quality)
    
    def setSell_in(self):
        NormalItem.setSell_in()

    def setQuality(self, valor):
        NormalItem.setQuality(self,valor)

    def update_quality(self):
        if self.sell_in > 0:
            self.setQuality(-2)
        else:
            self.setQuality(-4)
        self.setSell_in()

class AgedBrie (Item, Updateable):
    def __init__(self, name, sell_in, quality):
        NormalItem.__init__(self, name, sell_in, quality)

    def update_quality(self):
        if self.sell_in > 0:
            self.setQuality(1)
        else:
            self.setQuality(1)
        self.setSell_in()
