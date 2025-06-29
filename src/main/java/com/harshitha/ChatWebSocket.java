
package com.harshitha;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@WebSocket
public class ChatWebSocket {
    private static Set<Session> sessions = ConcurrentHashMap.newKeySet();

    @OnWebSocketConnect
    public void onConnect(Session session) {
        sessions.add(session);
    }

    @OnWebSocketClose
    public void onClose(Session session, int statusCode, String reason) {
        sessions.remove(session);
    }

    @OnWebSocketMessage
    public void onMessage(Session sender, String message) throws IOException {
        for (Session session : sessions) {
            if (session.isOpen() && session != sender) {
                session.getRemote().sendString(message);
            }
        }
    }
}
