package ru.iamdvz.distanceplaceholder.utils;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class CoordinateUtils {

    public static int getLengthFromTwoPoints(Location playerLoc, Vector two) {
        //Vector one = new Vector(playerLoc.getBlockX(), playerLoc.getBlockY(), playerLoc.getBlockZ());
        return (int) Math.round(Math.sqrt(
                                Math.pow(two.getBlockX() - playerLoc.getBlockX(), 2) +
                                Math.pow(two.getBlockY() - playerLoc.getBlockY(), 2) +
                                Math.pow(two.getBlockZ() - playerLoc.getBlockZ(), 2)));
    }
}
