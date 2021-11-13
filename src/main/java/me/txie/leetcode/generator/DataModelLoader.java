package me.txie.leetcode.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class DataModelLoader {

    public static Problem load() throws IOException {
        Path path = Paths.get(System.getProperty("user.dir"), "problem.properties");
        BufferedReader reader = Files.newBufferedReader(path);

        Properties props = new Properties();
        props.load(reader);

        Problem problem = new Problem();
        problem.setPackageName(props.getProperty("problem.package"));
        problem.setProblemName(props.getProperty("problem.name").replace('-', '_'));
        problem.setProblemSignature(props.getProperty("problem.signature"));
        problem.setUtilPackage(props.getProperty("problem.util"));
        problem.setProblemUrl(props.getProperty("problem.url"));
        return problem;
    }
}
