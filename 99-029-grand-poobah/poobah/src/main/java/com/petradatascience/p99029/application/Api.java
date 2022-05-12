package com.petradatascience.p99029.application;

import com.petradatascience.p99029.model.FlowMap;

public interface Api {
    FlowMap get();
    void set(FlowMap resourceFlow);
}
