package com.huibudc.springLearning.libraryManagerSystem.log;

import java.io.File;
import java.util.regex.Pattern;

public interface LogAction {
    public boolean delete(File logFile);

    public boolean delete(File logFile, Pattern logFilePatten);

    public boolean delete(File logFile, Pattern logFilePatten, int storeDays);

    public boolean archiveToGZfile(File logFile, Pattern logFilePatten, int storeDays, String folder);
}
