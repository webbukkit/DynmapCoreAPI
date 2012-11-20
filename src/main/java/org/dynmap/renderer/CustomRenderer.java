package org.dynmap.renderer;

/**
 * Abstract base class for custom renderers - used to allow creation of customized patch sets for blocks
 * 
 * Custom renderer classes are loaded by classname, and must have a default constructor
 */
public abstract class CustomRenderer {
    /**
     * Constructor - subclass must have public default constructor
     */
    protected CustomRenderer() {
        
    }
    /**
     * Initialize custom renderer
     * 
     * If overridden, super.initializeRenderer() should be called and cause exit if false is returned
     *
     * @param rpf - render patch factory (used for allocating patches)
     * @param blkid - block type ID
     * @param blockdatamask - block data mask (bit N=1 if block data value N is to be handled by renderer)
     * @param custparm - parameter string for custom renderer - renderer specific
     * @return true if initialized successfully, false if not
     */
    public boolean initializeRenderer(RenderPatchFactory rpf, int blkid, int blockdatamask, String custparm) {
        return true;
    }
    /**
     * Cleanup custom renderer
     * 
     * If overridden, super.cleanupRenderer() should be called
     */
    public void cleanupRenderer() {
        
    }
    /**
     * Return list of fields from the TileEntity associated with the blocks initialized for the renderer, if any.
     * 
     * @return array of field ID strings, or null if none (the default)
     */
    public String[] getTileEntityFieldsNeeded() {
        return null;
    }
    /**
     * Return the maximum number of texture indices that may be returned by the renderer.  Used to validate
     * the teture mapping defined for the block definitions.
     * @return highest texture index that may be returned, plus 1.  Default is 1.
     */
    public int getMaximumTextureCount() {
        return 1;
    }
    /**
     * Return list of patches for block at given coordinates.  List will be treated as read-only, so the same list can
     * and should be returned, when possible, for different blocks with the same patch list.  The provided map data
     * context will always allow reading of data for the requested block, any data within its chunk, and any block
     * within one block in any direction of the requested block, at a minimum.  Also will include any requested tile
     * entity data for those blocks.
     * 
     * @param mapDataCtx - Map data context: can be used to read any data available for map.
     * @return patch list for given block
     */
    public abstract RenderPatch[] getRenderPatchList(MapDataContext mapDataCtx);
}
