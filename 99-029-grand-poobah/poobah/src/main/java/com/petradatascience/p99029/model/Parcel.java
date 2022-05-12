package com.petradatascience.p99029.model;

import com.petradatascience.p99029.model.structural.InternalReference;

public interface Parcel extends InternalReference  {
    Material getMaterial();
    Provenance getProvenance();
}
