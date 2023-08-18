package br.com.fiap.domain.repository.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Objects;
import java.util.Properties;

public class ConnectionFactory {

    private static volatile ConnectionFactory instace;

    private volatile Connection conexao;

    private String url;
    private String user;
    private String pass;
    private String driver;

    private ConnectionFactory(String url, String user, String pass, String driver) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        this.driver = driver;
    }

    public static ConnectionFactory build() {

        ConnectionFactory factory = instace;

        if (Objects.nonNull(factory)) {
            return factory;
        }

        Properties prop = new Properties();
        FileInputStream file = null;
        String debugar = "";

        try {

            file = new FileInputStream("scr/main/resources/application.properties");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
            System.err.println("Não conseguimos encontrar o arquivo de propriedades" + e.getMessage());

    }
}






