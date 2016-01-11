package net.canarymod.api.attributes;

import net.canarymod.Canary;

/**
 * @author Jamie Mansfield
 */
public enum HorseAttribute {

    JUMPSTRENGTH("horse.jumpStrength");

    private final String nmsName;

    HorseAttribute(String nmsName) {
        this.nmsName = nmsName;
    }

    public Attribute getAttribute() {
        return Canary.factory().getAttributeFactory().getGenericAttribute(this.nmsName);
    }

    public String getNativeName() {
        return this.nmsName;
    }
}
