package ru.iamdvz.distanceplaceholder.utils;

import org.bukkit.util.Vector;

public class GetterUtils {

    public static String getFromBracket(String str) {
        try {
            if (str.contains("(") && str.contains(")")) {
                return str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            }
        } catch (Exception ignored) { }
        return null;
    }

    public static Vector getVectorFromString(String str) {
        try {
            return new Vector(Integer.parseInt(str.split(",")[0]),
                              Integer.parseInt(str.split(",")[1]),
                              Integer.parseInt(str.split(",")[2]));
        } catch (Exception ignored) { }
        return null;
    }
}
