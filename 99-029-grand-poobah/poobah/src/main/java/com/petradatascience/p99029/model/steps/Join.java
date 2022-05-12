package com.petradatascience.p99029.model.steps;

import com.petradatascience.p99029.model.FlowStep;
import com.petradatascience.p99029.model.structural.MultipleIngest;
import com.petradatascience.p99029.model.structural.SingleEgest;

/**
 * Like a fork but the other way about.
 */
public interface Join extends FlowStep, MultipleIngest, SingleEgest {
    
}
