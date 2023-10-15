package com.pattern.abstractfactory.factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/15 23:57
 */
public abstract class Factory {
	
	private final static String DATABASE = "database.name";
	// 举一个例子，配置文件还可以设置是否开启事务等，在read中可以将读取的结果设置出来，再通过反射创建更具体的对象
	private final static String TRANSACTIONAL = "database.transaction";
	private static Properties properties;
	
	public static Factory getFactory (String configPath) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		File root = new File("src/com/pattern/abstractfactory/");
		Class<?> aClass = Class.forName("com.pattern.abstractfactory.factory." + read(getPropertiesPath(root, configPath)) + "Factory");
		// 示例程序
		setSpecificFactory(aClass);
		return (Factory) aClass.getDeclaredConstructor().newInstance();
	}
	
	private static String getPropertiesPath (File root, String configPath) {
		String path = null;
		if (root.isDirectory()) {
			File[] files = root.listFiles();
			assert files != null;
			for (File file : files) {
				path = getPropertiesPath(file, configPath);
				if (path != null)
					break;
			}
		}
		else {
			if (root.getName().equals(configPath)) {
				return root.getAbsolutePath();
			}
		}
		return path;
	}
	
	private static String read (String configPath) throws IOException {
		properties = new Properties();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(configPath));
		properties.load(bufferedReader);
		return properties.getProperty(DATABASE);
	}
	
	private static void setSpecificFactory (Class<?> aClass) {
		// doSomething
		if (properties.getProperty(TRANSACTIONAL) != null) {
			// do something...
			System.out.println("获取了关于事务的配置信息，并配置到类中");
			// aClass.getDeclaredFields()...
		}
		// if... // 读取其他配置
	}
	
	public abstract void getStatement ();
	
	public abstract void getConnection ();
	
}
