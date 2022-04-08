package org.ema.tp1.serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.ema.tp1.AurorePhoto;
import org.ema.tp1.IPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProxyPhotoServeur extends Thread {
    @Autowired
    private final ServerSocket server;
    private final IPhoto photo = new AurorePhoto();

    public ProxyPhotoServeur(ServerSocket server) {
        this.server = server;
    }


    public void run() {
        try {
            // On attend une connexion d'un client
            Socket client = server.accept();

            byte[] buffer = new byte[2048];

            client.getInputStream().read(buffer);

            byte[] result = handle(buffer);

            if (result != null) {
                client.getOutputStream().write(result);
                client.getOutputStream().flush();

            }

        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public byte[] handle(byte[] input) {
        String data = new String(input);
        String result = null;

        if (data.startsWith("width")) {
            result = Integer.toString(width());
        } else if (data.startsWith("getId")) {
            result = Integer.toString(getId_());
        } else if (data.startsWith("setId")) {
            String id = data.substring("setId".length() + 1);
            setId(Integer.parseInt(id));
        }
        if (result != null) {
            return result.getBytes();
        }

        return null;
    }

    public int width() {
        return photo.width();
    }

    public int getId_() {
        return photo.getId();
    }

    public void setId(int id) {
        photo.setId(id);
    }

}
