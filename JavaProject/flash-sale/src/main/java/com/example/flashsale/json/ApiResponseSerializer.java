package com.example.flashsale.json;

import com.example.flashsale.model.ApiResponse;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class ApiResponseSerializer extends StdSerializer<ApiResponse> {

    public ApiResponseSerializer() {
        super(ApiResponse.class);
    }

    @Override
    public void serialize(ApiResponse value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("code", value.getCode());
        gen.writeStringField("message", value.getMessage());
        gen.writeObjectField("data", value.getData());
        gen.writeEndObject();
    }
}
