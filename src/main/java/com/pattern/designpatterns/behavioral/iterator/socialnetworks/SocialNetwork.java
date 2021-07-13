package com.pattern.designpatterns.behavioral.iterator.socialnetworks;

import com.pattern.designpatterns.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
