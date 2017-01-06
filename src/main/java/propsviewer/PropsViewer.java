package propsviewer;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import static spark.Spark.webSocket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.jetty.websocket.api.Session;

public class PropsViewer {

   static Map<Session, String> userUsernameMap = new ConcurrentHashMap<>();
   static int nextUserNumber = 1;

   public static void main(String[] args) {
      staticFileLocation("/public");
      webSocket("/propsviewer", ProsViewerWebSocketHandler.class);

      /**
       * Gets a list of configs (eg mel, dev)
       */
      get("/configs", (request, response) -> {
         return "config";
      });

      /**
       * Get the configuration for the given name (eg mel)
       */
      get("/configs/:name", (request, response) -> {
         String name = request.params("name");

         return name;
      });

   }

}
