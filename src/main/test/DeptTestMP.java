import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class DeptTestMP {
   @Test
	public void test1(){
		GlobalConfig config = new GlobalConfig();

	    DataSourceConfig dataSourceConfig = new DataSourceConfig();
	    dataSourceConfig.setDbType(DbType.MYSQL)
	            .setUrl("jdbc:mysql://localhost:3306/mcally")
	            .setUsername("root")
	            .setPassword("mcally")
	            .setDriverName("com.mysql.jdbc.Driver");
	    StrategyConfig strategyConfig = new StrategyConfig();
	    strategyConfig
	            .setCapitalMode(true)
	            .setEntityLombokModel(false)
	            .setDbColumnUnderline(true)
	            .setNaming(NamingStrategy.underline_to_camel)
	            .setInclude(new String[] {"employee","dept","login"});
	    config.setActiveRecord(true)
	            .setAuthor("Mcally")
	            .setIdType(IdType.AUTO)
	            .setOutputDir("E:\\ideawork\\demospring\\src\\main\\java")
	            .setFileOverride(true)
	            .setServiceName("%sService")
	            .setBaseResultMap(true)
	            .setBaseColumnList(true);
	
	    new AutoGenerator().setGlobalConfig(config)
	            .setDataSource(dataSourceConfig)
	            .setStrategy(strategyConfig)
	            .setPackageInfo(
	                    new PackageConfig()
	                            .setParent("com.mcally.MP")
	                            .setController("controller")
	                            .setEntity("entity")
	                            .setMapper("dao")
	                            .setXml("dao")
	            ).execute();
		
		
		
	}

	
	
	
}
