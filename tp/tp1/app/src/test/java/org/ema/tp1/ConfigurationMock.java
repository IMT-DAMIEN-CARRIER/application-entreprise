package org.ema.tp1;

import org.ema.tp1.client.ProxyPhotoClient;
import org.ema.tp1.serveur.ProxyPhotoServeur;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@Configuration
public class ConfigurationMock
{
    @Bean
    public Socket mockSocket() throws IOException
    {
        Socket mockSocket = mock(Socket.class);

        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        when(mockSocket.getOutputStream()).thenReturn(byteArrayOutputStream);

        final byte[] buffer = "10".getBytes();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        when(mockSocket.getInputStream()).thenReturn(byteArrayInputStream);

        return mockSocket;
    }

    @Bean
    public ServerSocket mockServerSocket() throws IOException {
        Socket mockSocket = mock(Socket.class);

        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        when(mockSocket.getOutputStream()).thenReturn(byteArrayOutputStream);

        final byte[] buffer = "width".getBytes();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        when(mockSocket.getInputStream()).thenReturn(byteArrayInputStream);

        ServerSocket mockServer = mock(ServerSocket.class);
        when(mockServer.accept()).thenReturn(mockSocket);

        return mockServer;
    }

    @Bean
    public ProxyPhotoClient proxyPhotoClient()
    {
        return new ProxyPhotoClient(null);
    }

    @Bean
    public ProxyPhotoServeur proxyPhotoServeur()
    {
        return new ProxyPhotoServeur(null);
    }
}
