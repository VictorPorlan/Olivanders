from gilded_rose import *

if __name__ == '__main__':

    item = ConjuredItem("(Conjured) Elixir of Mongoose", 5, 13)
    print(item)
    for dia in range(1, 10):
        item.update_quality()
        print(item)