import org.example.Product;
import org.example.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopTest {
    private Shop shop;

//    private Product product;

    List<Product> products = Arrays.asList(
            new Product("Fromage blanc"),
            new Product("Chocolat"),
            new Product("Brie vieilli"));

    @Before
    public void setUp(){
        shop = new Shop(products);
    }

    @Test
    public void WhenSellIn_0_ThenQualityDecreaseTwiceAsQuickly(){


    }

/*
    @Test
    public void rechercheWhenLess_2_Char_Raise_NotFoundException(){
        //Arrange
        String myChar = "v";

        //Assert
        Assert.assertThrows(NotFoundException.class,()->{
            rechercheVille.recherche(myChar);
        });
    }*/

    //Une fois la date de péremption est à zéro, la qualité se dégrade deux fois plus vite.
    //La qualité d'un article n'est jamais négative.
    //La qualité d'un article n'est jamais supérieure à 50.
    //La qualité du « brie vieilli » augmente à mesure qu'il vieillit.
    //Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux

}
