package br.edu.utfpr.td.tsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({ "file:./applicationContext.xml"})
@PropertySource("file:application.properties")
public class Main {
  public static void main(String[] args) {
    System.setProperty("server.servlet.context-path", "/posto-saude");
    SpringApplication.run(Main.class, args);
  }
}