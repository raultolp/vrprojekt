package ee.ut.cs.wad2018.vrprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VrprojektApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(VrprojektApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(VrprojektApplication.class);
	}

}
