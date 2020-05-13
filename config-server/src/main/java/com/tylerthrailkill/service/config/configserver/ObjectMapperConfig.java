package com.tylerthrailkill.service.config.configserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

@SuppressWarnings("Duplicates")
@Configuration
public class ObjectMapperConfig {

    @Primary
    @Bean(name = "restObjectMapper")
    public ObjectMapper getObjectMapper() {
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES));
        om.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        om.registerModule(new JavaTimeModule());
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        om.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        om.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        om.registerModule(new Jdk8Module());
        return om;
    }

}
