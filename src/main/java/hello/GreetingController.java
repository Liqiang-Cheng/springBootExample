/*
 * Copyright Medtronic, Inc. 2015
 *
 *  MEDTRONIC CONFIDENTIAL - This document is the property of Medtronic,
 *  Inc.,and must be accounted for. Information herein is confidential. Do
 *  not reproduce it, reveal it to unauthorized persons, or send it outside
 *  Medtronic without proper authorization.
 */

package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
