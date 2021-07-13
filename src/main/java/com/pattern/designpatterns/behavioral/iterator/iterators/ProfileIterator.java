package com.pattern.designpatterns.behavioral.iterator.iterators;

import com.pattern.designpatterns.behavioral.iterator.profiles.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
