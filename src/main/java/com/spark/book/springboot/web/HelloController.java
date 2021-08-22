package com.spark.book.springboot.web;

import com.spark.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
// @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해줌.
@RestController
public class HelloController {

    // HTTP Method인 get의 요청을 받을수 있는 API를 만들어 준다.
    // @RequestMapping(method = RequestMethod.GET)으로 사용되었다.
    // 이제 이 프로젝트는 /hello로 요청이 오면 문자열 hello를 반환하는 기능을 가지게 됨.
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}