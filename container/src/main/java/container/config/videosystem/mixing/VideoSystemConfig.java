package container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 
 * @author javafullstack-bitacademy
 * 
 *     JavaConfig3    <-------------- JavaConfig1   +    JavaConfig2
 * (VideoSystemConfig)     [import]     (DVDConfig) 	  (DVDPlayerConfig)
 * 
 * 
 * JavaConfig = JavaConfig2 + JavaConfig1
 * 
 */

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {
	
}
