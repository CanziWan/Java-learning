package com.example.flashsale.config;

import com.example.flashsale.json.ApiResponseSerializer;
import com.example.flashsale.json.ApiResponseDeserializer;
import com.example.flashsale.model.ApiResponse;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class ApiResponseJsonComponent {

    public static class Serializer extends ApiResponseSerializer {
        // 使用 ApiResponseSerializer 的实现
    }

    public static class Deserializer extends ApiResponseDeserializer {
        // 使用 ApiResponseDeserializer 的实现
    }
}
