package me.txie.leetcode.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyScanner {
    // use the members of ProblemBuilder
    private static final Logger LOG = LoggerFactory.getLogger(PropertyScanner.class);
    // only PropertyScanner knows where to load ".properties".
    static final String CONF = "/conf";


    /**
     * @param fileName such as: "layout.properties"
     * @return A Properties object.
     */
    public static Properties load(String fileName) {
        String fullName = CONF + "/" + fileName;
        InputStream stream = PropertyScanner.class.getResourceAsStream(fullName);
        Properties props = new Properties();
        try {
            props.load(stream);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return props;
    }
}
