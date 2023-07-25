package com.automationanywhere.botcommand;

import com.automationanywhere.commandsdk.annotations.BotCommand;
import com.automationanywhere.commandsdk.annotations.CommandPkg;
import static com.automationanywhere.commandsdk.model.DataType.NUMBER;


//Make the class eligible for being considered as an action
@BotCommand
//Adds required information to be dispalable on GUI.
@CommandPkg(
        //Name inside a package and label to display.
        name = "GetFileDetails", label = "[[GetFileDetails.label]]",
        node_label = "[[GetFileDetails.node_label]]", description = "[[GetFileDetails.description]]", icon = "pkg.svg",
        //Type information. return_type ensures only the right kind of variable is provided on the UI.
        return_label = "[[GetFileDetails.return_label]]", return_type = NUMBER, return_required = true,
        return_description = "[[GetFileDetails.return_label_description]]"
)
public class GetFileSize {
}
