package org.dynmap.permissions;

import java.util.Set;


public interface PermissionsHandler {
    /**
     * Location to install provider (used by DynmapCBBridge)
     */
    public static PermissionsHandler handler = null;
    
    /**
     * Test if given logged in user has given permissions
     * 
     * @param username - user name
     * @param perm - permission (relative ID - e.g. 'dynmap.fullrender' is 'fullrender')
     * @return true if has permission, false if not
     * 
     */
    public boolean hasPermission(String username, String perm);
    /**
     * Test if given (potentially offline) user has the given permissions
     * 
     * @param username - user name
     * @param perms - permissions to be tested
     * @return set of permissions granted to user
     */
    public Set<String> hasOfflinePermissions(String username, Set<String> perms);
    /**
     * Test if given (potentially offline) user has the given permission
     * 
     * @param username - user name
     * @param perm - permission
     * @return true if has permission, false if not
     */
    public boolean hasOfflinePermission(String player, String perm);
}
