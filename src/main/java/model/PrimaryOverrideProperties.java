package model;

/**
 * This extends PrimaryProperties as every property can be overridden. The
 * overrideId is used to identify the owner of this override
 */
public class PrimaryOverrideProperties extends PrimaryProperties {

   // the id used to identify the override file (eg hui, test)
   String overrideId;
}
