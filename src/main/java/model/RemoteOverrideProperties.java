package model;

/**
 * This extends RemoteProperties as every property can be overridden. The
 * overrideId is used to identify the owner of this override
 */
public class RemoteOverrideProperties extends RemoteProperties {
   // the id used to identify the override file (eg hui, test)
   String overrideId;
}
