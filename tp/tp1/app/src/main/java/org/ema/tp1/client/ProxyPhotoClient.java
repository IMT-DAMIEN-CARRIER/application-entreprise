package org.ema.tp1.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.ema.tp1.IPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProxyPhotoClient implements IPhoto {
    @Autowired
    private final Socket socket;

    public ProxyPhotoClient(Socket socket) {
        this.socket = socket;
    }

    public int width() {
        byte[] result = sendData("width".getBytes());

        return Integer.parseInt(new String(result, Charset.forName("UTF8")));
    }

    @Override
    public int getId() {
        byte[] result = sendData("getId".getBytes());

        return Integer.parseInt(new String(result));
    }

    @Override
    public void setId(int id) {
        sendData(("setId " + id).getBytes());
    }

    private byte[] sendData(byte[] data) {
        OutputStream out;
        try {
            out = socket.getOutputStream();

            out.write(data);
            out.flush();

            byte[] buffer = new byte[2048];
            int read = socket.getInputStream().read(buffer);

            // neretourne que les bytesutil.
            return Arrays.copyOf(buffer, read);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
