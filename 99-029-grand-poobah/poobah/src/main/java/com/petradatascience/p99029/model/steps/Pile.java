package com.petradatascience.p99029.model.steps;

import com.petradatascience.p99029.model.FlowStep;
import com.petradatascience.p99029.model.structural.SimpleFlowStep;

/**
 * Represents a part of the material flow where material can
 * be aggregated and may remain at rest for some time.  Like
 * a stockpile :-).
 */
public interface Pile extends SimpleFlowStep {
}
