package propsviewer;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;

public class WebSocketHandler {
   @OnWebSocketConnect
   public void onConnect(Session user) throws Exception {
      String username = "User" + PropsViewer.nextUserNumber++;
      PropsViewer.userUsernameMap.put(user, username);
      // Chat.broadcastMessage(sender = "Server", msg = (username + " joined the
      // chat"));
   }

   @OnWebSocketClose
   public void onClose(Session user, int statusCode, String reason) {
      String username = PropsViewer.userUsernameMap.get(user);
      PropsViewer.userUsernameMap.remove(user);
      // Chat.broadcastMessage(sender = "Server", msg = (username + " left the
      // chat"));
   }

   @OnWebSocketMessage
   public void onMessage(Session user, String message) {
      // Chat.broadcastMessage(sender = Chat.userUsernameMap.get(user), msg =
      // message);
   }
}
