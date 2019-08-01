package com.sda.patterns.behavioral.iterator.iterators;

import com.sda.patterns.behavioral.iterator.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
