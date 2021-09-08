package com.mobigen.ni.devops.orca.common;

import com.mobigen.ni.devops.orca.domain.common.CommonOutput;
import com.mobigen.ni.devops.orca.domain.common.ResponseCommon;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Slf4j
public class ShellUtil {

    public static ResponseCommon killPython(String workId) {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM 종료할프로세스 네임");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static ResponseCommon execPython(String exec, String path) {
        ResponseCommon res = null;
        ByteArrayOutputStream outputStream = null;
        PumpStreamHandler pumpStreamHandler = null;
        int result = -1;

        try {
            CommandLine commandLine = CommandLine.parse(exec);
            commandLine.addArgument(path);

            outputStream = new ByteArrayOutputStream();
            pumpStreamHandler = new PumpStreamHandler(outputStream);
            DefaultExecutor executor = new DefaultExecutor();
            executor.setStreamHandler(pumpStreamHandler);
            result = executor.execute(commandLine);
            log.info("python execution code=[{}]", result);
            log.info("python execution output=[{}]", outputStream.toString());

            res = ResponseCommon.builder().output(CommonOutput.builder().code(result).message(outputStream.toString()).build()).build();
        } catch (Exception e) {
            res = ResponseCommon.builder().output(CommonOutput.builder().code(result).message(outputStream.toString()).build()).build();
        } finally {
            try {
                pumpStreamHandler.stop();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return res;
    }
//
}
