package org.dynmap.markers;

/**
 * This defines the public interface to a generic marker object, for use with the MarkerAPI
 */
public interface GenericMarker {
    /**
     * Get ID of the marker (unique string within the MarkerSet)
     * @return id of marker
     */
    public String getMarkerID();
    /**
     * Get the marker set for the marker
     * @return marker set
     */
    public MarkerSet getMarkerSet();
    /**
     * Set the marker set for the marker
     * @return marker set
     */
    public void setMarkerSet(MarkerSet newset);
    /**
     * Delete the marker
     */
    public void deleteMarker();
    /**
     * Get marker's world ID
     * @return world id
     */
    public String getWorld();
    /**
     * Get marker's world ID (normalized - used for directory and URL names in Dynmap - '/' replaced with '_')
     * @return world id
     */
    public String getNormalizedWorld();
    /**
     * Test if marker is persistent
     */
    public boolean isPersistentMarker();
    /**
     * Get the marker's label
     */
    public String getLabel();
    /**
     * Update the marker's label (plain text)
     */
    public void setLabel(String lbl);
    /**
     * Update the marker's label and markup flag
     * @param label - label string
     * @param markup - if true, label is processed as HTML (innerHTML for <span> used for label); false implies plaintext
     */
    public void setLabel(String lbl, boolean markup);
    /**
     * Test if marker label is processed as HTML
     */
    public boolean isLabelMarkup();
    /**
     * Get minimum zoom level for marker to be visible
     * @return -1 if no minimum, >0 for level of zoom needed to show
     */
    public int getMinZoom();
    /**
     * Set minimum zoom level for marker to be visible
     * @param zoom : -1 if no minimum, >0 for level of zoom needed to show
     */
    public void setMinZoom(int zoom);
}
