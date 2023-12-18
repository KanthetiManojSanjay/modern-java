package com.modernjava.sealed;

/**
 * @author kansanja on 18/12/23.
 */
public sealed interface SmartMediaPlayer permits Car {
    void connectPhone();
}
