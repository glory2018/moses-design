package com.moses.design.pattern.iterator.lang;

public interface Iterator<E> {
    boolean hasNext();

    E next();
}
