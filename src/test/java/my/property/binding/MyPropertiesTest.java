package my.property.binding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles( "hello" )
@SpringBootTest( classes = MyPropertiesConfig.class )
class MyPropertiesTest {
	
	@Autowired
	private MyProperties binding;
	
	@Test
	void baselineMyPropertiesTest() {
		
		// Properties binding is present in the context
		assertNotNull( this.binding,
			() -> "this is fine");
		
		// Properties binding should be initialized properly 
		assertNotNull( this.binding.getValue(), 
				() -> "the property is null unexpectedly" );

		assertEquals( "Hello World", this.binding.getValue());
	}

}
