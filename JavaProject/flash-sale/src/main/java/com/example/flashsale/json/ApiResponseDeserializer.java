package com.example.flashsale.json;

import com.example.flashsale.model.ApiResponse;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class ApiResponseDeserializer extends StdDeserializer<ApiResponse> {

    public ApiResponseDeserializer() {
        super(ApiResponse.class);
    }

    @Override
    public ApiResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return new ApiResponse(); // 示例返回空的 ApiResponse
    }
}
