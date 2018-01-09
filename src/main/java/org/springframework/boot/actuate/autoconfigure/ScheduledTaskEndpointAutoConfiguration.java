package org.springframework.boot.actuate.autoconfigure;

import org.springframework.boot.actuate.endpoint.ScheduledTaskEndpoint;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

@Configuration
@AutoConfigureAfter({ SchedulingConfiguration.class })
public class ScheduledTaskEndpointAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public ScheduledTaskEndpoint scheduledTaskEndpoint() {
        return new ScheduledTaskEndpoint();
    }
}