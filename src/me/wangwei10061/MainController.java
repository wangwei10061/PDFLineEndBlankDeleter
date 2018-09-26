package me.wangwei10061;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML
    private Button convertButton;
    @FXML
    private TextArea source;
    @FXML
    private TextArea to;

    @FXML
    private void convert() {
        String sourceStr = source.getText();
        // (?![A-Z])为负向零宽先行断言，表示断言大写字母不出现在待替换串后
        sourceStr = sourceStr.replaceAll("\n(?![A-Z])", " ");

        to.setText(sourceStr);
    }

}
