package contrallor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class appContrallor {

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

    }

    @FXML
    void btnCompleteTask(ActionEvent event) {

    }

    @FXML
    void btnDelete(ActionEvent event) {
        
    }

}
