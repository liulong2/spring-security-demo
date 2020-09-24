package com.liu.dao.test;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Component
@Data
@ConfigurationProperties(prefix = "taco.order")
@Validated
public class OrderProps {

    @Min(value = 5,message = "最小5,最大25")
    @Max(value = 25,message = "最小5,最大25")
    private int pageSize = 10;
}
