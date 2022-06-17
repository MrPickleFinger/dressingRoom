import material.DestinyAPI;
import material.clan.Clan;
import material.inventory.DestinyItem;
import material.stats.character.UserStats;
import material.inventory.InventoryManager;
import material.user.DestinyCharacter;

import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.awt.event.ItemListener;
import java.sql.Array;
import java.util.ArrayList;
import java.awt.List;
import java.util.Arrays;

public class start {

    public static void main(String[] args) {
        System.out.println("GFY"); // Display the string.

        DestinyAPI api = new DestinyAPI().setApiKey("89fdc02a152e4e30ab768b37e935e8aa");

        var user = DestinyAPI.getUsersWithName("Ron's Creamy Surprise#7155").get(0);

        System.out.println(user.getTimePlayed() / 60.0);

        System.out.println(new Clan("Heavenly Mayhem").getFounder().getSupplementalDisplayName());

        ////

        var characters = user.getCharacters();

        for(var character : characters) {
            var items = character.getEquippedItems();

            for(var item : items) {
                System.out.println("Name: " + item.getName() + " Desc: " + item.getDescription());
            }
            System.out.println("------------------------------------");
        }

        ArrayList Beloveds = new ArrayList();
        var itemIndex = 0;
        while(itemIndex < DestinyItem.searchForItems("Beloved").size()) {
            Beloveds.add(DestinyItem.searchForItems("Beloved").get(itemIndex));
            itemIndex ++;
        }

        System.out.println(Beloveds);
        System.out.println(DestinyItem.searchForItems("Beloved"));

        //System.out.println(DestinyItem);
    }
}
