package com.blogspot.debukkitsblog.net;

public interface Callback<T> {
    /**
     * Handles the callback of async executed actions
     */

    /*
    This method get's executed when the action was performend without any errors thrown
     */
    void done(T t);

    /*
    This method get's executed when the action has thrown an error.
     */
    void error(T t, Throwable throwable);
}

