package cz.alry.asrm;

import com.beust.jcommander.ParameterException;
import cz.alry.asrm.testconnection.TestConnectionCommandParams;
import cz.alry.asrm.testconnection.TestConnectionCommandRunner;
import cz.alry.jcommander.CommandController;

public class App {

    public static void main( String[] args ) {
        try {
            CommandController<GlobalCommandParams> controller = new CommandController<>(new GlobalCommandParams());
            controller.addCommand(new TestConnectionCommandParams(), new TestConnectionCommandRunner());
            controller.run(args);
        } catch (ParameterException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
