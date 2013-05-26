package org.dynmap.markers;

public interface MarkerDescription {
    /**
     * Set marker description (HTML markup shown in popup when clicked)
     * @param desc - HTML markup description
     */
    public void setDescription(String desc);
    /**
     * Get marker description
     * @return descrption
     */
    public String getDescription();
}
