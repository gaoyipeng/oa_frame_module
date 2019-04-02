package com.sxdx.oa_backend.common.function;

@FunctionalInterface
public interface CacheSelector<T> {
    T select() throws Exception;
}
