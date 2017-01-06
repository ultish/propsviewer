package model;

import java.util.List;

public class RemoteConfig {
   String id;

   // you can have properties defined but also disabled so it won't deploy
   boolean enabled;

   RemoteProperties defaultProperties;
   List<RemoteOverrideProperties> overrides;
}
