package com.github.flickr.api.test;

import com.github.flickr.api.commons.FlickrRequest;

import java.util.HashMap;
import java.util.Map;

public class EchoRequest extends FlickrRequest {


    private String testParameter = "This is a sample";

    @Override
    public Map<String, Object> buildParameters() {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("method", "flickr.test.echo");
        parameters.put("testParameter", testParameter);
        return parameters;
    }

    @Override
    public boolean isOAuth() {
        return false;
    }

    public void setTestParameter(String testParameter) {
        this.testParameter = testParameter;
    }
}
