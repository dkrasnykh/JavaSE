package com.mera.training.advanced.practice7;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static Collection<ShopItem> hypermarket = new ArrayList<>();
    public static Collection<ElectronicItem> electronicStore = new ArrayList<>();
    public static Collection<FoodItem> productStore = new ArrayList<>();
    public static Collection<Apple> stall = new ArrayList<>(); //ларек

    public static void main(String[] args) {

        ElectronicFabric electronicFabric = new ElectronicFabric();
        electronicFabric.fillShopWithElectronicGoods(hypermarket);
        electronicFabric.fillShopWithElectronicGoods(electronicStore);

        AppleGarden appleGarden = new AppleGarden();
        appleGarden.fillShopWithApples(productStore);
        appleGarden.fillShopWithApples(hypermarket);
        appleGarden.fillShopWithApples(stall);

        FoodFactory foodFactory = new FoodFactory();
        foodFactory.fillShopWithFood(productStore);
        foodFactory.fillShopWithFood(hypermarket);

        ElectronicAddictedVisitor electronicVisitor = new ElectronicAddictedVisitor();
        electronicVisitor.visitShop(electronicStore);

        ImJustLookingVisitor justLookingVisitor = new ImJustLookingVisitor();
        justLookingVisitor.visitShop(hypermarket);

        RichVisitor richVisitor = new RichVisitor();
        richVisitor.visitShop(productStore);
    }
}
