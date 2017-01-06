package model;

import java.util.List;

/**
 * This contains the whole configuration for a single config store. The id
 * determines the config store name
 *
 */
public class Config {
   // eg mel, prod etc paths are allowable via . notation.
   // eg mel.dev will save to <configDir>/mel/dev/
   String id;

   PrimaryConfig primaryConfig;

   // remote configs can be enabled/disabled which affects how properties are
   // saved
   List<RemoteConfig> remoteConfigs;
}
