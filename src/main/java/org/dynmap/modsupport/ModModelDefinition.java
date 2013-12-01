package org.dynmap.modsupport;

/**
 * Model definition for a mod
 */
public interface ModModelDefinition {
    /**
     * Get mod ID
     * @return mod ID
     */
    public String getModID();
    /**
     * Get mod version
     * @return mod version
     */
    public String getModVersion();
    /**
     * Get texture definition associated with the model definition
     * @return texture definition
     */
    public ModTextureDefinition getTextureDefinition();
    /**
     * Final call for model definition: publishes definiiton to Dynmap to be used for the mod
     * @return true if successful, false if error
     */
    public boolean publishDefinition();
}
