package eu.deltasource;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;


public class ProcessTest {

    @Test
    public void CreateProcessAndGetPid() throws IOException {
        //given
        ProcessBuilder builder = new ProcessBuilder("/bin/sleep", "5");
        Process proc = builder.start();

        //when
        Long actualpid = proc.pid();
        ProcessHandle processHandle = ProcessHandle.of(actualpid).orElseThrow(IllegalAccessError::new);

        //then
        assertThat("", actualpid.equals(processHandle.pid()));
        assertThat("", processHandle.info().commandLine().get().equals("/bin/sleep 5"));
    }

    @Test
    public void CreateProcessAndFindAmongAllProcesses() throws IOException {
        //given
        ProcessBuilder builder = new ProcessBuilder("/bin/sleep", "5");
        builder.start();

        //when
        String sleep = ProcessHandle.allProcesses()
                .map(handle -> handle.info().command().orElse(String.valueOf(handle.pid())))
                .filter(cmd -> cmd.equals("/bin/sleep"))
                .findFirst()
                .orElse(null);

        //then
        assertThat ("", !(sleep == null));

    }

    @Test
    public void pickRandomProcessIdAndCheckUser() throws IOException {
        //given
        ProcessHandle processHandle = ProcessHandle.of(56301).orElseThrow(IllegalAccessError::new);
        ProcessHandle.Info info = processHandle.info();

        //when
        String user = info.user().get();

        //then
        assertThat("Is current User tanerilyazov?", "tanerilyazov".equals(user));
    }

    @Test
    public void killPickedProcessUsingJava() throws IOException {

        //given
        ProcessHandle processHandle = ProcessHandle.of(56301).orElseThrow(IllegalAccessError::new);

        //when
        processHandle.destroy();

        //then
        assertThat("", processHandle.isAlive());
    }
}
