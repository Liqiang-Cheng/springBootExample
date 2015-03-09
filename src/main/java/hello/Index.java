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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class Index {
    @RequestMapping("/")
    public AbstractUrlBasedView index() {
        return new RedirectView("index.html");
    }
}
