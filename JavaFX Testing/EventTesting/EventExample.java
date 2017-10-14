import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.util.HashSet;


public class EventExample extends Application{
  public static void main(String[] args){
    launch(args);
  }
  static Scene mainScene;
  static GraphicsContext graphicsContext;
  static int WIDTH = 512;
  static int HEIGHT = 256;
  static Image left;
  static Image leftGreen;
  static Image right;
  static Image rightGreen;
  static Image up;
  static Image upGreen;
  static Image down;
  static Image downGreen;
  static Image spacebg;
  static HashSet<String> currentlyActiveKeys;
  
  @Override
  public void start(Stage mainStage){
    mainStage.setTitle("Event Handling");
    Group root = new Group();
    mainScene = new Scene(root);
    mainStage.setScene(mainScene);
    Canvas canvas = new Canvas(WIDTH, HEIGHT);
    root.getChildren().add(canvas);
    prepareActionHandlers();
    graphicsContext = canvas.getGraphicsContext2D();
    loadGraphics();
    mainStage.getIcons().add(new Image(getClass().getResourceAsStream("aicon2.png")));
    
    // Main "game" loop
    new AnimationTimer(){
      public void handle(long currentNanoTime){
        tickAndRender();
      }
    }.start();
    mainStage.show();
  }
  
  private static void prepareActionHandlers(){
    currentlyActiveKeys = new HashSet<String>();
    mainScene.setOnKeyPressed(new EventHandler<KeyEvent>(){
      @Override
      public void handle(KeyEvent event){
        currentlyActiveKeys.add(event.getCode().toString());
      }
    });
    mainScene.setOnKeyReleased(new EventHandler<KeyEvent>(){
      @Override
      public void handle(KeyEvent event){
        currentlyActiveKeys.remove(event.getCode().toString());
      }
    });
  }
  
  private static void loadGraphics(){
    left = new Image(getResource("left.png"));
    leftGreen = new Image(getResource("leftG.png"));
    right = new Image(getResource("right.png"));
    rightGreen = new Image(getResource("rightG.png"));
    up = new Image(getResource("up.png"));
    upGreen = new Image(getResource("upG.png"));
    down = new Image(getResource("down.png"));
    downGreen = new Image(getResource("downG.png"));
    spacebg = new Image("spacebg.jpg");
  }
  
  private static String getResource(String filename){
    return EventExample.class.getResource(filename).toString();
  }
  
  private static void tickAndRender(){
    // clear canvas
    graphicsContext.clearRect(0,0,WIDTH,HEIGHT);
    graphicsContext.drawImage(spacebg, 0, 0);
    
    if(currentlyActiveKeys.contains("LEFT")){
      graphicsContext.drawImage(leftGreen, 94, 69);
    }
    else{
      graphicsContext.drawImage(left,94,69);
    }
    if(currentlyActiveKeys.contains("RIGHT")){
      graphicsContext.drawImage(rightGreen,320,69);
    }
    else{
      graphicsContext.drawImage(right, 320,69);
    }
    if(currentlyActiveKeys.contains("UP")){
      graphicsContext.drawImage(upGreen,209,10);
    }
    else{
      graphicsContext.drawImage(up,209,10);
    }
    if(currentlyActiveKeys.contains("DOWN")){
      graphicsContext.drawImage(downGreen,209,140);
    }
    else{
      graphicsContext.drawImage(down,209,140);
    }
  }
}
    
      
