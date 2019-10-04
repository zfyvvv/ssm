import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 1.�Զ�����pojo���mapper.xml�ļ���
 * @author DELL
 *
 */
public class Test {
	
	public void generator() throws Exception {
		//һ�׹̶��ı�̴��룻
		List<String> warnings=new ArrayList<String>();
		boolean overwrite=true;
		//ָ�����򹤳������ļ���
		File configFile=new File("genetratorConfig.xml");
		ConfigurationParser cp=new ConfigurationParser(warnings);
		Configuration config=cp.parseConfiguration(configFile);
		DefaultShellCallback callback=new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config, 
				callback, warnings);
		myBatisGenerator.generate(null);
	}
	
	public static void main(String[] args){
		try {
			Test t=new Test();
			t.generator();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
