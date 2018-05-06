package com.dlsc.workbenchfx.standard;

import com.dlsc.workbenchfx.WorkbenchFx;
import com.dlsc.workbenchfx.extended.calendar.CalendarModule;
import com.dlsc.workbenchfx.extended.notes.NotesModule;
import com.dlsc.workbenchfx.extended.preferences.PreferencesModule;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StandardDemo extends Application {

  public WorkbenchFx workbenchFx;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Scene myScene = new Scene(initWorkbench());

    primaryStage.setTitle("Standard WorkbenchFX Demo");
    primaryStage.setScene(myScene);
    primaryStage.setWidth(1000);
    primaryStage.setHeight(700);
    primaryStage.show();
    primaryStage.centerOnScreen();
  }

  private WorkbenchFx initWorkbench() {
    return workbenchFx = WorkbenchFx.builder(
        new PreferencesModule(),
        new CalendarModule(),
        new NotesModule()
    ).build();
  }

}