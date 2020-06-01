package br.com.parebem.version9;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

public class ProcessInformation {

    public static void main(String[] args) throws InterruptedException {
        ProcessHandle self = ProcessHandle.current();
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> args2 = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        Thread.sleep(10000);

        System.out.println();
        System.out.println(Arrays.toString(args2.get()));
        System.out.println(cmd);
        System.out.println(startTime);
        System.out.println(new Date());
        System.out.println(cpuUsage);
    }
}
