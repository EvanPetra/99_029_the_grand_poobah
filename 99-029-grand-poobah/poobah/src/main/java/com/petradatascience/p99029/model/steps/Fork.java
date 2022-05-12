package com.petradatascience.p99029.model.steps;


import com.petradatascience.p99029.model.FlowStep;
import com.petradatascience.p99029.model.structural.MultipleEgest;
import com.petradatascience.p99029.model.structural.SingleIngest;

/**
 * A fork is a part of the process where the material
 * may split into parts.
 */
public interface Fork extends FlowStep, SingleIngest, MultipleEgest {
}
