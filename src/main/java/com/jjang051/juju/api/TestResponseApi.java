package com.jjang051.juju.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResponseApi {

    @GetMapping("/test/response/string")
    public String stringResponse() {
        return "This is String";
    }

    @GetMapping("/test/response/json")
    public TestResponseBody jsonResponse() {
        return new TestResponseBody("jyujyu", 20);
        //return new TestResponseBody("jyujyu", 20);
    }

    @GetMapping("/test/response/fakejson")
    public String fakeJsonResponse() {
        return "{\"name\":\"장성호\"}";
    }
    public static class TestResponseBody {
        String name;
        Integer age;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public TestResponseBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

}


