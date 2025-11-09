package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 50, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);
        Carpet carpet = new Carpet(300, 200, PaintColor.RED);

        Bedroom bedroom = new Bedroom("MyBedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Bedroom içindeki objelerin metodlarını test edelim
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();

        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Bed pillows: " + bedroom.getBed().getPillows());
        System.out.println("Ceiling height: " + bedroom.getCeiling().getHeight());
    }
}
