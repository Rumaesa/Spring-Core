package com.properties.file.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("person")
@PropertySource(value = "com/properties/file/commons/information.properties")
public class Person {

	@Value("${per.id}")
	public int personId;
	@Value("${per.name}")
	public String personName;
	@Value("${per.address}")
	public String personAddress;
	
	@Value("7428402423")
	public long mobile;
	
	@Value("${os.name}")
	public String os_name;
	
	@Value("${os.version}")
	public String os_version;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ ", mobile=" + mobile + ", os_name=" + os_name + ", os_version=" + os_version + "]";
	}
	
		
}
