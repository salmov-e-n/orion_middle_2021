package lection7.task1.visitors;

import lection7.task1.items.ShopItem;

import java.util.List;

public interface ShopVisitor {
    void visitShop(List<? extends ShopItem> shopItems);
}
