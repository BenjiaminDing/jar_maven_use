```txt
maven常用打包命令
1、mvn compile 编译,将Java 源程序编译成 class 字节码文件。

2、mvn test 测试，并生成测试报告

3、mvn clean 将以前编译得到的旧的 class 字节码文件删除

4、mvn pakage 打包,动态 web工程打 war包，Java工程打 jar 包。

5、mvn install 将项目生成 jar 包放在仓库中，以便别的模块调用

6、mvn clean install -Dmaven.test.skip=true  抛弃测试用例打包
————————————————

```



##使用maven-jar-plugin和maven-dependency-plugin插件打包

```
<build>
	<plugins>
 
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-jar-plugin</artifactId>
			<version>2.6</version>
			<configuration>
				<archive>
					<manifest>
						<addClasspath>true</addClasspath>
						<classpathPrefix>lib/</classpathPrefix>
						<mainClass>com.xxg.Main</mainClass>
					</manifest>
				</archive>
			</configuration>
		</plugin>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-dependency-plugin</artifactId>
			<version>2.10</version>
			<executions>
				<execution>
					<id>copy-dependencies</id>
					<phase>package</phase>
					<goals>
						<goal>copy-dependencies</goal>
					</goals>
					<configuration>
						<outputDirectory>${project.build.directory}/lib</outputDirectory>
					</configuration>
				</execution>
			</executions>
		</plugin>
 
	</plugins>
</build>
```

