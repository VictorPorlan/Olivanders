from gilded_rose import *

if __name__ == '__main__':
    item = Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 3)
    print(item)
    for dia in range(1, 15):
        item.update_quality()
        print(item)