package my.property.binding;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties( prefix = "my.property" )
public class MyProperties {
	
	private String value;
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
