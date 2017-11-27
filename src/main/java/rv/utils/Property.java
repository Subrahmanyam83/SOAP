package rv.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class Property {

    private static final Property PROPERTY_MAP = new Property();

    private final Properties properties = new Properties();

    private Property() {
        load();
    }

    public static Property getInstance()  {
        synchronized (Property.class) {
            return Property.PROPERTY_MAP;
        }
    }

    /**
     * loads the properties in the property file and all the system properties
     * @throws IOException
     */
    private void load() {
        try {
            FileInputStream stream = new FileInputStream(
                    new File(this.getClass().getResource("/project.properties").getPath()));
            System.getProperties().load(stream);
            stream.close();
            properties.putAll(System.getProperties());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
