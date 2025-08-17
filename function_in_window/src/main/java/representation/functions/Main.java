package representation.functions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Cria um componente (um rótulo com um texto)
        Label label = new Label("Olá, JavaFX no VS Code!");
    
        // Cria um layout para organizar os componentes
        StackPane root = new StackPane();
        root.getChildren().add(label);
            
        // Cria a cena (a "tela" da janela)
        Scene scene = new Scene(root, 800, 600);
        // Configura a janela (stage)
        stage.setTitle("function representation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}