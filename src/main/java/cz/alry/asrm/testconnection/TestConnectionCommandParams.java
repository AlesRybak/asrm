package cz.alry.asrm.testconnection;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

/**
 * @author Ales Rybak (ales.rybak@ibacz.eu)
 */
@Parameters(
    commandNames = {"test"}
)
public class TestConnectionCommandParams {

    @Parameter(
            names = {"-c"},
            description = "Count of messages")
    private int numberOfMessages = 10;

    public int getNumberOfMessages() {
        return numberOfMessages;
    }

}
