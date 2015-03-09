/*
 * Copyright Medtronic, Inc. 2015
 *
 *  MEDTRONIC CONFIDENTIAL - This document is the property of Medtronic,
 *  Inc.,and must be accounted for. Information herein is confidential. Do
 *  not reproduce it, reveal it to unauthorized persons, or send it outside
 *  Medtronic without proper authorization.
 */

package hello;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return content;
    }
}
