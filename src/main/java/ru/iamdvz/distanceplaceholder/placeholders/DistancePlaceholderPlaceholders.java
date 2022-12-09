package ru.iamdvz.distanceplaceholder.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import ru.iamdvz.distanceplaceholder.DistancePlaceholder;
import ru.iamdvz.distanceplaceholder.utils.CoordinateUtils;
import ru.iamdvz.distanceplaceholder.utils.GetterUtils;

import java.util.Objects;

public class DistancePlaceholderPlaceholders extends PlaceholderExpansion {
    public DistancePlaceholderPlaceholders(DistancePlaceholder plugin) {}

    @NotNull
    @Override
    public String getAuthor() {
        return "iamDvz";
    }

    @NotNull
    @Override
    public String getIdentifier() {
        return "DIST";
    }

    @NotNull
    @Override
    public String getVersion() {
        return "1.0";
    }

    public String onRequest(OfflinePlayer p, @NotNull String identifier) {
        if (identifier.equals("fromCords:")) {
            if (identifier.contains("(") && identifier.contains(")") && identifier.contains(",")) {
                return String.valueOf(
                        CoordinateUtils.getLengthFromTwoPoints(
                                ((Player)p).getLocation(),
                                GetterUtils.getVectorFromString(
                                        GetterUtils.getFromBracket(identifier))));
            }
        }
        if (identifier.equals("fromConfig:")) {
            return String.valueOf(
                    CoordinateUtils.getLengthFromTwoPoints(
                            ((Player)p).getLocation(),
                            Objects.requireNonNull(DistancePlaceholder.getInstance().getConfig().getVector(identifier.split(":")[1]))));
        }
        return null;
    }
}
