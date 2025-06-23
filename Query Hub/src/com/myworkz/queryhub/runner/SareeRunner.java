package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.SareeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {

        SareeDTO sareeDTO1 = new SareeDTO("Silk","Kanjeevaram Silk", 7499.00, "Zari Work", "Maroon-Gold", "Wedding");
        SareeDTO sareeDTO2 = new SareeDTO("Cotton", "Bengal Tant", 1299.00, "Woven", "White-Red", "Festive");
        SareeDTO sareeDTO3 = new SareeDTO("Georgette", "Daily Drape", 899.00, "Floral Print", "Peach", "Casual");
        SareeDTO sareeDTO4 = new SareeDTO("Chiffon", "Light Breeze", 1149.50, "Plain with Border", "Sky Blue", "Office");
        SareeDTO sareeDTO5 = new SareeDTO("Linen", "Eco Linen Saree", 1999.00, "Hand Block Print", "Olive Green", "Daily Wear");
        SareeDTO sareeDTO6 = new SareeDTO("Crepe", "Urban Chic", 1549.00, "Abstract Print", "Grey-Yellow", "Party");
        SareeDTO sareeDTO7 = new SareeDTO("Silk Blend", "Banarasi Touch", 3499.00, "Zari with Meenakari", "Royal Blue", "Reception");
        SareeDTO sareeDTO8 = new SareeDTO("Synthetic", "Budget Beauty", 599.00, "Printed", "Pink", "Casual");
        SareeDTO sareeDTO9 = new SareeDTO("Tussar Silk", "Tribal Threads", 2799.00, "Tribal Motifs", "Beige-Brown", "Cultural");
        SareeDTO sareeDTO10 = new SareeDTO("Organza", "Festive Glow", 3299.00, "Embroidered", "Lemon Yellow", "Engagement");

        Collection<SareeDTO> collection =new ArrayList<>();
        collection.add(sareeDTO1);
        collection.add(sareeDTO2);
        collection.add(sareeDTO3);
        collection.add(sareeDTO4);
        collection.add(sareeDTO5);
        collection.add(sareeDTO6);
        collection.add(sareeDTO7);
        collection.add(sareeDTO8);
        collection.add(sareeDTO9);
        collection.add(sareeDTO10);

        for(SareeDTO sareeDTO : collection){
            System.out.println("Saree Collections: ");
            System.out.println(sareeDTO);
        }
    }
}
