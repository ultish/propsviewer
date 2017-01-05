package propsviewer;

import static spark.Spark.init;
import static spark.Spark.staticFileLocation;
import static spark.Spark.webSocket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.server.WebSocketHandler;

public class PropsViewer {

   static Map<Session, String> userUsernameMap = new ConcurrentHashMap<>();
   static int nextUserNumber = 1;

   public static void main(String[] args) {
      staticFileLocation("/public");
      webSocket("/propsviewer", WebSocketHandler.class);
      init();
   }
}
