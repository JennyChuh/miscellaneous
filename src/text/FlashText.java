package text;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class FlashText extends Application{
private String text = "";

	public void start(Stage primaryStage){
		StackPane pane = new StackPane();
		final Label lbtext = new Label("JAVA");
		pane.getChildren().add(lbtext);
		new Thread(new Runnable(){
			public void run(){
				//try{
					while(true){
						if(lbtext.getText().trim().length() == 0){
							text = "welcome!";
						}else{
							text = "";
						}
						
					Platform.runLater(new Runnable(){
						public void run(){
							lbtext.setText(text);
						}
					});
					//Thread.sleep(200);
					}
				//}
				/*catch(InterruptedException ex){
					
				}*/
			}
		}).start();
		Scene scene = new Scene(pane,1000,500);
		primaryStage.setTitle("flashtext");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String []args){	
		Application.launch(args);
	}
}
