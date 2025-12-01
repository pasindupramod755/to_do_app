package contrallor;

import dto.TaskDTO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import service.AppService;

public class appContrallor {

    AppService taskService = new AppService();
    ObservableList<TaskDTO> taskDTOObservableList = taskService.getAllComplete();
    int x = taskService.getNextIndex();
    int gridIndex = 1;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private GridPane gridTask;

    @FXML
    private Label lblTask;

    @FXML
    private TableView<?> tblTask;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtTitle;

    @FXML
    void btnAddTask(ActionEvent event) {
        TaskDTO taskDTO = new TaskDTO(
                1,
                txtTitle.getText(),
                String.valueOf(txtDate.getValue()),
                txtDescription.getText()
        );

        taskService.addTask(taskDTO);
        System.out.println(taskDTO);
        lblTask.setText("");
        CheckBox checkBox = new CheckBox(txtTitle.getText());
        checkBox.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-padding: 5;" +
                        "-fx-background-color: transparent;"
        );
        checkBox.setId(x+"");
        gridTask.add(checkBox,0,gridIndex);
        gridIndex++;
        x++;
    }

    @FXML
    void btnCompleteTask(ActionEvent event) {

    }

    @FXML
    void btnDelete(ActionEvent event) {

    }

}
