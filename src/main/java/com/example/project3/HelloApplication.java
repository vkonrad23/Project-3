package com.example.project3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Implementation of start method
    }

    // Superclass with a method
    static class Superclass {
        void theMethod() {
            System.out.println("Superclass method");
        }
    }

    // Subclass that extends Superclass and overrides theMethod
    static class Subclass extends Superclass {
        @Override
        void theMethod() {
            System.out.println("Subclass method");
        }
    }

    // Main class to demonstrate polymorphism
    public static class Main {
        public static void main(String[] args) {
            // Create a variable of the superclass type but assign a subclass instance
            Superclass a = new Subclass();
            // Call theMethod on the superclass reference pointing to a subclass object
            a.theMethod();  // This will call the method of the Subclass
        }
    }
}